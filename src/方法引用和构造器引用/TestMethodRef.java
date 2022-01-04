package 方法引用和构造器引用;

import Lambda02.Employee;
import org.junit.Test;

import java.io.PrintStream;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class TestMethodRef {

    @Test
    public void test1() {
        PrintStream ps1 = System.out;
        Consumer<String> con = (x) -> ps1.println(x);
        PrintStream ps = System.out;
        Consumer<String> consumer = ps::println;
    }

    @Test
    public void test2() {
        Employee employee = new Employee(1,"lisi");
        Supplier<String> stringSupplier = () -> employee.getName();
        System.out.println(stringSupplier.get());

        Supplier<Integer> integerSupplier = employee::getId;
        Integer num = integerSupplier.get();
        System.out.println(num);
    }
}
