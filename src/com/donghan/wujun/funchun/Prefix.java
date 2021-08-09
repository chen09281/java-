package com.donghan.wujun.funchun;

public class Prefix {
    public static void main(String[] args) {
        int binary = 0b11; // 二进制数，0b也可以写成0B
        System.out.println("binary=" + binary);
        int octonary = 011; // 以0开头，后面非bB、非xX的就是八进制
        System.out.println("octonary" + octonary);
        int hexadecimal = 0x11; // 十六进制，0x也可以写成0X
        System.out.println("hexadecimal=" + hexadecimal);
        int hexLetter = 0xff; // 十六进制数不区分大小写，如ff也可以写成FF
        System.out.println("hexadecimal=" + hexLetter);
        int decimal = 11; //若没有任何前缀，则默认为十进制
        System.out.println("decimal=" + decimal);
        long worldPopulation = 7444443881l;
        System.out.println("worldPopulation=" + worldPopulation);
        float huilv = 3.14f;
        System.out.println("huilv=" + huilv);
        // 中国的领土是960万平方千米
        int chinaArea = 960_0000; //从java7开始，数字中间允许添加下划线，从而可以更方便的区分位数
        System.out.println("chinaArea=" + chinaArea);
        double sunDistance = 1.5e8;
        System.out.println("sunDistance="+sunDistance);
        int changjiang = 6397; //长江的长度为6497千米
        System.out.println("changjiang="+changjiang);
        int longRiver = changjiang; // 把一个整型变量赋值给另一个整型变量
        System.out.println("longRiver="+longRiver);
        long woldPopulation = 7444443881L;
        System.out.println("worldPopulation="+woldPopulation);
        int shijierenkou = (int)worldPopulation;
        System.out.println("shijierenkou="+shijierenkou);
    }
}
