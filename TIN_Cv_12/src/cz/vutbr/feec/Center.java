package cz.vutbr.feec;

import java.util.LinkedList;

public class Center {
	private LinkedList<Uzel> uzly = new LinkedList<>();
	
	public void pridej(Uzel u) {
		uzly.add(u);
	}
}
