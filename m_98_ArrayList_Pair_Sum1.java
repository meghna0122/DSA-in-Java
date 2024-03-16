import java.util.ArrayList;

public class m_98_ArrayList_Pair_Sum1 {

    public static void sumpair(ArrayList<Integer> arr, int sum){
        int i=0;
        int j=arr.size()-1;
        int a;
        while (j>i) {
            a= arr.get(i) + arr.get(j);
            if(a>sum){
                j--;
            }
            if(a<sum){
                    i++;
                }
            if(a==sum){
                    System.out.println(arr.get(i)+","+arr.get(j));
                    break;
                }
            
            
        }
    }
    public static void main(String[] args) {
          ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
     
        System.out.println(arr);
        int sum = 11;
        sumpair(arr,sum);
    }
}
