package gui;

import java.util.ArrayList;
import java.util.List;

public class logic {
	
	private model m;
	ArrayList<Object> prio = new ArrayList<Object>();
	
	public logic(model m) {
		// TODO Auto-generated constructor stub
		this.m = m;
	}

	public int prio() {
		int s = 0;
		for (int i = 0; i <m.getData().size(); i++) {
			int s2 = Integer.valueOf((String) m.getData().get(i).prioritaet);
			if (s2 > s) {
				s = s2;
			}
		}
		return s;
	}
	
}
