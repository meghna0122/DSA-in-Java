import java.util.ArrayList;

public class m_100_ArrayList_Monotonic_arraylist {
    public static boolean Monotonic(ArrayList<Integer> arr){
// if(arr.get(0)>arr.get(arr.size()-1)){
//     // decreasing order
//     for (int i = 0; i < arr.size()-1; i++) {
//         if(arr.get(i)<arr.get(i+1)){
//             return false;
//         }
//     }
// }else{
//     //ascending order
//     for (int i = 0; i < arr.size()-1; i++) {
//         if(arr.get(i)>arr.get(i+1)){
//             return false;
//         }
//     }
// }
// return true;


boolean inc = true;
boolean dec = true;
for (int i = 0; i < arr.size()-1; i++) {
    if(arr.get(i)>arr.get(i+1)){
        inc=false;
    }
    if(arr.get(i)<arr.get(i+1)){
        dec=false;
    }
}
return inc || dec ; 
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(1);
       
        System.out.println(arr);
        System.out.println(Monotonic(arr));
    }
}
