package gui;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.table.AbstractTableModel;


public class model_ausgabe extends AbstractTableModel {

	private view v;
	private model m;
	private logic l;
	
	public model_ausgabe(view v, model m, logic l) {
		// TODO Auto-generated constructor stub
		this.v = v;
		this.m = m;
		this.l = l;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return v.getTable().getRowCount();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 15;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		if (columnIndex == 0) {
			return m.getData().get(rowIndex).name;
		}
		else if (columnIndex == 1) {
			if (l.prio() == Integer.valueOf(m.getData().get(rowIndex).prioritaet)) {
				m.getData().get(rowIndex).setArbeiten();
			} else {
				m.getData().get(rowIndex).setBelegt();
			}
			return m.getData().get(rowIndex).zustand;
		}
		return rowIndex;
	}
	
	public void setValueAt(Object value, int row, int col) {
		
	}
}
