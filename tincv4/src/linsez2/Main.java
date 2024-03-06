package linsez2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MujSeznam list = new MujSeznam();
		
		list.pridejNaZacatek(100);
		list.pridejNaZacatek(10);
		list.pridejNaZacatek(1);
		
		list.odstranZeZacatku();
		
		list.pridejNaKonec(49);
		list.pridejNaZacatek(44);
		
		System.out.println(list.obsahuje(100));
		System.out.println(list.obsahuje(1));
		System.out.println(list.obsahuje(44));
		
		System.out.println(list.jePrazdny());
		
		list.printSeznam();
		
		list.odstarZKonce();
		
		list.printSeznam();
	}

}
