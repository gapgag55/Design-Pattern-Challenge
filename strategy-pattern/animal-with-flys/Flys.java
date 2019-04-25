// Flys.java: Interface
interface Flys {
  String fly();
}

class ItFlys implements Flys {
  public String fly() {
    return "can fly";
  }
}


class ItCantFlys implements Flys {
  public String fly() {
    return "can't fly";
  }
}