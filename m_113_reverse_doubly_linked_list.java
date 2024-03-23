
class Node{
    int data;
    Node next;
    Node prev;
    public Node(int data){
        this.data=data;
        this.next=null;
        this.prev = null;
    }
}
public class m_113_reverse_doubly_linked_list {
    
public static Node head;
public static Node tail;
public static int size;

    public static void print(){
        Node curr=head;
        while (curr!=null) {
            System.out.print(curr.data+"<->");
            curr=curr.next;
            
        }
        System.out.print("null");
    }

    public static void AddElement(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public static void reverseDoublyLL(Node head){
        Node curr =head;
        Node prev=null;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            curr.prev =next;
            prev = curr;
            curr=next; 
        }
        head = prev;
    }

    public static void main(String[] args) {
        AddElement(3);
		AddElement(1);
	    AddElement(5);
		AddElement(4);
		print();

	    reverseDoublyLL(head);
		System.out.println();
System.out.println("reverse doubly linked list");
		print();

    }
}
