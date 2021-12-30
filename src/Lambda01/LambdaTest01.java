package Lambda01;

import org.junit.*;

import java.util.function.Consumer;

public class LambdaTest01 {
    @Test
    public void test01(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我先run了");
            }
        };
        r1.run();
        System.out.println("**************");
        Runnable r2 = () -> System.out.println("这是真要run了");
        r2.run();
    }
    @Test
    public void test2(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("run");
        System.out.println("----");
        Consumer<String> con01 = (s) -> System.out.println(s);
        con01.accept("麻了");
    }


}
