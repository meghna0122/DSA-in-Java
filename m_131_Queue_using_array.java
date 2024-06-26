public class m_131_Queue_using_array {
    static class queue {
        static int arr[];
        static int size;
        static int rear;

        queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;

        }

         boolean isEmpty() {
            return rear == -1;
        }

        void add(int data) {
            if (rear == size - 1) {
                System.out.println("queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;

        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[0];
        }

    }

    public static void main(String[] args) {

        queue q = new queue(3);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
