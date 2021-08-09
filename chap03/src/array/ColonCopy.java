package array;

import java.util.Arrays;

public class ColonCopy {
    public static void main(String[] args){
        int[] pricesOrigin = new int[5];
        Arrays.fill(pricesOrigin,99);
        // 复制数组的第二个办法：调用原数组的clone方法。新数组由原数组克隆而来
        int[] pricesClone = pricesOrigin.clone();
        pricesOrigin[1] = 80;
        for (int price:pricesClone){ // 循环遍历并打印整型数组的所有元素数值
            System.out.println("clone price="+price);
        }
    }
}
