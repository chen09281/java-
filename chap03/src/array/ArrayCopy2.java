package array;

import java.util.Arrays;

public class ArrayCopy2 {
    public static void main(String[] args){
        int[] pricesOrigin = new int[5];
        Arrays.fill(pricesOrigin,99);
        // 复制数组的第3个方法：调用Arrays工具的copyOf方法。允许复制部分元素
        int[] pricesPart = Arrays.copyOf(pricesOrigin,pricesOrigin.length-1);
        for (int price:pricesPart){ // 循环遍历并打印整型数组的所有元素数值
            System.out.println("part price="+price);
        }
    }
}
