package davenkin;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TestServiceInvocationHandler implements InvocationHandler

{
    private Object proxy;

    public TestServiceInvocationHandler(Object proxy)
    {
        this.proxy = proxy;
    }

    public Object invoke(Object o, Method method, Object[] objects) throws Throwable
    {
        System.out.println("This is proxy method");
        System.out.println(method.getName());
        return method.invoke(proxy, objects);

    }
}
