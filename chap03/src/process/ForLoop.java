package process;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("长野漫漫，无心睡眠，请给他设定一个睡醒的年限");
        Scanner scan = new Scanner(System.in);
        int limit = scan.nextInt();
        int year;
        for (year = 0; year < limit; year++) {
            System.out.println("已经过去的年份：" + year);
        }
        System.out.println("他足足睡了这么多年");
    }
}
