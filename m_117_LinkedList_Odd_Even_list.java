public class m_117_LinkedList_Odd_Even_list {
    // Node head;
    public static Node head;
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    

    static void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void OddEven() {
        Node end = head;
        Node prev = null;
        Node curr = head;
        while (end.next != null)
            end = end.next;
        Node new_end = end;
        while (curr.data % 2 != 0 && curr != end) {
            new_end.next = curr;
            curr = curr.next;
            new_end.next.next = null;
            new_end = new_end.next;
        }
        if (curr.data % 2 == 0) {
            head = curr;
            while (curr != end) {
                if (curr.data % 2 == 0) {
                    prev = curr;
                    curr = curr.next;
                } else {
                    prev.next = curr.next;
                    curr.next = null;
                    new_end.next = curr;

                    new_end = curr;
                    curr = prev.next;
                }
            }
        } else
            prev = curr;
        if (new_end != end && end.data % 2 != 0) {
            prev.next = end.next;
            end.next = null;
            new_end.next = end;
        }

    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
printList();
        OddEven();
        printList();

      
    }
}
