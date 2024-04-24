package cz.vutbr.feec;

public class Spustitelna {
	public static void main(String[] args) {
		MujStrom s = new MujStrom("B");
		s.pridej("D");
		s.pridej("A");
		s.pridej("C");
		s.pridej("E");

		s.prevedNaList();



	}
}
