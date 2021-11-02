package com.yjl.primary.day05_Object.Enum;

/**
 * @author yujiale
 * @Classname Season
 * @Description TOO
 * @Date 2021/9/9 下午8:05
 * @Created by yujiale
 */
public enum Season {
    // SPRING, SUMMER, AUTUMN, WINTER;

    //如果枚举类中有抽象方法 //那么在枚举项中必须要全部重写
    SPRING("春") {
        @Override
        public void show() {
            System.out.println(this.name);
        }
    },

    SUMMER("夏") {
        @Override
        public void show() {
            System.out.println(this.name);
        }
    },

    AUTUMN("秋") {
        @Override
        public void show() {
            System.out.println(this.name);
        }
    },

    WINTER("冬") {
        @Override
        public void show() {
            System.out.println(this.name);
        }
    };


    public String name;


    //有参构造
    private Season(String name) {
        this.name = name;
    }

    //抽象方法
    public abstract void show();
}
