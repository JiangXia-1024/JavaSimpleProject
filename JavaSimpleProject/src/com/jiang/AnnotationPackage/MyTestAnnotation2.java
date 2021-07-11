package com.jiang.AnnotationPackage;

import java.lang.annotation.*;

/**
 * 声明一个自定义注解
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyTestAnnotation2 {
    int result() default 50;
}
