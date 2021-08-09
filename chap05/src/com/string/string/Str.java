package com.string.string;

public class Str {
    public static void main(String[] args){
        // 第一种方法：用双引号把字符串引起来
        String fromQuote = "Hello";
        System.out.println("fromQuote="+fromQuote);
        // 第二种方法:使用String的valueOf方法把数值、布尔、字符数组等变量转换为字符串
        String fromValueOf = String.valueOf(111);
        System.out.println("fromValueOf="+fromValueOf);
        // 第三种方法:对于字符数组来说，还能通过new关键字创建字符串变量
        char[] array = {'a','b','c'};
        String fromArray = new String(array);
        System.out.println("fromArray="+fromArray);
        // 第四种方法:对于基本变量类型(数组除外)来说，也可以利用加号连接基本变量和空串
        // tips:数值变量之间的加号为算术上的相加运算，而字符串之间的加号为两个字符串的合并操作
        String fromPlus = true+"";
        System.out.println("fromPlus="+fromPlus);
    }
}
