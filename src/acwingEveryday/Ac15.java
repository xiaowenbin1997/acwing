package acwingEveryday;

/**15. 二维数组中的查找
 *在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 *
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Ac15 {
//    public boolean searchArray(int[][] array, int target) {
//        if (array == null || array.length == 0 || array[0].length == 0) {
//            return false;
//        }
//        for (int i = 0;i < array.length;i++) {
//            for (int j = 0;j < array[i].length;j++) {
//                if (array[i][j] == target) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
    public boolean searchArray(int[][] array, int target) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return false;
        }
        int i = 0,j = array[0].length - 1;
        while (i <= array.length - 1 && j >= 0) {
            int temp = array[i][j];
            if (target == temp) {
                return true;
            } else if (target > temp) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
