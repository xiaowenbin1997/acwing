package java8newtest;

public interface CompareB {
    public default void method2(){
        System.out.println("compareB:接口中默认方法");
    }
}
