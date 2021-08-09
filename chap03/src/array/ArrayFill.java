package array;
import java.util.Arrays; // 引用Arrays库
public class ArrayFill {
    public static void main(String[] args){
        int[] prices = new int[10]; // 声明一个整型数组，数组大小为10
        Arrays.fill(prices,99); // 给整型书的每个元素全部填写99
        for (int price : prices){ // 循环遍历并打印整型数组的所有有元素数值
            System.out.println("price="+price);
        }
    }
}
