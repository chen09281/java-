package process;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args){
        System.out.println("凉风有信，秋月无边，打二字");
        System.out.println("获取“凉风有信”的谜底请按1，获取“秋月无边”的谜底请按2");
        Scanner scan = new Scanner(System.in); //从控制台接收输入文本
        int seq = scan.nextInt(); //nextInt方法表示接受一个整数，以回车键结尾
        if (seq == 1) { //为1的情况
            seq = 1;
        }else { //不为1的情况
            seq = 2;
        }
        if (seq == 1) { //按1时打印"凉风有信"的谜底
            System.out.println("凉风有信的谜底时“讽”");
        }
        if (seq == 2) { //按2时打印“秋月无边”的谜底
            System.out.println("秋月无边的谜底是“二”");
        }
    }
}
