public class m_163_BinaryTree_subtree_of_another_tree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }

    }

    static class BinaryTree {
        static int idx = -1;
        static int idx2=-1;

        public Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newnode = new Node(nodes[idx]);
            newnode.left = buildTree(nodes);
            newnode.right = buildTree(nodes);
            return newnode;
        }
        public Node buildSubTree(int nodes[]) {
            idx2++;
            if (nodes[idx2] == -1) {
                return null;
            }

            Node newnode = new Node(nodes[idx2]);
            newnode.left = buildSubTree(nodes);
            newnode.right = buildSubTree(nodes);
            return newnode;
        }
    }
   

    public static boolean identicalTree(Node root, Node subroot) {
        if (root == null && subroot == null) {
            return true;
        } else if (root == null || subroot == null || root.data != subroot.data) {
            return false;
        }

        if (!identicalTree(root.left, subroot.left)) {
            return false;
        }
        if (!identicalTree(root.right, subroot.right)) {
            return false;
        }
        return true;

    }

    public static boolean SubtreeOfOtherTree(Node root, Node subroot) {
        if (root == null) {
            return false;
        }
        if (root.data == subroot.data) {
            if (identicalTree(root, subroot)) {
                return true;
            }
        }
        boolean leftans = SubtreeOfOtherTree(root.left, subroot);
        boolean rightans = SubtreeOfOtherTree(root.right, subroot);
        return leftans || rightans;

    }

    public static void main(String[] args) {
        int tree[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        int subtree[] = { 2, 4, -1, -1, 5, -1, -1 };
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(tree);
        
        Node subroot = bt.buildSubTree(subtree);
        System.out.println(SubtreeOfOtherTree(root, subroot));

    }
}
