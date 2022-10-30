package com.itranswarp.learnjava;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//寿命
@Target(ElementType.FIELD)//作用域
public @interface Range {

	int min() default 0;

	int max() default 255;

}
