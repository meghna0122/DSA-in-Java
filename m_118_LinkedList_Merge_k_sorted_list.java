public class m_118_LinkedList_Merge_k_sorted_list {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;

    public static void push(int data){
        Node newnode = new Node(data);
       newnode.next=head;
       head=newnode;
    }

    public static void print(Node head){
        Node curr = head;
        while (curr!=null) {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }

    public static Node mergeKLists(Node arr[],int last){
        while (last!=0) {
            int i=0;
            int j=last;
            while (i<j) {
                arr[i]=SortedMerge(arr[i],arr[j]);
                i++;
                j--;
                if(i>=j){
                    last=j;
                }
            }
            
        }
        return arr[0];
    }

    public static Node SortedMerge(Node a , Node b){
        Node result = null;
        if(a==null){
            return b;
        }
        if(b==null){
            return a;
        }
        if(a.data<=b.data){
            result=a;
            result.next=SortedMerge(a.next, b);
        }else{
            result=b;
            result.next=SortedMerge(a, b.next);
        }
        return result;
    }



    public static void main(String[] args) {
        int k = 3;
        int n = 4;
        Node arr[] = new Node[k];
        arr[0] = new Node(1);
        arr[0].next = new Node(3);
        arr[0].next.next = new Node(5);
        arr[0].next.next.next = new Node(7);
        arr[1] = new Node(2);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(6);
        arr[1].next.next.next = new Node(8);
        arr[2] = new Node(0);
        arr[2].next = new Node(9);
        arr[2].next.next = new Node(10);
        arr[2].next.next.next = new Node(11);
        Node head = mergeKLists(arr, k - 1);
        print(head);

    }
}
