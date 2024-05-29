import java.util.Arrays;
import java.util.Comparator;

class NameCampare implements Comparator<Employee1> {

    @Override
    public int compare(Employee1 o1, Employee1 o2) {
         return o1.getName().compareTo(o2.getName());
    }

}

public class CamprableComparator {
    public static void main(String[] args) {
        
        Employee1[] empArr = new Employee1[4];
        empArr[0] = new Employee1(5, "John");
        empArr[1] = new Employee1(9, "Paul");
        empArr[2] = new Employee1(1, "John");
        empArr[3] = new Employee1(10, "Ame");

        Arrays.sort(empArr);

        System.out.println("arr "+Arrays.toString(empArr));

        NameCampare ob = new NameCampare();
        Arrays.sort(empArr, ob);

        System.out.println("arr 2"+Arrays.toString(empArr));
    }
}
