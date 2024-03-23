import java.util.LinkedList;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
};

class m_110_LinkedList_MergeSort_on_LL {
	

	public void AddElement(int data) {
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

	public static Node merge(Node left, Node right) {
		Node mergell =new Node(-1);
Node temp =mergell;

while (left!=null && right!=null) {
	
if(left.data < right.data){
	temp.next = left;
	left=left.next;
	temp=temp.next;
	}else{
		temp.next =right;
		right=right.next;
		temp=temp.next;
	}
	
	
}

while (left!=null) {
	temp.next = left;
	left=left.next;
	temp=temp.next;
	
}
while (right!=null) {
	temp.next=right;
	right=right.next;
	temp=temp.next;
	
}
return mergell.next;

	}

	public Node mergesort(Node head) {
		if (head.next == null || head == null) {
			return head;
		}

		Node leftll = head;
		Node mid = getmid(head);
		Node rightll = mid.next;
		mid.next = null;

		Node left = mergesort(leftll);
		Node right = mergesort(rightll);

		return merge(left, right);

	}


	public void print(){
		Node curr =head;
		while (curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
			
		}

	}
	public static void main(String[] arguments) {
		m_110_LinkedList_MergeSort_on_LL l1 = new m_110_LinkedList_MergeSort_on_LL();
		l1.AddElement(3);
		l1.AddElement(1);
		l1.AddElement(5);
		l1.AddElement(4);
		l1.print();

		head=l1.mergesort(head);
		System.out.println();
System.out.println("sorted linked list");
		l1.print();


		

	}
}
