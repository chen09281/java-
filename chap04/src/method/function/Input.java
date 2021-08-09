package method.function;

import java.util.Date;

public class Input {
    // 若没有输入参数，则方法名称后面的圆括号内部留空。showTime方法的用途是显示当前时间
    private static void showTime(){
        Date date = new Date(); // 创建一个时间实例
        int hour = date.getHours(); // 获取当前时钟
        int minute = date.getMinutes(); // 获取当前分秒
        int second = date.getSeconds(); // 获取当前秒钟
        System.out.println("当前时间是"+hour+"时"+minute+"分"+second+"秒");
    }
    public static void main(String[] args){
        showTime(); // 显示当前时间
    }
    // 只有一个输入参数，参数格式为"参数类型 参数名称"
    // setAlarm方法的用途是设置指定时刻的闹钟，其中始终为在当前时间上增加若干小时
    private static void setAlarm(int addedHour){
        Date date = new Date(); // 创建一个时间实例
        int hour = date.getHours()+addedHour; // 给当前始终加上若干小时
        int minute = date.getMinutes();
        int second  = date.getSeconds();
        System.out.println("设定的闹钟时间是"+hour+"时"+minute+"分"+second+"秒");
    }
    private  static void setAlarm(int... addedNumber){
        Date date = new Date();
        int hour = date.getHours();
        int minute = date.getMinutes();
        int second = date.getSeconds();
        // 可变参数的数量也是通过".length"获得的
        if (addedNumber.length>0){ // 至少有一个输入参数
            // 获取指定位置的可变参数，依然通过下标"[数字]"实现，就像时访问数组元素一般
            hour += addedNumber[0];
        }
        if (addedNumber.length>1){
            minute += addedNumber[1];
        }
        if (addedNumber.length>2){
            minute += addedNumber[2];
        }
        System.out.println("可变参数谁当的闹钟时间是"+hour+"时"+minute+"分"+second+"秒");
    }
    // 编译器认为"int..."与“int[]"类型先沟通，所以不允许定义参数为"int..."和:"int[]"的同名方法
    private static void setAlarmByArray(int[] addedNumber){
        Date date = new Date();
        int hour = date.getHours();
        int minute = date.getMinutes();
        int second = date.getSeconds();
        if (addedNumber.length>0){
            hour += addedNumber[0];
        }
        if (addedNumber.length>1){
            hour += addedNumber[1];
        }
        if (addedNumber.length>2){
            hour += addedNumber[2];
        }
        System.out.println("可变参数谁当的闹钟时间是"+hour+"时"+minute+"分"+second+"秒");
    }
}
