package com.yjl.Advanced.producersAndConsumers;

/**
 * @author yujiale
 * @Classname Middle
 * @Description TOO
 * @Date 2021/9/7 下午8:33
 * @Created by yujiale
 * 中间件
 */
public class Middle {

    /**
     * 如果为true则表示需要生产者执行
     * //如果为false表示需要消费者执行
     */
    //public static boolean flag = false;

    private boolean isFlag;
    private Integer count;
    private final Object lock = new Object();
    //public static Integer count = 10;

    //  public static final Object lock = new Object();


    public Middle() {
        this(false,10);
    }

    public Middle(boolean isFlag, Integer count) {
        this.isFlag = isFlag;
        this.count = count;
    }

    public boolean isFlag() {
        return isFlag;
    }

    public void setFlag(boolean flag) {
        isFlag = flag;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Object getLock() {
        return lock;
    }

    @Override
    public String toString() {
        return "Middle{" +
                "isFlag=" + isFlag +
                ", count=" + count +
                ", lock=" + lock +
                '}';
    }
}
