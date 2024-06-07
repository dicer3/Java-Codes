package java8;

interface TestInterface1{
    default void show(){
        System.out.println("Default TestInterface1");
    }
}

interface TestInterface2{
    default void show(){
        System.out.println("Default TestInterface2");
    }
}

class TestClass implements TestInterface1,TestInterface2{
    public void show(){
       System.out.println("hi ....");
    }
}

public class MutliInterDefaultMethod {
    public static void main(String[] args) {
        TestClass ob = new TestClass();
        ob.show();
    }
}