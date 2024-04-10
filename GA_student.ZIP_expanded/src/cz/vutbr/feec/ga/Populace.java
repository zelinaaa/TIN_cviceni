package cz.vutbr.feec.ga;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Populace {
	private LinkedList<Chromozome> populaceChromozomu = new LinkedList<Chromozome>();
	private int pocatecniPopulace;
	private Fitness eval;
	
	public Populace(int pocatecniPopulace) throws IOException {
		this.pocatecniPopulace = pocatecniPopulace;
		this.eval = new Fitness("image/orloj.jpg");
		
		for (int i = 0; i < pocatecniPopulace; i++) {
			Chromozome ch = new Chromozome();
			ch.mutateAll();
			populaceChromozomu.add(ch);
		}
	}
	
	public void add(Chromozome ch) {
		populaceChromozomu.add(ch);
	}
	public void remove(Chromozome ch) {
		populaceChromozomu.remove(ch);
	}
	
	public int size() {
		return populaceChromozomu.size();
	}

	public void mutuj(int pocetMutaci) {
		// TODO Auto-generated method stub
		for (int i = 0; i < pocetMutaci; i++) {
			Chromozome chVyber = populaceChromozomu.get(new Random().nextInt(size()));
			Chromozome chKlon = chVyber.cloneChromozome();
			chKlon.mutace(0.5);
			populaceChromozomu.add(chKlon);
		}
	}

	public void krizeni(int pocetKrizeni) {
		// TODO Auto-generated method stub
		for (int i = 0; i < pocetKrizeni; i++) {
			Chromozome chVyber1 = populaceChromozomu.get(new Random().nextInt(size()));
			Chromozome chVyber2 = populaceChromozomu.get(new Random().nextInt(size()));
			
			Chromozome ch1Klon = chVyber1.cloneChromozome();
			Chromozome ch2Klon = chVyber2.cloneChromozome();
			
			ch1Klon.crossOver(ch2Klon);
			
			//Chromozome potomek = chVyber1.cloneChromozome();
			
			//potomek.crossOver(chVyber2);
			populaceChromozomu.add(ch1Klon);
			populaceChromozomu.add(ch2Klon);
			
		}
		//System.out.println(populaceChromozomu.size());
	}

	public void selekce(int pocet) throws IOException {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		
		//Populace p2 = new Populace(0);
		LinkedList<Chromozome> p2 = new LinkedList<Chromozome>();

		
		for (int i =0;i<pocet; i++) {
			int nahodnyIndex1 = rnd.nextInt(populaceChromozomu.size());
			Chromozome ch1 = populaceChromozomu.get(nahodnyIndex1);
			populaceChromozomu.remove(ch1);
			
			int nahodnIndex2 = rnd.nextInt(populaceChromozomu.size());
			Chromozome ch2 = populaceChromozomu.get(nahodnIndex2);
			populaceChromozomu.remove(ch2);
			
			if(eval.getFitness(ch1) < eval.getFitness(ch2)) {
				p2.add(ch1);
			} else {
				p2.add(ch2);
			}
		}
		//System.out.println(p2.size()); //vypisuje 50
		populaceChromozomu = p2;
	}

	private Chromozome get(int nahodnyIndex1) {
		// TODO Auto-generated method stub
		return populaceChromozomu.get(nahodnyIndex1);
	}
	
	public Chromozome getBestChromozome() throws IOException {
		Collections.sort(populaceChromozomu, new ChromozomeComparator());
		return populaceChromozomu.getFirst();
	}
	
	public long getBestFitness() throws IOException {
		Collections.sort(populaceChromozomu, new ChromozomeComparator());
		return eval.getFitness(populaceChromozomu.getFirst());
	}

}












