package com.GenericsExc;

/**
 * @Author:Hchien Ying
 * @date:2019/8/7
 * @description:
 */
public class GenericMethodTest {
    //泛型方法printArrary
    public static <E> void printArrary(E[] inputArray) {
        //输出数组元素
        for (E element : inputArray) {
            System.out.printf("%s", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //创建不同类型的数组
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("整型数组元素为：");
        printArrary(intArray); //传递一个整型数组

        System.out.println("\n双精度型数组元素为：");
        printArrary(doubleArray);

        System.out.println("\n字符型数组元素为");
        printArrary(charArray);
    }

}
