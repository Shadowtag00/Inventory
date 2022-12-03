package shop.main;

import shop.ui.UIFactory;
import shop.ui.UI;
import shop.data.Data;

import javax.swing.*;

public class Main {
  private Main() {}
  public static void main(String[] args) {
    UI ui;
    JOptionPane.showMessageDialog(null, "Loading...");
    if (Math.random()<=0.5) {
      ui = UIFactory.TextUI();
    } else {
      ui = UIFactory.PopupUI();
    }
    Control control = new Control(Data.newInventory(), ui);
    control.run();
  }
}