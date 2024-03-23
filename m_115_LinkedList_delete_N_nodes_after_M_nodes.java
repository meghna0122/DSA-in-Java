public class m_115_LinkedList_delete_N_nodes_after_M_nodes {
    static class Node{
        int data;
        Node next;
        public Node(int data){
this.data=data;
this.next=null;
        }
    }

    public static void Delete_N_after_M(Node head,int m ,int n){
Node temp =head;
while(temp!=null){
    for (int i = 0; i <m-1 ; i++) {
        temp=temp.next;
    }
    if(temp==null){
        return;
    }
    Node temp_new =temp;
    for (int i = 0; i <= n; i++) {
        temp_new =temp_new.next;
    }
    temp.next=temp_new;
    temp=temp_new;
}
    }

    public static void main(String[] args) {
        Node l1 =new Node(1);
        l1.next=new Node(2);
        l1.next.next=new Node(3);
        l1.next.next.next=new Node(4);
        l1.next.next.next.next=null;

        Delete_N_after_M(l1,2,1);

        Node curr=l1;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }

    }
}
