import java.util.*;
public class m_134_stack_using_2_queue {

    static class stack{
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty(){
            return q1.isEmpty();
        }

        public void add(int data){
            if(isEmpty()){
                q1.add(data);
                return;
            }else{
              while (!isEmpty()) { q2.add(q1.remove());}
              q1.add(data);
              while (!q2.isEmpty()) { q1.add(q2.remove());}
            }
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
             return q1.remove();
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
             return q1.peek();
        }

    }
    public static void main(String[] args) {
        stack s =new stack();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.remove();

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.remove();
        }
    }
}
