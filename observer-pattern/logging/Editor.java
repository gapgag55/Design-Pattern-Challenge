import java.util.ArrayList;

public class Editor implements EventManager {

  private ArrayList<EventListeners> listeners;

  public Editor() {
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

  public void openFile() {
    this.notifyListeners();
  }

  public void saveFile() {
    this.notifyListeners();
  }

}