package process;

public class ForPrint {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 7};
        for (int i = 0; i < numbers.length; i++){
            int number = numbers[i]; // 获取下表为i的元素，并赋值给名为number的遍历
            System.out.println("number="+number);
        }
    }
}
