package logfgic;

public class Bool {
    public static void main(String[] args){
        //boolean表示布尔类型，该类型的变量只允许两个数值,即true和false
        boolean zhen = true; //true表示真
        System.out.println("zhen="+zhen);
        boolean jia = false; //false表示为假
        System.out.println("jia="+jia);
        boolean not = !zhen; //"!"放在布尔变量前面表示开展"非"运算
        System.out.println("not="+not);
        boolean and = zhen&jia; //"&"放在两个布尔变量之间表示开展"与”运算
        System.out.println("and="+and);
        boolean or = zhen | jia; //"|"放在两个布尔变量之间表示开展"或"运算
        System.out.println("or="+or);
        boolean xor = zhen^jia; //"^"放在两个布尔变量之间表示开展"异或"运算
        System.out.println("xor="+xor);
    }
}
