package acwingEveryday;

import com.sun.javafx.collections.MappingChange;

import java.util.LinkedList;

public class Ac57 {
    //这个用作检测
    public int digitAtIndexTest(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0;;i++) {
            stringBuilder.append(String.valueOf(i));
            if (stringBuilder.length() > n) {
                break;
            }
        }
        return stringBuilder.charAt(n) - '0';
    }
    //这个用作实际
    public int digitAtIndexTest01(int n) {
        if (n == 0) return 0;
        int numsBit = 1;//记录当前数的位数
        int numsCount = 9;//记录当前位数的数的个数
        int begin = 1;//记录当前位数的数的开始数
        while (n > numsBit * numsCount) {
            n -= numsBit * numsCount;
            numsBit++;
            numsCount *= 10;
            begin *= 10;
        }
        //计算得到的数是当前位数数的第几个
        int numIndex = (int) Math.ceil((double)n / numsBit);
        //计算得到当前数
        int num = begin + numIndex - 1;
        //计算目标数是在当前数的第几位
        int index = n % numsBit - 1;
        return getIndexNum(num,index);
    }
    //计算得到num的index位
    private int getIndexNum(int num, int index) {
        LinkedList<Integer> resultArray = new LinkedList();
        while (num > 0) {
            resultArray.addFirst(num % 10);
            num /= 10;
        }
        return resultArray.get(index);
    }

    public int digitAtIndex(int n) {
        int begin = 1;
        long numCount = 9;
        int numBit = 1;
        while (n > numCount * numBit) {
            n -= numCount * numBit;
            numCount *= 10;
            numBit++;
            begin *= 10;
        }
        begin = begin + (n - 1) / numBit;
        String s = Integer.toString(begin);
        return Character.getNumericValue(s.charAt((n - 1) % numBit));
    }

    public static void main(String[] args) {
        int i = 2147483647;
        Ac57 ac57 = new Ac57();
        System.out.println(ac57.digitAtIndex(i));
    }
}
