package pr5;

import java.util.HashSet;

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
		
		HashSet<Board> mnozina = new HashSet<>();
		mnozina.add(b1);
		mnozina.add(b2);
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b1.equals(b2));
		System.out.println(b2.equals(b1));
		
		System.out.println(mnozina.size());
		
	}

}
