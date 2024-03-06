package linsez2;

public class MujSeznam {

	private Node zacatek = null;
	private Node posledni = zacatek;
	
	
	public void pridejNaZacatek(int data) {
		Node newNode = new Node();
		newNode.setData(data);
		
		if (zacatek == null) {
			zacatek = newNode;
			posledni = newNode;
		} else {
			newNode.setNasledujici(zacatek);
			zacatek.setPredchozi(newNode);
			zacatek = newNode;
		}
	}	
	
	public void pridejNaKonec(int data) {
		Node newNode = new Node();
		newNode.setData(data);
		
		if (posledni == null) {
			zacatek = newNode;
			posledni = newNode;
		} else {
			posledni.setNasledujici(newNode);
			newNode.setPredchozi(posledni);
			posledni = newNode;
		}
	}
	
	public void odstranZeZacatku() {
		if (zacatek == null) {
			return;
		}
		
		if (zacatek == posledni) {
			zacatek = null;
			posledni = null;
			return;
		}
		
		Node tmpNode = zacatek;
		zacatek = zacatek.getNasledujici();
		zacatek.setPredchozi(null);
	}
	
	public void odstarZKonce() {
		if (posledni == null) {
			return;
		}
		
		if (zacatek == posledni) {
			zacatek = null;
			posledni = null;
			return;
		}
		
		Node tmpNode = posledni;
		posledni = posledni.getPredchozi();
		posledni.setNasledujici(null);
	}
	
	public boolean obsahuje(int data) {
		Node tmpNode = zacatek;
		boolean result = false;
		
		while (tmpNode != null || result == false) {
			if (tmpNode == null) {
				break;
			}
			else if (tmpNode.getData() == data) {
				result = true;
			}
			tmpNode = tmpNode.getNasledujici();
		}
		return result;
	}
	
	public boolean jePrazdny() {
		if (zacatek == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void printSeznam() {
		Node tmp = zacatek;
		while (tmp != null) {
			System.out.println(tmp.getData());
			tmp = tmp.getNasledujici();
		}
		System.out.println();
}
}
