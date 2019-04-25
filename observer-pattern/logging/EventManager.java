interface EventManager {
  public void subscribe(EventListeners EventListeners);
  public void unsubscribe(EventListeners deletedListener);
  public void notifyListeners();
}