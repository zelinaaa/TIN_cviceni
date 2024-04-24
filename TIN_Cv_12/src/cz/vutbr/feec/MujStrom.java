package cz.vutbr.feec;

public class MujStrom {
	private Center c = new Center();
	private Uzel koren = new Uzel();

	public MujStrom(String nazev) {
		koren.setNazev(nazev);
		c.pridej(koren);
	}

	public void pridej(String nazev) {
		Uzel vkladany = new Uzel();
		vkladany.setNazev(nazev);
		c.pridej(vkladany);
		
		Uzel tmp = koren;
		for(;;) {
			if(tmp.getNazev().compareTo(nazev) > 0) {
				if(tmp.getLevy() == null) {
					tmp.setLevy(vkladany);
					return;
				} else {
					tmp = tmp.getLevy();
				}
			} else {
				if(tmp.getPravy() == null) {
					tmp.setPravy(vkladany);
					return;
				} else {
					tmp = tmp.getPravy();
				}
			}
		}
	}

	public void prevedNaList() {
		Uzel tmp = koren;
		while (tmp != null) {
			if(tmp.getLevy() != null) {
				Uzel b = tmp;
				Uzel a = tmp.getLevy();
				Uzel d = tmp.getPravy();
				
				b.setLevy(null);
				b.setPravy(a);
				a.setPravy(d);
			}
			tmp = tmp.getPravy();
		}
	}

}
