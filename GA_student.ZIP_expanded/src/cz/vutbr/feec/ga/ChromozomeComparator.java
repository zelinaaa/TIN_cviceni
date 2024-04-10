package cz.vutbr.feec.ga;

import java.io.IOException;
import java.util.Comparator;

public class ChromozomeComparator implements Comparator<Chromozome>{
	private Fitness eval;
	
	public ChromozomeComparator() throws IOException {
		eval = new Fitness("image/orloj.jpg");
	}
	
	@Override
	public int compare(Chromozome ch1, Chromozome ch2) {
		Long i1 = eval.getFitness(ch1);
		Long i2 = eval.getFitness(ch2);
		return i1.compareTo(i2);
	}
}
