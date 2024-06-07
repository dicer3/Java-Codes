class Base {
    void fn1(){
      System.out.println("nice 1");
    }
    void fn2(){
        System.out.println("nice 2");
    }
}

class Derived extends Base{
    void fn1(){
        System.out.println("nice 2");
    }
    void fn3(){
        System.out.println("nice 3");
    }
}

public class Polymorisphism2 {
    public static void main(String[] args) {
        Base ob = new Derived();
        ob.fn1();
    }
}
