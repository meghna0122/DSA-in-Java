public class m_171_BinaryTree_invertBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static Node InvertTree(Node root){

        if(root==null){
            return root;
        }
        Node left = InvertTree(root.left);
        Node right = InvertTree(root.right);
        root.left=right;
        root.right = left;
        return root;
    }

    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node head =new Node(1);
        head.left=new Node(1);
        head.right = new Node( 2);
        head.left.left=new Node(1);
        head.left.right=new Node(4);
        head.right.left=new Node(1);
        head.right.right=new Node(7);
        preorder(head);
        System.out.println();
        InvertTree(head);
        preorder(head);
    }
}
