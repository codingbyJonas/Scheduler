package gui;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.table.AbstractTableModel;


public class model extends AbstractTableModel {
	
	String[] columnNames = {"Name", "Priorität", "Zeit"}; 

	ArrayList<Prozess> data = new ArrayList<>(

			Arrays.asList(
	
				new Prozess("Name", "Priorität", "Zeit"),
				new Prozess("Peter", "12", "1;2;2"),
				new Prozess("uuuuuu", "12", "1;2;2")

			)

			);

	private model_ausgabe ma;

			public model(model_ausgabe ma) {
				// TODO Auto-generated constructor stub
				this.ma = ma;
			}

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
				return data.get(row).name;
			case 1:
				 return data.get(row).priorität;
			case 2:
				 return data.get(row).zeit;
			}
			return null;
						
			} 

			Class[] columns = new Class[]{
					String.class, String.class, String.class
					}; 
			
			public Class getColumnClass(int c) {
				return columns[c];
			}
	
			public boolean isCellEditable(int row, int col) {			
				if (row==0) {
					return false;
				}
				return true;
			}

			public void setValueAt(Object value, int row, int col) {
				Prozess p = data.get(row);
				switch (col) {
				case 0:
					p.name = (String) value;
					break;
				 case 1:
					p.priorität = (String) value;
					break;
				 case 2:
					p.zeit = (String) value;
					break;
				}
			
			}

			public void appendEmptyRow() {
				// TODO Auto-generated method stub
				data.add(new Prozess("","",""));
				int count = getRowCount();
				fireTableRowsInserted(0, count);
				ma.fireTableRowsInserted(0, count);
			}	
			
			public void deleteRow(int rowIndex) {
				if (rowIndex > 0) {
					data.remove(data.get(rowIndex));
					int count = getRowCount();
					fireTableRowsDeleted(count, count);
					fireTableRowsInserted(0, count);
				}
			}

			public ArrayList<Prozess> getData() {
				return data;
			}

			public void setData(ArrayList<Prozess> data) {
				this.data = data;
			}	
}
