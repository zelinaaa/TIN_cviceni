package pr1;

import java.util.HashMap;
import java.util.LinkedList;

public class Graf {
	
	private HashMap<String, Uzel> vsechnyUzly = new HashMap<String, Uzel>();

	public void pridej(String uzelStart, String uzelCil, Integer vahaHrany) {
		// TODO Auto-generated method stub
		Uzel u1 = vezmiExistujiciNeboNovy(uzelStart);
		Uzel u2 = vezmiExistujiciNeboNovy(uzelCil);
		
		u1.pridejSouseda(u2, vahaHrany);
		u2.pridejSouseda(u1, vahaHrany);
		
	}
	
	private Uzel vezmiExistujiciNeboNovy(String nazevUzlu) {
		Uzel tmp = vsechnyUzly.get(nazevUzlu);
		if (tmp == null || tmp.equals(null)) {
			Uzel novyUzel = new Uzel(nazevUzlu);
			vsechnyUzly.put(nazevUzlu, novyUzel);
			return novyUzel;
		} else {
			return tmp;
		}
	}
	
	public int getCenaMeziUzly(String uzel1, String uzel2) {
		Uzel u1 = vsechnyUzly.get(uzel1);
		Uzel u2 = vsechnyUzly.get(uzel2);
		return u1.getPrimaCena(u2);
	}

}
