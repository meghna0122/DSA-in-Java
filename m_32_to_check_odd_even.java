import java.util.Scanner;

public class m_32_to_check_odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if ((n & 1) == 1) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }

    }
}
