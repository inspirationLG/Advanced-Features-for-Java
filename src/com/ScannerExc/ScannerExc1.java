package com.ScannerExc;

import java.util.Scanner;

/**
 * @Author:Hchien Ying
 * @date:2019/9/26
 * @description:
 */
public class ScannerExc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name:");
        String name = scanner.nextLine();//读取一行输入并获取字符串
        System.out.println("Input age");
        int age = scanner.nextInt();//读取一行输入并获取整数
        System.out.printf("%s, %d", name, age);
    }
}
