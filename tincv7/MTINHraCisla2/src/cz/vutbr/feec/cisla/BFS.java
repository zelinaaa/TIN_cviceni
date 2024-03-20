package cz.vutbr.feec.cisla;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class BFS {
	
	private static final int[] POHYBY = new int[] {1,2,3,4};

    public HraciPole reseni(HraciPole zadani) {
        HashSet<HraciPole> closed = new HashSet<HraciPole>();
        LinkedList<HraciPole> fronta = new LinkedList<HraciPole>();

        fronta.add(zadani);

        while (!fronta.isEmpty()) {
            HraciPole tmp = fronta.poll();
            closed.add(tmp);
            if (tmp.jeReseni()) {
                return tmp;
            }

            for (int pohyb : POHYBY) {
                HraciPole newPole = tmp.klonujAPohni(pohyb);
                if (!closed.contains(newPole) && newPole != null)
                    fronta.addLast(newPole);
            }
        }

        return null;
    }
}
