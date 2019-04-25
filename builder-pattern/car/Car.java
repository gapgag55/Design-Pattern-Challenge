public class Car {

  private int seats;
  private String engine;
  private boolean trip;
  private boolean GPS;

  public void setSeats(int number) {
    this.seats = number;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public void setTripComputer(boolean trip) {
    this.trip = trip;
  }

  public void setGPS(boolean GPS) {
    this.GPS = GPS;
  }

  public void getCarInformation() {
    String seats = "\nSeat: " + this.seats + "\n";
    String engine = "Engine: " + this.engine + "\n";
    String trip = "TripComputer: " + this.trip + "\n";
    String GPS = "GPS: " + this.GPS;

    System.out.print(seats + engine + trip + GPS);
  }

  public void run() {
    System.out.print("Car is running...");
  }

}