public class Test76 {
    public static void main(String[] args) {
        boolean[] groups = new boolean[100];
        int remain = 100;
        int count = 1;
        int i = 0;
        while (remain != 1) {
            while (groups[i]) {
                i = (i + 1) % 100;
            }
            if (judgeNum(count)) {
                groups[i] = true;
                remain--;
            }
            i = (i + 1) % 100;
            count++;
        }
        for (int j = 0; j < 100; j++) {
            if (!groups[j]) {
                System.out.println(j + 1);
            }
        }
    }

    public static boolean judgeNum(int input) {
        //检验是否是7的倍数
        if (input % 7 == 0) {
            return true;
        }
        //检验是否包含7
        while (input > 0) {
            int res = input % 10;
            input = input / 10;
            if (res == 7) {
                return true;
            }
        }
        return false;
    }
}
