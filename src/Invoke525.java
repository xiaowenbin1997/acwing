import javax.xml.ws.WebServiceContext;
import javax.xml.ws.spi.Invoker;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Invoke525 {
    public static void main(String[] args) {
        Worker worker = new Worker();
        InvocationHandler invocationHandler = new CountTime(worker);
    }
}

class CountTime implements InvocationHandler {
    private Object target;
    public CountTime() {
    }

    public CountTime(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long begin = System.currentTimeMillis();
        method.invoke(target,args);
        long end = System.currentTimeMillis();
        System.out.println("last time : " + (end - begin));
        return null;
    }
}

class Worker {

    public void work() {
        System.out.println("work");
    }

}
