package com.string.character;

public class PackChar {
    public static void main(String[] args){
        PackChar();
        is();
    }
    private static void PackChar(){
        Character character = 'A'; // 声明一个包装字符变量
        System.out.println("character="+character);
        char value = character.charValue(); // 把包装字符变量转换成基本字符变量
        System.out.println("value="+value);
        //Character类型与char类型得变量之间允许直接赋值，靠得是"自动装箱"和"自动拆箱"
        Character plusResult = (char)(character+1);
        System.out.println("plusResult="+plusResult);
    }
    private static void is(){
        Character letter = 'A'; // 声明一个包装字符变量
        // 下面是Character常用得字符处理方法
        boolean isDigit = Character.isDigit(letter); // idDigit方法判断字符是否为数字
        System.out.println("isDigit="+isDigit);
        boolean isLetter = Character.isLetter(letter); // isLetter方法用于判断是否为字母
        System.out.println("isLetter="+isLetter);
        boolean isLowerCase = Character.isLowerCase(letter); // isLowerCase方法判断字符是否都为小写
        System.out.println("isLowerCase="+isLowerCase);
        boolean isUpperCase = Character.isUpperCase(letter); // isUpperCase方法判断字符是否都为大写
        System.out.println("isUpperCase="+isUpperCase);
        Character line = '\n'; // 声明一个包装字符变量
        boolean isSpaceChar = Character.isSpaceChar(line); // isSpaceChar方法判断字符是否为空格
        System.out.println("isSpaceChar="+isSpaceChar);
        // isWhitespace方法判断字符是否为空白(非数字、非字母、非标点，包括空格、制表、回车、换行等)
        boolean isWhitespace = Character.isWhitespace(line);
        System.out.println("isWhitespace="+isWhitespace);
        char lowerCsee = Character.toLowerCase(letter); // toLowerCase方法把字符转换为大写
        System.out.println("lowerCase="+lowerCsee);
        char upperCase = Character.toUpperCase(letter); // toUpperCase方法把字符转换为小写
        System.out.println("UpperCase="+upperCase);
        }
}
