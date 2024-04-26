import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.*;

public class m_183_Heap_PriorityQueue {

    static class student implements Comparable<student>{
        String name;
        int rank;
        public student(String name , int rank){
            this.name=name;
            this.rank=rank;
        }
    @Override
        public int compareTo(student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {

        PriorityQueue<student> q = new PriorityQueue<>();

        q.add(new student("A", 2));
        q.add(new student("B", 4));
        q.add(new student("C", 1));
        q.add(new student("D", 3));
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(4);
        pq.add(3);
        pq.add(7);
        pq.add(1);


        PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());
        
        p.add(4);
        p.add(3);
        p.add(7);
        p.add(1);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
        System.out.println();
        while (!p.isEmpty()) {
            System.out.print(p.peek()+" ");
            p.remove();
        }
        System.out.println();
        while (!q.isEmpty()) {
            System.out.print(q.peek().name+"->"+q.peek().rank+" ");
            q.remove();
        }
    }
}
