package shop.ui;
import shop.ui.*;


/**
 * @see UIFormBuilder
 */
final class UIForm implements UIProcessor {
  private final String _heading;
  private final Pair[] _form;

//  static final class Pair {
//    final String prompt;
//    final UIFormTest test;

//    Pair(String thePrompt, UIFormTest theTest) {
//      String prompt = thePrompt;
//      UIFormTest test = theTest;
//    }
//  }
  
  UIForm(String heading, Pair[] menu) {
    _heading = heading;
    _form = menu;
  }
  public int size() {
    return _form.length;
  }
  public String getHeading() {
    return _heading;
  }
  public String getPrompt(int i) {
    return _form[i].prompt;
  }
  public void runAction(int i) {
	    _form[i].action().run();
	  }
  public boolean checkInput(int i, String input) {
    if (null == _form[i])
      return true;
    return _form[i].test().run(input);
  }
}
