import java.util.*;
public class m_173_BinaryTree_Find_all_duplicate_subtrees {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }

    }


    static HashMap<String,Integer> m;
    static ArrayList<Node> a ;

    public static String inorder(Node root,HashMap<String, Integer> m , ArrayList<Node> a){
        if(root==null){
            return "";
        }
        String s = "(";
        s+= inorder(root.left,m,a);
        s+=Integer.toString(root.data);
        s+=inorder(root.right,m,a);
        s+=")";

        if(m.get(s)!=null  && m.get(s)==1){
            a.add(root);
        }
        if(m.containsKey(s)){
            m.put(s, m.get(s)+1);
        }else{
            m.put(s, 1);
        }
        return s;


    }
    public static ArrayList<Node> printDuplicate(Node root){
        m= new HashMap<>();
        a= new ArrayList<>();
        inorder(root,m,a);
        return a;
    }
    public static void main(String[] args) {
        Node head = new Node(3);
        head.left = new Node(2);
        head.right = new Node(2);
        head.left.left = new Node(6);
        head.right.right =new Node(7);
        head.left.right=new Node(6);
        head.right.left=new Node(7);
   printDuplicate(head);
   for (int i = 0; i < a.size(); i++) {
    System.out.println(a.get(i).data);
   }
    }
}
