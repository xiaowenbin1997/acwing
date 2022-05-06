package acwingEveryday;

/**
 * 16. 替换空格
 * 请实现一个函数，把字符串中的每个空格替换成"%20"。
 *
 * 数据范围
 * 0≤ 输入字符串的长度 ≤1000。
 * 注意输出字符串的长度可能大于 1000。
 */
public class Ac16 {
    public String replaceSpaces(StringBuffer str) {
        for (int i = 0; i < str.length();i++) {
            if (' ' == str.charAt(i)) {
                str.replace(i,i + 1,"%20");
            }
        }
//        return new String(str);
        return str.toString();
    }
}
