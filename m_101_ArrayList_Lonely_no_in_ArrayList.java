import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class m_101_ArrayList_Lonely_no_in_ArrayList {
    public static void LonelyNumber(ArrayList<Integer> arr){
       Collections.sort(arr);
       ArrayList<Integer> newarr=new ArrayList<>();
       int n = arr.size()-1;
if(n>0){if(arr.get(1)!=arr.get(0) && arr.get(1)!=arr.get(0)+1 ){
newarr.add(arr.get(0));
}
if(arr.get(n)!=arr.get(n-1) && arr.get(n)!=arr.get(n-1)+1 ){
    newarr.add(arr.get(n));
    }
       for (int i = 1; i < arr.size()-1; i++) {
        int curr =arr.get(i);
        int prev = arr.get(i-1);
        int next = arr.get(i+1);

        if(curr!=prev && curr!=next && next!= curr+1 && prev !=curr-1){
            newarr.add(curr);
        }


        
       }
    }else{
        newarr.add(arr.get(0));
    }
       System.out.println(newarr);


    }
    public static void main(String[] args) {
         ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        // arr.add(2);
        // arr.add(6);
        // arr.add(2);
        // arr.add(3);
        System.out.println(arr);
        LonelyNumber(arr);
       
    }
}
