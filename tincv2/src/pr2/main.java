package pr2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paket paket1 = new Paket("Paket1");	
		Paket paket2 = new Paket("Paket2");
		Paket paket3 = new Paket("Paket3");
		Paket paket4 = new Paket("Paket4");
		
		paket1.setDalsi(paket2);
		paket2.setDalsi(paket3);
		paket3.setDalsi(paket4);
		paket4.setDalsi(null);
		
		System.out.println(paket1.getDalsi().getDalsi().getNazev());
		
		System.out.println(paket2.getDalsi().getNazev());
		System.out.println(paket3.getDalsi().getNazev());

	}

}
