//package acwingEveryday;
//
///**
// * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
// *
// * 路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
// *
// * 如果一条路径经过了矩阵中的某一个格子，则之后不能再次进入这个格子。
// */
//public class Ac23 {
//    public boolean hasPath(char[][] matrix, String str) {
//        char[][] isVis = new char[matrix.length][];
//        for (int i = 0; i < matrix.length;i++) {
//            isVis[i] = new char[matrix[i].length];
//            for (int j = 0;j < matrix[i].length;j++) {
//                isVis[i][j] = 0;
//            }
//        }
//        for (int i = 0; i < matrix.length;i++) {
//            for (int j = 0;j < matrix[i].length;j++) {
//                if (dfs(matrix,isVis,0,i,j,str) == true) return true;
//            }
//        }
//        return false;
//    }
//    public boolean dfs(char[][] matrix,char[][] isVis,int index,int i,int j,String str) {
//        if (i < 0 || i > matrix.length - 1 ||j < 0||j > matrix[i].length - 1) {
//            return false;
//        }
//        if (matrix[i][j] != str.charAt(index)) {
//            return false;
//        }
//        if (isVis[i][j] == 1) {
//            return false;
//        }
//        if (index == str.length() - 1) {
//            return true;
//        }
//        if (dfs(matrix,isVis,index + 1,i,j + 1,str)) {
//            return true;
//        }
//        if (dfs(matrix,isVis,index + 1,i,j - 1,str)) {
//            return true;
//        }
//        if (dfs(matrix,isVis,index + 1,i - 1,j,str)) {
//            return true;
//        }
//        if (dfs(matrix,isVis,index + 1,i + 1,j,str)) {
//            return true;
//        }
//        isVis[i][j] = 0;
//        return false;
//    }
//
//    public static void main(String[] args) {
//        char[][] matrix = {{'A','B','C','E'},
//                {'S','F','C','S'},
//                {'A','D','E','E'}};
//        String str = "BCCE";
//        Ac23 ac23 = new Ac23();
//        boolean b = ac23.hasPath(matrix, str);
//        System.out.println(b);
////        int[][] a = {{1,2},{1,2,3}};
////        System.out.println(a);
////        int[][] b = new int[3][3];
////        int[][] c = new int[4][];
////        for (int i = 0;i < c.length;i++) {
////            c[i] = new int[i];
////            for (int j = 0;j < c[i].length;j++) {
////                c[i][j] = i + j;
////            }
////        }
////        System.out.println(c);
//    }
//}
