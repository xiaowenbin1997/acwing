package acwingEveryday;

import java.util.ArrayDeque;
import java.util.Queue;

class Pair{
    int x;
    int y;
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
public class Ac24 {
    public int movingCount(int threshold, int rows, int cols) {
        boolean[][] isVis = new boolean[rows][cols];
        int count = 0;
        int dx[] = {-1,0,1,0},dy[] = {0,1,0,-1};
        Queue<Pair> queue = new ArrayDeque<>();
        if (rows == 0 || cols == 0) return 0;
        queue.add(new Pair(0,0));
        while (!queue.isEmpty()) {
            Pair temp = queue.poll();
            if (isVis[temp.x][temp.y] || getPairSum(temp) > threshold)  continue;
            for (int i = 0;i < 4;i++) {
                if (temp.x + dx[i] >=0
                        &&temp.x + dx[i] < rows
                        &&temp.y + dy[i] >= 0
                        &&temp.y + dy[i] < cols) {
                    queue.add(new Pair(temp.x + dx[i],temp.y + dy[i]));
                }
            }
            isVis[temp.x][temp.y] = true;
            count++;
        }
        return count;
    }
    /**
     * 输入一个数，返回ta的数位和
     * @param num
     * @return
     */
    private int getSumNum(int num) {
        int sum = 0;
        while (num > 0) {
            int temp = num % 10;
            sum = sum + temp;
            num = num / 10;
        }
        return sum;
    }
    private int getPairSum(Pair pair) {
        return getSumNum(pair.getX()) + getSumNum(pair.getY());
    }

//    public static void main(String[] args) {
//        Ac24 ac24 = new Ac24();
//        System.out.println(ac24.movingCount(18,40,40));
//    }
}
