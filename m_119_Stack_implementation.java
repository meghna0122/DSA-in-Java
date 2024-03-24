import java.util.ArrayList;
import java.util.Stack;


public class m_119_Stack_implementation {
    static class stack {
        static ArrayList<Integer> list = new ArrayList<>();

        // isempty
        public boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public void push(int data) {
            list.add(data);
        }

        // pop
        public int pop() {
            if (isEmpty()) {
                return -1;
            } else {
                int top = list.get(list.size() - 1);
                list.remove(list.size() - 1);
                return top;
            }
        }

        // peek
        public int peek() {
            return list.get(list.size() - 1);
        }
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class stackB {
        public static Node head = null;

        // isempty
        public boolean isEmptyB() {
            // if(head==null){
            // return true;
            // }else{
            // return false;
            // }
            return head == null;
        }

        // push
        public void pushB(int data) {
            Node newnode = new Node(data);
            if (isEmptyB()) {
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;

        }

        // pop
        public int popB() {
            if (isEmptyB()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // peek
        public int peekB() {
            if (isEmptyB()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        //Implement stack using arraylist
        stack s = new stack();
        s.push(0);
        s.push(1);
        s.push(2);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();

        }
//Implement stack using linked list
        stackB s1 = new stackB();
        s1.pushB(10);
        s1.pushB(20);
        s1.pushB(30);
        while (!s1.isEmptyB()) {
            System.out.println(s1.peekB());
            s1.popB();
        }

        //Implement stack using java collection framework

        Stack<Integer> s2=new Stack<>();
        s2.push(1);
        s2.push(2);
        s2.push(3);
        while (!s2.isEmpty()) {
            System.out.println(s2.peek());
            s2.pop();
            
        }

    }
}
