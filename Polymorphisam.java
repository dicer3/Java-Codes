class Parent {
    void parent(){
        System.out.println("parent fn");
    } 
    void child(){
        System.out.println("child fn");
    } 
}

class Child extends Parent {
    @Override
    void child(){
        System.out.println("child fn ##");
    } 
}

public class Polymorphisam {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.child();
    }
}
