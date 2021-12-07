/**
 *
 */
public class t87 {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.strToInt("la123"));
    }
}
class Solution1 {
    public int strToInt(String str) {
        int num = 0;
        boolean isPos = true;
        StringBuilder numStr = new StringBuilder("");
        char[] strs = str.toCharArray();
        for (int i = 0;i < strs.length;i++){
            if (judge(strs[i]) == Signal.oth || judge(strs[i]) == Signal.pos){
                continue;
            }
            else if (judge(strs[i]) == Signal.neg){
                isPos = false;
            }
            else {
                numStr.append(strs[i]);
            }
        }
        if (isPos){
            return strToNum(numStr);
        }
        else {
            return -strToNum(numStr);
        }
    }
    public static int strToNum(StringBuilder stringBuilder){
        int num = 0;
        int base = 1;
        for (int i = stringBuilder.length() - 1;i>=0;i--){
            num = num + (int)(stringBuilder.charAt(i) - '0') * base;
            base = base * 10;
        }
        return num;
    }

    /**
     * @param a 传入的字母
     * @return 什么类型的数据返回啥
     *
     */
    public static Signal judge(char a){
        if (a >= '0' && a <= '9'){
            return Signal.num;
        }
        else if (a == '+'){
            return Signal.pos;
        }
        else if (a == '-'){
            return Signal.neg;
        }
        else {
            return Signal.oth;
        }
    }
}
enum Signal{
    num,pos,neg,oth;
}