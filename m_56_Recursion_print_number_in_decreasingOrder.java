public class m_56_Recursion_print_number_in_decreasingOrder {

    public static void DecreasingOrder(int n){
        if(n==1){
           System.out.println(1);
           return;
        }
        else{
            System.out.println(n);
            DecreasingOrder(n-1);
        }
    }
    public static void main(String[] args) {
        DecreasingOrder(7);
    }
}
