import java.util.*;

public class m_145_Queue_Maximum_of_all_subarrays_of_size_k {
//SLIDING WINDOW PROBLEM
    // Brute force --> T.C O(n^2)
    public static void Brute_MaxSubarray(int arr[], int k, int n) {
        int i = 0;
        int j = k - 1;
        int newarr[] = new int[n - k + 1];
        int l = 0;
        int max = Integer.MIN_VALUE;
        while (j < n) {
            for (int m = i; m <= j; m++) {
                if (max < arr[m]) {
                    max = arr[m];
                }
            }
            newarr[l] = max;

            i++;
            j++;
            l++;
        }

        for (int s = 0; s < newarr.length; s++) {
            System.out.print(newarr[s] + " ");
        }
    }

    // Optimal solution --> Using Deque --> T.C O(n)

    public static void Optimal_MaxSubarray(int arr[], int K, int N) {
        Deque<Integer> Qi = new LinkedList<Integer>();
        int i;
        for (i = 0; i < K; ++i) {
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }
            Qi.addLast(i);
        }

        for (i=K; i < N; ++i) {
            System.out.print(arr[Qi.peek()] + " ");
            while ((!Qi.isEmpty()) && Qi.peek() <= i - K) {
                Qi.removeFirst();
            }

            while ((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }
            Qi.addLast(i);
        }

        System.out.print(arr[Qi.peek()]);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int k = 3;
        int n = 9;
        // Brute_MaxSubarray(arr, k, n);
        Optimal_MaxSubarray(arr, k, n);

    }
}
