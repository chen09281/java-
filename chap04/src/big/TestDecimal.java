package big;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class TestDecimal {
    public static void main(String[] args){
        BigDecimal sevenAndHalf = BigDecimal.valueOf(7.5); // 生成一个指定数值的大小数变量
        BigDecimal three = BigDecimal.valueOf(3); // 生成一个指定数值的大小数变量
        BigDecimal one = BigDecimal.valueOf(100);
        MathContext mc = new MathContext(64, RoundingMode.HALF_UP);
        BigDecimal divByMC = one.divide(three,mc);
        System.out.println("divByMC="+divByMC);
//        BigDecimal divTest = sevenAndHalf.divide(three);
//        System.out.println("divTest="+divTest);
//        BigDecimal sum =sevenAndHalf.add(three);
//        System.out.println("sum="+sum);
//        BigDecimal sub = sevenAndHalf.subtract(three);
//        System.out.println("sub="+sub);
//        BigDecimal mul = sevenAndHalf.multiply(three);
//        System.out.println("mul="+mul);
//        BigDecimal div = sevenAndHalf.divide(three);
//        System.out.println("div="+div);
//        BigDecimal remainder = sevenAndHalf.remainder(three);
//        System.out.println("remainder="+remainder);
//        BigDecimal neg = sevenAndHalf.negate();
//        System.out.println("neg="+neg);
//        BigDecimal abs = sevenAndHalf.abs();
//        System.out.println("abs="+abs);
//        BigDecimal pow = sevenAndHalf.pow(2);
//        System.out.println("pow="+pow);
    }
}
