package AcwingBasic.cha01;

import java.util.*;


/**
 * 区间合并
 */

class PairAc803 {
    int l;
    int r;

    public PairAc803(int l, int r) {
        this.l = l;
        this.r = r;
    }
}

public class Ac803 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<PairAc803> pairArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            pairArray.add(new PairAc803(l, r));
        }
        System.out.println(mergeArray(pairArray));
    }

    private static int mergeArray(ArrayList<PairAc803> pairArray) {
        if (pairArray == null || pairArray.size() == 0) return 0;
        Collections.sort(pairArray, new Comparator<PairAc803>() {
            @Override
            //目标是先按左端点排升序，左端点相同就按右端点排升序
            public int compare(PairAc803 o1, PairAc803 o2) {
                if (o1.l == o2.l) {
                    return o1.r - o2.r;
                } else {
                    return o1.l - o2.l;
                }
            }
        });
        List<PairAc803> resultArr = new ArrayList<>();
        int tempLeft = pairArray.get(0).l;
        int tempRight = pairArray.get(0).r;
        for (PairAc803 tempPair : pairArray) {
            if (tempPair.l <= tempRight){
                tempRight = Math.max(tempRight,tempPair.r);
            } else {
                resultArr.add(new PairAc803(tempLeft,tempRight));
                tempLeft = tempPair.l;
                tempRight = tempPair.r;
            }
        }
        if (tempRight < Math.pow(10,9)){
            resultArr.add(new PairAc803(tempLeft,tempRight));
        }
        return resultArr.size();
    }
}
