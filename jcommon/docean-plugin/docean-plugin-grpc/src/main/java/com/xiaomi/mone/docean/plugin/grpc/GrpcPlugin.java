/*
 *  Copyright 2020 Xiaomi
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.xiaomi.mone.docean.plugin.grpc;

import com.xiaomi.youpin.docean.Ioc;
import com.xiaomi.youpin.docean.anno.DOceanPlugin;
import com.xiaomi.youpin.docean.plugin.IPlugin;
import com.xiaomi.youpin.docean.plugin.config.Config;
import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author goodjava@qq.com
 * @Date 2021/11/5 10:08
 */
@DOceanPlugin
@Slf4j
public class GrpcPlugin implements IPlugin {

    ExecutorService executor = new ThreadPoolExecutor(200, 200, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(10000));

    @Override
    public boolean after(Ioc ioc) {
        Config config = ioc.getBean(Config.class);
        int port = Integer.valueOf(config.get("grpc_port", "5555"));
        Set<BindableService> beans = ioc.getBeans(BindableService.class);
        log.info("grpc service:{}", beans);
        new Thread(() -> {
            ServerBuilder<?> builder = ServerBuilder
                    .forPort(port)
                    .executor(executor);
            beans.forEach(it -> builder.addService(it));
            Server server = builder.build();
            try {
                server.start();
            } catch (IOException e) {
                log.error(e.getMessage());
            }
        }).start();
        return true;
    }
}
