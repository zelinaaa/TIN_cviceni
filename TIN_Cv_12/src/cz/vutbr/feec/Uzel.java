package cz.vutbr.feec;

public class Uzel {
	private String nazev;
	private Uzel levy;
	private Uzel pravy;
	
	public String getNazev() {
		return nazev;
	}
	public void setNazev(String nazev) {
		this.nazev = nazev;
	}
	public Uzel getLevy() {
		return levy;
	}
	public void setLevy(Uzel levy) {
		this.levy = levy;
	}
	public Uzel getPravy() {
		return pravy;
	}
	public void setPravy(Uzel pravy) {
		this.pravy = pravy;
	}
	
	@Override
	public String toString() {
		return nazev;
	}
	
}
