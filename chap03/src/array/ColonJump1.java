package array;

public class ColonJump1 {
    public static void main(String[] args){
        double[][] triangle = {{-2.0,0.0},{0.0,-1.0},{2.0,1.0}};
        // 处理要求：一旦发现数组元素等于0.0，就立即从第二次循环跳出第一层循环(跳出两层循环)
        for (int i=0; i<triangle.length; i++){
            boolean isFound = false; // 该布尔变量用来标记是否找到0.0
            for (int j=0; j<triangle[i].length; j++){
                if (triangle[i][j] == 0.0){
                    isFound = true; // 找到了0.0
                    System.out.println("simple found 0.0");
                    break; // 跳出二层循环
                }
            }
            if (isFound){ // 根据布尔变量判断是否找到了0.0
                break; // 跳出第一层循环
            }
        }
    }
}
