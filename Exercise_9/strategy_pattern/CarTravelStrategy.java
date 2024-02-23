package Exercise_9.strategy_pattern;


public class CarTravelStrategy implements TravelStrategy {
    public void travel() {
        System.out.println("Traveling by car.");
    }

    public double getSpeed() {
        return 65.0; // km per hour
    }

    public double getCost() {
        return 0.8; // manat per km
    }
}
