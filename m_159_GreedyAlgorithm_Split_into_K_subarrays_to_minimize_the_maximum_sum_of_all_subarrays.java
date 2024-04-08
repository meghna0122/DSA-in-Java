public class m_159_GreedyAlgorithm_Split_into_K_subarrays_to_minimize_the_maximum_sum_of_all_subarrays {
    static boolean check(int mid, int array[], int n, int K) {

        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > mid)
                return false;

            sum += array[i];

            if (sum > mid) {
                count++;
                sum = array[i];
            }
        }
        count++;

        if (count <= K)
            return true;
        return false;
    }

    static int solve(int array[], int n, int K) {
        int start = 1;
        for (int i = 0; i < n; ++i) {
            if (array[i] > start)
                start = array[i];
        }

        int end = 0;

        for (int i = 0; i < n; i++) {
            end += array[i];
        }

        int answer = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (check(mid, array, n, K)) {
                answer = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4 };
        int n = array.length;
        int K = 3;
        System.out.println(solve(array, n, K));
    }
}
