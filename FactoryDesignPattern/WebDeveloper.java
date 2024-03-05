package FactoryDesignPattern;

public class WebDeveloper implements Employee{

    @Override
    public int salary() {
        // TODO Auto-generated method stub
        System.out.println("Getting web dev salary");
        return 4000;
    }
    
}
