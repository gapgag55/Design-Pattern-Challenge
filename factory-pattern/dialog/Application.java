public class Application {
  public static void main(String[] args) {
    Dialog webDialog = new WebDialog();
    webDialog.render();
  
    Dialog windowsDialog = new WindowsDialog();
    windowsDialog.render();
  }
}