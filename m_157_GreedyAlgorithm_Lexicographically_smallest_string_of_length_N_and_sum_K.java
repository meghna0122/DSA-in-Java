import java.util.*;
public class m_157_GreedyAlgorithm_Lexicographically_smallest_string_of_length_N_and_sum_K {
    public static void main(String[] args) {
        int N=5;
        int k=42;
        char arr[]=new char[N];
        Arrays.fill(arr, 'a');
      for (int i = N-1; i >=0; i--) {
            k-=i;
            if(k>0){
            if(k>26){
                arr[i]='z';
                k=k-26;
            }else{
                arr[i] = (char)(k + 97 - 1);
                k -= arr[i] - 'a' + 1;
            }
        }else{
            break;
        }
        k+=i;
    }

    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }


    }
}
