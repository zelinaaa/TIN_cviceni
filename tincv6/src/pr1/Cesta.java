package pr1;

import java.util.ArrayList;

public class Cesta {
	private Graf graf;
	private Integer cena = 0;
	private ArrayList<String> listVrcholu = new ArrayList<String>();
	
	public Cesta(Graf graf, String uzelStart) {
		this.graf = graf;
		listVrcholu.add(uzelStart);
	}

	public void pridejVrchol(String vrchol) {
		// TODO Auto-generated method stub
		listVrcholu.add(vrchol);
	}
	
	public int getCena() {
		for (int i = 0; i < listVrcholu.size() - 1; i++) {
			cena = cena + (graf.getCenaMeziUzly(listVrcholu.get(i), listVrcholu.get(i+1)));
		}
		return cena;
	}

}
