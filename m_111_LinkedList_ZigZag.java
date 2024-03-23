class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
};
public class m_111_LinkedList_ZigZag {
   

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

	public static Node getmid(Node head) {
		Node slow = head;
		Node fast = head.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

		}
		return slow;
	}

	public static void print(){
		Node curr =head;
		while (curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
			
		}

	}


    public static void zigzag(Node head){
        //find mid
        Node mid = getmid(head);

        // right half
        Node rightll = mid.next;
        mid.next = null;

        // reverse second half
        Node currnode = rightll;
        Node next ;
        Node prev=null;

        while (currnode!=null) {
            next=currnode.next;
            currnode.next=prev;
            prev = currnode;
            currnode=next;
            
        }

        rightll=prev;

        // alternate merge
        Node nextL;
        Node nextR;
        Node curr1=head;
        Node curr2= rightll;
        while (curr1!=null && curr2!=null) {
            nextL=curr1.next;
            curr1.next=curr2;
            nextR = curr2.next;
            curr2.next=nextL;
           curr1=nextL;
           curr2=nextR;  
        }

        



    }
	public static void main(String[] arguments) {
		AddElement(3);
		AddElement(1);
	    AddElement(5);
		AddElement(4);
		print();

	    zigzag(head);
		System.out.println();
System.out.println("zigzag linked list");
		print();


		

	}


}