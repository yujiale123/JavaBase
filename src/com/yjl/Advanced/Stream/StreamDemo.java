package com.yjl.Advanced.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author yujiale
 * @Classname StreamDemo
 * @Description TOO
 * @Date 2021/9/5 下午3:37
 * @Created by yujiale
 */
public class StreamDemo {
    public static void main(String[] args) {
        streamTest05();
    }

    static void StreamTest01() {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张翠山");
        list.add("谢逊");

        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")) {
                list2.add(s);
            }
        }
        ArrayList<String> list3 = new ArrayList<>();
        for (String s : list2) {
            if (s.length() == 3) {
                list3.add(s);
            }
        }
        for (String s : list3) {
            System.out.println(s);
        }

        System.out.println("==============");
        list.stream().filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(s -> System.out.println(s));

    }

    /**
     * Stream流获取方法
     *     单列集合
     *         可以使用Collection接口中的默认方法stream（）生成流
     *         default Stream<E> stream()
     *     双列集合
     *         间接的生成流
     *         可以先通过keySet或者entrySet获取一个set集合，在获取Stream流
     *     数组
     *         Arrays中的静态方法Stream生成流
     *     同种类型的多个数据
     *         使用Stream.of（T values）生成流
     */
    static void StreamTest02() {
        System.out.println("单列集合");
        //单列
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Stream<Integer> stream = list.stream();
        stream.forEach(s -> System.out.println(s));
        list.stream().forEach(s -> System.out.println(s));

        System.out.println("双列集合");
        //双列集合
        HashMap<String, Integer> map = new HashMap<>();
        map.put("123",23);
        map.put("1234",235);
        map.put("1235",234);
        map.put("1236",233);
        map.put("1237",232);
        map.put("1238",231);
        //keySet  先获取到所有建，再把set集合中所有的建放到stream流中
        map.keySet().stream().forEach(s -> System.out.println(s));
        //entrySet  先获取所有的键值对对象，再把这个set集合中所有的健值对放到stream流中
        map.entrySet().stream().forEach(s-> System.out.println(s));
        //数组
        System.out.println("数组");
        int[] arr = {1,2,3,4,5,6};
        Arrays.stream(arr).forEach(s-> System.out.println(s));
    }

    /**
     * 在stream流中无法直接修改集合、数组等数据源中的数据
     */
    static void streamTest03(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        list.stream().filter(i->{
            return i%2==0;
        }).forEach(i-> System.out.println(i));
        System.out.println("==========");
        for (Integer i :list){
            System.out.println(i);
        }
    }

    /**
     * stream流的收集操作
     *     R collect(Collector collector)
     *     但是这个收集方法的参数是一个Collector 接口
     *     具体收集方式
     *         public static <T> Collector toList()：创建list集合并把元素收集到List集合中
     *         public static <T> Collector toSet()：底层创建set集合并把元素收集到Set集合中
     *         public static  Collector toMap(Function keyMapper,Function valueMapper)：把元素收集到Map集合中
     */
    static void streamTest04(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        //filter过滤数据
        //collect()负责收集容器，获取流中的剩余数据，但是不负责创建容器，也不负责把数据添加到容器中

        List<Integer> list1 = list.stream().filter(i -> {
            return i % 2 == 0;
        }).collect(Collectors.toList());
        System.out.println("==========");
        System.out.println(list1);
    }

    /**
     * 现在有两个ArrayList集合，分别存储6名男演员名称和6名女演员名称，要求完成如下的操作
     * 男演员只要名字为3个字的前三人
     * 女演员只要姓林的，并且不要第一个
     * 把过滤后的男演员姓名和女演员姓名合并到一起
     * 把上一步操作后的元素作为构造方法的参数创建演员对象,遍历数据
     * 演员类Actor已经提供，里面有一个成员变量，一个带参构造方法，以及成员变量对应的get/set方法
     */
    static void streamTest05(){

        class Actor{
            private String name;

            public Actor() {
            }

            public Actor(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return "Actor{" +
                        "name='" + name + '\'' +
                        '}';
            }
        }
        ArrayList<String> manList = new ArrayList<>();
        ArrayList<String> womanList = new ArrayList<>();
        manList.add("张国立");
        manList.add("张国");
        manList.add("张立");
        manList.add("王宝强");
        manList.add("郑伊健");
        womanList.add("杨紫");
        womanList.add("贾玲");
        womanList.add("关晓彤");
        womanList.add("赵丽颖");
        womanList.add("杨明");
        womanList.add("张天爱");
        Stream<String> stream1 = manList.stream().filter(name -> name.length() == 3).limit(2);
        Stream<String> stream2 = womanList.stream().filter(name -> name.startsWith("杨")).skip(1);
        Stream.concat(stream1,stream2).forEach(s-> {
            Actor actor = new Actor(s);
            System.out.println(actor);
        });
    }
}
