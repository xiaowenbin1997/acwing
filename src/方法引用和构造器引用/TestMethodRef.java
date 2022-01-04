package 方法引用和构造器引用;

import Lambda02.Employee;
import org.junit.Test;

import java.io.PrintStream;
import java.util.function.*;

public class TestMethodRef {
    @Test
    public void test8() {
        Function<Integer,String[]> fun = args -> new String[args];
        String[] strings = fun.apply(4);
        System.out.println(strings.length);
        System.out.println("---------------------");
        Function<Integer, Employee[]> function = Employee[] :: new;
        Employee[] employees = function.apply(5);
        System.out.println(employees.length);
    }

    @Test
    public void test7() {
        Function<Integer,Employee> function01 = Employee::new;
        BiFunction<Integer,String,Employee> function02 = Employee::new;
    }

    @Test
    public void test5() {
        BiPredicate<String,String> bp = (x,y)->x.equals(y);
        System.out.println(bp.test("a","b"));
        System.out.println("-------------------------");
        BiPredicate<String,String> bp2 = String::equals;
        System.out.println(bp2.test("abc","abc"));
    }

    @Test
    public void test2() {
        Employee emp = new Employee(1,"xiaosan",18,999.0);
        Supplier<Integer> supplier = emp::getAge;
    }

    @Test//最重要
    public void test() {
        PrintStream ps = System.out;
        Consumer<String> consumer = (str) -> System.out.println("hello" + str);
        consumer.accept("李明");
        Consumer<String> consumer1 = ps::println;
        consumer1.accept("hello java8");
    }
}
