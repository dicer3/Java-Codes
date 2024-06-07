import java.util.Scanner;

class MyExpection extends Exception{
    @Override
    public String toString(){
        return super.toString()+ " I am to String";
    }

    @Override
    public String getMessage(){
        return super.getMessage()+ " in my Expection";
    }
}

public class ExpectionClass {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        a = sc.nextInt();
        if(a<9){
            try {
               throw new MyExpection();
            } catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e);
            }
        }


    }
}
