package com.xiaomi.mone.log.manager.model.vo;

import lombok.Data;

@Data
public class SearchSaveUpdateCmd {
    private Long id;
    private Long storeId;
    private String name;
    private String param;
    private Long startTime;
    private Long endTime;
    private Integer isFixTime;
    private String common;
}