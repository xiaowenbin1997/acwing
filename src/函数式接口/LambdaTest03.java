package 函数式接口;

import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
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

    @Test
    public void TestStrFunc() {
        String newStr = operateString("aaaaa",(str) -> str.toUpperCase());
        System.out.println(newStr);
        String newStr02 = operateString("hello",String::toUpperCase);
        System.out.println(newStr02);
    }

    public String operateString(String str, Function<String,String> fun) {
        return fun.apply(str);
    }

    @Test
    public void testFilter() {
        Map<String,Object> tempMap = new HashMap<>();
        tempMap.put("age",18);
        List<String> oldStrings = Arrays.asList("啊这","麻了","笑嘻了","九折","输麻了");
        List<String> newStrings = filterString(oldStrings,s -> {
            return s.length() == 2;
        });
        for (String str : newStrings) {
            System.out.println(str);
        }
    }

    public List<String> filterString (List<String> list, Predicate<String> predicate) {
        List<String> resultStrings = new ArrayList<>();
        for (String str : list) {
            if (predicate.test(str)) {
                resultStrings.add(str);
            }
        }
        return resultStrings;
    }
}
