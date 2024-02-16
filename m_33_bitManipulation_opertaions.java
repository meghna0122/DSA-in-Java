import java.util.Scanner;

public class m_33_bitManipulation_opertaions {

    public static void Get_ith_Bit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            System.out.println("0");
        } else {
            System.out.println(1);
        }
    }

    public static int Set_ith_Bit(int n, int i) {
        int bitmask = 1 << i;
        return (n | bitmask);
    }

    public static int Clear_ith_Bit(int n, int i) {
        int bitmask = ~(1 << i);
        return (n & bitmask);
    }

    public static int Update_ith_Bit(int n, int i, int newbit) {
        // if(newbit==0){
        // Clear_ith_Bit(n, i);
        // }
        // else{
        // Set_ith_Bit(n,i);
        // }

        n = Clear_ith_Bit(n, i);
        int bitmask = newbit << i;
        return n | bitmask;

    }

    public static int Clear_last_i_bits(int n,int i){
            return (n & ((~0)<<i));
    }

    public static int Clear_range_of_bits(int n, int i,int j){
        int a=(~0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask=a|b;
        return n& bitmask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Get_ith_Bit(n, 1);
        Set_ith_Bit(n, 3);
        Clear_ith_Bit(n, 2);
        Update_ith_Bit(n, 2, 1);
        Clear_last_i_bits(n,2);
        Clear_range_of_bits(n, 2, 4);

    }
}
