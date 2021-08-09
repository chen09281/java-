package method.function;

public class PackNumber {
    public static void main(String[] args){
        Integer oneInterger = Integer.valueOf(1);
        System.out.println("oneInterger="+oneInterger);
        byte oneByte = oneInterger.byteValue();
        System.out.println("oneByte="+oneByte);
        short oneShort = oneInterger.shortValue();
        System.out.println("oneShort="+oneShort);
        int oneInt = oneInterger.intValue();
        System.out.println("oneInt="+oneInt);
        long oneLong = oneInterger.longValue();
        System.out.println("oneLong="+oneLong);
        float oneFloat = oneInterger.floatValue();
        System.out.println("oneFlat="+oneFloat);
        double oneDouble = oneInterger.doubleValue();
        System.out.println("oneDouble="+oneDouble);
    }
}
