package 流的使用;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import 流的使用.Employee.Status;

public class TestStreamAPI3 {
    List<Employee> emps = Arrays.asList(
            new Employee(102, "李四", 79, 6666.66, Status.BUSY),
            new Employee(101, "张三", 18, 9999.99, Status.FREE),
            new Employee(103, "王五", 28, 3333.33, Status.VOCATION),
            new Employee(104, "赵六", 8, 7777.77, Status.BUSY),
            new Employee(104, "赵六", 8, 7777.77, Status.FREE),
            new Employee(104, "赵六", 8, 7777.77, Status.FREE),
            new Employee(105, "田七", 38, 5555.55, Status.BUSY)
    );

    @Test
    public void test1(){
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer sum = numList.stream().reduce(0,(x,y) -> x + y);
        System.out.println("sum = " + sum);
        Integer sum1 = numList.stream().reduce(0,(x,y) -> x - y);
        System.out.println("sum1 = " + sum1);
        System.out.println("-----------------");
        Optional<Double> total = emps.stream().map(employee -> employee.getSalary()).reduce((x, y) -> x + y);
        System.out.println("total salary is " + total);
        System.out.println("total.get()" + total.get());
    }

    //需求：搜索名字中出现六的次数
    public static Stream<Character> str2Char(String str) {
        List<Character> chList = new ArrayList<>();
        for (Character ch : str.toCharArray()) {
            chList.add(ch);
        }
        return chList.stream();
    }
    @Test
    public void test02() {
        Optional<Integer> countCh = emps.stream().map(employee -> employee.getName()).flatMap(
                TestStreamAPI3::str2Char
        ).map(ch -> {
            if ('六' == ch) {
                return 1;
            } else {
                return 0;
            }
        }).reduce(Integer::sum);
        System.out.println("六的个数是" + countCh.get());
    }
    //collect——将流转换为其他形式。接收一个 Collector接口的实现，用于给Stream中元素做汇总的方法

    @Test
    public void test3() {
        //1.所有职员的名字输出一遍
        List<String> nameList = emps.stream().map(employee -> employee.getName()).collect(Collectors.toList());
        for (String name : nameList) {
            System.out.println(name);
        }
        System.out.println("-------------");
        Set<String> nameSet = emps.stream().map(e -> e.getName()).collect(Collectors.toSet());
        nameSet.forEach(System.out::println);
        System.out.println("-------------");
        HashSet<String> hashSet = emps.stream().map(e->e.getName()).collect(Collectors.toCollection(() -> new HashSet<>()));
        hashSet.forEach(System.out::println);
    }

    @Test
    public void test4() {
        
    }
}
