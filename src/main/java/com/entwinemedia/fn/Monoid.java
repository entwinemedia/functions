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

package com.entwinemedia.fn;

public final class Monoid<A> {
  private final A identity;
  private final Fn2<A, A, A> op;

  @SuppressWarnings("unchecked")
  public Monoid(A identity, Fn2<? super A, ? super A, A> op) {
    this.identity = identity;
    this.op = (Fn2<A, A, A>) op;
  }

  /** The identity element for operation {@link #op(Object, Object)}. */
  public final A identity() {
    return identity;
  }

  /** An associative operation. */
  public A op(A a, A b) {
    return op.apply(a, b);
  }

  /** An associative operation. */
  public Fn2<A, A, A> op() {
    return op;
  }
}
