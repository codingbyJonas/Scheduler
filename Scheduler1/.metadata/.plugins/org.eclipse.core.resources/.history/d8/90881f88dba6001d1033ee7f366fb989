package gui;

public class app {
	public static void main (String[] args) {
		model m;
		view v;
		model_ausgabe ma;
		controller c;
		
		m = new model();
		v = new view();
		ma = new model_ausgabe(v, m);
		c = new controller(m, ma, v);
		c.initController();
		v.setVisible(true);
	}
}
