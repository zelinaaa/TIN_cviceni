package car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c4 = new Car();
		c4.price = 300000;
		c4.brand = "BMW";
		c4.pozice = "A";
		
		Car c2 = new Car();
		c2.price = 500000;
		c2.brand = "Audi";
		c2.left = c4;
		c2.pozice = "B";
		
		Car c1 = new Car();
		c1.price = 100000;
		c1.brand = "Skoda";
		c1.left = c2;
		c1.pozice = "C";
		
		Car c5 = new Car();
		c5.price = 200000;
		c5.brand = "Seat";
		c5.pozice = "D";
		
		Car c3 = c1;
		
		Mapa mapa = new Mapa();
		mapa.auto1 = c1;
		mapa.auto2 = c2;
		mapa.auto3 = c4;
		mapa.auto4 = c5;
		
		System.out.println(mapa.auto1.brand);
		
		
	}

}
