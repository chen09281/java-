package array;

public class TwoDimensional3 {
    public static void main(String[] args){
        // 以下是声明二维数组的第一种形式:"变量类型 数组名称[][]"
        double triangle[][];
        // 以下是分配二维数组空间的第一种形式：在两队方括号内分别填入数字，表示数组有几行几列
        triangle = new double[3][2];
        // 数组名称后面的"[数字][数字]"为数组元素的行列下标，表示当前操作第几行第几列的元素
        triangle[0][0] = -2.0;
        triangle[0][1] = 0.0;
        triangle[1][0] = 0.0;
        triangle[1][1] = -1.0;
        triangle[2][0] = 2.0;
        triangle[2][1] = 1.0;
        // 下面通过循环语句依次计算三角形每条边的长度
        // 假设第一个数组元素代表点A，第二个数组元素代表点B，第三个数组元素代表点C
        // 假设循环将依次求得AB、AC、BC这3条边的长度
        for (int i = 0;i<triangle.length-1;i++){
            for (int j = i+1;j<triangle.length;j++){
                // 获取两个顶点在横轴方向的距离
                double xDistance = Math.abs(triangle[j][0]-triangle[i][0]);
                // 获取两个定点在纵轴方向的距离
                double yDistance = Math.abs(triangle[j][1]-triangle[i][1]);
                // 根据勾股定理计算连接两个顶点的斜边产固定
                double distance = Math.sqrt(xDistance*xDistance+yDistance*yDistance);
                System.out.println("i="+i+",j="+j+",distance="+distance);
            }
        }
    }
}
