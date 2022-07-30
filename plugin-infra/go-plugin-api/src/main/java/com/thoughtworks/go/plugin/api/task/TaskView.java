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
package com.thoughtworks.go.plugin.api.task;

/**
 * Used to define the view of the task configuration.
 */
@Deprecated
//Will be moved to internal scope
public interface TaskView {
    /**
     * Specifies the display value of this task plugin. This value is used in the job UI's task dropdown
     * as well as in the title of the task definition dialog box.
     *
     * @return display value for the task plugin
     */
    String displayValue();

    /**
     * The template for the task configuration, written using Angular.js templating language.
     *
     * @return Angular.js template for the task configuration
     */
    String template();
}
