public class m_106_LinkedList_Reverse_linkedList {

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


    public static Node ReverseList(){
Node curr=head;
Node prev=null;
Node next;
while(curr!=null){
    next=curr.next;
    curr.next = prev;
    prev=curr;
    curr=next;
}
head = prev;




return head;


    }
    public static void main(String[] args) {
        AddElement(1);
        AddElement(2);
        AddElement(3);
        AddElement(4);
       
        head = ReverseList();
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
       
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;

    }
}
