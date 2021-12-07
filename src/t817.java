import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//待完成
public class t817 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();//数组长度
        int[] nums = new int[length];//数组
        for (int i = 0;i < length;i++){
            nums[i] = scan.nextInt();
        }
        Object[] objects = new Object[length];
        get_unique_count(nums,length,objects);
        int count = 0;
        for (int i = 0;i < objects.length;i++){
            System.out.println(objects[i]);
            count++;
        }
        System.out.println(count);
    }
    //数组去重
    public static void get_unique_count(int[] a,int n,Object[] objects){
        Set<Integer> numsUnique = new HashSet<>();
        for (int i = 0;i < n;i++){
            numsUnique.add(a[i]);
        }
        objects = numsUnique.toArray();
    }
}
