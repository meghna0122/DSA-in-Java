import java.util.ArrayList;

public class m_181_kth_smallest_element_in_BST {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
 

    public static void inorder(Node root,ArrayList<Integer> a){
        if(root==null){
            return ;
        }
        inorder(root.left,a);
        // System.out.print(root.data+" ");
a.add(root.data);
        inorder(root.right,a);
    }

    public static int kthSmallestElement(Node root,int k){
        ArrayList<Integer> a =new ArrayList<>();
        inorder(root, a);

        for (int i = 0; i < a.size(); i++) {
            if(i==k-1){
return a.get(i);
            }
        }
        return -1;
    }
    static int count=0;
    public static Node kthSmallestElement_optimized(Node root,int k){
        if(root==null){
            return null;
        }

        Node left = kthSmallestElement_optimized(root.left,k);
        if(left!=null){
            return left;
            
        }
        count++;
        if(count==k){
            return root;
        }
        return kthSmallestElement_optimized(root.right, k);

    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left=new Node(2);
        root.left.right =new Node(5);

// int a=kthSmallestElement(root, 3);
// System.out.println(a);

int a=kthSmallestElement_optimized(root, 4).data;
System.out.println(a);




    }
}
