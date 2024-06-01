import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int ind = sc.nextInt();
        try {
            System.out.println("Welcome to video no 82");
            try {
                System.out.println(marks[ind]);
            }    
            catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("sorry index does not exist");
                }

        } catch (Exception e){
            System.out.println("Expection in level 1");
        }
    }
}
