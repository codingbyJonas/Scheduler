package gui;

import java.util.ArrayList;

public class Prozess {
	String name; 
	String prioritaet;
	String zeit;
	ArrayList<Integer> zeiten = new ArrayList<Integer>();
	String zustand; //a = arbeitend, b = belegt, w = wartend

	public Prozess(String name, String prioritaet, String zeit) {
		this.name = name;
		this.prioritaet = prioritaet;
		setZeit(zeit); 
	}
		
	public void setZeit(String zeit) {
		this.zeit = zeit;
		if(zeit != "") {
			zeiten.clear();
			String [] zZeiten = zeit.split(";", 0);
			for (int i = 0; i < zZeiten.length; i++) {
				this.zeiten.add(Integer.parseInt(zZeiten[i]));
			}
			System.out.print(this.name + " " + this.prioritaet + " ");
			System.out.println(this.zeiten);
		}
	}
	
	public void setArbeiten() {
		// TODO Auto-generated method stub
		this.zustand = "a";
		//TODO zeit -1, prio -2 usw.
	}

	public void setBelegt() {
		// TODO Auto-generated method stub
		this.zustand = "b";
	}
}

	

