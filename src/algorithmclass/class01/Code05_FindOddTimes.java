package algorithmclass.class01;
//一个数组中有某数字奇数个，其他数字都是偶数个
//一个数组中有两个奇数个数，其他的都是偶数个
public class Code05_FindOddTimes {
    private static void findOdd01(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        System.out.println(result);
    }
    private static void findOdd02(int[] arr) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        int result01 = xor;
        //求出xor最右边的一个一
        int rightOne = xor & (~xor + 1);
        for (int i = 0; i < arr.length; i++) {
            if ((rightOne & arr[i]) == 0) {
                result01 = result01 ^ arr[i];
            }
        }
        System.out.println(result01);
        System.out.println(result01 ^ xor);
    }

    public static void main(String[] args) {
        int[] arr01 = new int[]{1,1,1,2,2,4,4,6,6};
        int[] arr02 = new int[]{1,1,1,2,2,2,4,4,6,6,8,8};
        int num = 11;
//        System.out.println(num & (~num + 1));
//        findOdd01(arr01);
        findOdd02(arr02);
    }
}
