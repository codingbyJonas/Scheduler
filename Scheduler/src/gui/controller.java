package gui;

import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//import com.google.gson.Gson;

import java.awt.Event;

public class controller {
	private model model;
	private model_ausgabe model_ausgabe;
	private view view;
	
	public controller (model m, model_ausgabe ma, view v) {
		this.model = m;
		this.model_ausgabe = ma;
		this.view = v;
		initView();
	}
	public void initView() {
		view.getTable().setModel(this.model);
	}
	public void initController() {
		view.get_Append().addActionListener(e -> appendEmptyRow(e));
		view.get_Delete().addActionListener(e -> deleteRow(e));
		view.get_Run().addActionListener(e -> run(e));
		view.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				save();
			}
		});
	}
	
	private void appendEmptyRow(ActionEvent e) {
		// TODO Auto-generated method stub
		this.model.appendEmptyRow();
		int row = view.getTable().getRowCount();
		view.getTable().setRowSelectionInterval(row-1, row-1);
		view.getTable().editCellAt(row-1, 0);
		view.getTable().setSurrendersFocusOnKeystroke(true);
		view.getTable().getEditorComponent().requestFocus();
	}

	private void deleteRow(ActionEvent e) {
		int row = view.getTable().getSelectedRow();
		this.model.deleteRow(row);
	}
	
	private void run(ActionEvent e) {
		
		view.getAusgabe().setModel(this.model_ausgabe);
	}
	
	private void save() {
		/*String file = "Dokumente";
		Path path = Paths.get(file);
		
		try (Writer writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {

	            Gson gson = new Gson();
	            gson.toJson(model.data, writer);	//DATA GETTER VON MODEL , writer);
	        } catch(IOException e1) {
				System.out.println("FAIL!!!!! ABORT MISSION!!! VIVA LA REVOLUTIONA" );
			}*/
		}
}