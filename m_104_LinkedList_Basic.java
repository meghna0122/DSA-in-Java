public class m_104_LinkedList_Basic {

    public static Node head;
    public static Node tail;
    public static int size;

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

    public static void AddElementAtStart(int data){
        Node newnode = new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
        }
        newnode.next=head;
        head=newnode;
    }


    public static void AddElementAtMiddle(int data,int index){
        Node newnode = new Node(data);
        Node currnode =head;
        size++;
        for (int i = 0; i < index-1; i++) {
currnode=currnode.next;
            
        }
        newnode.next=currnode.next;
        currnode.next=newnode;
    }

    public static int RemoveFirst(){

        if(size==0){
System.out.println("linked list is empty");
return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
head=tail=null;
size--;
return val;
        }else{
int val=head.data;
head=head.next;
size--;
return val;
        }
    }

    public static int RemoveLastElement(){
        if(size==0){
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        }if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }else{

            Node currnode =head;
            for (int i = 0; i <size-2; i++) {
                currnode=currnode.next;

            }
            int val = currnode.next.data;
            currnode.next=null;
            tail=currnode;
            size--;
            return val;



        }
    }
    public static void main(String[] args) {
        AddElement(1);
        AddElement(2);
        AddElement(4);
        AddElementAtMiddle(3, 2);
        RemoveLastElement();

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
