package com.string.string;

import java.math.BigDecimal;
import java.math.BigInteger;

public class StrAssign {
    public static void main(String[] args){
        String number = "123456";
        Integer packInt = Integer.parseInt(number); // 将字符串变量转换成包装整型变量
        System.out.println("packInt="+packInt);
        Long packLong = Long.parseLong(number); // 将字符串变量转换成包装长整型变量
        System.out.println("packLong="+packLong);
        Float packFloat = Float.parseFloat(number); // 将字符串变量转换成包装浮点型变量
        System.out.println("packFloat="+packFloat);
        Double packDouble = Double.parseDouble(number); // 将字符串变量转换成包装双精度变量
        System.out.println("packDouble="+packDouble);
        String zhen = "true";
        Boolean packBoolean = Boolean.parseBoolean(zhen); // 将字串变量转换成包装布尔型变量
        System.out.println("packBoolean="+packBoolean);
        char[] numberArray = number.toCharArray(); // 将字符串转换成字符数组
        for (char item: numberArray){ // 遍历并打印字符数组中的各元素
            System.out.println("item="+item);
        }
        String bigNumber = "1234567890";
        BigInteger bigInt = new BigInteger(bigNumber); // 将字符串变量转换成大整数变量
        System.out.println("bigInt="+bigInt);
        BigDecimal bigDec = new BigDecimal(bigNumber); // 将字符串变量转成大小数变量
        System.out.println("bigDec="+bigDec);
    }
}
