package AbstractDesignPattern;

public class EmployeeFactory {
    
    public static Employee getEmployee(EmployeeAbstract factory){
        return factory.createEmployee();
    }
}
