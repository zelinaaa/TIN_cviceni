package linsez2;

public class Node {
	private int data;
	private Node nasledujici;
	private Node predchozi;
	
	public Node getPredchozi() {
		return predchozi;
	}
	public void setPredchozi(Node predchozi) {
		this.predchozi = predchozi;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNasledujici() {
		return nasledujici;
	}
	public void setNasledujici(Node nasledujici) {
		this.nasledujici = nasledujici;
	}
}
