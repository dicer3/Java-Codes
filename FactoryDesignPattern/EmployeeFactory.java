package FactoryDesignPattern;

public class EmployeeFactory {
    
    public static Employee getEmployee(String empType){
        if(empType.trim().equalsIgnoreCase("ANDRIOD DEVELOPER"))
            return new AndroidDeveloper();
        if(empType.trim().equalsIgnoreCase("WEB DEVELOPER"))
            return new WebDeveloper();
        else 
          return null;    
    }
}
