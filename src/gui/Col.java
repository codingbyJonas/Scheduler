package gui;

import java.util.ArrayList;

public class Col {
	
	ArrayList<String> rows = new ArrayList<String>();
	
	//public Col () {
	//}

	public void setReihe(String z) {
		rows.add(z);
	}
	
	public String getReihe(int i) {
		return rows.get(i);
	}
}
