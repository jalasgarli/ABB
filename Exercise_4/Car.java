class Car {
    String Brand;
    String Model;
    int YearOfProduction;
    String FuelType;
    double Speed;
    
    Car(String Brand, String Model, int YearOfProduction, String FuelType) {
        this.Brand = Brand;
        this.Model = Model;
        this.YearOfProduction = YearOfProduction;
        this.FuelType = FuelType;
        this.Speed = 0;
    }

    void speed(double amountOfSpeed) {
        Speed += amountOfSpeed;
    }

    void slow(double amountOfSpeed) {
        Speed -= amountOfSpeed;
    }
    void slow() {
        Speed = 0;
    }
    void checkSpeed(double limit) {
        if(Speed > limit) {
            System.out.println("Warning");
        }
    }
}
