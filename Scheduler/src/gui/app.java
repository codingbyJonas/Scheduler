package gui;

public class app {
	public static void main (String[] args) {
		model m;
		view v;
		model_ausgabe ma;
		controller c;
		logic l;
		
		m = new model();
		v = new view();
		l = new logic(m);
		ma = new model_ausgabe(v, m, l);
		c = new controller(m, ma, v);
		c.initController();
		v.setVisible(true);
	}
}
