package java8;

import java.util.function.Consumer;

public class ConsumerDemo {
    public void squareInt(int i){
        int squared = i*i;
        System.out.println("Squared no is "+squared);
    }
    public static void main(String[] args) {
        ConsumerDemo ob = new ConsumerDemo();
        ob.squareInt(5);

        Consumer<Integer> sqaureMe = i -> System.out.println("taking an input and performing operation");
        sqaureMe.accept(5);

        Consumer<Integer> sqaureMe1 = i -> System.out.println("taking an input and performing operation "+i*i);
       // sqaureMe.accept(5);

        Consumer<Integer> double1 = i -> System.out.println("taking an input and performing operation "+2*i);
        // sqaureMe.accept(5);

        sqaureMe1.andThen(double1).accept(5);

    }
}
