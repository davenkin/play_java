package davenkin;

public class DefaultTestService implements  TestService
{
    public void service(String str)
    {
        System.out.println("This is the default service: "+str);
    }
}
