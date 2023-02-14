package gui;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.table.AbstractTableModel;


public class model_ausgabe extends AbstractTableModel {

	private model m;
	private logic l;
	int takt;
	
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
		Object inhalt = l.inhalt(rowIndex, columnIndex, takt);
		takt ++;
		System.out.println(takt);
		return inhalt;
	}
	
	public void setValueAt(Object value, int row, int col) {
		
	}
	
	public boolean isCellEditable(int row, int col) {			
		return false;
	}

}
