/*
 * Copyright (c) 2004, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package com.sun.mirror.declaration;


import com.sun.mirror.type.TypeMirror;
import com.sun.mirror.type.VoidType;


/**
 * Represents a method of a class or interface.
 * Note that an
 * {@linkplain AnnotationTypeElementDeclaration annotation type element}
 * is a kind of method.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @since 1.5
 */

public interface MethodDeclaration extends ExecutableDeclaration {

    /**
     * Returns the formal return type of this method.
     * Returns {@link VoidType} if this method does not return a value.
     *
     * @return the formal return type of this method
     */
    TypeMirror getReturnType();
}
