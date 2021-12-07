package java8newtest;

public interface CompareA {
    public static void method1(){
        System.out.println("static : 接口中静态方法");
    }
    public default void method2(){
        System.out.println("compareA:接口中默认方法");
    }
}
