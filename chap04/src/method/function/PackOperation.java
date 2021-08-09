package method.function;

public class PackOperation {
    public static void main(String[] args){
        Integer ten1=10,ten2=10; // 准备演示两个包装变量之间==运算
        boolean equalTen = (ten1==ten2); // 当变量值小于128时，==运算侥幸得手
        System.out.println("equalTen="+equalTen);
        Integer thousand1=1000,thousand2=1000; // 准备演示两个包装变量之间的==运算
        boolean equalThousand = (thousand1==thousand2);
        System.out.println("equalThousand="+equalThousand);
        int a=7,b=8;
        int sum =Integer.sum(a,b);
        System.out.println("sum="+sum);
        int max = Integer.max(a,b);
        System.out.println("max="+max);
        int min = Integer.min(a,b);
        System.out.println("min="+min);
        int compareResult = Integer.compare(a,b);
        System.out.println("compareResult="+compareResult);


//        boolean a =true,b=false;
        // 布尔包装类型的logicalAnd方法相当于"逻辑与"运算符"&"
//        boolean andResult = Boolean.logicalAnd(a,b);
//        System.out.println("andResult="+andResult);
//        // 布尔包装类型的logicalOr方法相当于"逻辑或"运算符“|”
//        boolean orResult = Boolean.logicalOr(a,b);
//        System.out.println("orResult="+orResult);
//        // 布尔包装类型的logicalXor方法相当于“逻辑异或”运算符"^"
//        boolean xorResult = Boolean.logicalXor(a,b);
//        System.out.println("xorResult="+xorResult);
    }
}
