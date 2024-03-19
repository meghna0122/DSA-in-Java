public class m_108_LinkedList_Palindrom_or_not {
    public static void AddElement(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public static Node head;
    public static Node tail;
    public static int size;
    
// we can use findnode methos also to find mid node 

//     public static Node findmid(Node head){
//         Node slow=head;
//         Node fast=head;
//         while(fast!=null && fast.next!=null){
//             slow =slow.next;
// fast =fast.next.next;
//         }
//         return slow;
//     }

    public static boolean CheckPalindrom(){ // 1->2->3->2->1
        int mid;
       if(size%2==0){

     mid = (size/2)-1; 
       }else{

        mid = size/2; //size==5 --> idx=2 
       }


    
       
        Node new_head ;
        Node curr=head;
        for (int i = 0; i < mid; i++) {
            curr=curr.next;
        }


        //curr= 3
        new_head=curr.next;
        curr.next =null; // 1->2->3->null  .. linked list 1

        //reverse -->   2->1->null  to 1->2->null  .. linked list 2
        Node currnode = new_head;
        Node prev =null;
        Node next;
        while(currnode!=null){
            next = currnode.next;
            currnode.next = prev;
            prev=currnode;
            currnode= next;
        }
        new_head = prev;

        //LL1 : 1->2->3->null  Head =1
        //LL2 : 1->2->null     New_head = 2

        while (head!=null && new_head!=null) {
            if(head.data !=new_head.data){
                return false;
            }
            head=head.next;
            new_head=new_head.next;
        }
        return true;

    }
    public static void main(String[] args) {

        
        AddElement(1);
        AddElement(2);
        AddElement(3);
        AddElement(2);
        AddElement(1);
        // AddElement(1);
       System.out.println(CheckPalindrom());
        // Node currNode = head;
        // while (currNode != null) {
        //     System.out.println(currNode.data);
        //     currNode = currNode.next;
        // }
        
    }
}

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data =data;
        this.next=null;
    }
}

