import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class AcwingT26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
}

class SolutionT26 {
    public static long num2Bin(int num) {
        return num & 0x0FFFFFFFF;
    }
    //测试一下各种类型的长度
    public static void testTypeLen() {
        System.out.println("int length = " + Integer.SIZE);
    }
}
