package java8;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateBifunc {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> checkSumOfTwo = (a,b) -> a+b >=5;
        System.out.println("sum of 2 and 5 is greater than 5: "+checkSumOfTwo.test(3,4));
        System.out.println("sum of 2 and 5 is greater than 5: "+checkSumOfTwo.test(2,1));

        BiFunction<Integer, Integer, Integer> multiplBiFunction = (a,b) -> a*b;
        System.out.println("multiplication f 5 and 10 is "+multiplBiFunction.apply(2,1));

        
    }



}
