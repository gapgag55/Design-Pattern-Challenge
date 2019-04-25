abstract class Dialog {
  abstract Button createButton();

  public void render() {
    Button button = createButton();
    button.render();
    button.onClick();
  }
}