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
import {MithrilViewComponent} from "jsx/mithril-component";
import m from 'mithril';
import style from './index.scss';

const f = require('helpers/form_helper').f;

export interface Attrs {
  disabled?: boolean;
  width: number;
  placeholder: string;
  attrName: string;
  model: any;
}

export class SearchBox extends MithrilViewComponent<Attrs> {
  view(vnode: m.Vnode<Attrs>) {
    const width = vnode.attrs.width;
    const widthStyle = width ? `width: ${width}px` : `flex-grow: 1`;

    return <div class={style.searchBoxWrapper} style={widthStyle}>
      <f.input disabled={vnode.attrs.disabled}
               class={style.searchBoxInput}
               model={vnode.attrs.model}
               attrName={vnode.attrs.attrName}
               placeholder={vnode.attrs.placeholder}
               data-test-id={"search-box"}/>
    </div>;
  }
}
