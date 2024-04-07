public class m_154_GFG_PractiseQuestions {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static long multiplyTwoLists(Node l1,Node l2){
        long mod=1000000007L;
        long rem1=0;
        while(l1!=null){
            rem1= ((rem1*10)%mod + (l1.data)%mod)%mod;
            l1=l1.next;
        }
        long rem2=0;
        while(l2!=null){
             rem2= ((rem2*10)%mod + (l2.data)%mod)%mod;
            l2=l2.next;
        }
        
        return (rem1%mod*rem2%mod)%mod;
        
    }
    public static void main(String[] args) {
        Node head = new Node(1);
            Node curr = new Node(2);
            Node curr1 = new Node(1);
            head.next = curr;
            head.next.next = curr1;

            Node head1 = new Node(1);
            Node curr2 = new Node(2);
            Node curr3 = new Node(1);
            head1.next = curr2;
            head1.next.next = curr3;


            long a=multiplyTwoLists(head,head1);
            System.out.println(a);
    }
}
