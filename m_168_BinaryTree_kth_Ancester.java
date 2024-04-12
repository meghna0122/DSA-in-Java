public class m_168_BinaryTree_kth_Ancester {
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

    public static int KthAncestor(Node head,int k,int n){
if(head ==null){
return -1;
}
if(head.data == n){
    return 0;
}

int left = KthAncestor(head.left,k,n);
int right = KthAncestor(head.right, k, n);
if(left == -1 && right ==-1){
return -1;
}
int max = Math.max(left,right);
if(max +1 ==k){
    System.out.println("Kth ancestor of given node: "+head.data+" ");
}
return max+1;

    }
    public static void main(String[] args) {
        Node head =new Node(1);
        head.left=new Node(2);
        head.right = new Node( 3);
        head.left.left=new Node(4);
        head.left.right=new Node(5);
        head.right.left=new Node(7);
        head.right.right=new Node(8);
        int n=5;
        int k=1;
        KthAncestor(head, k, n);
    }
}
