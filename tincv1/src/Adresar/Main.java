package Adresar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adresar ad1 = new Adresar();
		Adresar ad2 = new Adresar();
		Adresar ad3 = new Adresar();
		Adresar ad4 = new Adresar();
		Adresar ad5 = new Adresar();
		
		ad1.setPodadresar1(ad4);
		ad1.setPodadresar1(ad2);
		ad2.setPodadresar2(ad5);
		ad2.setPodadresar2(ad3);
		
		System.out.println(ad1.podadresar1);
	}

}
