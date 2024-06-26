@FunctionalInterface
interface MyInter{
    void doWork();
}
public class HOF {
    static void callingfn(String v, MyInter d){
        d.doWork();
    }
    public static void main(String[] args) {
      
        System.out.println();
        
        callingfn("Pragun ",()->{
            System.out.println("belve in me");
        });

        callingfn("rakul ",()-> System.out.println("fine with it"));
    }
}
