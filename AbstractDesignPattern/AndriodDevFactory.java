package AbstractDesignPattern;

public class AndriodDevFactory extends EmployeeAbstract  {

    @Override
    public Employee createEmployee() {
        return new AndriodDeveloper();
    }
    
}
