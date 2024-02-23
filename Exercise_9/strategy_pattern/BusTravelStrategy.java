package Exercise_9.strategy_pattern;

public class BusTravelStrategy implements TravelStrategy {
    public void travel() {
        System.out.println("Traveling by bus.");
    }

    public double getSpeed() {
        return 30.0; // km per hour
    }

    public double getCost() {
        return 0.4; 
    }
}
