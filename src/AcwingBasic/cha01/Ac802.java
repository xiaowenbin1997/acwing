package AcwingBasic.cha01;

import org.junit.Test;

import java.util.*;

/**
 * 区间和
 */
class Pair {
    int a;
    int b;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

public class Ac802 {
    static int N = 300010;
    //记录节点数
    static ArrayList<Integer> nodeList = new ArrayList<>();
    static ArrayList<Pair> addOp = new ArrayList<>();
    static ArrayList<Pair> queryOp = new ArrayList<>();
    static int[] a = new int[N];
    static int[] s = new int[N];

    //输入真实值，返回离散化后的值+1，其实这个就是在nodeList中找
    static int find(int x) {
        int l = 0, r = nodeList.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) >> 1;
            if (nodeList.get(mid) <= x)
                l = mid;
            else
                r = mid - 1;
        }
        return l + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //n个节点加上x
        int n = scanner.nextInt();
        //m次求出两个端点之间的和
        int m = scanner.nextInt();
        //录入add的情况
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int c = scanner.nextInt();
            addOp.add(new Pair(x, c));
            nodeList.add(x);
        }
        for (int i = 0; i < m; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            queryOp.add(new Pair(l, r));
            nodeList.add(l);
            nodeList.add(r);
        }
        Collections.sort(nodeList);
        getUniqueList(nodeList);
        for (Pair addPair : addOp) {
            //离散化之前的位置
            int posBef = addPair.a;
            int addNum = addPair.b;
            //离散化之后的位置加上某个值
            a[find(posBef)] += addNum;
        }
        for (int i = 1; i <= nodeList.size(); i++) {
            s[i] = s[i - 1] + a[i];
        }
        for (Pair query : queryOp) {
            int l = query.a;
            int r = query.b;
            System.out.println(s[find(r)] - s[find(l) - 1]);
        }
    }

    private static void getUniqueList(ArrayList<Integer> nodeList) {
        TreeSet<Integer> tempSet = new TreeSet<>(nodeList);
        nodeList.clear();
        nodeList.addAll(tempSet);
    }
}
