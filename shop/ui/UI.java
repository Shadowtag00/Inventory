package shop.ui;

import shop.ui.UIFactory.UIForm;

public interface UI {
  public void processMenu(UIForm _menus);
  public String[] processForm(UIForm form);
  public void displayMessage(String message);
  public void displayError(String message);
}
