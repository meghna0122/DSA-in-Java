import java.util.*;

public class m_175_BST_Questions {

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

    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node buildTree(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        // val should be inserted at right of root
        if (val > root.data) {
            root.right = buildTree(root.right, val);
        } else {
            // val should be inserted at left of root
            root.left = buildTree(root.left, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
//SEARCH A KEY IN BST
    public static boolean Search(Node root, int key) {
        boolean x;
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (key > root.data) {
            x = Search(root.right, key);
        } else {
            x = Search(root.left, key);
        }
        return x;

    }
//DELETE A KEY FROM BST
    public static Node DeleteNode(Node root, int key) {
        if(root==null){
            return root;
        }
//key is in right part of BST
        if (key > root.data) {
            root.right = DeleteNode(root.right, key);
            return root;
        }
        // key is in left part of BST
        if (key < root.data) {
            root.left = DeleteNode(root.left, key);
            return root;
        } else {
            // Leaf Node
            if (root.left == null && root.right == null) {
                return null;
            }
            // One child node
            if (root.left == null ) {
                return root.right;
            }
            else if ( root.right == null) {
                return root.left;
            }
          

            // Two child node
          
                Node inorder_succ = inorder_Successor(root.right);
                root.data = inorder_succ.data;
                root.right = DeleteNode(root.right, inorder_succ.data);
              
        }
        return root;

    }

    public static Node inorder_Successor(Node root){
           while(root.left!=null){
            root = root.left;
           }
           return root;
    }
//TO PRINT IN GIVEN RANGE
    public static void printInRange(Node root,int k1,int k2){
        if(root==null){
            return ;
        }
// when root is b/w k1 and k2
        if(k1<=root.data && root.data<=k2){
printInRange(root.left, k1, k2);
System.out.print(root.data+" ");
printInRange(root.right, k1, k2);
        }
// when root is greater than k2
if(root.data>k2){
printInRange(root.left, k1, k2);
}
// when root is less than k1
if(root.data<k1){
printInRange(root.right, k1, k2);
}
    }

public static void print(ArrayList<Integer> list){
    for (int i = 0; i < list.size(); i++) {
        System.out.print(list.get(i)+"->");
    }
    System.out.println("Null");
}
    public static void RootToLeafPath(Node root,ArrayList<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.data);
        if(root.left ==null && root.right ==null){
            print(list);
            
        }else{
        RootToLeafPath(root.left, list);
        RootToLeafPath(root.right, list);
        }
        list.remove(list.size()-1);

    }

    public static boolean ValidateBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min !=null && root.data<=min.data){
            return false;
        }
        if(max!=null && root.data>=max.data){
            return false;
        }

        return ValidateBST(root.left, min, root)  && ValidateBST(root.right, root, max);
    }

    public static Node MirrorBST(Node root){
        if(root ==null){
            return null;
        }
        Node left = MirrorBST(root.left);
        Node right = MirrorBST(root.right);
        root.left = right;
        root.right =left;
        return root;
    }

    public static Node SortedArray_To_Balanced_BST(int[] arr,int low,int high){
        //arr =[2,3,5,7,9,12,15]
        if(low>high){
            return null;
        }
        
        int mid=(low+high)/2;
       Node root = new Node(arr[mid]);
      root.left= SortedArray_To_Balanced_BST(arr, low, mid-1);
      root.right = SortedArray_To_Balanced_BST(arr, mid+1, high);
      return root;
       
    }
    public static void inorder_list(Node root,ArrayList<Integer> list){
        if(root==null){
            return;
        }
      
        inorder_list(root.left,list);
        list.add(root.data);
        inorder_list(root.right, list);
    }

    public static Node balanced_bst_from_sorted_list(ArrayList<Integer> list,int low,int high){
        if(low>high){
            return null;
        }
int mid= (low+high)/2;

Node root = new Node(list.get(mid));
root.left = balanced_bst_from_sorted_list(list, low, mid-1);
root.right=balanced_bst_from_sorted_list(list, mid+1, high);
return root;

    }
    // BST to BALANCED BST
    public static Node BalancedBST(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        inorder_list(root, list);

        root = balanced_bst_from_sorted_list(list,0,list.size()-1);
        return root;
    }

    public static void main(String[] args) {
        // int[] values = { 1,3,4,5,6,8,10,11,14 };
        // Node root = null;
        // for (int i = 0; i < values.length; i++) {
        //     root = buildTree(root, values[i]);
        // }
        Node root= new Node(5);
        root.left = new Node(2);
        root.left.left=new Node(1);
        root.right.right =new Node(8);
        root.right=new Node(7);
        
// inorder(root);
// System.out.println();
        // System.out.println(Search(root, 1));
        // root = DeleteNode(root, 3);
        // inorder(root);
        // printInRange(root, 10, 14);
        
        // RootToLeafPath(root,new ArrayList<>());

        // System.out.println(ValidateBST(root, null,null));
        // MirrorBST(root);
        // inorder(root);

    // int[] arr={3,5,6,8,10,11,12};
    // Node root1= SortedArray_To_Balanced_BST(arr, 0, arr.length-1);
    // preorder(root1);
    Node root1=BalancedBST(root);
    preorder(root1);

    }
}
