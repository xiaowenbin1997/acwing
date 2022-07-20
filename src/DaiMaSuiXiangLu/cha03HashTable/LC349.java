package DaiMaSuiXiangLu.cha03HashTable;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LC349 {
    //运用流的一种解法
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        set1.addAll(Arrays.stream(nums1).boxed().collect(Collectors.toList()));
        for (int i = 0;i < nums2.length;i++) {
            if (set1.contains(nums2[i])) {
                resultSet.add(nums2[i]);
            }
        }
        return resultSet.stream().mapToInt(Integer::intValue).toArray();
    }
}
