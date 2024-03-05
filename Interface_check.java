interface a{
    void fn1();
}
interface b{
    void fn1();
    void fn2();
}
class Base implements a,b{

    @Override
    public void fn2() {
        System.out.println("to be nice"); 
    }

    @Override
    public void fn1() {
        System.out.println("to be nice 2"); 
    }
    
}

public class Interface_check {

        public static void main(String[] args) {
            Base b =new Base();
            b.fn1();    
        }


}
