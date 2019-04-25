public class Director {
  private Builder builder;

  public void constructSportsCar(Builder builder) {
    builder.reset();
    builder.setSeats(2);
    builder.setEngine("SportEngine");
    builder.setTripComputer(true);
    builder.setGPS(true);
  }

  public void constructNormalCar(Builder builder) {
    builder.reset();
    builder.setSeats(4);
    builder.setEngine("normalEngine");
    builder.setTripComputer(false);
    builder.setGPS(false);
  }
}