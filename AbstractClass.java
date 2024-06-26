abstract class One {
    void method1(){
        System.out.println("ok !!");
    }
    abstract void method2();
    abstract void method3();
}

class Two extends One {

    void method1(){
        System.out.println("ok ####");
    }
    @Override
    void method2() {
       System.out.println("in fn2");
    }

    @Override
    void method3() {
      System.out.println("in fn3");
    }

    void fn4(){
        System.out.println("in fn4");
    }

    void fn5(){
        System.out.println("in fn5");
    }
    
}

public class AbstractClass {
   // One ob = new One();
   public static void main(String[] args) {
    One ob = new Two();
    ob.method1();
    //ob.fn1();
    ob.method2();
    ob.method3();
   }


}
