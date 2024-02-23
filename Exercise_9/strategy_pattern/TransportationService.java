package Exercise_9.strategy_pattern;

public class TransportationService {
    private TravelStrategy travelStrategy;

    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void travel() {
        if(travelStrategy != null) {
            travelStrategy.travel();
            System.out.println("Speed: " + travelStrategy.getSpeed());
            System.out.println("Cost: " + travelStrategy.getCost());
        } else {
            System.out.println("No Travel Strategy");
        }
    }
}
