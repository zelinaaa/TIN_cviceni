package pr4;

import java.util.Vector;

public class Uzel {
	Vector<Uzel> vector = new Vector<Uzel>();
	private Uzel node;
	private String nazev;
	
	public Uzel(String nazev) {
		this.nazev = nazev;
	}

	public Uzel getNode(int pozice) {
		return vector.get(pozice);
	}

	public void setNode(Uzel node) {
		vector.add(node);
	}

	public void printNodes() {
		for (Integer i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i).nazev);
		}
	}
	
	

}
