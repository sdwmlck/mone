package run.mone.mcp.idea.function;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import lombok.Data;
import run.mone.hive.mcp.spec.McpSchema;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

@Data
public class GenerateBizCodeFunction implements Function<Map<String, Object>, McpSchema.CallToolResult> {

    public GenerateBizCodeFunction(String port) {
        this.ideaPort = port;
    }

    private String name = "generateBizCode";

    private String desc = "根据需求，生成业务代码";
    private String ideaPort;

    private String toolScheme = """
                {
                    "type": "object",
                    "properties": {
                        "requirement": {
                            "type": "string",
                            "description":"需求描述，一定要简短精炼，生成完毕后，不要调用任何MCP工具或者有任何动作"
                        }
                    },
                    "required": ["requirement"]
                }
                """;

    @Override
    public McpSchema.CallToolResult apply(Map<String, Object> arguments) {
        JsonObject req = new JsonObject();
        req.addProperty("cmd", "writeCodeMethod");
        req.addProperty("from", "idea_mcp");
        req.addProperty("requirement", (String) arguments.get("requirement"));
        req.addProperty("athenaPluginHost", "127.0.0.1:" + ideaPort);
        JsonObject res = IdeaFunctions.callAthena(ideaPort, req);
        if (res.get("code") != null && res.get("code").getAsInt() == 0) {
            return new McpSchema.CallToolResult(List.of(new McpSchema.TextContent("已完成")), false);
        }
        return new McpSchema.CallToolResult(List.of(new McpSchema.TextContent(new Gson().toJson(res))), true);
    }
}
