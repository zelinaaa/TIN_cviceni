package pr2;

public class Paket {
	private Paket nasledujici;
	private String nazev;
	
	public Paket(String nazev) {
		this.nazev = nazev;
	}
	
	public Paket getDalsi() {
		return nasledujici;
	}
	public void setDalsi(Paket nasledujici) {
		this.nasledujici = nasledujici;
	}

	public String getNazev() {
		return nazev;
	}

	public void setNazev(String nazev) {
		this.nazev = nazev;
	}
	
	

}
