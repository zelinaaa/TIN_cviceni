package cz.vutbr.feec.termin2;

public class Spustitelna {
	public static void main(String[] args) {
		MujSeznam s = new MujSeznam("A");
		s.pridej("B");
		s.pridej("C");
		s.pridej("D");
		s.pridej("E");
		s.pridej("F");

		s.vycentruj();
	}
}
