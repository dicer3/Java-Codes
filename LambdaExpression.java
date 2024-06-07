import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface DemoAno{
    void meth1();
    void meth2();
}

class AnnoyDemo implements DemoAno{
    public void display(){
        System.out.println("Hello");
    }

    @Override
    public void meth1() {
        System.out.println("I am meth1");
    }

    @Override
    public void meth2() {
        System.out.println("I am meth2");
    }
}

public class LambdaExpression {
    public static void main(String[] args) {
        AnnoyDemo obj = new AnnoyDemo();

        List<Integer> list1 = Arrays.asList(5,4,12);
        List<Integer> list2 = list1.stream().filter(i->i%2==0).collect(Collectors.toList());

        String names[] = {"Durgesh","Uttam","Ankit","Divya"};

        Stream.of(names).forEach(e-> System.out.println("fine "+e));

        Arrays.stream(new int[]{2, 4, 65, 3, 564})
        .forEach(e -> {
            System.out.println("e "+e);
        });
    }
}
