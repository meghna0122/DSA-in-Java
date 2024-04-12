public class m_172_BinaryTree_Delete_LeafNodes_with_target_value {
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
    public static Node DeleteLeafNodes(Node root,int target){
if(root ==null){
    return null;
}
root.left = DeleteLeafNodes(root.left, target);
root.right = DeleteLeafNodes(root.right, target);

if(root.data == target & root.left ==null & root.right == null){
    return null;
}
return root;
    }
    public static void main(String[] args) {
        Node head =new Node(1);
        head.left=new Node(1);
        head.right = new Node( 2);
        head.left.left=new Node(1);
        head.left.right=new Node(4);
        head.right.left=new Node(1);
        head.right.right=new Node(7);
        int target =1;
        DeleteLeafNodes(head,target);
        

    }
}
