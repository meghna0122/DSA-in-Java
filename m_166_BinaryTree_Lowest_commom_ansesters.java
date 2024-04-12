import java.util.ArrayList;

public class m_166_BinaryTree_Lowest_commom_ansesters {
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
public static boolean calculatePath(Node root,int n,ArrayList<Node> path){

    if(root==null){
        return false;
    }
    path.add(root);
    if(root.data==n){
        return true;
    }

    boolean foundleft=calculatePath(root.left, n, path);
    boolean foundright=calculatePath(root.right, n, path);
    if(foundleft || foundright){
        return true;
    }
    path.remove(path.size()-1);
    return false;
   
}
    public static Node lca1(Node root,int n1,int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 =new ArrayList<>();

        calculatePath(root,n1,path1);
        calculatePath(root,n2,path2);
int i=0;
        for (; i < path1.size() && i<path2.size(); i++) {
            if(path1.get(i).data!=path2.get(i).data){
break;
            }
        }
        Node lca = path1.get(i-1);
        return lca;

    }

    public static Node lca2(Node root,int n1,int n2){
        if(root ==null || root.data == n1 || root.data==n2){
            return root;
        }
        Node left = lca2(root.left, n1, n2);
        Node right= lca2(root.right, n1, n2);
       if(left==null){
        return right;
       }
       if(right==null){
        return left;
       }
      
        return root;
       

    }
    public static void main(String[] args) {
        Node head =new Node(1);
        head.left=new Node(2);
        head.right = new Node(3);
        head.left.left=new Node(4);
        head.left.right=new Node(5);
        head.right.left=new Node(7);
        head.right.right=new Node(8);

        int n1=4;
        int n2=7;
       System.out.println( lca1(head, n1, n2).data);
       System.out.println( lca2(head, n1, n2).data);

    //     1
    //    / \
    //   2   3
  //    / \ / \
 //    4  5 7  8

    }
}
