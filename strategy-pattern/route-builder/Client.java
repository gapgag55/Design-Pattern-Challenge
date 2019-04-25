// NOTE: Strategy Pattern composes with Client, Context, Interface, and Strategy (A set of algorithms)

public class Client {
  public static void main(String[] args) {
    
      NavigatorContext context = new NavigatorContext();

      // Build Road
      RoadStrategy roadStrategy = new RoadStrategy();
      context.setStrategy(roadStrategy);
      context.executeStrategy();

      // Build Walking
      WalkingStrategy walkingStrategy = new WalkingStrategy();
      context.setStrategy(walkingStrategy);
      context.executeStrategy();

  }
}