package cz.vutbr.feec.termin2;

public class MujSeznam {
	private Uzel first;
	public MujSeznam(String nazev) {
		first = new Uzel();
		first.setNazev(nazev);
	}
	
	public void pridej(String nazev) {
		Uzel novy = new Uzel();
		novy.setNazev(nazev);
		
		novy.setPravy(first);
		first = novy;
	}

	public void vycentruj() {
		Uzel tmp1 = first;
		Uzel tmp2 = first;
		while (tmp2 != null && tmp2.getPravy().getPravy() != null) {
			Uzel kRotaci = tmp1;
			Uzel kRotaciNasledujici = tmp1.getPravy();
			
			tmp1 = tmp1.getPravy();
			tmp2 = tmp2.getPravy().getPravy();
			
			kRotaciNasledujici.setLevy(kRotaci);
			kRotaci.setPravy(null);
			first = kRotaciNasledujici;
		}
		
	}

}
