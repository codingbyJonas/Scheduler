package gui;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class model_ausgabe extends AbstractTableModel {

	private model m;
	private logic l;
	int takt;
	ArrayList<Col> data = new ArrayList<>();
	
	public model_ausgabe(model m, logic l) {
		this.m = m;
		this.l = l;
	}

	@Override
	public int getRowCount() {
		return m.getRowCount();
	}

	@Override
	public int getColumnCount() {
		return 20;
	}

	@Override
	public Object getValueAt(int row, int col) {
		return data.get(col).getReihe(row);
	}
	
	public void setValueAt(Object value, int row, int col) {
	}
	
	public boolean isCellEditable(int row, int col) {			
		return false;
	}

	public void setData(ArrayList<Col> data) {
		this.data = data;
	}
}
