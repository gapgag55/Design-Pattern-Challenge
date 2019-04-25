public class DialogFactory {

  public Dialog makeDialog(String dialogName) {

    if (dialogName.equals("web")) {
      return new WebDialog();
    }

    if (dialogName.equals("windows")) {
      return new WindowsDialog();
    }

    return null;
  }

}