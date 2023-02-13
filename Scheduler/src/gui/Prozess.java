package gui;

import java.util.ArrayList;

public class Prozess {
	String name; 
	int prioritaet;
	String zeit;
	ArrayList<Integer> zeiten = new ArrayList<Integer>();
	String zustand; //a = arbeitend, w = wartend
	int aZeit;

	public Prozess(String name, int prioritaet, String zeit) {
		this.name = name;
		this.prioritaet = prioritaet;
		setZeit(zeit);
	}
		
	public void setZeit(String zeit) {
		this.zeit = zeit;
		if(zeit != "") {
			zeiten.clear();
			String [] zZeiten = zeit.split(",", 0);
			for (int i = 0; i < zZeiten.length; i++) {
				this.zeiten.add(Integer.parseInt(zZeiten[i]));
			}
			System.out.print(this.name + " " + this.prioritaet + " ");
			System.out.println(this.zeiten);
		}
	}
	
	public void Arbeiten() {
		// TODO Auto-generated method stub
		if(this.zeiten.get(0)!= 0) {
			this.zeiten.set(0, this.zeiten.get(0)-1);
			System.out.println(this.name + this.zeiten.get(0));
			this.zustand = "a";
		}
		else {
			this.zeiten.remove(0);
			this.prioritaet = prioritaet -2;
			this.zustand = "";
		}
		
	}

	public void Belegt() {
		// TODO Auto-generated method stub
		this.zustand = "";
	}
	 
	public void Warten() {
		if(this.zeiten.get(0)!= 0) {
			this.zeiten.set(0, this.zeiten.get(0)-1);
			System.out.println(this.name + this.zeiten.get(0));
		}
		else {
			this.zeiten.remove(0);
			this.prioritaet = prioritaet -2;
			this.zustand = "";
		}
	}
}

	

