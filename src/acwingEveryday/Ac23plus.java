package acwingEveryday;

import java.io.*;

public class Ac23plus {
    public boolean hasPath(char[][] matrix, String str) {
        boolean[][] isVis = new boolean[matrix.length][];
        //初始化访问数组
        for (int i = 0;i < matrix.length;i++) {
            isVis[i] = new boolean[matrix[i].length];
            for (int j = 0;j < matrix[i].length;j++) {
                isVis[i][j] = false;
            }
        }
        for (int i = 0;i < matrix.length;i++) {
            for (int j = 0;j < matrix[i].length;j++) {
                if (dfs(matrix,isVis,0,i,j,str)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] matrix,boolean[][] isVis,int index,int i,int j,String str) {
        if (i < 0 || i > matrix.length - 1 || j < 0 || j > matrix[i].length - 1) {
            return false;
        }
        if (isVis[i][j]) {
            return false;
        }
        if (matrix[i][j] != str.charAt(index)) {
            return false;
        }
        if (index == str.length() - 1) {
            return true;
        }
        isVis[i][j] = true;
        index = index + 1;
        if (dfs(matrix,isVis,index,i - 1,j,str)) {
            return true;
        }
        if (dfs(matrix,isVis,index,i + 1,j,str)) {
            return true;
        }
        if (dfs(matrix,isVis,index,i,j - 1,str)) {
            return true;
        }
        if (dfs(matrix,isVis,index,i,j + 1,str)) {
            return true;
        }
        isVis[i][j] = false;
        index = index - 1;
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String matrixStr = br.readLine();
        char[][] matrix = {{'V','G','K','T','C'},{'Q','H','P','A','J'},{'Q','Q','S','X','T'}};
        String str = "GHPS";
        Ac23plus ac23plus = new Ac23plus();
        ac23plus.hasPath(matrix,str);
        //数据预处理
//        char[][] matrix = getMatrix(matrixStr);
    }

    private static char[][] getMatrix(String matrixStr) {
        StringBuilder sb = new StringBuilder(matrixStr);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);
        String str = sb.toString();
        String[] split = str.split(",");
        return null;
    }
}
