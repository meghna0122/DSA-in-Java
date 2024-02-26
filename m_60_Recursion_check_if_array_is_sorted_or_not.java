public class m_60_Recursion_check_if_array_is_sorted_or_not {
    public static Boolean SortedArray(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        else{
            return SortedArray(arr, i+1);

        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,4};
       System.out.println( SortedArray(arr,0));
    }
}
