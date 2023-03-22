package com.xiaomi.hera.trace.etl.manager.config;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboConfiguration {

    @Value("${dubbo.protocol.port}")
    private int port;

    @Value("${server.port}")
    private String httpGateWayPort;

    @NacosValue("${dubbo.registry.address}")
    private String regAddress;

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("Trace-etl-manager");
        applicationConfig.setParameters(Maps.newHashMap());
        applicationConfig.getParameters().put("http_gateway_port", httpGateWayPort);
        applicationConfig.getParameters().put("dubbo_version", "1.0");
        applicationConfig.setQosEnable(false);
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(regAddress);
        return registryConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setPort(port);
        protocolConfig.setTransporter("netty4");
        protocolConfig.setThreadpool("fixed");
        protocolConfig.setThreads(800);
        return protocolConfig;
    }

}
