import java.util.ArrayList;

public class EventManager {

  private ArrayList<EventListeners> listeners;
  
  public EventManager() {
    this.listeners = new ArrayList<EventListeners>();
  }
  

  public void subscribe(EventListeners newListener) {
    this.listeners.add(newListener);
  }

  public void unsubscribe(EventListeners deletedListener) {
    int indexListener = this.listeners.indexOf(deletedListener);
    this.listeners.remove(indexListener);
  }

  public void notifyListeners() {
    for(EventListeners listener : this.listeners) {
      listener.update();
    }
  }
}