import java.util.*;

public class m_144_Queue_reversing_k_elements_of_queue {

    public static Queue<Integer> ReverseKelements(Queue<Integer> q ,int k){
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < k; i++) {
            s.push(q.remove());
        }
    while (!s.isEmpty()) {
        q.add(s.pop());
    }
   for (int i = 0; i < k; i++) {
    q.add(q.remove());
   }
return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        int k=5;
Queue<Integer> q2 =ReverseKelements(q,k);
System.out.println(q2);


    }
}
