import java.util.Stack;

public class m_133_Queue_using_2_stack {
    static class queue{
        Stack<Integer> s1 =new Stack<>();
        Stack<Integer> s2 =new Stack<>();
        public boolean isEmpty(){
            return s1.isEmpty();
        }

        public void push(int data){
            if(s1.isEmpty()){
                s1.push(data);
                return;
            }else{
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
                s1.push(data);
                while (!s2.isEmpty()) {
                    s1.push(s2.pop());
                    
                }
            }
        }

        public int remove(){
            if(s1.isEmpty()){
                System.out.println("queue empty");
                return -1;
            }else{
                  int a = s1.pop();
                  return a;
            }
        }

        public int peek(){
            if(s1.isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            else{
                return s1.peek();
               
            }
        }




    }
    public static void main(String[] args) {
        queue q =new queue();
        q.push(1);
        q.push(2);
        q.push(3);
        // q.remove();

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
