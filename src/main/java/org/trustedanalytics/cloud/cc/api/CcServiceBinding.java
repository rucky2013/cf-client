/**
 * Copyright (c) 2015 Intel Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.trustedanalytics.cloud.cc.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CcServiceBinding {

    @JsonProperty("metadata")
    private CcMetadata metadata;

    @JsonProperty("entity")
    private CcServiceBindingEntity entity;

    public CcServiceBinding() {

    }

    public CcServiceBinding(CcMetadata metadata, CcServiceBindingEntity entity) {
        this.metadata = metadata;
        this.entity = entity;
    }

    public CcMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(CcMetadata metadata) {
        this.metadata = metadata;
    }

    public CcServiceBindingEntity getEntity() {
        return entity;
    }

    public void setEntity(CcServiceBindingEntity entity) {
        this.entity = entity;
    }
}
