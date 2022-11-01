package shop.ui;


class Pair<U> {

	String prompt;
	U action;
	
//	Pair(String thePrompt, UIFormTest theTest) {
//	      String prompt = thePrompt;
//	      UIFormTest test = theTest;
//	    }
//	  
//	Pair(String thePrompt, UIMenuAction theAction) {
//	      String prompt = thePrompt;
//	      UIMenuAction x = theAction;
//	    }

//	Pair(String thePrompt, U theTest) {
//	      String prompt = thePrompt;
//	      if (theTest instanceof UIFormTest) {
//	      UIFormTest action = (UIFormTest) theTest;
//	    }else if(theTest instanceof UIMenuAction) {
//	    	UIMenuAction action =(UIMenuAction) theTest;
//	    }
//	}
	Pair(String thePrompt, U theAction) {
	      prompt = thePrompt;
	      action = theAction;
	    }
	public UIFormTest test() {
		return (UIFormTest)this.action;
	}
	
	public UIMenuAction action() {
		return (UIMenuAction)this.action;
	}
}
