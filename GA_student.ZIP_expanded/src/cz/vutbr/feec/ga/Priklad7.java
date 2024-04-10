package cz.vutbr.feec.ga;

import java.io.IOException;

public class Priklad7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Populace p = new Populace(50);
		
		int pocetEvoluci = 100;
		
		for (int i = 0; i < pocetEvoluci; i++) {
			int pocetMutaci = 25;
			p.mutuj(pocetMutaci);
			
			int pocetKrizeni = 25;
			p.krizeni(pocetKrizeni);
			
			p.selekce(50);
			
			System.out.println(p.getBestFitness());
			Chromozome chBest = p.getBestChromozome();
			ShowChromozome.show(chBest, Integer.toString(i+1));
		}
		
		
	}

}
