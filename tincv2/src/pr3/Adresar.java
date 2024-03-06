package pr3;

public class Adresar {
	private Adresar Pravy;
	private Adresar Levy;
	private String nazev;
	
	public Adresar(String nazev) {
		this.nazev = nazev;
	}
	
	public Adresar getPravy() {
		return Pravy;
	}
	public void setPravy(Adresar pravy) {
		Pravy = pravy;
	}
	public Adresar getLevy() {
		return Levy;
	}
	public void setLevy(Adresar levy) {
		Levy = levy;
	}

	public String getNazev() {
		return nazev;
	}

	public void setNazev(String nazev) {
		this.nazev = nazev;
	}
	
	
	
}
