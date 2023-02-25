package gui;

import java.awt.event.ActionEvent;

public class controller {
	
	private model model;
	private model_ausgabe model_ausgabe;
	private view view;
	private logic logic;
	
	public controller (model m, model_ausgabe ma, view v, logic l) {
		this.model = m;
		this.model_ausgabe = ma;
		this.view = v;
		this.logic = l;
		initView();
	}
	
	public void initView() {
		view.getTable().setModel(this.model);
	}
	
	public void initController() {
		view.get_Append().addActionListener(e -> appendEmptyRow(e));
		view.get_Delete().addActionListener(e -> deleteRow(e));
		view.get_Run().addActionListener(e -> run(e));
	}
	
	private void appendEmptyRow(ActionEvent e) {
		this.model.appendEmptyRow();
		int row = view.getTable().getRowCount();
		view.getTable().setRowSelectionInterval(row -1, row -1);
		view.getTable().editCellAt(row -1, 0);
		view.getTable().setSurrendersFocusOnKeystroke(true);
		view.getTable().getEditorComponent().requestFocus();
	}

	private void deleteRow(ActionEvent e) {
		int row = view.getTable().getSelectedRow();
		this.model.deleteRow(row);
	}
	
	private void run(ActionEvent e) {
		model_ausgabe.setData(logic.getInhalt());
		view.getAusgabe().setModel(this.model_ausgabe);
	}
}