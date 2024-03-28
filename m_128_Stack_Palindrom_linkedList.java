import java.util.Stack;

public class m_128_Stack_Palindrom_linkedList {

    public static Node head;
    public static Node tail;
    public static int size;

    public static void add(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public static void print() {
        Node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + " ");
            currnode = currnode.next;
        }
        System.out.println();
    }
//My solution --> this is also correct
    // public static Node mid() {
    // Node slow = head;
    // Node fast = head.next;
    // while (fast != null && fast.next != null) {
    // slow = slow.next;
    // fast = fast.next.next;
    // }
    // return slow;
    // }

    // public static boolean CheckPalindrom() {
    // Stack<Integer> s = new Stack<>();

    // Node curr = head;
    // Node mid = mid();
    // while (curr != mid.next) {
    // s.push(curr.data);
    // curr = curr.next;
    // }

    // if (size % 2 != 0) {
    // s.pop();
    // while (curr != null) {
    // if (curr.data != s.peek()) {
    // return false;
    // } else {
    // s.pop();
    // curr=curr.next;
    // }
    // }
    // } else {
    // while (curr != null) {
    // if (curr.data != s.peek()) {
    // return false;
    // } else {
    // s.pop();
    // curr=curr.next;
    // }
    // }
    // }
    // return true;
    // }

//Actual solution
    public static boolean CheckPalindrom() {
        Stack<Integer> s = new Stack<>();
        Node slow = head;
        boolean ispalindrom = true;
        while (slow != null) {
            s.push(slow.data);
            slow = slow.next;

        }

        while (head != null) {
            int i = s.pop();
            if (head.data == i) {
                ispalindrom = true;
            } else {
                ispalindrom = false;
                break;
            }
            head = head.next;
        }
        return ispalindrom;
    }

    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
        add(2);
        add(4);
        print();

        System.out.println("Palindrom: " + CheckPalindrom());

    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}