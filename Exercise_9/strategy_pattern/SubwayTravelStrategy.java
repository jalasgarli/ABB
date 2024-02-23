package Exercise_9.strategy_pattern;

public class SubwayTravelStrategy implements TravelStrategy {
    public void travel() {
        System.out.println("Traveling by subway.");
    }

    public double getSpeed() {
        return 100.0; // km per hour
    }

    public double getCost() {
        return 0.4; 
    }
}
