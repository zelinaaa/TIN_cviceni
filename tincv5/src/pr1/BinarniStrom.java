package pr1;

public class BinarniStrom {
	Node root = null;
	boolean obsahuje = false;
	
	
	//Insert
	public void insert(int data) {
		root = insert(root, data);
	}
	
	private Node insert(Node root, int data) {
		Node newNode = new Node(data);
		
		if (root == null) {
			root = newNode;
			return root;
		} else if (newNode.getData() < root.getData()){
			root.setLevy(insert(root.getLevy(), data));
		} else if (newNode.getData() > root.getData()) {
			root.setPravy(insert(root.getPravy(), data));
		}
		
		return root;
	}
	
	//Inorder
	public void inorder() {
		inorder(root);
	}
	
	private void inorder(Node node) {
		if (node != null) {
			inorder(node.getLevy());
			System.out.println(node.getData() + " ");
			inorder(node.getPravy());
		}
	}
	
	//Preorder
	public void preorder() {
		preorder(root);
	}
	
	private void preorder(Node node) {
		if (node == null) {
			return;
		} else {
			System.out.println(node.getData());
			
			preorder(node.getLevy());
			preorder(node.getPravy());
		}
	}
	
	//Postorder
	public void postorder() {
		postorder(root);
	}
	
	private void postorder(Node node) {
		if (node == null) {
			return;
		} else {
			postorder(node.getLevy());
			postorder(node.getPravy());
			
			System.out.println(node.getData());
		}
	}
	
	//Contains
	public void contains(int vstup) {
		boolean obsahuje = contains(root, vstup);
		System.out.println(obsahuje);
	}
	
	private boolean contains(Node node, int vstup) {
		if (node != null) {
			contains(node.getLevy(), vstup);
			if (node.getData() == vstup) {
				obsahuje = true;
			}
			contains(node.getPravy(), vstup);
		}
		return obsahuje;
		
	}
	
	//Print listy
	public void listy() {
		listy(root);
	}
	private void listy(Node node) {
		if (node == null) {
			return;
		}
		
		if (node.getLevy() == null && node.getPravy() == null) {
			System.out.println(node.getData());
			return;
		}
		
		if (node.getLevy() != null) {
			listy(node.getLevy());
		}
		
		if (node.getPravy() != null) {
			listy(node.getPravy());
		}
	}

}

























