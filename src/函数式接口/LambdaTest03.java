package 函数式接口;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaTest03 {

    @Test
    public void test01() {
        happy(1000.0,money -> System.out.println("消费了" + money + "元"));
    }

    public void happy(Double money, Consumer<Double> consumer) {
        consumer.accept(money);
    }

    @Test
    public void test02() {
        List<Integer> numList = getNumList(10,()->(int)(Math.random() * 100));
        for (Integer num : numList) {
            System.out.println(num);
        }
    }

    public List<Integer> getNumList(int count,Supplier<Integer> supplier) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count;i++) {
            Integer num = supplier.get();
            list.add(num);
        }
        return list;
    }
}
