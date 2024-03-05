package AbstractDesignPattern;

public class Client {
    public static void main(String[] args) {
        Employee e1 = EmployeeFactory.getEmployee(new AndriodDevFactory());
        e1.name();
    }
}
