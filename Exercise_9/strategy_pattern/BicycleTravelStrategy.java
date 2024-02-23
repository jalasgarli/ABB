package Exercise_9.strategy_pattern;

public class BicycleTravelStrategy implements TravelStrategy{
    public void travel() {
        System.out.println("Traveling by bicycle.");
    }

    public double getSpeed() {
        return 20.0; // km per hour
    }

    public double getCost() {
        return 0.0; // manat per km
    }
}
