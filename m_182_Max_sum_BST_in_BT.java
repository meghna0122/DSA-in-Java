public class m_182_Max_sum_BST_in_BT {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class Info{
       int max;
       int min;
       int sum;
       int maxsum;
       Boolean isBST;
       public Info(int max,int min, int sum, int maxsum, boolean isBST){
        this.isBST=isBST;
        this.min=min;
        this.max=max;
        this.sum=sum;
        this.maxsum = maxsum;
       } 
       Info(){}
    };
public static int maxsum = Integer.MIN_VALUE;
    static int MaxSumBST( Node root)
{
    
    return MaxSumBSTUtil(root).maxsum;
}
 public static Info MaxSumBSTUtil(Node root){
    if (root == null){
    return new Info( Integer.MIN_VALUE,Integer.MAX_VALUE, 0, 0, true );}


    //leaf node
    if (root.left == null && root.right == null)
    {
        maxsum = Math.max(maxsum, root.data);
        return new Info( root.data, root.data,root.data, maxsum, true);
    }

    Info L = MaxSumBSTUtil(root.left);
    Info R = MaxSumBSTUtil(root.right);
    Info BST=new Info();

    if (L.isBST && R.isBST && L.max < root.data && 
                               R.min > root.data)
    {
 
        BST.max = Math.max(root.data, Math.max(L.max, R.max));
        BST.min = Math.min(root.data, Math.min(L.min, R.min));
 
        maxsum= Math.max(maxsum, R.sum + root.data + L.sum);
        BST.sum = R.sum + root.data + L.sum;
 
        BST.maxsum = maxsum;
 
        BST.isBST = true;
        return BST;
    }

    
    
    BST.isBST = false;
    BST.maxsum= maxsum;
    BST.sum = R.sum + root.data + L.sum;
 
    return BST;
 

 
 }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(14);
        root.right = new Node(3);
        root.left.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(9);
        root.left.left.right = new Node(1);

       int a= MaxSumBST(root);
       System.out.println(a);
    }
}
