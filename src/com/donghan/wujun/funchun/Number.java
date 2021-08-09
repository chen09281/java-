package com.donghan.wujun.funchun;

public class Number {
    public static void main(String[] args) {
        int x = 8; // 8对应的二进制数为00001000
        int y = x << 2; // 00001000 左移两位后变成00100000，左移结果转换成十进制则为 32
        int z = x >> 2; // 00001000 右移两位后变成00000010,右移结构转换成十进制为 2
        System.out.println("原数字 x=" + x);
        System.out.println("x左移两位后=" + y);
        System.out.println("x右移两位后=" + z);
    }
}
