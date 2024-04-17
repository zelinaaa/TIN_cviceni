package tincv11;

public class Hrana {
	
	private Integer cena;
	private Uzel u1;
	private Uzel u2;
	
	public Hrana(Integer cena, Uzel u1, Uzel u2) {
		this.cena = cena;
		this.u1 = u1;
		this.u2 = u2;
	}

	public Integer getCena() {
		return cena;
	}

	public void setCena(Integer cena) {
		this.cena = cena;
	}

	public Uzel getU1() {
		return u1;
	}

	public void setU1(Uzel u1) {
		this.u1 = u1;
	}

	public Uzel getU2() {
		return u2;
	}

	public void setU2(Uzel u2) {
		this.u2 = u2;
	}

	public Object getOdkud() {
		// TODO Auto-generated method stub
		return u1;
	}

	public Object getKam() {
		// TODO Auto-generated method stub
		return u2;
	}
	
	
}
