import java.util.ArrayList;

public class m_167_BinaryTree_minimum_distance_between_nodes {

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
    public static int mindis(Node root,int n){
        if(root ==null){
            return -1;
        }
        if(root.data ==n){
            return 0;
        }
        int left = mindis(root.left,n);
        int right =mindis(root.right, n);
        if(left == -1 && right ==-1){
            return -1;
        }
        else if(left ==-1){
            return right+1;
        }else{
            return left+1;
        }
    }

   

    public static Node lca(Node root,int n1,int n2){
        if(root ==null || root.data ==n1 || root.data==n2){
            return root;
        }
        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);
        if(left==null){
            return right;
        }
        if(right ==null){
            return left;
        }
        return root;
    }

    public static int MinimumDistance(Node root,int n1,int n2){
        
        Node common = lca(root, n1, n2);
        int x = mindis(common,n1);
        int y =mindis(common,n2);
        return x+y;

    }
    public static void main(String[] args) {
        Node head =new Node(1);
        head.left=new Node(2);
        head.right = new Node( 3);
        head.left.left=new Node(4);
        head.left.right=new Node(5);
        head.right.left=new Node(7);
        head.right.right=new Node(8);

        int n1=4;
        int n2=7;
        System.out.println(MinimumDistance(head, n1, n2));

    }
}
