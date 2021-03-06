/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2017-2018 Yegor Bugayenko
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.cactoos.scalar;

import org.cactoos.Scalar;

/**
 * Scalar that doesn't throw checked {@link Exception}.
 *
 * <p>There is no thread-safety guarantee.
 *
 * @deprecated Use {@link Unchecked} instead
 * @param <T> Type of result
 * @since 0.3
 * @todo #1081:30min Remove once the dependency cactoos-matchers has been
 *  updated to latest version of cactoos and use {@link Unchecked} instead
 *  of {@link UncheckedScalar}.
 */
@Deprecated
public final class UncheckedScalar<T> implements Scalar<T> {

    /**
     * Unchecked origin.
     */
    private final Unchecked<T> origin;

    /**
     * Ctor.
     * @param scalar Encapsulated origin
     */
    public UncheckedScalar(final Scalar<T> scalar) {
        this.origin = new Unchecked<>(scalar);
    }

    @Override
    public T value() {
        return this.origin.value();
    }

}
