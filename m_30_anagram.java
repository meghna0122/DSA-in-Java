import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class m_30_anagram {
    public static void main(String[] args) {
        System.out.println("enter a string:");
        String sc = new Scanner(System.in).next();
        System.out.println("enter 2nd string:");
        String str = new Scanner(System.in).next();
        sc = sc.toLowerCase();
        str = str.toLowerCase();
        
       
        // int count = 0;
        // if (sc.length() != str.length()) {
        //     System.out.println("False");
        // } else {
        //     for (int i = 0; i < sc.length(); i++) {

        //         for (int j = 0; j < str.length(); j++) {
        //             if (sc.charAt(i) == str.charAt(j)) {
        //                 count++;
        //                 break;
        //             }
        //         }

        //     }
        //     if (count == sc.length()) {
        //         System.out.println("True");
        //     } else {
        //         System.out.println("False");
        //     }
        // }

        char[] array1=sc.toCharArray();
        char[] array2=str.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        boolean result = Arrays.equals(array1,array2);
        if(result){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
