public class m_57_Recursion_print_number_in_IncreasingOrder {
    public static void IncreaseOrder(int n){

// if(a==n){
//     System.out.println(n);
//     return;
// }
// else{
//     System.out.println(a);
//     a++;
//     IncreaseOrder(n,a);
// }

if(n==1){
    System.out.println(1);
    return;
}
IncreaseOrder(n-1);
System.out.println(n);
    }
    public static void main(String[] args) {
        // IncreaseOrder(10, 1);
        IncreaseOrder(10);
    }
}
