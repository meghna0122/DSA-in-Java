import java.util.Arrays;

public class m_84_Majority_element {

    // Brute Force --> o(n^2) -- after sorting array
    public static void MajorityElement(int arr[]) {
        int n = arr.length;// n=5
        Arrays.sort(arr);// 2,2,2,3,3
        int count = 1;
        int max = 0;
        int idx = arr[0];// idx=2
        for (int i = 0; i < n; i++) {
            count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    i++;
                }
            }
            if (count > n / 2) {
                max = count;
                idx = arr[i];

            }

        }
        if (max == 0) {
            System.out.println(-1);
        } else {
            System.out.println(idx);
        }
    }

    // Brute Force --> o(n^2) -- without sorting
    public static int MajorityElement_1(int arr[]) {
        int n = arr.length;// n=5
        int majorityCount = n / 2;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > majorityCount) {
                return arr[i];
            }
        }
        return -1;
    }

    // Moore's Voting algorithm --> O(n)T.C and O(1)S.C
    public static int FindMajority(int[] arr){
        int count=0;
        int element =-1;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                element = arr[i];
                count=1;
            }
            else{
                if(arr[i]==element){
                    count++;
                }else{
                    count--;
                }
            }
        }

        //to check if the element found is majority element or not
        count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                count++;
            }
        }
        if(count > (arr.length)/2){
            return element;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 3, 3, 1, 2,2 };
        // MajorityElement(arr);
       int a= FindMajority(arr);
       System.out.println(a);

    }

}