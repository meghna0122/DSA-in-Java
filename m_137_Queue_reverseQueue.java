import java.util.*;

public class m_137_Queue_reverseQueue {
    public static void ReverseQueue(Queue<Integer> q){
          Stack<Integer> s =new Stack<>();
          while(!q.isEmpty()){
               s.push(q.remove());
          }
          while (!s.isEmpty()) {
            q.add(s.pop());
          }
    }
    
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        ReverseQueue(q);
        System.out.println(q);

    }
}
