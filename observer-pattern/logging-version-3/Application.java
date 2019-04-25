public class Application {
  public static void main(String[] args) {

    // Publisher 
    EventManager eventManager = new EventManager();

    // Subscriber
    LoggingListener loggingListener = new LoggingListener();
    EmailAlertsListener emailAlertsListener = new EmailAlertsListener();

    // Client
    Editor editor = new Editor(eventEditor);
    editor.event.subscribe(loggingListener);
    editor.event.subscribe(emailAlertsListener);

    editor.openFile();
  }
}