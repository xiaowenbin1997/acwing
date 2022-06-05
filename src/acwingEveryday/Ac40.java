package acwingEveryday;

public class Ac40 {
    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};
    public int[] printMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0)    return new int[0];
        int length = matrix.length * matrix[0].length;
        int[] resultNums = new int[length];
        boolean[][] isVisit = new boolean[matrix.length][matrix[0].length];
        int x = 0, y = 0;
        int newx = 0,newy = 0;
        int k = 0;//标记坐标的批次做循环
        for (int i = 0; i < length;i++) {
            resultNums[i] = matrix[x][y];
            isVisit[x][y] = true;
            newx = x + dx[k];
            newy = y + dy[k];
            if (outOfRange(newx,newy,isVisit)) {
                k = (k + 1) % 4;
                newx = x + dx[k];
                newy = y + dy[k];
            }
            x = newx;
            y = newy;
        }
        return resultNums;
    }
    private boolean outOfRange(int ix,int jy,boolean[][] isVisit) {
        if (ix < 0 || ix >= isVisit.length)  return true;
        if (jy < 0 || jy >= isVisit[0].length)     return true;
        if (isVisit[ix][jy])    return true;
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},{5, 6, 7, 8},{9,10,11,12}};
        Ac40 ac40 = new Ac40();
        int[] ints = ac40.printMatrix(matrix);
        System.out.println(ints);
    }

}
