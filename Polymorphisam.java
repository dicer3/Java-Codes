class Parent {
    void parent(){
        System.out.println("parent fn");
    } 
}

class Child extends Parent {
    void child(){
        System.out.println("parent fn");
    } 
}

public class Polymorphisam {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.parent();
    }
}
