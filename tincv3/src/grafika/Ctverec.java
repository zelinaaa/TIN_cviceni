package grafika;

public class Ctverec extends GrObjekt{
	
	private int delka;
	
	public Ctverec(int x, int y, int delka) {
		super(x, y);
		this.delka = delka;
	}
	
	@Override
	public void vykresli() {
		// TODO Auto-generated method stub
		System.out.println(String.format("Pozice ctverce jsou X: %d a Y: %d a delka je %d.", x, y, delka));
	}

}
