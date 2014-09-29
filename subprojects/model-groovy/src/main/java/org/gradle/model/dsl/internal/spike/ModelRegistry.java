/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.model.dsl.internal.spike;

import org.gradle.model.internal.core.ModelPath;

import java.util.HashMap;
import java.util.Map;

class ModelRegistry {

    Map<ModelPath, ModelCreator> creators = new HashMap<ModelPath, ModelCreator>();

    void create(ModelPath path, ModelCreator creator) {
        creators.put(path, creator);
    }

    Object get(ModelPath path) {
        return creators.get(path).create();
    }
}
