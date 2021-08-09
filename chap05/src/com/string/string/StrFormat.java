package com.string.string;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StrFormat {
    public static void main(String[] args){
        // 往字符串中填入另一个字符串
        String fromString = String.format("格式化子串的字符串: %s","hello");
        System.out.println("fromString="+fromString);
        // 往字符串中填入字符
        String fromChar = String.format("格式化字符的字符串 :%c",'A');
        System.out.println("fromChar="+fromChar);
        // 往字符串中填入布尔值
        String fromBoolean = String.format("格式化布尔值的字符串: %b",false);
        System.out.println("fromBoolean="+fromBoolean);
        // 往字符串中填入十进制整数
        String fromInt = String.format("格式化整型数的字符串:%d",255);
        System.out.println("fromint="+fromInt);
        // 往字符串中填入十六进制数
        String fromOct = String.format("格式化十六进制数的字符串 %o",255);
        System.out.println("fromOct="+fromOct);
        // 往字符串中填入八进制数
        String fromHex = String.format("格式化八进制的字符串 %x",255);
        System.out.println("FfromHex="+fromHex);
        // 往字符串中填入浮点数
        String fromFloat = String.format("格式化浮点数的字符串: %f",3.14);
        System.out.println("fromFloat="+fromFloat);
        // 格式化字符串的时候们同事填充多个变量
        String manyVariable = String.format("一下字符串包括多个变量值: %s,%c,%b,%d,%o,%x,%f","Hello",'A',false,255,255,255,3.14);
        System.out.println("manyVariable="+manyVariable);
        // tips:若是通过%f格式化双精度，则会强制转换成浮点型
        String fromDouble = String.format("双精度格式化后丢失精度的字符串: %f",3.1415926);
        System.out.println("fromDouble="+fromDouble);
        // 格式化双精度时，需要指定小数点后面保留的位数
        String fromDecimal = String.format("格式化双精度数的字符串: %.8f",3.1415926);
        System.out.println("fromDecimal="+fromDecimal);
        // 对整数分配固定长度，该整数默认右对齐、左补空格
        String fromLenth = String.format("格式化固定长度(默认右对齐)的证书字符串: (%8d)",255);
        System.out.println("fromLenth="+fromLenth);
        // 对整数分配固定长度，且该整数左对齐、右补空格
        String fromLeft = String.format("格式化固定长度且左对齐的证书字符串:(%-8d)",255);
        System.out.println("fromLeft="+fromLeft);
        // 对整数分配固定长度，该整数默认右对齐、左补0
        String fromzERO = String.format("格式化固定长度且左补0的整数字符串:(%08d)",255);
        System.out.println("fromZero="+fromzERO);
        // 字符串格式化的时候，可能出现某个变量被多次填入的情况
        String fromRepeat1 = String.format("重要的事情说3遍: %s,%s,%s","别迟到","别迟到","别迟到");
        System.out.println("fromRepat1="+fromRepeat1);
        // 重复填入某个变量值，可利用"%数字$"的形式，其中"数字$"表示这里去后面的第几个变量值
        String fromRepeat2 = String.format("重要的事情说三遍: %1$s,%1$s,%1$s","别迟到");
        System.out.println("fromRepeat2="+fromRepeat2);
        double normalDecimal = 19.895;
        // 保留刷给你精度数的小数点后面两位
        String normalResult = formatWithDouble(normalDecimal,2);
        System.out.println("normalResult="+normalResult);
        BigDecimal bigDecimal = new BigDecimal("12345678.901");
        String bigResult = formatWithBigDecimal(bigDecimal,2);
        System.out.println("bigResult="+bigResult);
    }
    // 对双精度类型的变量截取小数位，多余部分的数字默认四舍五入
    public static String formatWithDouble(double value,int digit){
        // 现根据小数为数构建格式化标记串。两个百分号"%%"可转义为一个百分号"%"
        String format = String.format("%%.%df",digit);
        // 再依据标记将具体数字格式化为字符串
        String result = String.format(format,value);
        return result;
    }
    //对于带线啊哦书类型的变量窃取小数位，可指定多余部分大数字的舍入规则
    public static String formatWithBigDecimal(BigDecimal value,int digit){
        // 大小数类型的setScale方法需要指定明确的舍入规则，其中HALF_UP表示四舍五入
        BigDecimal result = value.setScale(digit, RoundingMode.HALF_UP);
        return result.toString();
    }
}
