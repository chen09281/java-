package array;

public class ColonErgodic {
    public static void main(String[] args){
        int[] numbers = {2, 3, 5, 7};
        // 在for循环中，可利用"变量类型 变量名称:数组名称"的形式，直接把数组元素赋值给该变量
        for (int number: numbers) {
            System.out.println("number="+number);
        }
    }
}
