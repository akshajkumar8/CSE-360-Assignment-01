package cse360assignment02;

public class AddingMachine {
	  private int total;
	  private StringBuffer history;
	  
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    history = new StringBuffer("0");
	  }
	  
	  public int getTotal () {
	    return 0;
	  }
	  
	  public void add (int value) {
		  total = total + value;
		  history.append(" + " + value);
	  }

	  public void subtract (int value) {
		  total = total - value;
		  history.append(" - " + value);
	  }

	  public String toString () {
	    return history.toString();
	  }

	  public void clear() {
		  history.delete(0,  history.length());
	  }
	}