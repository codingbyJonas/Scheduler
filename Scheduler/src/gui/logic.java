package gui;

import java.util.ArrayList;
import java.util.List;

public class logic {
	
	private model m;
	
	public logic(model m) {
		// TODO Auto-generated constructor stub
		this.m = m;
	}

	public int prio() {
		int s = 0;
		for (int i = 0; i <m.getData().size(); i++) {
			if(m.getData().get(i).zustand == "w");
			else {
				int s2 = m.getData().get(i).prioritaet;
				if (s2 > s) {
					s = s2;
				}
			}
		}
		return s;
	}
	
	public String inhalt(int rowIndex, int columnIndex) {
		if (m.getData().get(rowIndex).zustand == "w") {
			m.getData().get(rowIndex).Warten();
		}
		else if (prio == m.getData().get(rowIndex).prioritaet) {
			m.getData().get(rowIndex).Arbeiten();
		} else {
			m.getData().get(rowIndex).Belegt();
		}
		return m.getData().get(rowIndex).zustand;
		return null;
	}
	
}
