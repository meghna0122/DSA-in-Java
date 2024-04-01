import java.util.Arrays;

public class m_141_Practise_leetcode_Valid_anagram {
    public static void main(String[] args) {
       String s = "anagram";
        String t = "nagaram";
       char a[]= s.toCharArray();
       char b[]=t.toCharArray();
       Arrays.sort(a);
       Arrays.sort(b);
    //    System.out.println(a);
    //    System.out.println(b);
    
       if(Arrays.equals(a, b)){
        System.out.println("true");
       }else{
        System.out.println("false");
       }

    }
}
