package gui;

import java.util.ArrayList;

public class Prozess {
	
	private String name; 
	private String zeit;
	private int prio;
	private ArrayList<Integer> zeiten = new ArrayList<Integer>();
	private String zustand; //a = arbeitend, w = I/O wartend, " " = belegt
	private String nZustand = "";

	public Prozess(String name, String prioritaet, String zeit) {
		setName(name);
		setPrio(prioritaet);
		setZeit(zeit);
	}
	
	public void Arbeiten() {
		this.zustand = "a";
		if (this.zeiten.get(0)-1 > 0) {
			this.zeiten.set(0, this.zeiten.get(0) -1);
			this.nZustand = "a";
		}
		else {
			if (this.prio > 0) {
				this.prio = this.prio-2;
			}
			else {
				this.prio = 0;
			}
			this.zustand = "a /" + this.prio;
			if (this.zeiten.size() > 1) {
				this.zeiten.remove(0);
				this.nZustand = "w";
			}
			else {
				this.nZustand = " ";
			}
		}
	}
	
	public void Blockiert() {
		this.zustand = " ";
	}

	public void Warten() {
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
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrio() {
		return prio;
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

	public String getZeit() {
		return zeit;
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
	
	public String getZustand () {
		return zustand;
	}
	
	public String getNZustand () {
		return nZustand;
	}
}

	
