public class m_64_x_power_n_Optimized {

    public static int optimizedPower(int a,int n){
        if(n==0){
            return 1;
        }
        int b =optimizedPower(a, n/2);
        int halfPowersq = b*b;

        if(n%2!=0){
            halfPowersq=a * halfPowersq;
        }
        return halfPowersq;
    }
    public static void main(String[] args) {
        int a=2;
        int n = 10;
        System.out.println(optimizedPower(a, n));
    }
}
