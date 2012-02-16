import testpackage2.MyClass;

public class TestPackageClass {
    public static void main(String[] args) {
        System.out.println("Hello from testpackage.TestPackageClass!");
        System.out.println("Now accessing " + MyClass.NAME);
        MyClass cla = new MyClass();
        cla.sayHello();
    }
}
