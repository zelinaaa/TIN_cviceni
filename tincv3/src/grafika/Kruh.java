package grafika;

public class Kruh extends GrObjekt{
	
	private int polomer;
	
	public Kruh(int x, int y, int polomer) {
		super(x, y);
		this.polomer = polomer;
	}
	
	@Override
	public void vykresli() {
		// TODO Auto-generated method stub
		System.out.println(String.format("Pozice kruhu jsou X: %d a Y: %d a poloměr je %d.", x, y, polomer));
	}
	
}
