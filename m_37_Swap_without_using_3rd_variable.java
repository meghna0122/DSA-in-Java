public class m_37_Swap_without_using_3rd_variable {

    public static void main(String[] args) {
        int a=7;
        int b=1;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);


    }
    
}
