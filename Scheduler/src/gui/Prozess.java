package gui;

import java.util.ArrayList;

public class Prozess {
	
	String name; 
	int prio;
	String zeit;
	ArrayList<Integer> zeiten = new ArrayList<Integer>();
	int azeit = 0;
	String zustand = " "; //a = arbeitend, w = wartend, " " = belegt

	public Prozess(String name, String prioritaet, String zeit) {
		this.name = name;
		setPrio(prioritaet);
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
			//System.out.println(this.name + " " + this.prio + " " + this.zeiten);
		}
	}
	
	public void setPrio(String prio) {
		if (prio.equals("")) {
			this.prio = 0;
		}
		else {
			 this.prio = Integer.parseInt(prio);
		}
		if (this.prio > 15) {
			this.prio = 15;
		}
	}
	
	public void Arbeiten() {
		if(this.zeiten.get(0) > 0) {
			this.zeiten.set(0, this.zeiten.get(0) -1);
			this.azeit++;
			this.zustand = "a";
		}
		else {
			if (this.zeiten.size() > 0) {
				this.zeiten.remove(0);
				if (this.prio > 1) {
					this.prio = this.prio -2;
				}
				else {
					this.prio = 0;
				}
				this.zustand = "w";
			}
			else {
				this.zustand = " ";
			}
		}
		//System.out.println(this.name + " Übrige Zeit:" + this.zeiten.get(0) + " Zustand:" + this.zustand + " Prio:" + this.prioritaet);
	}

	public void Warten() {
		if(this.zeiten.get(0) > 0) {
			this.zeiten.set(0, this.zeiten.get(0) -1);
			this.zustand = "w";
		}
		else {
			if (this.zeiten.size() > 0) {
				this.zeiten.remove(0);
			}
			this.zustand  = " ";
		}
		//System.out.println(this.name + " Übrige Zeit:" + this.zeiten.get(0) + " Zustand:" + this.zustand);
	}
	
	public void Blockiert() {
		
	}
}

	

