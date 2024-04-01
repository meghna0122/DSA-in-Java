import java.util.*;
public class m_140_Connect_n_ropes_with_minimum_cost {
    public static int MinimumCost(int arr[]) {
      PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
      int i=0;
      while (i!=arr.length) {
        pq.add(arr[i]);
        i++;
      }
      int sum=0;
      //poll() method is used to remove the head and return it.
      while (pq.size()>1) {
        int a =pq.poll();
        int b =pq.poll();
         sum +=a+b;
        pq.add(a+b);
      }
return sum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int a=MinimumCost(arr);
        System.out.println(a);
    }
}