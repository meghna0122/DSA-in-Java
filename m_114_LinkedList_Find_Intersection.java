import java.util.LinkedList;

public class m_114_LinkedList_Find_Intersection {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node GetIntersection(Node head1,Node head2){
while(head2!=null){
    Node temp=head1;
    while(temp!=null){
        if(temp==head2){
            return head2;
        }
        temp=temp.next;
    }
    head2=head2.next;
}
return null;
    }
    public static void main(String[] args) {
        Node head1;
        Node head2;
        head1=new Node(4);
        head2=new Node(1);
        head1.next=new Node(5);
        head1.next.next=new Node(6);
        head2.next=new Node(2);
        head2.next.next=new Node(3);
head2.next.next.next=head1.next.next;
head1.next.next.next=new Node(7);
head1.next.next.next.next=null;


Node intersectionNode = GetIntersection(head1,head2);
System.out.println("Intersection Node is: "+intersectionNode.data);

        
        
    }
}
