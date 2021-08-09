package array;

public class ColonJump {
    public static void main(String[] args){
        double[][] triangle = {{-2.0,0.0},{0.0,-1.0},{2.0,1.0}};
        // 下面通过多重循环依次打印二维数组里面的元素
        for (int i=0; i < triangle.length; i++){
            for (int j=0; j< triangle[i].length; j++){
                System.out.println("value="+triangle[i][j]);
            }
        }
    }
}
