package acwingEveryday;

import java.util.Arrays;
import java.util.Comparator;

public class Ac58 {

    public String printMinNumber(int[] nums) {
        Integer[] integers = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Comparator<Integer> myComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String str1 = String.valueOf(o1);
                String str2 = String.valueOf(o2);
                return (str1 + str2).compareTo(str2 + str1);
            }
        };
        Arrays.sort(integers, myComparator);
        String result = "";
        for (int i = 0; i < integers.length;i++) {
            result += integers[i];
        }
        return result;
    }
}

