package array;

public class ColonJump2 {
    public static void main(String[] args){
        double[][] triangle = {{-2.0,0.0},{0.0,-1.0},{2.0,1.0}};
        // 下面的loop1是一个记号，连同后面的冒号加在for前面，表示它指代这个for循环
        loop1 : for (int i=0; i< triangle.length; i++){
            for (int j=0; j<triangle[i].length; j++){
                if (triangle[i][j] == 0.0){ // 找到了0.0，准备跳出外层循环
                    System.out.println("loop1 found 0.0");
                    break loop1; // 跳出loop1代表的训话，也就是跳出第一层循环
                }
            }
        }
    }
}
