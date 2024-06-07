package java8;

interface TestInterface {
    public void square(int a);

    default void show(){
        System.out.println("Default method executed");
    }

    static void staticMethod(){
        System.out.println("this is a static method");
    }
}

class TestClass implements TestInterface {

    @Override
    public void square(int a) {
         System.out.println("finally "+a*a);
    }
    
}
public class DefaultMethods {
    public static void main(String[] args) {
        TestClass d = new TestClass();
        d.square(4);
        TestInterface.staticMethod();
    }


}
