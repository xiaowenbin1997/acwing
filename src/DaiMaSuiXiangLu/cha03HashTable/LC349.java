package DaiMaSuiXiangLu.cha03HashTable;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

public class LC349 {
    //运用流的一种解法
    public int[] intersection1(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        set1.addAll(Arrays.stream(nums1).boxed().collect(Collectors.toList()));
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                resultSet.add(nums2[i]);
            }
        }
        return resultSet.stream().mapToInt(Integer::intValue).toArray();
    }

    //运用数组的一种解法
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] nums = new int[1003];
        for (int i = 0; i < nums1.length; i++) {
            nums[nums1[i]]++;
        }
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (nums[nums2[i]] > 0) {
                result.add(nums2[i]);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 9, 5};
        int[] nums2 = new int[]{9, 4, 9, 8, 4};
        LC349 lc349 = new LC349();
        lc349.intersection(nums1, nums2);
    }
}
