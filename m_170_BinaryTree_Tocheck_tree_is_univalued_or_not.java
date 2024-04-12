public class m_170_BinaryTree_Tocheck_tree_is_univalued_or_not {
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

    public static boolean IsUnivalued(Node root ){
        if(root ==null){
            return true;
        }
        if(root.left!=null && root.data != root.left.data){
            return false;
        }
        if(root.right!=null && root.data != root.right.data){
            return false;
        }
        return IsUnivalued(root.left) && IsUnivalued(root.right);
    }
    public static void main(String[] args) {
        Node head =new Node(1);
        head.left=new Node(1);
        head.right = new Node( 1);
        head.left.left=new Node(1);
        head.left.right=new Node(1);
        head.right.left=new Node(1);
        head.right.right=new Node(1);
        System.out.println(IsUnivalued(head));
    }
}
