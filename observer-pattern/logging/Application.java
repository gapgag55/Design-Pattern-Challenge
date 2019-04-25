public class Application {
  public static void main(String[] args) {

    // Subscriber
    LoggingListener loggingListener = new LoggingListener();
    EmailAlertsListener emailAlertsListener = new EmailAlertsListener();

    // Publisher
    Editor editor = new Editor();
    editor.subscribe(loggingListener);
    editor.subscribe(emailAlertsListener);
    
    editor.openFile();
  }
}