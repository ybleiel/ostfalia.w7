package s0start;

class Matryoshka {
	String name;
	int gewicht;
	Matryoshka kleine;
}

public class Nesting {
	
	static int gesamt;
	
	public static Matryoshka nest(String n, int w, Matryoshka m) {
		Matryoshka puppe = new Matryoshka();
		puppe.name = n;
		puppe.gewicht = w;
		puppe.kleine = m;
		return puppe;
	}

	public static Matryoshka unnest(Matryoshka m) {
		return m.kleine;
	}
	
	public static String describe(Matryoshka m) {
		String beschreibung = "";
		
		if (m.kleine != null)
			beschreibung += "[" + m.name + " " + describe(m.kleine) + " " + m.gewicht + "]";
		else
			beschreibung += "[" + m.name + " " + m.gewicht + "]";
		return beschreibung;
	}
	
	public static int getTotalWeightR(Matryoshka m) {
		gesamt += m.gewicht;
		if (m.kleine != null) {
			getTotalWeightR(m.kleine);
		}
		return gesamt;
	}
	
	public static int getTotalWeightI(Matryoshka m) {
		int gesamtI;
		
		gesamtI = 0;
		while (m.kleine != null) {
			gesamtI += m.gewicht;
			m = m.kleine;
		}
		gesamtI += m.gewicht;
		return gesamtI;
	}
	
	public static void main(String[] args) {
		Matryoshka puppe1 = new Matryoshka();
		Matryoshka puppe2 = new Matryoshka();
		Matryoshka puppe3 = new Matryoshka();
		puppe1 = nest("olaf", 10, null);
		puppe2 = nest("ronaldo", 15, puppe1);
		puppe3 = nest("joe", 20, puppe2);
		int gewicht = getTotalWeightR(puppe1);
		System.out.println(describe(puppe3));
		System.out.println(gewicht);
	}
}
