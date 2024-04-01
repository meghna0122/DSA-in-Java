public class m_143_Practise_leetcode_valid_palindrom {
    public static boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
       
        int start = 0;
        int last = s.length()-1;


        while(start<=last){
char currfirst = s.charAt(start);
char currlast = s.charAt(last);
            if(!Character.isLetterOrDigit(currfirst)){
                start++;
            }
           else if(!Character.isLetterOrDigit(currlast)){
                last--;
            } else {
            if(Character.toLowerCase(currfirst)!=Character.toLowerCase(currlast)){
                return false;
            }
            start++;
            last--;
        }
        
        }
        return true;
        
    }
    public static void main(String[] args) {
        String s ="My name is meghna";
        isPalindrome(s);
    }
}

