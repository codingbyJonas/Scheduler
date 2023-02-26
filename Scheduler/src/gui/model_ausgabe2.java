package gui;

import javax.swing.table.AbstractTableModel;


public class model_ausgabe2 extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	@Override
	
	public int getRowCount() {
		return 0;
	}

	@Override
	public int getColumnCount() {
		return 0;
	}

	@Override
	public Object getValueAt(int row, int col) {
		return null;
	}
	
	public void setValueAt(Object value, int row, int col) {
	}
	
	public boolean isCellEditable(int row, int col) {			
		return false;
	}
}
