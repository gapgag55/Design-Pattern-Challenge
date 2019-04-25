public class Application {
  public static void main(String[] args) {

    // Builder
    CarBuilder carBuilder = new CarBuilder();

    // Director
    Director director = new Director();

    // Build Sport Car
    director.constructSportsCar(carBuilder);
    
    // Result from Builder with Construct
    Car sportCar = carBuilder.getCar();
    sportCar.getCarInformation();
    sportCar.run();

    // Build Normal Car
    director.constructNormalCar(carBuilder);

    // Result from Builder with Construct
    Car normalCar = carBuilder.getCar();
    normalCar.getCarInformation();
    normalCar.run();

  }
}