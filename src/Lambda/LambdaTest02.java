package Lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaTest02 {
    @Test
    public void test1(){
        happyTime(500, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("价格为" + aDouble);
            }
        });
        System.out.println("*****************");
        happyTime(400,money -> System.out.println("价格为" + money));
    }
    public void happyTime(double money, Consumer<Double> consumer){
        consumer.accept(money);
    }
    @Test
    public void test3(){
        List<String> list = Arrays.asList("赢","麻","啦");
        List<String> filterStrs = filterString(list,s -> s.contains("赢"));
        System.out.println(filterStrs);
    }
    public void test2(){
        List<String> list = Arrays.asList("北京","天津","南京","西京","东京","普金");
        List<String> filterList = filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });
        System.out.println(filterList.toString());
    }
    public List<String> filterString(List<String> list, Predicate<String> pre){
        ArrayList<String> filterList = new ArrayList<>();
        for (String str : list){
            if (pre.test(str)){
                filterList.add(str);
            }
        }
        return filterList;
    }

}
