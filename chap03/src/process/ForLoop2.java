package process;

import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args){
        System.out.println("长野漫漫，无心睡眠，请给他设定一个睡醒的年限");
        Scanner scan = new Scanner(System.in);
        int limit = scan.nextInt();
        for (int year=0;;year++){
            System.out.println("已经过去的年份："+year);
            if (year>=limit){ // 这里判断能否跳出循环
                System.out.println("他足足睡了那么多年:"+year);
                break; // 跳出循环，即跳到for循环的右花括号之后
            } else {
                continue; // 继续下一次循环。此时先整形year++，再执行循环内部语句
            }
        }
    }
}
