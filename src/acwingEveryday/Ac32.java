package acwingEveryday;

public class Ac32 {
    public void reOrderArray(int[] array) {
        if (array == null || array.length == 1) return;
        int left = 0,right = array.length - 1;
        while (left < right) {
            while (left< right && array[left] % 2 == 1)    left++;
            while (left< right && array[right] % 2 == 0)   right--;
            swap(array,left++,right--);
        }
    }
    public static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
