/*
 * Copyright 2020 Xiaomi
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.xiaomi.mone.log.manager.service.env;

import com.xiaomi.mone.log.api.enums.ProjectTypeEnum;
import com.xiaomi.youpin.docean.anno.Service;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @author wtt
 * @version 1.0
 * @description
 * @date 2022/11/15 19:28
 */
@Service
public class HeraEnvIpServiceFactory {

    @Resource
    private MoneHeraEnvIpService moneHeraEnvIpService;

    public HeraEnvIpService getHeraEnvIpServiceByAppType(Integer code) {

        if (Objects.equals(ProjectTypeEnum.MIONE_TYPE.getCode(), code)) {
            return moneHeraEnvIpService;
        }
        return moneHeraEnvIpService;
    }

}
