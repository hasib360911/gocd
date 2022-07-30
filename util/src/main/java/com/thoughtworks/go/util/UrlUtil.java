/*
 * Copyright 2022 Thoughtworks, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.thoughtworks.go.util;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class UrlUtil {
    public static String encodeInUtf8(String url) {
        String[] parts = url.split("/");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];
            builder.append(URLEncoder.encode(part, StandardCharsets.UTF_8));
            if (i < parts.length - 1) {
                builder.append('/');
            }
        }
        if (url.endsWith("/")) {
            builder.append('/');
        }
        return builder.toString();
    }
}
