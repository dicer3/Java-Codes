package FactoryDesignPattern;

public class DeveloperClient {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("ANDRIOD DEVELOPER");
        System.out.println(employee.salary());
    }
}
