package grafika;

import java.util.ArrayList;

public class Slozenina extends GrObjekt{
	
	private ArrayList<GrObjekt> objekty = new ArrayList<GrObjekt>();
	
	public Slozenina(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	public void add(GrObjekt o) {
		objekty.add(o);
	}
	
	@Override
	public void vykresli() {
		// TODO Auto-generated method stub
		for (GrObjekt grObjekt : objekty) {
			grObjekt.vykresli();
		}
	}
	
}
