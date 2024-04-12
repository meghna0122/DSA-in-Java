import java.util.*;
public class m_165_BinaryTree_Print_kth_level_of_tree {
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

    public static void kthLevel_iteratively(Node root,int k){
Queue<Node> q = new LinkedList<>();
q.add(root);
q.add(null);
int a =1;
while (!q.isEmpty()) {
    Node curr = q.remove();

    if(curr==null){
        System.out.println();
        a++;
        if(q.isEmpty()){
            break;
        }else{
            q.add(null);
        }
    }else{
     if(a==k) {  System.out.print(curr.data+" ");}
       
        if(curr.left!=null){
            q.add(curr.left);
        }
        if(curr.right!=null){
            q.add(curr.right);
        }
    }
}

    }
    public static void kthLevel_recursively(Node root,int k,int level){

if(root==null){
    return;
}
if(level==k){
    System.out.print(root.data+" ");
    return;
}
kthLevel_recursively(root.left, k, level+1);
kthLevel_recursively(root.right, k, level+1);

    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(6);
        root.left.right = new Node(7);
        root.right.left = new Node(9);
        root.right.right = new Node(10);
        int k=3;
        // kthLevel_iteratively(root, k);
        kthLevel_recursively(root, k,1);
    }
}
