package Lambda;

import java.util.Comparator;

public class LambdaTest {
    public void test1(){
        Runnable run01 = new Runnable() {
            @Override
            public void run() {
                System.out.println("test1的runnable");
            }
        };
        run01.run();
        Runnable run2 = () -> System.out.println("run2的runnable");
        run2.run();
    }

    public void test2(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        int compare1 = com1.compare(11,22);
        System.out.println(compare1);
        System.out.println("***************");
        Comparator<Integer> com2 = (o1,o2) -> Integer.compare(o1,o2);
        int compare2 = com2.compare(99,77);
        System.out.println(compare2);
        System.out.println("***************");
        Comparator<Integer> com3 = Integer :: compare;
        int compare3 = com3.compare(11,11);
        System.out.println(compare3);
    }

    public static void main(String[] args) {
        LambdaTest lambdaTest = new LambdaTest();
        lambdaTest.test2();
    }
}
