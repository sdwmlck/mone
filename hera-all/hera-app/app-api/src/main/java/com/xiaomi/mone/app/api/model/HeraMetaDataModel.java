package com.xiaomi.mone.app.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description
 * @Author dingtao
 * @Date 2023/4/28 10:04 AM
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class HeraMetaDataModel implements Serializable {

    private Long id;

    private Integer metaId;

    /**
     * 元数据的名称，app类型就是appName，mysql类型就是DBA定义的DBName等等
     */
    private String metaName;

    private Integer envId;

    private String envName;

    /**
     * dubbo service 元数据，group/service/version，多个以逗号分隔
     */
    private String dubboServiceMeta;

    /**
     * 元数据类型，有APP、MYSQL、REDIS、ES、MQ等，具体可以参照{@link HeraMetaDataType}
     */
    private String type;

    /**
     *元数据的实例，有可能是IP，有可能是域名，也有可能是hostName
     */
    private String host;

    /**
     *该元数据暴露的端口
     */
    private HeraMetaDataPortModel port;

    private Date createTime;

    private Date updateTime;

    private String createBy;

    private String updateBy;
}
