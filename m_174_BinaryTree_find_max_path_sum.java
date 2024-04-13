import java.nio.file.Path;
import java.nio.file.Paths;

public class m_174_BinaryTree_find_max_path_sum {
static class Node {
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left =null;
        this.right=null;
    }
}
    public static int max =Integer.MIN_VALUE;
    public static int PathSum(Node root){
  if(root ==null){
    return 0;
  }

  int value = root.data;
  int x = Math.max(PathSum(root.left),0);
  int y = Math.max(PathSum(root.right),0);
  max = Math.max(max, x+y+value);
  return Math.max(x,y)+value;
    }

    public static int MaxSum(Node root){
        PathSum(root);
        return max;
    }
    public static void main(String[] args) {
        Node head =new Node(1);
        head.left=new Node(1);
        head.right = new Node( 2);
        head.left.left=new Node(1);
        head.left.right=new Node(4);
        head.right.left=new Node(1);
        head.right.right=new Node(7);
  System.out.println( MaxSum(head));

    }
}
