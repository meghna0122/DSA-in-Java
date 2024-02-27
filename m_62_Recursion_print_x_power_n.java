public class m_62_Recursion_print_x_power_n {
    public static int pow(int x,int n){
if(n==0){
    return 1;
}
    
    return x*pow(x,n-1);

    }
    public static void main(String[] args) {
       System.out.println( pow(3,2));
    }
}
