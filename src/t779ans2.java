import java.util.Scanner;
public class t779ans2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tempCount = scan.nextInt();
        while(tempCount > 0){
            StringBuffer[] strs = new StringBuffer[tempCount];
            int lenShort = 999;//用来记录字符串数组中最短字符串的长度
            for (int i = 0;i < tempCount;i++){
                String tempStr = scan.next();
                if(lenShort > tempStr.length()){
                    lenShort = tempStr.length();
                }
                strs[i] = new StringBuffer(tempStr);
                strs[i].reverse();//完成反转
            }
            int count = 0;//记录相同的字母个数
            //外层是某个固定位置的字母，内层遍历比较所有的数组，所以还需要一个函数得到字符串数组中的最短字符串的长度
            for(int i = 0;i < lenShort;){//i表示字符串的第i个位置
                char temp = strs[0].charAt(i);//0号字符串第i个位置的char值
                boolean isSame = true;
                for(int j = 1;j < tempCount;j++){
                    if(temp != strs[j].charAt(i)){
                        isSame = false;
                        break;
                    }
                }
                if(isSame)
                    i++;
                if(i == lenShort||!isSame) {
                    count = i;
                    break;
                }
            }
            if (count == 0)
                System.out.println();
            else
                System.out.println(strs[0].reverse().substring(strs[0].length() - count,strs[0].length()));
            tempCount = scan.nextInt();
        }
    }
}
