public class m_162_BinaryTree {
static class Node {

	int key;

	Node left, right;
	public Node(int item)
	{
		key = item;
		left = right = null;
	}
}

static class BinaryTree {
	Node root;
	
	BinaryTree(int key) { root = new Node(key); }
	BinaryTree() { root = null; }
	public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree();
		
		// Create root
		tree.root = new Node(1);
		
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		tree.root.left.left = new Node(4);
		
	}
}

}
