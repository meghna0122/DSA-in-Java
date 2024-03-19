public class m_107_LinkedList_Remove_nth_node_from_last {
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

    public static void RemoveNthFromLast(int n){
int idx = size-n;
Node currNode=head;
for (int i = 0; i < idx-1; i++) {
    currNode=currNode.next;
}
Node fault = currNode.next;
currNode.next = fault.next;
size--;


    }
    public static void main(String[] args) {

        AddElement(1);
        AddElement(2);
        AddElement(3);
        AddElement(4);
        AddElement(5);
        AddElement(6);
       RemoveNthFromLast(2);
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