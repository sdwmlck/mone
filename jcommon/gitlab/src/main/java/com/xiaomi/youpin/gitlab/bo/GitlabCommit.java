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

package com.xiaomi.youpin.gitlab.bo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author gaoyibo
 */
@Data
public class GitlabCommit implements Serializable {
    private String id;
    private String short_id;
    private String title;
    private String author_name;
    private String author_email;
    private String authored_date;
    private String committer_name;
    private String committer_email;
    private String committed_date;
    private String created_at;
    private String message;
    private String[] parent_ids;
}
