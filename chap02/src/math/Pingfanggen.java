package math;

public class Pingfanggen {
    public static void main(String[] args){
        double number = 3; //需要求平方根的数值
        double Xm = number; //每次迭代后的数值
        Xm = (Xm+number/Xm) / 2; //第一次迭代后的平方根
        System.out.println(number+"的平方根="+Xm);
        Xm = (Xm + number/Xm)/2; //第二次迭代后的平方根
        System.out.println(number+"的平方根="+Xm);
        Xm = (Xm + number/Xm)/2; //第三次迭代后的平方根
        System.out.println(number+"的平方根="+Xm);
    }
}
