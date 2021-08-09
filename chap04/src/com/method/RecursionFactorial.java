package com.method;

import java.math.BigInteger;

public class RecursionFactorial {
    public static void main(String[] args){
        calculatFactorialByLong(); // 利用长整数计算阶乘函数
        calculatFactorialByBigInteger(); // 利用大整数计算阶乘函数
    }
    private static void calculatFactorialByBigInteger(){
        int n = 10000;
        // 使用大数字类型，阶乘方法可以一直计算下去，计算到"1000!"都没问题
        BigInteger resltBig = factorialBig(n);
        System.out.println(n+"!的大整数阶乘结果="+resltBig);
    }
    // 利用大数字实现精确计算的阶乘方法
    private static BigInteger factorialBig(int n){
        BigInteger bigN = BigInteger.valueOf(n); // 把整型的n转换为大整数类型
        return (n <= 1) ? bigN : bigN.multiply(factorialBig(n-1));
    }
    private  static void calculatFactorialByLong(){
        int n = 20;
        // 注意：使用long类型，阶乘方法只能计算到"20"，再往上面计算就不行了
        long resultLong = factorialSimplify(n);
        System.out.println(n+"!的长整数阶乘结果="+resultLong);
    }
    // 利用循环语句实现阶乘函数N!
    private static long factorialRepeat(int n) {
        long result = n;
        for (int i = n; i > 1; i--) {
            result = result * i; // 只要i大于1，就乘他
        }
        return result;
    }

    // 利用方法递归实现阶乘函数n!
    private static long factorialRecursion(int n) {
        if (n <= 1) { // n小于等于1，结束递归
            return n;
        } else { // 若n是一个大于1的整数，则重复递归调用
            return n * factorialRepeat(n - 1);
        }
    }

    // 利用三元运算符"?:"简化阶乘函数n!
    private static long factorialSimplify(int n) {
        return (n <= 1) ? n : n * factorialSimplify(n - 1);
    }
}
