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
    public void test5() {
        BiPredicate<String, String> bp = (x, y) -> x.equals(y);
        System.out.println(bp.test("a", "b"));
        System.out.println("-------------------------");
        BiPredicate<String, String> bp2 = String::equals;
        System.out.println(bp2.test("abc", "abc"));
    }
}
