package gui;

import java.util.ArrayList;

public class logic {
	
	private model m;
	ArrayList<Col> columns = new ArrayList<>();
	
	public logic(model m) {
		this.m = m;
	}

	public int prio() {
		int s = 0;
		for (int i = 0; i < m.getRowCount(); i++) {
			if(m.getData().get(i).zustand == "w" || m.getData().get(i).azeit == 5);
			else {
				int s2 = m.getData().get(i).prio;
				if (s2 > s) {
					s = s2;
				}
			}
		}
		return s;
	}
	
	public ArrayList<Col> inhalt() {
		for (int col = 0; col < 20; col++) {
			columns.add(new Col());
			for (int row = 0; row < m.getRowCount(); row++) {
				
				if (m.getData().get(row).zustand.equals("w")) {
					m.getData().get(row).Warten();
				}
				else if (prio() == m.getData().get(row).prio) {
					m.getData().get(row).Arbeiten();
				}
				columns.get(col).setReihe(m.getData().get(row).zustand);
			}
		}/*
		for (int row = 0; row <m.getRowCount(); row++) {
			for (int col = 0; col <columns.size(); col++) {
				System.out.print("| " + columns.get(col).getZustand(row) + " ");
			}
			System.out.println("|");
		}*/
		return columns;
	}
	
}
