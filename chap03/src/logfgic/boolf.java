package logfgic;

public class boolf {
    public static void main(String[] args){
        boolean value = true; //为布尔变量赋初始值
        System.out.println("value="+value);
        // 对布尔变量做"与"运算，且运算结果仍旧保存在该变量中，则可使用运算符"&="
        value &= false; //该行代码等同于 value = value & false
        System.out.println("value="+value);
        // 对布尔变量做"或"运算，且运算结果仍旧保存在该变量中，则可使用运算符"|="
        value |= true; //该行代码等同于 value = value|true;
        System.out.println("value="+value);
        // 对布尔变量做"异或"运算，且运算结果仍旧保存在该变量中，则可使用运算符"^="
        value ^= false; //该行代码等同于 value = value^false;
        System.out.println("value="+value);
    }
}
