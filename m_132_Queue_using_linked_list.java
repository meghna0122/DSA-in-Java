import java.util.LinkedList;
import java.util.*;

public class m_132_Queue_using_linked_list {
 static class Queue{
    static Node front;
    static Node rear;
    static int size;
    

public boolean isEmpty(){
    return rear==null && front==null;
}

    
    public  void add(int data){
        Node curr =new Node(data);
        if(front==null){
            front=rear =curr;
            return;
        }
        
        rear.next=curr;
        rear =curr;
    }

    public  int remove(){
        if(isEmpty()){
            System.out.println("queue empty");
            return -1;
        }else{
                int a = front.data;
                if(front == rear){
                    front=rear=null;
                }else{
                front = front.next;}
                return a;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        else{
            return front.data;
        }
    }
    
}

    
        public static void main(String[] args) {

            //using java collection framework
            // Queue<Integer> q =new LinkedList<>();

            Queue q =new Queue();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            
            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();
            }


        }
    }

    //Node class
 class Node{
    int data;
Node next;
public Node(int data){
    this.data=data;
    this.next=null;
}

}