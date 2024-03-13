package pr1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graf novyGraf = new Graf();
		novyGraf.pridej("1", "7", 16);
		novyGraf.pridej("1", "6", 6);
		novyGraf.pridej("1", "2", 4);
		novyGraf.pridej("2", "3", 24);
		novyGraf.pridej("6", "3", 23);
		novyGraf.pridej("6", "5", 5);
		novyGraf.pridej("6", "7", 8);
		novyGraf.pridej("7", "5", 10);
		novyGraf.pridej("7", "8", 21);
		novyGraf.pridej("5", "4", 11);
		novyGraf.pridej("5", "3", 18);
		novyGraf.pridej("5", "8", 14);
		novyGraf.pridej("4", "3", 9);
		novyGraf.pridej("4", "8", 7);
		
		Cesta c = new Cesta(novyGraf, "1");
		c.pridejVrchol("6");
		c.pridejVrchol("5");
		c.pridejVrchol("4");
		c.pridejVrchol("3");
		
		int cena = c.getCena();
		System.out.println(cena);
		
	}

}
