<#--
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
 -->
<#noparse>
{if modification.comment != null && modification.comment != ""}
    {var comment_map = JSON.parse(modification.comment)}
    {if comment_map.COMMENT != null}
        ${%comment_map.COMMENT%}<br/>
    {/if}
    {if comment_map.TRACKBACK_URL != null}
        Trackback: <a href="${%comment_map.TRACKBACK_URL%}">${%comment_map.TRACKBACK_URL%}</a>
    {else}
        Trackback: Not Provided
    {/if}
{/if}
</#noparse>