package process;

import java.util.Scanner;

public class WhileLoop1 {
    public static void main(String[] args) {
        System.out.println("长夜漫漫，无心睡眠，请给他设定一个睡醒的年限");
        Scanner scan = new Scanner(System.in); // 从控制台接收输入文本
        int limit = scan.nextInt(); // nextInt方法表示接收一个整数，以回车结尾
        int year = 0;
        do {
            System.out.println("已经过去的年份:" + year);
            year++;
        } while (year < limit);
        System.out.println("他足足睡了这么多年：" + year);
    }
}
