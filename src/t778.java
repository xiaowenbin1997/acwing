import java.util.Scanner;
public class t778 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] strs = str.split(",");
        int index1 = strs[0].indexOf(strs[1]);
        int index2 = strs[0].lastIndexOf(strs[2]);
        if(index1 < 0||index2 < 0||index1 + strs[1].length() >= index2)
            System.out.println(-1);
        else
            System.out.println(index2 - (index1 + strs[1].length()));
    }
}
