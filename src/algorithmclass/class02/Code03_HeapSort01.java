package algorithmclass.class02;

public class Code03_HeapSort01 {
    public static void heapSort(int[] arr,int begin,int size) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = begin; i < size; i++) {
            heapInsert(arr,i);
        }
        swap(arr,0,--size);
        while (size > 0) {
            heapify(arr,0,size);
            swap(arr,0,--size);
        }
    }
    //挨个插入数组中的元素，实现最大元素在堆顶,ok
    public static void heapInsert(int[] arr,int i) {
        while (arr[i] > arr[(i - 1) / 2]) {
            swap(arr,i,(i - 1) / 2);
            i = (i - 1) / 2;
        }
    }

    /**    函数作用是重新调整数组，得到一个新的大根堆
     *
     * @param arr
     * @param i
     * @param size
     */
    public static void heapify(int[] arr,int index,int size) {
        int left = index * 2 + 1;
        while (left < size) {
            int largest = left;
            if (left + 1 < size && arr[left + 1] > arr[left]) {
                largest = left + 1;
            }
            largest = arr[index] > arr[largest] ? index : largest;
            if (index == largest) {
                break;
            }
            swap(arr,index,largest);
            index = largest;
            left = index * 2 + 1;
        }
    }

    public static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{9,8,7,6,5};
        heapSort(nums,0, nums.length);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
