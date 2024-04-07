public class m_153_GFG_PractiseQuestions {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static void segregate(Node head)
    {
        Node curr =head;
        int count[]=new int[3];
        while(curr!=null){
            count[curr.data]++;
            curr=curr.next;
        }
        
        Node curr1 =head;
        int i=0;
        while(curr1!=null){
            if(count[i]==0){
                i++;
            }else{
                curr1.data=i;
                curr1=curr1.next;
                count[i]--;
            }
        }
        Node curr2 =head;
        while (curr2!=null) {
            System.out.println(curr2.data);
            curr2=curr2.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(0);
            Node curr = new Node(2);
            Node curr1 = new Node(1);
            head.next = curr;
            head.next.next = curr1;
            segregate(head);
    }

}
