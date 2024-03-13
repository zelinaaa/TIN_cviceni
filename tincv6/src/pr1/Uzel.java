package pr1;

import java.util.HashMap;

public class Uzel {
	private String nazev;
	private HashMap<Uzel, Integer> sousediSVahy = new HashMap<Uzel, Integer>();
	
	public Uzel(String nazev) {
		this.nazev=nazev;
	}
	
	public void pridejSouseda(Uzel soused, Integer vahaSouseda) {
		sousediSVahy.put(soused, vahaSouseda);
	}
	
	public int getPrimaCena(Uzel hledanySoused) {
		return sousediSVahy.get(hledanySoused);
	}

	public String getNazev() {
		return nazev;
	}

	public void setNazev(String nazev) {
		this.nazev = nazev;
	}
	
}
