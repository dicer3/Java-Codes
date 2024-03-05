
class Base {
    int x;
    Base(){
System.out.println("Base");
    }
    Base(int c){
        System.out.println("In Base Class");
    }
}

class Derived extends Base{
    int x;
    Derived(char a){
        //super();
        System.out.println("In Derived Class");
    }
}

public class Contructor_practice {
    public static void main(String[] args) {
        System.out.println("pragun");
       // Derived ob = new Derived('2'); 
    }
}