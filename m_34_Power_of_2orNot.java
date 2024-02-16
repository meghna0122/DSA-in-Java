import java.util.Scanner;

public class m_34_Power_of_2orNot {
    public static boolean powerof2(int n){
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
       System.out.println( powerof2(n));
    }
}
