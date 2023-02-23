package gui;

import java.util.ArrayList;

public class Prozess {
	
	String name; 
	int prio;
	String zeit;
	ArrayList<Integer> zeiten = new ArrayList<Integer>();
	int aZeit = 0;
	int wZeit = 0;
	String zustand; //a = arbeitend, w = I/O wartend, " " = belegt
	String nZustand = "";
	boolean fertig;

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
		this.zustand = "  /" + this.prio; 
	}
	public int getPrio() {
		return prio;
	}
	
	public String getZustand () {
		return zustand;
	}
	
	public String getNZustand () {
		return nZustand;
	}
	
	public boolean getFortschritt() {
		return fertig;
	}
	
	public void Arbeiten() {
		this.wZeit = 0;
		this.zustand = "a";
		this.aZeit++;
		/*if (this.aZeit == 5) {
			this.prio = this.prio-2;
			this.zustand = "a /" + this.prio;
			this.nZustand = " ";
		}
		else */if (this.zeiten.get(0) > 1) {
			this.zeiten.set(0, this.zeiten.get(0) -1);
			this.nZustand = "a";
		}
		else {
			this.prio = this.prio-2;
			this.zustand = "a /" + this.prio;
			if (this.zeiten.size() > 1) {
				this.zeiten.remove(0);
				this.nZustand = "w";
			}
			else {
				this.nZustand = " ";
				fertig = true;
			}
		}
	}

	public void Warten() {
		this.aZeit = 0;
		this.zustand = "w";
		if (this.zeiten.get(0) > 1) {
			this.zeiten.set(0, this.zeiten.get(0) -1);
			this.nZustand = "w";
		}
		else {
			this.zeiten.remove(0);
			this.nZustand = "";
		}
	}
	
	public void Blockiert() {
		this.aZeit = 0;
		this.wZeit++;
		this.zustand = " ";
	}
}

	

