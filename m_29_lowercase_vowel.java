import java.util.Scanner;

public class m_29_lowercase_vowel {
    public static void LowerCaseVowels(String sc){
        int count=0;
        for(int i=0;i<sc.length();i++){
            if(sc.charAt(i)=='a' | sc.charAt(i)=='e'| sc.charAt(i)=='i'|sc.charAt(i)=='o'|sc.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        System.out.println("enter a string");
        String sc = new Scanner(System.in).next();
        // String sc = "Meghna";
        LowerCaseVowels(sc);

    }
}