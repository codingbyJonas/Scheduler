package gui;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.table.AbstractTableModel;


public class model_ausgabe extends AbstractTableModel {

	private view v;
	private model m;
	
	public model_ausgabe(view v, model m) {
		// TODO Auto-generated constructor stub
		this.v = v;
		this.m = m;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return (v.getTable().getRowCount()-1)*2+1;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		switch (columnIndex) {
		case 0:
			return m.getData().get((rowIndex+1)/2).name;
		}
		return null;
	}
	
	public void setValueAt(Object value, int row, int col) {
		
	}
}
