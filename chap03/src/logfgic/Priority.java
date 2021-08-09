package logfgic;

public class Priority {
    public static void main(String[] args){
        //比较加减乘除以及取余数运算的优先级
        int fiveArithmetic = 7+5-4*6/3%9; //等价与"7+5-(4*6/3%9)"
        System.out.println("fiveArithmetic="+fiveArithmetic);
        //比较负号与乘除运算的优先顺序
        int negativeArithmetic = -8/4+2*-3; //等价于"(-8)/4+2*(-3)"
        System.out.println("negativeArithmetic="+negativeArithmetic);
    }
}
