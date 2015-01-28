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

package com.entwinemedia.fn.fns;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BooleansTest {
  @Test
  public void test() throws Exception {
    assertTrue(Booleans.<Integer, Integer>lt()._(10, 20));
    assertTrue(Booleans.<Integer, Integer>lt(20)._(10));
    assertFalse(Booleans.<Integer, Integer>lt()._(20, 10));
    assertFalse(Booleans.<Integer, Integer>lt(10)._(20));
    //
    assertTrue(Booleans.<Integer, Integer>le()._(10, 20));
    assertTrue(Booleans.<Integer, Integer>le(20)._(10));
    assertFalse(Booleans.<Integer, Integer>le()._(20, 10));
    assertFalse(Booleans.<Integer, Integer>le(10)._(20));
    assertTrue(Booleans.<Integer, Integer>le()._(10, 10));
    assertTrue(Booleans.<Integer, Integer>le(10)._(10));
    //
    assertTrue(Booleans.<Integer, Integer>gt()._(20, 10));
    assertTrue(Booleans.<Integer, Integer>gt(10)._(20));
    assertFalse(Booleans.<Integer, Integer>gt()._(10, 20));
    assertFalse(Booleans.<Integer, Integer>gt(20)._(10));
    //
    assertTrue(Booleans.<Integer, Integer>ge()._(20, 10));
    assertTrue(Booleans.<Integer, Integer>ge(10)._(20));
    assertFalse(Booleans.<Integer, Integer>ge()._(10, 20));
    assertFalse(Booleans.<Integer, Integer>ge(20)._(10));
    assertTrue(Booleans.<Integer, Integer>ge()._(10, 10));
    assertTrue(Booleans.<Integer, Integer>ge(10)._(10));
  }
}