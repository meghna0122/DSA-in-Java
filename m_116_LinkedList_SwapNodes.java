public class m_116_LinkedList_SwapNodes {
    static class Node{
        int data;
        Node next;
        public Node(int data){
this.data=data;
this.next=null;
        }
    }

    public static void SwapNodes(Node head,int x,int y){
        if(x==y){
            return;
        }
        Node prevX =null;
        Node currX = head;
        while(currX!=null && currX.data!=x){
prevX=currX;
currX = currX.next;
        }
        Node prevY =null;
        Node currY = head;
        while(currY!=null && currY.data!=y){
prevY=currY;
currY = currY.next;
        }

        if(currX==null|| currY==null){
            return;
        }

        if(prevX!=null){
            prevX.next=currY;
        }else{
            head=currY;
        }

        if(prevY!=null){
            prevY.next=currX;
        }else{
            head=currX;
        }

        Node temp =currX.next;
        currX.next=currY.next;
        currY.next=temp;



    }
    public static void main(String[] args) {
        Node l1 =new Node(1);
        l1.next=new Node(2);
        l1.next.next=new Node(3);
        l1.next.next.next=new Node(4);
        l1.next.next.next.next=null;

        SwapNodes(l1,2,4);

        Node curr=l1;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}
