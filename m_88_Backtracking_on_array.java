public class m_88_Backtracking_on_array {

    public static void Array_backtrack(int arr[], int i, int n) {
        if (i == arr.length) 
            {
                printarr(arr);
                return;
            }
           
            arr[i] = i+1;
            Array_backtrack(arr, i + 1, n);
            arr[i]=arr[i]-2;
        }

    
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        int n = arr.length;
        Array_backtrack(arr, 0, n-1);
        printarr(arr);

    }
}
