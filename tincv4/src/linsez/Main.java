package linsez;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MujSeznam list = new MujSeznam();
		
		list.pridejNaZacatek(100);
		list.pridejNaZacatek(10);
		list.pridejNaZacatek(1);
		
		
		list.odstranZeZacatku();
		
		System.out.println(list.obsahuje(100));
		System.out.println(list.obsahuje(1));
		
		System.out.println(list.jePrazdny());
		
		list.printSeznam();
	}

}
