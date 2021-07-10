package com.jiang.AnnotationPackage;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationDemo {
    public static void main(String[] args) throws NoSuchMethodException {
        /**
         * 获取类注解属性
         */
        Class<AnnotationUser> userClass = AnnotationUser.class;
        /**是否存在对应 Annotation 对象*/
        boolean annotationPresent = userClass.isAnnotationPresent(MyTestAnnotation.class);

        if(annotationPresent){
            /**获取 Annotation 对象*/
            MyTestAnnotation myTestAnnotation = userClass.getAnnotation(MyTestAnnotation.class);
            System.out.println("姓名是："+myTestAnnotation.name());
            System.out.println("年龄是："+myTestAnnotation.age());
        }
    }
}
