// AnimalPlay.java: Client
public class AnimalPlay {
  public static void main(String[] args) {

    Animal dog = new Dog("Riktor");
    dog.setFly(new ItCantFlys());
    dog.tryToFly();

    Animal bird = new Bird("Lucifer");
    bird.setFly(new ItFlys());
    bird.tryToFly();

  }
}