import java.util.ArrayList;

public class m_99_ArrayList_Pair_Sum2 {

    public static void sumpair2(ArrayList<Integer> arr, int sum){
        int i=0;
        int j=0;
        int n=arr.size();
        for (int k = 0; k < arr.size()-1; k++) {
            if(arr.get(k)>arr.get(k+1)){
                 j = k;
                 i = k+1;
            }
        }
        int a;
        while (j!=i) {
            a= arr.get(i) + arr.get(j);
            if(a>sum ){
//                 if(j>0){
//                 j--;}else{
// j=arr.size()-1;
//                 }

j= (n+j-1)%n;

            }
            if(a<sum ){
                    // if(i<arr.size()-1){i++;}
                    // else{
                    //     i=0;
                    // }
                    i=(i+1)%n;
                }
            if(a==sum){
                    System.out.println(arr.get(i)+","+arr.get(j));
                    break;
                }
            
            
        }
   

    }
    public static void main(String[] args) {
        // arr={11,15,6,8,9,10}
        //sum=16
         ArrayList<Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(15);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        System.out.println(arr);
        int sum = 15;
        sumpair2(arr,sum);
    }
}
