package cz.vutbr.feec.cisla;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random random = new Random();
        HraciPole h = new HraciPole();
        for (int i = 0; i < 10000; i++) {
            h.pohni(random.nextInt(4)+ 1);
        }
        System.out.println(h);
        BFS bfs = new BFS();

        HraciPole vysledek = bfs.reseni(h);
        System.out.println("Pocet pohybu je " + vysledek.getPohyby().size() + ".");
        System.out.println(vysledek);
		
	}
}
