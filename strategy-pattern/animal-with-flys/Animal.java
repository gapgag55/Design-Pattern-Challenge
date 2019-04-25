// Animal.java: Context
public class Animal {
  private String name;
  private Flys flyStrategy;

  public Animal(String name) {
    this.name = name;
  }

  public void setFly(Flys fly) {
    this.flyStrategy = fly;
  }

  public void tryToFly() {
    System.out.println(this.name + " " + this.flyStrategy.fly());
  }
}