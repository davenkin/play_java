package davenkin;

import java.lang.reflect.Proxy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        DefaultTestService service = new DefaultTestService();
        TestServiceInvocationHandler handler = new TestServiceInvocationHandler(service);
        TestService proxy = (TestService) Proxy.newProxyInstance(service.getClass().getClassLoader(), service.getClass().getInterfaces(), handler);
        proxy.service("davenkin");
    }
}
