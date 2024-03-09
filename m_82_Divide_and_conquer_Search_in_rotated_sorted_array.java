public class m_82_Divide_and_conquer_Search_in_rotated_sorted_array {

    public static int FindKey(int arr[], int key, int i, int j) {
        if (i > j) {
            return -1;
        }
        int mid = (i + j) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        // mid lies on L1
        if (arr[i] <= arr[mid]) {
            // case a
            if (key >= arr[i] & key <= arr[mid]) {
                return FindKey(arr, key, i, mid - 1);
            } else {
                return FindKey(arr, key, mid + 1, j);
            }

        } else {
            // case a
            if (key >= arr[mid] & key <= arr[j]) {
                return FindKey(arr, key, mid + 1, j);
            } else {
                return FindKey(arr, key, i, mid - 1);
            }
        }
       
    }

    public static void main(String[] args) {
        // array =[0,1,2,3,4] --> rotated --> [4,3,0,1,2]
        int arr[] = { 4, 3, 0, 1, 2 };
        int key = 4;
        int a = FindKey(arr, key, 0, arr.length - 1);
        System.out.println(a);
       

    }
}
