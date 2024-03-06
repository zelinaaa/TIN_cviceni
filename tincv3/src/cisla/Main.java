package cisla;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board b1 = new Board();
		b1.posun(1);
		
		Board b2 = new Board();
		b2.posun(1);
		b2.posun(3);
		
		b1.vypisPole();
		b2.vypisPole();
		
		TreeSet<Board> mnozina = new TreeSet<>();
		mnozina.add(b1);
		mnozina.add(b2);
		
		//System.out.println(b1.equals(b2));
		if (!b1.equals(b2)) {
			System.out.println("Pole se nerovnaji.");
		}
		
		//System.out.println(b2.equals(b1));
		if (!b2.equals(b1)) {
			System.out.println("Pole se nerovnaji.");
		}
		
		//System.out.println(b1.compareTo(b2));
		if (b1.compareTo(b2) == 0) {
			System.out.println("Pole jsou shodne");
		}else {
			System.out.println("Pole jsou odlisne.");
		}
		
		//System.out.println(b2.compareTo(b1));
		if (b2.compareTo(b1) == 0) {
			System.out.println("Pole jsou shodne");
		}else {
			System.out.println("Pole jsou odlisne.");
		}
		
		
		System.out.println("Pocet prvku v treesetu: " + mnozina.size());
	}

}
