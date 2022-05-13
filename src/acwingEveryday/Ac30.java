package acwingEveryday;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ac30 {
    public boolean isMatch(String s, String p) {
        char[] charS = s.toCharArray();
        char[] charP = p.toCharArray();
        List<Character> newCharP = new ArrayList<>();
        List<Character> ;
        for (int i = 0;i < charP.length;i++) {
            if (charP[i] == '*') {
                newCharP.remove(newCharP.size() - 1);
                indexC.put(i - 1,charP[i - 1]);
            } else {
                newCharP.add(charP[i]);
            }
        }
        for (int i = 0;i < charS.length;i++) {
            if (charS[i] == charP[i])   continue;
            else if (charP[i] == '.')   continue;
            else {

            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aaa";
        String p = "ab*ac*a";
        Ac30 ac30 = new Ac30();
        ac30.isMatch(s,p);
    }
}
