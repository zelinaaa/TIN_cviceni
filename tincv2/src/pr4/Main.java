package pr4;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Uzel uz1 = new Uzel("Uzel1");
		Uzel uz2 = new Uzel("Uzel2");
		Uzel uz3 = new Uzel("Uzel3");
		Uzel uz4 = new Uzel("Uzel4");
		Uzel uz5 = new Uzel("Uzel5");
		Uzel uz6 = new Uzel("Uzel6");
		
		uz1.setNode(uz4);
		uz1.setNode(uz5);
		uz1.setNode(uz2);
		uz1.setNode(uz6);
		
		uz2.setNode(uz1);
		uz2.setNode(uz5);
		uz2.setNode(uz3);
		
		uz1.printNodes();
		
		
		
		
		
	}

}
