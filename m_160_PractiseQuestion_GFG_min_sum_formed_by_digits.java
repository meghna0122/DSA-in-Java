
import java.util.*
;public class m_160_PractiseQuestion_GFG_min_sum_formed_by_digits {
    public static long minSum(int arr[], int n)
    {
        if(n==0){
            return 0;
        }
        // Your code goes here
        Arrays.sort(arr);
        long rem1=0;
        for(int i=0;i<arr.length;i=i+2){
           rem1= rem1*10 + arr[i];
        }
        
        long rem2=0;
        for(int i=1;i<arr.length;i=i+2){
            rem2 = rem2*10 + arr[i];
        }
        
        return rem1+rem2;
    }
        public static void main(String[] args) {
            int arr[]={1,2,3,4};
            int n=4;
            minSum(arr, n);
        }
}
