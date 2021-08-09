package array;

public class ColonJump3 {
    public static void main(String[] args){
        double[][] triangle = {{-2.0,0.0},{0.0,-1.0},{2.0,1.0}};
        // 下面用到了两种冒号：一种用来标记循环；另一种用来简化代码
        loop2 : for (double[] dot:triangle){ // dot等价于前面的triangle[i]
            for (double coordinate : dot){ // coordinate等价于前面的triangle[i][j]
                if (coordinate == 0.0){ // 找到了0.0.准备跳出循环
                    System.out.println("loop2 found 0.0");
                    break loop2; // 跳出loop2代表的循环
                }
            }
        }
    }
}
