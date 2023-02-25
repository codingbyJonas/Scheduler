package gui;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.AbstractTableModel;


public class model extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	private ArrayList<Prozess> data = new ArrayList<>(
		Arrays.asList(
			new Prozess("A", "12" , "2,4,6"),
			new Prozess("B", "10", "1,2,1,2,1"),
			new Prozess("C", "11" , "2,2,5")
		)
	);

	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public int getRowCount() {
		return data.size();
	}
	
	@Override
	public Object getValueAt(int row, int col) {
		switch (col) {
			case 0:
				return data.get(row).getName();
			case 1:
				return data.get(row).getPrio();
			case 2:
				return data.get(row).getZeit();
		}
		return null;	
	} 
			
	public void setValueAt(Object value, int row, int col) {
		switch (col) {
			case 0:
				data.get(row).setName((String) value);
				break;
			case 1:
				data.get(row).setPrio((String) value);
				break;
			case 2:
				data.get(row).setZeit((String) value);
				break;
		}
	}
			
	public boolean isCellEditable(int row, int col) {			
		return true;
	}

	public void appendEmptyRow() {
		data.add(new Prozess("", "" ,""));
		int count = getRowCount();
		fireTableRowsInserted(0, count);
	}	
			
	public void deleteRow(int rowIndex) {
		data.remove(data.get(rowIndex));
		int count = getRowCount();
		fireTableRowsDeleted(count, count);
		fireTableRowsInserted(0, count);
	}

	public ArrayList<Prozess> getData() {
		return data;
	}

	public void setData(ArrayList<Prozess> data) {
		this.data = data;
	}	
}
