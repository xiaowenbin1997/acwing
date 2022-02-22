package algorithmclass.class01;

//本题需要查找局部最低的点，比如6 3 5,3就属于局部最低点
public class Code09_FindLocalMin {
    private static int getLocalMinIndex(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        if (arr.length == 1 || arr[0] < arr[1]) {
            return 0;
        }
        if (arr[arr.length - 2] > arr[arr.length - 1]) {
            return arr.length - 1;
        }
        int left = 1;
        int right = arr.length - 2;
        int mid = 0;
        while(left < right) {
            mid = left + ((right - left) >> 1);
            if (arr[mid] > arr[mid - 1]) {
                right = mid - 1;
            }else if (arr[mid] > arr[mid + 1]) {
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr= new int[]{6, 5, 5, 4, 6, 7, 8};
        int index = getLocalMinIndex(arr);
        System.out.println(index);
    }
}
