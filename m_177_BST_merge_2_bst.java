import java.util.ArrayList;

public class m_177_BST_merge_2_bst {
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

    public static void getInorder(Node root, ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);

    }


    public static Node mergeBST(Node root1, Node root2){
ArrayList<Integer> arr1 =new ArrayList<>();
getInorder(root1, arr1);

ArrayList<Integer> arr2=new ArrayList<>();
getInorder(root2, arr2);

int i=0;
int j=0;
 ArrayList<Integer> finalarr =new ArrayList<>();
 while(i<arr1.size()&& j<arr2.size()){
    if(arr1.get(i)<=arr2.get(j)){

        finalarr.add(arr1.get(i));
        i++;
    }else{
finalarr.add(arr2.get(j));
j++;
    }
 }
 while(i<arr1.size()){
    finalarr.add(arr1.get(i));
    i++;
 }
 while (j<arr2.size()) {
    finalarr.add(arr2.get(j));
j++;
 }
 return createBST(finalarr,0,finalarr.size()-1);
    }

    public static Node createBST(ArrayList<Integer> arr, int low,int high){
        if(low>high){
            return null;
        }
        int mid=(low+high)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, low, mid-1);
        root.right =createBST(arr, mid+1, high);
        return root;
    }
    public static void main(String[] args) {
        Node root= new Node(5);
        root.left = new Node(2);
        root.right=new Node(7);

        Node root1= new Node(1);
        root1.left = new Node(3);
        root1.right=new Node(8);

        mergeBST(root, root1);
        
    }
}
