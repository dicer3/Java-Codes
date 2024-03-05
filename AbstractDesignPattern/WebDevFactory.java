package AbstractDesignPattern;

public class WebDevFactory extends EmployeeAbstract {
    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
