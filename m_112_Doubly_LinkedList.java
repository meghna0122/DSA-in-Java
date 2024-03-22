public class m_112_Doubly_LinkedList {
    
    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
this.data=data;
this.next=null;
this.prev=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        size++;
        Node newnode = new Node(data);
        if(head==null){
head=tail =newnode;
return;
        }else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
    }

    
    public void addlast(int data){
        size++;
        Node newnode = new Node(data);
        if(head==null){
head=tail =newnode;
return;
        }else{
           tail.next=newnode;
           newnode.prev=tail;
           tail=newnode;
        }
    }

    public static void print(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.print("null");

    }

    
    public int removefirst(int data){
        size--;
       
        if(head==null){
System.out.println("empty");
return Integer.MIN_VALUE;
        }

            int a = head.data;
            head=head.next;
            head.prev=null;

        
        return a;
    }
    public static void main(String[] args) {
        m_112_Doubly_LinkedList dll = new m_112_Doubly_LinkedList();
        dll.addfirst(1);
        dll.addfirst(2);
        dll.addfirst(3);
        dll.addlast(0);
        print();


    }
}
