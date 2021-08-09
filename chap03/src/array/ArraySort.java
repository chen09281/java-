package array;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args){
        int[] prices = {99,80,18,68,8};
        // 对整型数组prices里的元素排序，sort方法得到的结果是升序排序
        Arrays.sort(prices);
        for (int price:prices){
            System.out.println("price="+price);
        }
    }
}
