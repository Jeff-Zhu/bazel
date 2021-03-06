// Copyright 2018 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.devtools.build.lib.skyframe;

import com.google.devtools.build.lib.analysis.ConfiguredTarget;
import com.google.devtools.build.lib.analysis.config.BuildConfiguration;
import com.google.devtools.build.lib.cmdline.Label;
import com.google.devtools.build.skyframe.SkyKey;

/**
 * A {@link com/google/devtools/build/lib/skyframe/ConfiguredTargetValue.java used only in javadoc:
 * com.google.devtools.build.skyframe.SkyValue} for a {@link ConfiguredTarget}.
 */
public interface ConfiguredTargetValue extends ConfiguredObjectValue {
  static SkyKey key(Label label, BuildConfiguration configuration) {
    return ConfiguredTargetKey.of(label, configuration);
  }

  /** Returns the configured target for this value. */
  ConfiguredTarget getConfiguredTarget();

  @Override
  default ConfiguredTarget getConfiguredObject() {
    return getConfiguredTarget();
  }
}
