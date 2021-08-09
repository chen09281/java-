package method.function;

public class Output {
    // 若不反悔任何数据，也就是不存在输出参数，则返回值填void
    // printNsquareRoot方法用于打印指定数字的N次方根
    private static void printNsquareRoot(double number,int n){
        if (n<=0){
            System.out.println("n必须为自然数");
            return;
        } else if (n%2==0 && number<0){
            System.out.println("不能对负数开偶次方根");
            return; // 不带任何参数直接返回，return语句表示该方法的剩余代码都不予执行
        }
        // 下面利用牛顿迭代法求数字的N次方根
        double nsquareRoot = number;
        for (int i=0;i<n*2;i++){ // 只需迭代2n次，即可求得较为精确的方根
            double slope = n*Math.pow(nsquareRoot,n-1); // 求导数，即切线的斜率
            nsquareRoot = nsquareRoot-(Math.pow(nsquareRoot,n)-number)/slope;
        }
        System.out.println(number+"的"+n+"次方根="+nsquareRoot);
        // return; // 若方法的返回值类型为void，则方法末尾的return语句可加可不加
    }
    private static double getNsquareRoot(double number,int n){
        if (n<=0){
            System.out.println("n必须为自然数");
            return 0; // 若输入参数非法，则默认返回0
        } else if (n%2==0&&number<0){
            System.out.println("不能对负数开偶次方根");
            return 0;
        }
        // 下面利用牛顿迭代法求数字的N次方根
        double nsquareRoot = number;
        for (int i=0;i<n*2;i++){ // 只需迭代2n次，即可求得较为精确的方根
            double slope = n*Math.pow(nsquareRoot,n-1);
            nsquareRoot = nsquareRoot-(Math.pow(nsquareRoot,n)-number)/slope;
        }
        return nsquareRoot; // return后面跟着返回的变量名称，该变量类型与返回值类型保持一致
    }
}
