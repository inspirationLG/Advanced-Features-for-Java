package com.StringExc;

/**
 * @Author:Hchien Ying
 * @date:2019/9/26
 * @description:
 */


//java String 的不可变特性
public class StringExc1 {
    public static void main(String[] args) {
        String s = "hello"; //JVM先创建字符串“hello”，然后把字符串变量s指向它
        String t = s;
        s = "world"; //JVM先创建字符串"world"，然后把字符串变量s指向它
        //原来的字符串"hello"还在，只是我们无法通过变量s访问它而已。因此，字符串的不可变是指字符串内容不可变。
        System.out.println(t);
    }
}
