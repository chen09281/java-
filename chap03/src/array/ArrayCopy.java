package array;
import java.util.Arrays;
public class ArrayCopy {
    public static void main(String[] args){
        int[] pricesOrigin = new int[5];
        Arrays.fill(pricesOrigin,99);
        // 复制数组的第一个办法：利用等号直接赋值。新数组只是原数组的别名
        int[] pricesAssign = pricesOrigin;
        pricesOrigin[1] = 80;
        for (int price:pricesAssign){ // 循环遍历并打印整型数组的所有元素数值
            System.out.println("assign price="+price);
        }
    }
}
