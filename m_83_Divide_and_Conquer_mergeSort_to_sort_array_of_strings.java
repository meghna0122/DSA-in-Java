public class m_83_Divide_and_Conquer_mergeSort_to_sort_array_of_strings {
    public static String[] mergeSort(String arr[], int i, int j) {
        if (i == j) {
            String[] A = { arr[i] };
            return A;
        }
        int mid = (i + j) / 2;

        String[] arr1 = mergeSort(arr, i, mid);
        String[] arr2 = mergeSort(arr, mid + 1, j);
        String[] arr3 = merge(arr1, arr2);
        return arr3;
    }

    public static String[] merge(String[] arr1, String[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        String arr3[] = new String[n + m];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n & j < m) {
            if (isAlphabeticalSmaller(arr1[i], arr2[j])) {
                arr3[k] = arr1[i];
                k++;
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i < n) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while (j < m) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        return arr3;

    }

    public static boolean isAlphabeticalSmaller(String str1, String str2) {
        if (str1.compareTo(str2) < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        String arr_sorted[] = mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr_sorted.length; i++) {
            System.out.println(arr_sorted[i]);
        }

    }

}
