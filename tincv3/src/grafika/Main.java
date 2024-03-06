package grafika;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Platno platno1 = new Platno();
		
		platno1.add(new Kruh(10, 15, 30));
		platno1.add(new Kruh(22, 4, 14));
		platno1.add(new Ctverec(50, 50, 30));
		
		Slozenina slozenina1 = new Slozenina(50, 50);
		slozenina1.add(new Kruh(30, 30, 100));
		slozenina1.add(new Ctverec(100, 100, 80));
		platno1.add(slozenina1);
		
		platno1.vytvorRastr();
		
	}

}
