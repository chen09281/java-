package method.function;

public class getNsquareRootArray {
    private static double[] getNsquareRootArray(double number,int n){
        if (n<=0){
            System.out.println("n必须为自然数");
            return new double[]{}; // 若输入参数非法，则默认返回一个空的双精度数组
        } else if (n%2==0 && number<0){
            System.out.println("不能对负数开偶次方根");
            return new double[]{};
        }
        // 下面利用牛顿迭代法求数字的N次方根
        double nsquareRoot = number;
        for (int i=0;i<n*2;i++){
            double slope = n*Math.pow(nsquareRoot,n-1);
            nsquareRoot=nsquareRoot-(Math.pow(nsquareRoot,n)-number)/slope;
        }
        double[] rootArray; // 声明一个放跟数组
        if (n%2==0){ // 求偶次方跟，则方根有正值和负值两个数值
            rootArray = new double[]{nsquareRoot,-nsquareRoot};
        } else { // 求奇次方根，则方根只会有一个数值
            rootArray = new double[]{nsquareRoot};
        }
        return rootArray; // return后面跟着rootArray，其变量类型与返回值类型一样都是双精度数组
    }
}
