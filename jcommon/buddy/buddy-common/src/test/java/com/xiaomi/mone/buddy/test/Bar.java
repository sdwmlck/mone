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

package com.xiaomi.mone.buddy.test;

/**
 * @Author goodjava@qq.com
 * @Date 2021/7/16 17:18
 */
public class Bar {

    public static String sayHelloFoo() {
        return "bar";
    }


    public static int sum(int a, int b) {
        System.out.println("sum call");
        return (int) ((a + b) * 0.1);
    }

}
