public class Application {
  public static void main(String[] args) {

    DialogFactory dialogFactory = new DialogFactory();
    
    Dialog webDialog = dialogFactory.makeDialog("web");
    webDialog.render();
  
    Dialog windowsDialog = dialogFactory.makeDialog("windows");
    windowsDialog.render();

  }
}