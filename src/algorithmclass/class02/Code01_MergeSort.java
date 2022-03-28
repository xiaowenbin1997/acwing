package algorithmclass.class02;

import com.sun.scenario.effect.impl.prism.ps.PPSBlend_ADDPeer;

public class Code01_MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        mergeSort(arr,0,arr.length - 1);
    }
    public static void mergeSort(int[] arr,int left,int right) {
        if (left == right) {
            return;
        }
        int mid = left + ((right - left) >> 1);
        mergeSort(arr,left,mid);
        mergeSort(arr,mid + 1,right);
        merge(arr,left,mid,right);
    }
    public static void merge(int[] arr,int left,int mid,int right) {
        int[] help = new int[right - left + 1];
        int i = left,j = mid + 1,k = 0;//k用来遍历help数组,i遍历arr左边，j遍历arr右边
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                help[k++] = arr[i++];
            } else {
                help[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            help[k++] = arr[i++];
        }
        while (j <= right) {
            help[k++] = arr[j++];
        }
        for (int l = 0; l < help.length; l++) {
            arr[left + l] = help[l];
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{7,1,6,11,33,56,12};
        mergeSort(nums);
        for (int num :
                nums) {
            System.out.print(num);
            System.out.print(",");
        }
    }
}
