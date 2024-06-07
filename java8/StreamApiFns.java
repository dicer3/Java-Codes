package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiFns {
    public static void main(String[] args) {
        int[] numbers = {4,18,12,16,21,42,9,17};

        Integer a = Arrays.stream(numbers).min().getAsInt();
        System.out.println("a "+a);

        List<Integer> list = List.of(13,17,11,9,21,19);
        Integer ak = list.stream().min((x,y)->x.compareTo(y)).get();

        System.out.println("ak "+ak);
    }
}
