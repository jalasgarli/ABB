package Exercise_9.strategy_pattern;

public class Client {
    public static void main(String[] args) {
        TransportationService transportationService = new TransportationService();

        transportationService.setTravelStrategy(new BicycleTravelStrategy());
        transportationService.travel();
        System.out.println();

        transportationService.setTravelStrategy(new BusTravelStrategy());
        transportationService.travel();
        System.out.println();

        transportationService.setTravelStrategy(new CarTravelStrategy());
        transportationService.travel();
        System.out.println();

        transportationService.setTravelStrategy(new SubwayTravelStrategy());
        transportationService.travel();
        System.out.println();
    }
}
