public class m_86_Divide_and_Conquer_kth_smallest_element {
    public static void KthSmallestElement(int arr[], int start, int end, int k) {
        if (start == end) {
            System.out.println(arr[start]);
        }
        if (end > start) {
            int j = partition(arr, start, end);

            if (j == k - 1) {
                System.out.println(arr[j]);
                return;
            } else if (j < k - 1) {
                KthSmallestElement(arr, j + 1, end, k);
            } else {
                KthSmallestElement(arr, start, j - 1, k);
            }

        }

    }

    public static int partition(int arr[], int start, int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i < j) {
            while (arr[i] <= pivot && i <= end - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= start + 1) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }

        int temp1 = arr[j];
        arr[j] = arr[start];
        arr[start] = temp1;

        return j;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 2, 1, 6, 5, 0 };
        int n = arr.length;
        KthSmallestElement(arr, 0, n - 1, 7);

    }
}
