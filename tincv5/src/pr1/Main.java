package pr1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarniStrom bs = new BinarniStrom();
		
		bs.insert(7);
		bs.insert(5);
		bs.insert(14);
		bs.insert(1);
		bs.insert(6);
		bs.insert(16);
		bs.insert(10);
		
		bs.inorder();
		System.out.println("--------------------------");
		bs.preorder();
		System.out.println("--------------------------");
		bs.postorder();
		System.out.println("--------------------------");
		bs.contains(16);
		System.out.println("--------------------------");
		bs.listy();
	}

}
