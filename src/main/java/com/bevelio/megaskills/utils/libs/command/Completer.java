/*
 * Decompiled with CFR 0_118.
 */
package com.bevelio.megaskills.utils.libs.command;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.METHOD})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface Completer {
    public String name();

    public String[] aliases() default {};
}

