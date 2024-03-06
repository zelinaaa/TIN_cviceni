package pakety;

public class Main {

	public static void main(String[] args) {
		
		Paket paket1 = new Paket();	
		Paket paket2 = new Paket();
		Paket paket3 = new Paket();
		Paket paket4 = new Paket();
		
		paket1.setPaket(paket2);
		paket2.setPaket(paket3);
		paket3.setPaket(paket4);
		paket4.setPaket(paket1);
		
		System.out.println(paket2.nasledujiciPaket);
		

	}

}
