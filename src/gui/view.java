package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextPane;

public class view extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JPanel panel;
	private JButton btn_1;
	private JButton btn_2;
	private JPanel panel_1;
	private JButton btn_3;
	private JPanel panel_2;
	private JTable table_1;

	public view() {
		
		String[] columnNames = {"First Name",
                "Last Name",
                "Sport",
                "# of Years",
                "Vegetarian"};
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout(0,0));
		contentPane.add(panel, BorderLayout.WEST);
		
		table = new JTable();
		panel.add(table, BorderLayout.NORTH);
		
		panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new GridLayout(1, 2, 0, 0));
		
		btn_1 = new JButton("Append");
		panel_1.add(btn_1);
		
		btn_2 = new JButton("Delete");
		panel_1.add(btn_2);
		
		btn_3 = new JButton("Run");
		panel_1.add(btn_3);
		
		panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		table_1 = new JTable();
		panel_2.add(table_1, BorderLayout.CENTER);
		
		
		
	
	}
	public JButton get_Append() {
		return btn_1;
	}
	public JButton get_Delete() {
		return btn_2;
	}
	public JButton get_Run() {
		return btn_3;
	}
	public JTable getTable(){
		return table;
	}
	public JTable getAusgabe(){
		return table_1;
	}
}

	
