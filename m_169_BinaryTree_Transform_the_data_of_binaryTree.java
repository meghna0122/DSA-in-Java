public class m_169_BinaryTree_Transform_the_data_of_binaryTree {
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
   

    public static int TransformTree(Node root){
        if(root ==null){
            return 0;
        }
        
        int left=TransformTree(root.left);
        int right=TransformTree(root.right);
        int data = root.data;
        int leftdata = root.left ==null? 0: root.left.data;
        int rightdata= root.right ==null?0:root.right.data;
        root.data =left+right+leftdata+rightdata;
        return data;
    }

    public static void preorder(Node root){
        if(root ==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node head =new Node(1);
        head.left=new Node(2);
        head.right = new Node( 3);
        head.left.left=new Node(4);
        head.left.right=new Node(5);
        head.right.left=new Node(6);
        head.right.right=new Node(7);

        TransformTree(head);
        preorder(head);
    }
}
