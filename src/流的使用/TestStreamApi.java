package 流的使用;

import Lambda02.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamApi {
    @Test
    public void test1() {
        //1.流的创建
        List<String> list = new ArrayList<>();
        Stream<String> stringStream = list.stream();
        Stream<String> parallelStream = list.parallelStream();

        Integer[] nums = new Integer[10];
        Stream<Integer> stream01 = Arrays.stream(nums);
        Stream<Integer> stream02 = Stream.of(1,2,3,4,5,6);
//        stream02.forEach(System.out::println);
        Stream<Integer> stream03 = Stream.iterate(0,x -> x + 2).limit(10);
        stream03.forEach(System.out::println);
    }
    //2.流的中间操作
    List<Employee> emps = Arrays.asList(
            new Employee(101,"张三",19,1000.0),
            new Employee(102,"李四",20,2000.0),
            new Employee(103,"王五",21,3000.0),
            new Employee(104,"赵六",22,4000.0),
            new Employee(105,"差不多先生",80,500.0),
            new Employee(105,"差不多先生",80,500.0)
    );

    @Test
    public void test2() {
        Stream<Employee> employeeStream = emps.stream().filter(employee -> employee.getAge() > 21);
        employeeStream.forEach(employee -> {
            System.out.println(employee.getName());
        });
    }
    //外部迭代
    @Test
    public void test3() {
        Iterator<Employee> iterator = emps.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
    @Test
    public void test4() {
        List<Employee> employees = emps.stream().filter(employee -> {
            return employee.getAge() > 20;
        }).collect(Collectors.toList());
        for (Employee employee : employees) {
            System.out.println(employee.getName() +  " , " + employee.getAge());
        }
    }

    @Test
    public void test5() {
        emps.stream().distinct().forEach(employee -> System.out.println(employee.toString()));
    }
}
