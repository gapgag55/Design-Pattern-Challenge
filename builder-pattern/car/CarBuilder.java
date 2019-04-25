public class CarBuilder implements Builder {
  private Car car;

  public void reset() {
    this.car = new Car();
  }

  public void setSeats(int number) {
    this.car.setSeats(number);
  }

  public void setEngine(String engine) {
    this.car.setEngine(engine);
  }

  public void setTripComputer(boolean trip) {
    this.car.setTripComputer(trip);
  }

  public void setGPS(boolean GPS) {
    this.car.setGPS(GPS);
  }

  public Car getCar() {
    return this.car;
  }
}