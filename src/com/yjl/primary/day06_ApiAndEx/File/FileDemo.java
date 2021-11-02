package com.yjl.primary.day06_ApiAndEx.File;

import java.io.File;
import java.io.IOException;

/**
 * @author yujiale
 * @Classname FileDemo
 * @Description TOO
 * @Date 2021/9/5 下午4:51
 * @Created by yujiale
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        FileTest02();
    }

    /**
     * 构造方法
     *     File(String pathname)
     *         通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例
     *     File(String parent, String child)
     *         从父路径名字符串和子路径名字符串创建新的 File实例
     *     File(File parent, String child)
     *         从父抽象路径名和子路径名字符串创建新的 File实例
     */
    public static void FileTest01(){
        /**
         *   File(String pathname)
         *      通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例
         *      String转换为file目的是为类使用file的方法
         */
        String path = "/Users/yujiale/IdeaProjects/JavaBasics";
        File file = new File(path);
        System.out.println(file);
        /**
         *  File(String parent, String child)
         *      从父路径名字符串和子路径名字符串创建新的 File实例
         */
        String path1 = "/Users/yujiale/IdeaProjects/JavaBasics";
        String path2 = "src";
        File file1 = new File(path1,path2);
        System.out.println(file1);

        /**
         * File(File parent, String child)
         *      从父抽象路径名和子路径名字符串创建新的 File实例
         */
        File file2 = new File("/Users/yujiale/IdeaProjects/JavaBasics");
        String path3="src/basic";
        File file3 = new File(file2, path3);
        System.out.println(file3);
    }

    /**
     * File创建和删除功能
     */
    public  static void FileTest02() throws IOException {
        //file创建文件夹
        File file = new File("/Users/yujiale/IdeaProjects/JavaBasics/src/basic/File/FileTest");
        boolean mkdir = file.mkdir();
        System.out.println(mkdir);
        //file创建文件名
        File file1 = new File("/Users/yujiale/IdeaProjects/JavaBasics/src/basic/File/FileTest/FileTest.txt");
        boolean newFile = file1.createNewFile();
        System.out.println(newFile);
        //file删除文件
        boolean delete = file1.delete();
        System.out.println(delete);
        //file删除文件夹
        boolean delete1 = file.delete();
        System.out.println(delete1);

    }


}
