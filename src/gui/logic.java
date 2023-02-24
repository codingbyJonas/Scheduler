package gui;

import java.util.ArrayList;

public class logic {
	
	private model m;
	ArrayList<Col> columns = new ArrayList<>();
	boolean arbeiten;
	boolean run = true;
	int leer;
	
	public logic(model m) {
		this.m = m;
	}

	public int prio() {
		int s = 0;
		for (int i = 0; i < m.getRowCount(); i++) {
			if(m.getData().get(i).getNZustand().equals("w") || m.getData().get(i).getFortschritt() == true) {
			}
			else {
				if (m.getData().get(i).getPrio() > s) {
					s = m.getData().get(i).getPrio();
				}
			}
		}
		return s;
	}
	
	public ArrayList<Col> getInhalt() {
		int col = 0;
		while (run){
			columns.add(new Col());
			int p = prio();
			for (int row = 0; row < m.getRowCount(); row++) {
				if (m.getData().get(row).getPrio() == p && !m.getData().get(row).getNZustand().equals("w") && !m.getData().get(row).getNZustand().equals(" ")) {
					m.getData().get(row).Arbeiten();
					arbeiten = true;
				}
				else if (m.getData().get(row).getNZustand().equals("w")) {
					m.getData().get(row).Warten();
				}
				else {
					m.getData().get(row).Blockiert();
				}
				columns.get(col).setReihe(m.getData().get(row).getZustand());
				if (columns.get(col).getReihe(row).equals(" ") && leer != 0) {
					leer = 1;
				}
				else {
					leer = 0;
				}
			}
			if(leer == 1) {
				columns.remove(col);
				run = false;
			}
			leer = 2;
			col++;
		}
		return columns;
	}
	
	public ArrayList<Col> getColumns() {
		return columns;
	}
}