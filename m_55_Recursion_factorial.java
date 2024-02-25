public class m_55_Recursion_factorial {
    public static int recursion(int n){
        if(n==0){
            return 1;
        }
        else{
            return (n)*recursion(n-1);
        }
    }
    public static void main(String[] args) {
        int a=recursion(5);
        System.out.println(a);
    }
}
