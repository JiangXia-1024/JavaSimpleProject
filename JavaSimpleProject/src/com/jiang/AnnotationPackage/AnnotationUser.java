package com.jiang.AnnotationPackage;

/**
 * 声明一个类，使用自定义注解
 */

@MyTestAnnotation(name = "江夏",age = 20)
public class AnnotationUser {
    String name;
    int age;
}
