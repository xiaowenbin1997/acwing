package 流的使用;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamAPI1 {
    List<Employee> emps = Arrays.asList(
            new Employee(102, "李四", 59, 6666.66),
            new Employee(101, "张三", 18, 9999.99),
            new Employee(103, "王五", 28, 3333.33),
            new Employee(104, "赵六", 8, 7777.77),
            new Employee(104, "赵六", 8, 7777.77),
            new Employee(104, "赵六", 8, 7777.77),
            new Employee(105, "田七", 38, 5555.55)
    );
    @Test
    public void test01() {
        Stream<String> str = emps.stream().map(employee -> employee.getName());
        str.forEach(e -> System.out.println(e));
        List<String> stringList = Arrays.asList("aa","bb","cc","dd");
        stringList.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
        System.out.println("--------------");
        List<Character> collect = stringList.stream().flatMap(e -> {
            List<Character> characterList = new ArrayList<>();
            for (Character ch : e.toCharArray()) {
                characterList.add(ch);
            }
            return characterList.stream();
        }).collect(Collectors.toList());
    }

    @Test
    public void test02() {
        emps.stream().map(e -> e.getAge()).sorted((o1, o2) ->{
            return o2 - o1;
        }).forEach(System.out::println);
        Stream<Employee> employeeStream = emps.stream().sorted((o1, o2) -> {
            if (o1.getId() != o2.getId()) {
                return o1.getId() - o2.getId();
            } else {
                return o1.getAge() - o2.getAge();
            }
        });
        employeeStream.forEach(System.out::println);
    }
}
