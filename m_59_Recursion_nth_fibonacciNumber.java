public class m_59_Recursion_nth_fibonacciNumber {
    public static int fibonacci(int n) {
       if(n==1 || n==0){
        return n;
       }
       int f1=fibonacci(n-1);
       int f2=fibonacci(n-2);
       int fn = f1+f2;
       return fn;

    }

    public static void main(String[] args) {
       System.out.println( fibonacci(5));

    }
}
