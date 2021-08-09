package array;

import java.util.Arrays;

public class ArraysCopyOf {
    public static void main(String[] args) {
        int[] pricesOrigin = new int[5];
        Arrays.fill(pricesOrigin, 99);
        // 把copyOf方法的返回值赋给原数组，可以动态调整该数组的大小
        pricesOrigin = Arrays.copyOf(pricesOrigin,pricesOrigin.length+1);
        for (int price:pricesOrigin){
            System.out.println("origin price="+price);
        }
    }
}
