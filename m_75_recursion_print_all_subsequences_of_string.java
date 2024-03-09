import java.util.HashSet;

public class m_75_recursion_print_all_subsequences_of_string {
    public static void PrintSubsequences(String str, String s,int idx){
        if(idx==str.length()){
System.out.println(s);
return;
        }    
        char currchar = str.charAt(idx);
        PrintSubsequences(str, s+(currchar), idx+1);
        PrintSubsequences(str, s, idx+1);
    }

    public static void PrintUniqueSubsequences(String str, String s, int idx, HashSet<String> set){
        //hashset: store only unique elements
        if(idx==str.length()){
            if(set.contains(s)){
                return;
            }
            else{
                System.out.println(s);
                set.add(s);
                return;
            }
                    }    
                    char currchar = str.charAt(idx);
                    PrintUniqueSubsequences(str, s+(currchar), idx+1,set);
                    PrintUniqueSubsequences(str, s, idx+1,set);
    }

    public static void main(String[] args) {
        String str ="abc";
        HashSet<String> set = new HashSet<>();
       String s ="";
        // PrintSubsequences(str,  s, 0);
        PrintUniqueSubsequences(str, s, 0, set);
    }
}
