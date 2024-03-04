public class m_68_recursion_binaryStringPtoblem {
    public static void BinaryString(int n , int lastplace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        BinaryString(n-1, 0, str+"0");
        if(lastplace ==0){
            BinaryString(n-1, 1, str+"1");
        }

        
        
    }
    public static void main(String[] args) {
        BinaryString(3, 0," ");
        
    }
}
