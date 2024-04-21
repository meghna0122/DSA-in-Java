public class m_178_AVL_Trees {
     static class Node{
        int data;
        Node left;
        Node right;
        int height;
        public Node(int data){
            this.data =data;
            this.height=1;
        }
    }
    public static Node root;
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        else{
            return root.height;
        }
    }

    public static int getBalanceFactor(Node root){
        if(root==null){
            return 0;
        }
        else return height(root.left)-height(root.right);
    }


    public static Node leftRotate(Node x){
        Node y =x.right;
        Node T2 = y.left;

        y.left = x;
        x.right =T2;

        x.height = Math.max(height(x.left),height(x.right))+1;
        y.height =  Math.max(height(y.left),height(y.right))+1;

        return y;
    }

    public static Node rightRotate(Node y){
        Node x =y.left;
        Node T2 = x.right;

        x.right = y;
        y.left =T2;

        x.height = Math.max(height(x.left),height(x.right))+1;
        y.height =  Math.max(height(y.left),height(y.right))+1;

        return x;
    }

    public static Node insert(Node root,int key){
if(root ==null){
    return new Node(key);
}
if(key>root.data){
    root.right = insert(root.right,key);
}else if(key<root.data){
    root.left = insert(root.left,key);
}else{
    return root;
}


// update root height
root.height= 1+ Math.max(height(root.left),height(root.right));


//get balanced factor
int bf = getBalanceFactor(root);

//LL case
if(bf>1 && key<root.left.data){
    return rightRotate(root);
}



//RR case
if(bf<-1  && key>root.right.data){
    return leftRotate(root);
}



// LR case
if(bf>1 && key>root.left.data){
    root.left =leftRotate(root.left);
    return rightRotate(root);
}




//RL case
if(bf<-1 &&  key<root.right.data){
    root.right = rightRotate(root.right);
    return leftRotate(root);
}




return root;
    }


    public static void main(String[] args) {
        root =insert(root, 10);
        root =insert(root, 20);
        root =insert(root, 30);
        root =insert(root, 40);
        root =insert(root, 50);
        root =insert(root, 25);

        preorder(root);

    }

}
