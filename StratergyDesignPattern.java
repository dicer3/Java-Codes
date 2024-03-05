interface TravelStrategy {
    void travel(String source,String destination);
}

class CarTravelStrategy implements TravelStrategy {
	@Override
	public void travel(String source, String destination) {
		System.out.println("Traveling by car from " + source + " to " + destination);
	}
}

class BicycleTravelStrategy implements TravelStrategy {
	@Override
	public void travel(String source, String destination) {
		System.out.println("Traveling by bicycle from " + source + " to " + destination);
	}
}

class WalkingTravelStrategy implements TravelStrategy {
	@Override
	public void travel(String source, String destination) {
		System.out.println("Traveling on foot from " + source + " to " + destination);
	}
}

class TravelPlanner {
    private TravelStrategy travelStrategy;

    public TravelPlanner(TravelStrategy travelStrategy){
        this.travelStrategy = travelStrategy;
    }

    public void setTravelStrategy(TravelStrategy travelStrategy){
        this.travelStrategy = travelStrategy;
    }

    public void planTravel(String source, String destination){
          travelStrategy.travel(source, destination);
    }
}

public class StratergyDesignPattern {
    public static void main(String[] args) {
          
        TravelPlanner travelPlanner = new TravelPlanner(new CarTravelStrategy());
 
        // Plan travel by car
        travelPlanner.planTravel("Home", "Office");
    }
}
