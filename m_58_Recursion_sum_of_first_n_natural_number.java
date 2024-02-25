public class m_58_Recursion_sum_of_first_n_natural_number {
    public static int sum(int n){
       if(n==1){
        return 1;
       }
       int snm = sum(n-1);
       int sn = n+snm;
       return sn;
     


    }
    public static void main(String[] args) {
        int a=sum(10);
        System.out.println(a);
    }
}
