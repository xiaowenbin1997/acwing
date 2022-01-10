package 流的使用;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import 流的使用.Employee.Status;
public class TestStreamAPI2 {
    List<Employee> emps = Arrays.asList(
            new Employee(101, "李四", 59, 6666.66, Status.BUSY),
            new Employee(102, "张三", 18, 9999.99, Status.FREE),
            new Employee(103, "王五", 28, 3333.33, Status.FREE),
            new Employee(104, "赵五", 8, 6777.77, Status.BUSY),
            new Employee(105, "赵六", 8, 5777.77, Status.FREE),
            new Employee(106, "赵七", 8, 7999.77, Status.FREE),
            new Employee(107, "田七", 38, 5555.55, Status.BUSY)
    );

    @Test
    public void test1() {
        boolean b = emps.stream().allMatch(employee -> {
            return Status.BUSY.equals(employee.getStatus());
        });
        System.out.println(b);
        boolean b1 = emps.stream().anyMatch(employee -> employee.getStatus().equals(Status.BUSY));
        System.out.println(b1);
        boolean b2 = emps.stream().noneMatch(employee -> employee.getStatus().equals(Status.VOCATION));
        System.out.println(b2);
    }

    @Test
    public void test2() {
//        Optional<Employee> one = emps.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(),e1.getSalary())).findAny();
//        Optional<Employee> two = emps.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(),e1.getSalary())).findAny();
//        Optional<Employee> three = emps.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(),e1.getSalary())).findAny();
//        Optional<Employee> four = emps.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(),e1.getSalary())).findAny();
//        Optional<Employee> five = emps.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(),e1.getSalary())).findAny();
//        System.out.println(one.get());
//        System.out.println(two.get());
//        System.out.println(three.get());
//        System.out.println(four.get());
//        System.out.println(five.get());
//        System.out.println("--------------------------------");
//        Optional<Employee> op2 = emps.parallelStream()
//                .filter((e) -> e.getStatus().equals(Status.FREE))
//                .findAny();
//        System.out.println(op2.get());
        for (int i = 0;i < 20;i++) {
            Optional<Employee> op3 = emps.stream().parallel().findAny();
            System.out.println(op3);
        }
        System.out.println("----------------");
        for (int i = 0;i < 8;i++) {
            Optional<Employee> op4 = emps.stream().findAny();
            System.out.println(op4);
        }
    }

    @Test
    public void test3() {
        Long count = emps.stream().filter(employee -> employee.getStatus().equals(Status.FREE)).count();
        System.out.println(count);
        System.out.println("-------------------------");
        Optional<Double> op = emps.stream().map(employee -> employee.getSalary()).findAny();
        System.out.println(op);
        System.out.println("-------------------------");
    }

    @Test
    public void test4() {
        Stream<Employee> employeeStream = emps.stream().filter(employee -> employee.getStatus().equals(Status.FREE));
        Optional<Double> max = employeeStream.map(employee -> employee.getSalary()).max((s1, s2) -> (int) (s1 - s2));
        System.out.println("最大值是" + max.get());
    }
}
