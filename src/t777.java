import java.util.Scanner;
public class t777 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            String str = scan.nextLine();
            int lengthStr = str.length();
            for(int i = 1;i <= lengthStr;i++){
                if(lengthStr % i == 0){
                    String strNew = "";
                    String substr = str.substring(0,i);
                    //System.out.println(substr);
                    for(int j = 0;j < lengthStr / i;j++){
                        strNew = strNew + substr;
                    }
                    if(str.equals(strNew)){
                        System.out.println(lengthStr / i);
                    }
                }
            }
            if(".".equals(str)){
                break;
            }
        }
    }
}
