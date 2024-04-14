public class m_175_BST_Questions {

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

    public static Node buildTree(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        // val should be inserted at right of root
        if (val > root.data) {
            root.right = buildTree(root.right, val);
        } else {
            // val should be inserted at left of root
            root.left = buildTree(root.left, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean Search(Node root, int key) {
        boolean x;
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (key > root.data) {
            x = Search(root.right, key);
        } else {
            x = Search(root.left, key);
        }
        return x;

    }

    public static Node DeleteNode(Node root, int key) {
        if(root==null){
            return root;
        }
//key is in right part of BST
        if (key > root.data) {
            root.right = DeleteNode(root.right, key);
            return root;
        }
        // key is in left part of BST
        if (key < root.data) {
            root.left = DeleteNode(root.left, key);
            return root;
        } else {
            // Leaf Node
            if (root.left == null && root.right == null) {
                return null;
            }
            // One child node
            if (root.left == null ) {
                return root.right;
            }
            else if ( root.right == null) {
                return root.left;
            }
          

            // Two child node
          
                Node inorder_succ = inorder_Successor(root.right);
                root.data = inorder_succ.data;
                root.right = DeleteNode(root.right, inorder_succ.data);
              
        }
        return root;

    }

    public static Node inorder_Successor(Node root){
           while(root.left!=null){
            root = root.left;
           }
           return root;
    }

    public static void printInRange(Node root,int k1,int k2){
        if(root==null){
            return ;
        }
// when root is b/w k1 and k2
        if(k1<=root.data && root.data<=k2){
printInRange(root.left, k1, k2);
System.out.print(root.data+" ");
printInRange(root.right, k1, k2);
        }
// when root is greater than k2
if(root.data>k2){
printInRange(root.left, k1, k2);
}
// when root is less than k1
if(root.data<k1){
printInRange(root.right, k1, k2);
}
    }

    public static void main(String[] args) {
        int[] values = { 1,3,4,5,6,8,10,11,14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = buildTree(root, values[i]);
        }
inorder(root);
System.out.println();
        // System.out.println(Search(root, 8));
        // root = DeleteNode(root, 3);
        // inorder(root);
        printInRange(root, 10, 14);
    }
}
