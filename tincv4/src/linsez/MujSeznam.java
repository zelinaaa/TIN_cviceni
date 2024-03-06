package linsez;

import java.util.ArrayList;

public class MujSeznam {
	
	private Node zacatek = null;
	
	
	public void pridejNaZacatek(int data) {
		Node newNode = new Node();
		newNode.setData(data);
		
		if (zacatek == null) {
			zacatek = newNode;
			zacatek.setNasledujici(null);
		} else {
			Node tmpNode = zacatek;
			zacatek = newNode;
			zacatek.setNasledujici(tmpNode);
		}
	}	
	
	public void odstranZeZacatku() {
		if (zacatek != null) {
			zacatek = zacatek.getNasledujici();
		}
	}
	
	public boolean obsahuje(int data) {
		boolean result = false;
		
		
		if (zacatek != null) {
			if (zacatek.getData() == data) {
				return true;
			}
			Node tmp = zacatek.getNasledujici();
			do{
				if (tmp.getData() == data) {
					result = true;
				} else {
					tmp = tmp.getNasledujici();
				}
				if (tmp == null) {
					break;
				}
				
			} while (tmp.getNasledujici() != null || result == false);
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
