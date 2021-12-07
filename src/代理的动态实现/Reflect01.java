package 代理的动态实现;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//扮演淘宝功能

public class Reflect01 implements InvocationHandler {
    private  Object target = null;

    public Reflect01(){

    }
    public Reflect01(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = method.invoke(target,args);
        float price = (float) obj;
        obj = price + 25;
        return obj;
    }
}
