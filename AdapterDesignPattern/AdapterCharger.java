package AdapterDesignPattern;

public class AdapterCharger implements AppleCharger {

    private AndriodCharger charger;
    

    public AdapterCharger(AndriodCharger charger) {
        this.charger = charger;
    }


    @Override
    public void chargePhone() {
        charger.chargerAndriodPhone();
        System.out.println("ur phone is charging with adapter");
    }
    
}
