package tincv11;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Graf {
	
	private HashMap<Integer, Uzel> uzly = new HashMap<Integer, Uzel>();
	private HashSet<Hrana> hrany = new HashSet<Hrana>();
	
	public void pridej(Integer idUzlu1, Integer idUzlu2, Integer cena) {
		Uzel u1 = vytvorNeboVezmiExistujici(idUzlu1);
		Uzel u2 = vytvorNeboVezmiExistujici(idUzlu2);
		
		Hrana h1 = new Hrana(cena, u1, u2);
		hrany.add(h1);
	}

	private Uzel vytvorNeboVezmiExistujici(Integer idUzlu) {
		// TODO Auto-generated method stub
		Uzel novy = uzly.get(idUzlu);
		if (novy == null) {
			novy = new Uzel(idUzlu);
			uzly.put(idUzlu, novy);
		}
		
		return novy;
	}
	
	public Collection<Uzel> getVrcholy(){
		return uzly.values();
	}
	
	public Set<Hrana> getHrany(){
		return hrany;
	}

}
