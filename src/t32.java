public class t32 {

}
class Solutiont32 {
    public void reOrderArray(int [] array) {
        int beg = 0;
        int end = array.length - 1;
        while (beg < end) {
            while (beg < end && array[beg] % 2 != 0){
                beg++;
            }
            while (beg < end && array[end] % 2 == 0){
                end--;
            }
            if (array[beg] % 2 == 0){
                int temp = array[beg];
                array[beg] = array[end];
                array[end] = temp;
                beg++;
                end--;
            }
        }
    }
}