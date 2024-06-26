package java8;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);
        
        System.out.println(optional.isPresent());

        ///System.out.println(optional.get());

        System.out.println(optional.orElse("no value"));
    }
}
