package pr1;

import java.util.Vector;

public class Mapa {
	
	private Vector<Auto> mapa = new Vector<Auto>();
	
	public void addAuto(Auto auto) {
		mapa.add(auto);
	}
	
	public Auto getAuto(Integer pozice) {
		return mapa.get(pozice);
	}
	
	public void removeAuto(int pozice) {
		mapa.remove(pozice);
	}
	
	public Integer getPocetAuto() {
		return mapa.size();
	}
	
	public void vypisVsechnaAuta() {
		for (Integer autoPozice = 0; autoPozice < getPocetAuto(); autoPozice++) {
			System.out.println(mapa.get(autoPozice).getName());
		}
	}
	
	
	
	
}
