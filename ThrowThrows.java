class NegativeRadiusException extends Exception{
    
    @Override
    public String toString(){
        return "Raidus cannot be negative!";
    }

    @Override
    public String getMessage(){
        return "Raidus cannot be negative !!!";
    }
}
public class ThrowThrows {
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
           throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static int divide(int a,int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        int c = divide(6,0);
        System.out.println(c);
        
        try {
            area(4);
        } catch (NegativeRadiusException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
