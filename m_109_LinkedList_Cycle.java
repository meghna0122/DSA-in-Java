public class m_109_LinkedList_Cycle {

    public static boolean DetectCycle(){
        Node slow=head;
        Node fast =head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow ==fast){
                return true;
            }
        }
        return false;

    }

    public static void RemoveCycle(){
        Node slow=head;
        Node fast =head;
        boolean cycle = false;
      
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow.next ==fast.next.next){
                cycle = true;
               break;
            }
        }
        if(cycle ==false){
            return;
        }
        if(slow.next==head){
            slow.next=null;
        }else{
            slow=slow.next;
            fast=fast.next.next;
            slow=head;
            // Node prev =null;

        while (slow.next!=fast.next) {
            // prev =fast;
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
        }

       
        
    }


    public static Node head;
    public static Node tail;
    public static int size;
    public static void main(String[] args) {
        head = new Node(1);
       Node temp =new Node(2);
       head.next =temp;
       head.next.next=new Node(3);
       head.next.next.next=new Node(4);
       head.next.next.next.next=temp;
        
        
        System.out.println(DetectCycle());
        RemoveCycle();
        Node curr =head;
        while (curr!=null) {
            System.out.println(curr.data);
            curr=curr.next;
            
        }

        
    }
}


class Node {
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}