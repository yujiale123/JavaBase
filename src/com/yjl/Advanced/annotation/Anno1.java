package com.yjl.Advanced.annotation;


import com.yjl.primary.day05_Object.Enum.Season;

/**
 * @author yujiale
 * @Classname Anno
 * @Description TOO
 * @Date 2021/9/9 下午8:36
 * @Created by yujiale
 */
public @interface Anno1 {
    //定义一个基本类型的属性
    int a() default 23;

    //定一个String类型的属性
    public String name() default "Annotation";

    //定义一个Class类型的属性
    public Class clazz() default Anno2.class;

    //定义一个注解类型的属性
    public Anno2 anno() default @Anno2;

    //定义一个枚举类型的属性
    public Season season() default Season.SPRING;

    //int数组
    public int[] arr() default {1, 2, 3, 4, 5};

    //枚举数组
    public Season[] seasons() default {Season.SPRING, Season.SUMMER};

    //value。后期我们在使用注解的时候，如果我们只需要给注解的value属性赋值。 //那么value就可以省略
    public String value();


}
