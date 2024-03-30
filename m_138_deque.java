import java.util.*;
public class m_138_deque {
//stack using deque
    static class stack{
        Deque<Integer> d = new LinkedList<>();
        public boolean isEmpty(){
            return d.isEmpty();
        }
       public void add(int data){
        d.addLast(data);
       }
       public int remove(){
        if(d.isEmpty()){
            return -1;
        }
        return d.removeLast();
       }
       public int peek(){
        if(d.isEmpty()){
            return -1;
        }
        return d.peekLast();
       }
    }
    public static void main(String[] args) {
stack s = new stack();
s.add(1);
s.add(2);
while (!s.isEmpty()) {
    System.out.println(s.peek());
    s.remove();
}

    }
}
