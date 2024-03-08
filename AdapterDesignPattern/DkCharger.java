package AdapterDesignPattern;

public class DkCharger implements AndriodCharger{

    @Override
    public void chargerAndriodPhone(){
       System.out.println("Your andriod phone is charging");
    }
}