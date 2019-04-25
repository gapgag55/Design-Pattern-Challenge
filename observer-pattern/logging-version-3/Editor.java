public class Editor {

  public EventManager event;

  public Editor(EventManger event) {
    this.event = event;
  }
  
  public void openFile() {
    this.event.notifyListeners();
  }

  public void saveFile() {
    this.event.notifyListeners();
  }

}