public class m_105_LinkedList_Find_Key_Element {

    public static void AddElement(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
    public static int helper(Node head,int key){
if(head==null){
    return -1;
}

    if(head.data==key){
        return 0;
    }
    int idx=helper(head.next, key);
    if(idx==-1){
        return -1;
    }
    return idx+1;
}
    

    public static int SearchKey(int key){
        return helper(head,key);
    } 
    public static void main(String[] args) {
        AddElement(1);
        AddElement(2);
        AddElement(3);
        AddElement(4);
        Node currnode = head;

        while (currnode != null) {
            System.out.println(currnode.data);
            currnode = currnode.next;
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