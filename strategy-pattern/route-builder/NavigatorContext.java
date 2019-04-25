public class NavigatorContext {
  private RouteStrategyInterface strategy;

  public void setStrategy(RouteStrategyInterface strategy) {
    this.strategy = strategy;
  }

  public void executeStrategy() {
    this.strategy.build();
  }
}