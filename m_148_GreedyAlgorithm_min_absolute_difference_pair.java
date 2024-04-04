import java.util.Arrays;

public class m_148_GreedyAlgorithm_min_absolute_difference_pair {

    public static void MinAbsoluteDiff(int arr1[],int arr2[]){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
int diff=0;

        for (int i = 0; i < arr2.length; i++) {
            diff += Math.abs(arr1[i]-arr2[i]); 
        }
        System.out.println(diff);
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={2,1,3};
        MinAbsoluteDiff(arr1,arr2);
    }
}
