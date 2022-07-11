package AcwingBasic.cha01;

import java.util.LinkedList;
import java.util.Scanner;

public class Ac826 {
    static int N = 100010;
    static int[] e = new int[N];
    static int[] ne = new int[N];
    //head指向头结点，idx指向最新元素的位置
    static int head, index;

    public static void initLinkedList() {
        head = -1;
        index = 0;
    }

    public static void addHead(int val) {
        e[index] = val;
        ne[index] = head;
        head = index;
        index++;
    }

    //第k个插入的数，应该就是在k - 1的位置上
    //我们应该找到指向ta的这个数先
    public static void delIndexK(int k) {
        int val = e[k - 1];
        int nextIndex = ne[head];
        while (nextIndex != -1) {
            if (nextIndex == k - 1) {
                break;
            }
            nextIndex = ne[nextIndex];
        }
        ne[nextIndex] = ne[ne[nextIndex]];
    }

    //在第k个插入的数后插入一个数,位置在k - 1
    public static void insertAfterK(int k, int val) {
        e[index] = val;
        ne[index] = ne[k - 1];
        ne[k - 1] = index;
        if (index == 1) {
            head = index;
        }
        index++;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());
        initLinkedList();
        while (m-- > 0) {
            String tempStr = scanner.nextLine();
            String[] strs = tempStr.split(" ");
            switch (strs[0]) {
                case "H":
                    int valH = Integer.parseInt(strs[1]);
                    addHead(valH);
                    break;
                case "I":
                    int indexI = Integer.parseInt(strs[1]);
                    int valI = Integer.parseInt(strs[2]);
                    insertAfterK(indexI,valI);
                    break;
                case "D":
                    int indexD = Integer.parseInt(strs[1]);
                    delIndexK(indexD);
                    break;
            }
        }
        int visitIndex = head;
        while (visitIndex != -1) {
            System.out.print(e[visitIndex]);
            visitIndex = ne[visitIndex];
        }
    }
}
