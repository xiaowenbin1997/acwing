package javaTest03;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefTest01 {
    @Test
    public void test1(){
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("赢了");
        System.out.println("********************");
        PrintStream ps = System.out;
        Consumer<String> consumer1 = ps::println;
        consumer1.accept("run了");
    }
    @Test
    public void test2() {
        Employee employee2 = new Employee(1001, "Tom", 23, 1200);
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return employee2.getName();
            }
        };
        System.out.println(supplier.get());
        System.out.println("***********");
        Supplier<String> supplier1 = () -> employee2.getName();
        System.out.println(supplier1.get());
        System.out.println("***********");
        Supplier<String> supplier2 = employee2::getName;
        System.out.println(supplier2.get());
    }
    @Test
    public void test3(){
        Comparator<Integer> comparator01 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        System.out.println(comparator01.compare(3,8));
        Comparator<Integer> comparator02 = ((o1, o2) -> Integer.compare(o1,o2));
        System.out.println(comparator02.compare(9,3));
        Comparator<Integer> comparator03 = Integer::compare;
        System.out.println(comparator03.compare(11,11));
    }
    @Test
    public void test4(){
        Function<Double,Long> function01 = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        Function<Double,Long> function02 = aDouble -> Math.round(aDouble);
        System.out.println(function02.apply(12.99));
        Function<Double,Long> function03 = Math::round;
        System.out.println(function03.apply(11.2));
    }
    @Test
    public void test5(){
        Comparator<String> com1 = (s1,s2) -> s1.compareTo(s2);
        System.out.println(com1.compare("你好","你好"));
        System.out.println("************************");
        Comparator<String> comparator = String::compareTo;
        System.out.println(comparator.compare("麻了","run"));
    }
    @Test
    public void test6(){
        BiPredicate<String,String> biPredicate01 = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s, String s2) {
                return s.equals(s2);
            }
        };
        System.out.println(biPredicate01.test("abc","abc"));
        System.out.println("***********************************");
        BiPredicate<String,String> biPredicate02 = (s1,s2) -> s1.equals(s2);
        System.out.println(biPredicate02.test("a","b"));
        System.out.println("***********************************");
        BiPredicate<String,String> biPredicate03 = String::equals;
        System.out.println(biPredicate03.test("c","a"));
        System.out.println("***********************************");
    }
    @Test
    public void test7(){
        Employee employee = new Employee(1001,"Jerry",23,6000);
        Function<Employee,String> function01 = new Function<Employee, String>() {
            @Override
            public String apply(Employee employee) {
                return employee.getName();
            }
        };
        Function<Employee,String> function02 = employee1 -> employee.getName();
        System.out.println(function02.apply(employee));
        System.out.println("********");
        Function<Employee,String> function03 = Employee::getName;
        System.out.println(function03.apply(employee));
    }
}
