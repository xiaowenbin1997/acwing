import java.util.Scanner;

/**
 * 给定一个 row×col 的二维数组 a，请你编写一个函数，void print2D(int a[][N], int row, int col)，打印数组构成的 row 行，col 列的矩阵。
 *
 * 注意，每打印完一整行需要输出一个回车。
 *
 * 输入格式
 * 第一行包含两个整数 row,col。
 *
 * 接下来 row 行，每行包含 col 个整数，表示完整二维数组 a。
 *
 * 输出格式
 * 共 row 行，每行 col 个整数，表示打印出的矩阵。
 *
 * 数据范围
 * 1≤row≤100,
 * 1≤col≤100
 */

public class t813 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int[][] nums = new int[row][col];
        for (int i = 0;i < row;i++){
            for (int j = 0;j < col;j++){
                nums[i][j] = scan.nextInt();
            }
        }
        print2D(nums,row,col);
    }
    public static void print2D(int a[][],int row,int col){
        for (int i = 0;i < row;i++){
            for (int j = 0;j < col;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
