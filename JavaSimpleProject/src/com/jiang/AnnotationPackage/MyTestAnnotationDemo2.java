package com.jiang.AnnotationPackage;

import java.lang.reflect.Method;

/**
 * 自定义注解在方法上的使用
 */
public class MyTestAnnotationDemo2 {

    /**
     * @param number 猜数的大小
     */
    @MyTestAnnotation2(result = 85)
    public static void guess(int number){
        System.out.println(processGuess(number));
    }

    private static String processGuess(int number){
        try {
            Method guessnumber = MyTestAnnotationDemo2.class.getDeclaredMethod("guess",int.class);
            boolean annotationPresent = guessnumber.isAnnotationPresent(MyTestAnnotation2.class);
            if(annotationPresent){
                MyTestAnnotation2 annotation2 = guessnumber.getAnnotation(MyTestAnnotation2.class);
                if(number>annotation2.result()){
                    return "猜的数字大于指定数字";
                }else if (number==annotation2.result()){
                    return "猜的数字等于指定数字";
                }else{
                    return "猜的数字小于指定数字";
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return "猜测程序有误";
    }

    public static void main(String[] args) {
        guess(86);
    }

}
