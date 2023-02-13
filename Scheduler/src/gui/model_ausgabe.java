package gui;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.table.AbstractTableModel;


public class model_ausgabe extends AbstractTableModel {

	private model m;
	private logic l;
	
	public model_ausgabe( model m, logic l) {
		// TODO Auto-generated constructor stub
		this.m = m;
		this.l = l;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return m.getData().size();
		//return v.getTable().getRowCount()*2;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 15;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		int prio;
		switch (columnIndex) {
			case 0:
				return m.getData().get(rowIndex).name;
			
			case 1:
				prio = l.prio();
				if (m.getData().get(rowIndex).zustand == "w") {
					m.getData().get(rowIndex).Warten();
				}
				else if (prio == m.getData().get(rowIndex).prioritaet) {
					m.getData().get(rowIndex).Arbeiten();
				} else {
					m.getData().get(rowIndex).Belegt();
				}
				return m.getData().get(rowIndex).zustand;
				
			case 2:
				prio = l.prio();
				if (m.getData().get(rowIndex).zustand == "w") {
					m.getData().get(rowIndex).Warten();
				}
				else if (prio == m.getData().get(rowIndex).prioritaet) {
					m.getData().get(rowIndex).Arbeiten();
				} else {
					m.getData().get(rowIndex).Belegt();
				}
				return m.getData().get(rowIndex).zustand;
				
			case 3:
				prio = l.prio();
				if (m.getData().get(rowIndex).zustand == "w") {
					m.getData().get(rowIndex).Warten();
				}
				else if (prio == m.getData().get(rowIndex).prioritaet) {
					m.getData().get(rowIndex).Arbeiten();
				} else {
					m.getData().get(rowIndex).Belegt();
				}
				return m.getData().get(rowIndex).zustand;
				
			
		}
		return "";
	}
	
	public void setValueAt(Object value, int row, int col) {
		
	}
	
	public boolean isCellEditable(int row, int col) {			
		return false;
	}

}
