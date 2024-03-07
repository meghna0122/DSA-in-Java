public class m_72_recursion_count_substring_ending_and_starting_with_same_letter {

    public static int countSubstr(String str,int i,int j,int n){
        //BASE CASES
        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }

        //Work to do
        int res = countSubstr(str, i+1,j,n-1)+countSubstr(str, i, j-1, n-1)-countSubstr(str, i+1, j-1, n-2);
        if(str.charAt(i)==str.charAt(j)){
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        String str ="abcab";  //output: a,b,c,a,b,abca,bcab -->7
        int n = str.length();
        System.out.println(countSubstr(str, 0, n-1, n));
      
    }
}
