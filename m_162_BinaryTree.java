import java.util.*;
public class m_162_BinaryTree {
	static class Node {

		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static class BinaryTree {
		static int idx = -1;
		public Node buildtree(int nodes[]) {
			idx++;
			// base case
			if (nodes[idx] == -1) {
				return null;
			}
			// recursive callls
			Node newnode = new Node(nodes[idx]);
			newnode.left = buildtree(nodes);
			newnode.right = buildtree(nodes);
			return newnode;
		}
	}

	public static void preorder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}

	public static void postorder(Node root) {
		if (root == null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + " ");

	}

	public static void inorder(Node root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
//O(n)
	public static void levelorder(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		while (!q.isEmpty()) {
			Node a = q.remove();
			if (a == null) {
				System.out.println();
				if (q.isEmpty()) {
					break;
				} else {
					q.add(null);
				}
			} else {
				System.out.print(a.data + " ");
				if (a.left != null) {
					q.add(a.left);
				}
				if (a.right != null) {
					q.add(a.right);
				}
			}
		}
	}
//O(n)
	public static int countNodes(Node root) {
		if (root == null) {
			return 0;
		}
		int x = countNodes(root.left);
		int y = countNodes(root.right);
		return x + y + 1;
	}
//O(n)
	public static int SumOfNodes(Node root){
		if(root ==null){
return 0;
		}
		int x= SumOfNodes(root.left);
		int y= SumOfNodes(root.right);
		return x+y+ root.data;
	}
//O(n)
	public static int HeightOfTree(Node root){
		if(root == null){
			return 0;
		}
		 int x= HeightOfTree(root.left);
		 int y= HeightOfTree(root.right);
		 return Math.max(x, y)+1;
	}

	//O(n*n)
	public static int DiameterOfTree(Node root){
		if(root==null){
			return 0;
		}
		int left_dia = DiameterOfTree(root.left);
        int right_dia = DiameterOfTree(root.right);
		int max_dia = Math.max(left_dia,right_dia) ;
		int root_dia = HeightOfTree(root.left)+HeightOfTree(root.right)+1;
		return Math.max(max_dia,root_dia);
	}

	static class Info{
        int diameter;
		int height;
		public Info(int diameter,int height){
			this.diameter=diameter;
			this.height = height;
		}
	}
	//O(n)
	public static Info DiameterOfTree_optimalSolution(Node root){
          if(root==null){
			return new Info(0,0);
		  }
		  Info leftinfo = DiameterOfTree_optimalSolution(root.left);
		  Info rightinfo= DiameterOfTree_optimalSolution(root.right);
		  int dia = Math.max(Math.max(leftinfo.diameter,rightinfo.diameter),leftinfo.height+rightinfo.height+1);
		  int ht= Math.max(leftinfo.height,rightinfo.height)+1;
		  return new Info(dia,ht);

	}


	public static void main(String[] args) {
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		BinaryTree bt = new BinaryTree();
		Node root = bt.buildtree(nodes);
		// System.out.println(root.data);

		preorder(root);
		System.out.println();
		postorder(root);
		System.out.println();
		inorder(root);
		System.out.println();
		levelorder(root);
		System.out.print("number of nodes : " + countNodes(root));
		System.out.println();
		System.out.print("sum of data of all nodes :"+ SumOfNodes(root));
		System.out.println();
		System.out.print("Height of Tree : "+HeightOfTree(root));
		System.out.println();
		System.out.print("Diameter of tree in O(n*n) time:"+DiameterOfTree(root));
		System.out.println();
		System.out.print("Diamter in O(n) time:"+DiameterOfTree_optimalSolution(root).diameter);

	}

}
