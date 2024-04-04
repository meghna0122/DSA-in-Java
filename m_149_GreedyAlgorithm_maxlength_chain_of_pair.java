import java.util.Arrays;
import java.util.Comparator;

public class m_149_GreedyAlgorithm_maxlength_chain_of_pair {
    public static void main(String[] args) {
        int arr[][]={{5,24},{39,60},{5,28}};
        Arrays.sort(arr,Comparator.comparingDouble(o->o[1]));
        int chainlen=1;
        int chainend=arr[0][1];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][0]>chainend){
                chainlen++;
                chainend=arr[i][1];
            }
        }
        System.out.println(chainlen);
    }
}
