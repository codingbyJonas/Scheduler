package gui;

import java.util.ArrayList;
import java.util.List;

public class logic {

	private model model;
	int size = 1;
	ArrayList<ArrayList<String>> zeit = new ArrayList<ArrayList<String>>(size);
	
	public logic(model m) {
		// TODO Auto-generated constructor stub
		this.model = m;
	}
	
	public int zeiten() {
		  for(int i = 0; i < size; i++)  {
		        zeit.add(new ArrayList<String>());
		    }
		return 0;
	}
	
}
