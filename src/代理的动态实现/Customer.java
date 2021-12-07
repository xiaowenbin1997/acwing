package 代理的动态实现;

import java.lang.reflect.InvocationHandler;

public class Customer {
    public static void main(String[] args) {
        UsbKingFactory factory = new UsbKingFactory();
        InvocationHandler handler = new Reflect01(factory);
    }
}
