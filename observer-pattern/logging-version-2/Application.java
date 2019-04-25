public class Application {
  public static void main(String[] args) {

    // Publisher 
    EventManager eventManager = new EventManager();

    // Subscriber
    LoggingListener loggingListener = new LoggingListener();
    EmailAlertsListener emailAlertsListener = new EmailAlertsListener();

    // Client
    eventManager.subscribe(loggingListener);
    eventManager.subscribe(emailAlertsListener);

    Editor editor = new Editor(eventEditor);
    editor.openFile();
  }
}