package pr1;

public class Node {
	
	private int data;
	private Node pravy = null;
	private Node levy = null;
	
	public Node(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getPravy() {
		return pravy;
	}
	public void setPravy(Node pravy) {
		this.pravy = pravy;
	}
	public Node getLevy() {
		return levy;
	}
	public void setLevy(Node levy) {
		this.levy = levy;
	}
}
