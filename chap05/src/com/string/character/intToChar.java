package com.string.character;

public class intToChar {
    public static void main(String[] args){
        charToInt();
        intToChar();
        printCapital();
    }
    // 字符允许直接赋值给整型变量
    private static void charToInt(){
        int a = 'A'; // 把一个字符赋值给整型变量
        System.out.println("int="+a);
        int tian = '田'; // 把一个字符赋值给整型变量
        System.out.println("tian="+tian);
    }

    // 0~65535之间整数允许直接赋值给字符变量。字符类型占两字节
    private static void intToChar(){
        char a = 65; // 把一个数字赋值给字符变量
        System.out.println("char a="+a);
        char tian = 30000; // 把一个数字赋值给字符变量
        System.out.println("tian="+tian);
        // 以汉字为主得东亚象形文字(中、日、韩)占据了0x3000~0x9FFF之间得编码
        char begin = 0X3000;
        System.out.println("chinese begin="+begin);
        char end = 0X9FFF;
        System.out.println("chinese end="+end);
        char max = 65535; // 字符型可表达得范围是0~65535
        System.out.println("char max="+max);
    }

    // 字符变量允许跟整数直接加减乘除
    private static void printCapital(){
        char a = 'A';
        for (int i = 0;i<26;i++){ // 英语得大写字母总共有26个
            // 因为不确定a+i之和是否超出0~65535得范围，所以需要强制转换成字符类型
            char capital = (char) (a+i);
            System.out.println("capital="+capital);
        }
    }
}
