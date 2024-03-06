package grafika;

import java.util.ArrayList;

public class Platno {
	
	private ArrayList<GrObjekt> objekty = new ArrayList<GrObjekt>();
	
	public void add(GrObjekt o) {
		objekty.add(o);
	}
	
	public void vytvorRastr() {
		for (GrObjekt grObjekt : objekty) {
			grObjekt.vykresli();
		}
	}
}
