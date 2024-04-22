public class m_179_BST_Range_sum_of_bst {

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public static  int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        while (root != null) {
            if (root.left != null) {
                TreeNode temp = root.left;
                while (temp.right != null && temp.right != root) {
                    temp = temp.right;
                }
                if (temp.right == null) {
                    temp.right = root;
                    root = root.left;
                } else {
                    temp.right = null;
                }
            } else {
                if (root.val >= low && root.val <= high) {
                    sum += root.val;
                }
                root = root.right;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        TreeNode root= new TreeNode(5);
        root.left = new TreeNode(2);
        root.right=new TreeNode(7);
        int sum =rangeSumBST(root,2,5);
        System.out.println(sum);
    }
}
