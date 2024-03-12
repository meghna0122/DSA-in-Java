public class m_87_Divide_and_Conquer_min_max_problem {

    public static int[] MinMax(int arr[], int i, int j) {
        int max, min;
        if (i == j) {
            max = min = arr[i];

        } else {
            if (i + 1 == j) {
                if (arr[i] > arr[j]) {
                    max = arr[i];
                    min = arr[j];
                } else {
                    max = arr[j];
                    min = arr[i];
                }
            }

            else {
                int mid = (i + j) / 2;
                int leftminmax[] = MinMax(arr, i, mid);
                int rightminmax[] = MinMax(arr, mid + 1, j);
                if (leftminmax[0] > rightminmax[0]) {
                    max = leftminmax[0];
                } else {
                    max = rightminmax[0];
                }
                if (leftminmax[1] < rightminmax[1]) {
                    min = leftminmax[1];
                } else {
                    min = rightminmax[1];
                }
            }
            
        }
        int output[] = { max, min };
        return output;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 5, 1, 8 ,0};
        int[] storage = MinMax(arr, 0, arr.length - 1);
        for (int i = 0; i < storage.length; i++) {
            System.out.println(storage[i]);
        }
    }
}
