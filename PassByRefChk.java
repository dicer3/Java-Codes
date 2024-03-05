public class PassByRefChk {
    public static void changeit(String [] suit1){
        suit1[1] ="nice";
    }
    public static void main(String[] args) {
        String[] suit = {
            "spades", 
            "hearts", 
            "diamonds", 
            "clubs"  
          };
          changeit(suit);
          System.out.println("himanshi "+suit[1]);

    }
}
