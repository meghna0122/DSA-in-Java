import java.util.*;
public class m_164_BinaryTree_Top_view_of_tree {
   public static class Node{

        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
                                        
    }
public static class Info{
    Node node;
    int hd;
    public Info(Node node,int hd){
        this.hd=hd;
        this.node =node;
    }
}
    public static void TopView(Node head){
Queue<Info>  q = new LinkedList<>();
HashMap<Integer,Node> map =new HashMap<>();
int min=0;
int max=0;
q.add(new Info(head,0));
q.add(null);
while(!q.isEmpty()){
    Info curr = q.remove();
    if(curr==null){
        if(q.isEmpty()){
            break;
        }else{
            q.add(null);

        }
    }else{
        if(!map.containsKey(curr.hd)){
            map.put(curr.hd, curr.node);
        }
        if(curr.node.left!=null){
            q.add(new Info(curr.node.left,curr.hd-1));
            min=Math.min(min,curr.hd-1);
        }
        if(curr.node.right!=null){
            q.add(new Info(curr.node.right,curr.hd+1));
            max=Math.max(max,curr.hd+1);
        }
    }
}

for (int i = min; i <=max; i++) {
    System.out.print(map.get(i).data+" ");
}

    }

    public static void main(String[] args) {
        Node head = new Node(3);
        head.left = new Node(2);
        head.right = new Node(4);
        head.left.left = new Node(6);
        head.right.right =new Node(7);
        head.left.right=new Node(8);
        head.right.left=new Node(9);
        TopView(head);
    }
}
