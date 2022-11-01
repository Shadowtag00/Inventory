package shop.ui;

import java.util.ArrayList;
import java.util.List;

public class UIFactory {
  //public UIFactory() {}
  //static private UI _UI = new PopupUI();
  //static private UI _UI = new TextUI();
	static private UI _UI;
  private final List<Pair> _menu = new ArrayList<Pair>();
  
  public void add(String prompt, UIFormTest test) {
    _menu.add(new Pair(prompt, test));
  }
  
  public void add(String prompt, UIMenuAction action) {
	    if (null == action)
	      throw new IllegalArgumentException();
	    _menu.add(new Pair(prompt, action));
	  }
  
  public UIForm toUIForm(String heading) {
    if (null == heading)
      throw new IllegalArgumentException();
    
    if (_menu.size() < 1)
      throw new IllegalStateException();
    
    Pair[] array = new Pair[_menu.size()];
    
    for (int i = 0; i < _menu.size(); i++)
      array[i] = _menu.get(i);
    return new UIForm(heading, array);
  }
  
//  public UIMenu toUIMenu(String heading) {
//	    if (null == heading)
//	      throw new IllegalArgumentException();
//	    if (_menu.size() <= 1)
//	      throw new IllegalStateException();
//	    
//	    Pair[] array = new Pair[_menu.size()];
//	    
//	    for (int i = 0; i < _menu.size(); i++)
//	      array[i] = _menu.get(i);
//	    return new UIMenu(heading, array);
//	  }
//  static public UI ui () {
//    return _UI;
//    
//  }
  static public UI TextUI() {
	  return new TextUI();
  }
  
  static public UI PopupUI() {
	  return new PopupUI();
  }
  
 public final class UIForm implements UIProcessor {
	  private final String _heading;
	  private final Pair[] _form;

	//  static final class Pair {
//	    final String prompt;
//	    final UIFormTest test;

//	    Pair(String thePrompt, UIFormTest theTest) {
//	      String prompt = thePrompt;
//	      UIFormTest test = theTest;
//	    }
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

  
}
