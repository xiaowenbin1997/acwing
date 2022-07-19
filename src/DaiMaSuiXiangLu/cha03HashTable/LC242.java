package DaiMaSuiXiangLu.cha03HashTable;


import java.util.Arrays;

/**
 * 242.有效的字母异位词
 */
public class LC242 {
    //哈希表来做
    public boolean isAnagram1(String s, String t) {
        int[] count = new int[26];
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            count[chars[i] - 'a']++;
        }
        for (int i = 0; i < chart.length; i++) {
            count[chart[i] - 'a']--;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) return false;
        }
        return true;
    }

    //排序后相等来做
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chart);
        return Arrays.equals(chars, chart);
    }
}
