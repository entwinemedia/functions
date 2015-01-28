/*
 * Copyright 2015 Entwine AG, Switzerland
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

package com.entwinemedia.fn.data.json;

import static com.entwinemedia.fn.Equality.eq;
import static com.entwinemedia.fn.Equality.hash;

public final class JField implements JValue {
  private final String key;
  private final JValue value;

  public JField(String key, JValue value) {
    this.key = key;
    this.value = value;
  }

  public String getKey() {
    return key;
  }

  public JValue getValue() {
    return value;
  }

  @Override public int hashCode() {
    return hash(key, value);
  }

  @Override public boolean equals(Object that) {
    return that instanceof JField && eqFields((JField) that);
  }

  private boolean eqFields(JField that) {
    return eq(key, that.key) && eq(value, that.value);
  }
}