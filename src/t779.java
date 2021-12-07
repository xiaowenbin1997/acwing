import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class t779 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList l1 = new ArrayList();
        while(true){
            int count = scan.nextInt();
            int minLenth = 999;
            int sameLen = 0;
            if(count == 0)
                break;
            String[] strs = new String[count];
            char[][] arrs = new char[count][];
            for(int i = 0;i < strs.length;i++){
                strs[i] = scan.next();
                if(strs[i].length() < minLenth){
                    minLenth = strs[i].length();
                }
                arrs[i] = strs[i].toCharArray();
            }
            for(int j = 0;j < minLenth;j++){
                boolean isSame = true;
                char temp = strs[0].charAt(strs[0].length() - j - 1);
                for(int k = 1;k < strs.length;k++){
                    if(temp != strs[k].charAt(strs[k].length() - j - 1)){
                        isSame = false;
                        break;
                    }
                }
                if(isSame == false){
                    sameLen = j;
                    break;
                }
            }
            if(sameLen == 0){
                l1.add("");
            }
            else {
                l1.add(strs[0].substring(strs[0].length() - sameLen));
                //System.out.println(sameLen);
            }
        }
        System.out.println(l1.size());
        for (int i = 0;i < l1.size();i++){
            if (l1.get(i).equals(""))
                System.out.println();
            else
                System.out.println(l1.get(i));
        }
    }
}
