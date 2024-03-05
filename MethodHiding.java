class Parent1{
    static void fn1(){
        System.out.println("this is in Parent Class");
    }
}

class Child1 extends Parent1{
    static void fn1(){
        System.out.println("this is in Child Class");
    }
}

public class MethodHiding {
    public static void main(String[] args) {
        System.out.println("this is method hiding");

        try {
        Parent1 ob = new Child1();
        ob.fn1();
        } finally {
            System.out.println("here");
        }
    }
}
