public class m_176_BST_size_of_largest_BST_in_BT {

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

    public static class Info{
        boolean isbst;
        int size;
        int min;
        int max;
        public Info(boolean isbst,int size,int min,int max){
            this.isbst=isbst;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }

    public static int maxbst=0;
    public static Info largestbst(Node root){
        if(root==null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }

        Info leftinfo =largestbst(root.left);
        Info rightinfo =largestbst(root.right);
        int size= leftinfo.size +rightinfo.size+1;
        int min =Math.min(root.data, Math.min(leftinfo.min,rightinfo.min));
        int max =Math.max(root.data, Math.max(leftinfo.max,rightinfo.max));

        if(root.data<=leftinfo.max || root.data>= rightinfo.min){
            return new Info(false, size,min,max);
        }

        if(leftinfo.isbst && rightinfo.isbst){
            maxbst = Math.max(maxbst,size);
            return new Info(true,size,min,max);
        }
        return new Info(false,size,min,max);

    }


    public static void main(String[] args) {
        Node root= new Node(5);
        root.left = new Node(2);
        root.right=new Node(7);

        Info info=largestbst(root);
        System.out.println(maxbst);

    }
}
