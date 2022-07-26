package DaiMaSuiXiangLu.cha03HashTable;

import java.util.HashMap;
import java.util.Map;

public class LC1 {
    public int[] twoSum(int[] nums, int target) {
        //map key 存数组中的值，value存下标，都是int类型
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            Integer pos = map.get(temp);
            if (pos != null) {//这种情况就是找到了，直接返回
                result[0] = pos;
                result[1] = i;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
