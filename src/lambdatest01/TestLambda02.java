package lambdatest01;

import org.junit.Test;
import 代理的动态实现.Customer;
import java.util.function.Consumer;
public class TestLambda02 {
    @Test
    public void test01() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("run01");
            }
        };
        Runnable r2 = () -> System.out.println("run02");
        r1.run();
        r2.run();

        Consumer<String> customer = (x) -> System.out.println(x);
        Animal<String> dog = new Animal<String>() {
            @Override
            public void walk(String s) {
                System.out.println("狗走" + s);
            }
        };
        Animal<String> cat = (s) -> System.out.println("猫走" + s);
        dog.walk("狗");
        cat.walk("cat");
    }
}
