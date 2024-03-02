public class m_65_Recursion_delete_consecutive_string {
    

    public static String deleteConsecutiveStrings(String s)
    {
    
        // Initialize start and stop pointers
        int i = 0;
        int j = 0;
    
        // Initialize an empty string for new elements
        String newElements = "";
    
        // Iterate string using j pointer
        while (j < s.length()) {
    
        // If both elements are same then skip
        if (s.charAt(i) == s.charAt(j)) {
            j++;
        }
    
        // If both elements are not same then append new
        // element
        else if (s.charAt(j) != s.charAt(i)
                || j == s.length() - 1) {
            newElements += s.charAt(i);
    
            i = j;
            j++;
        }
        }
    
        newElements += s.charAt(j - 1);
        return newElements;
    }
    
    public static void main(String[] args)
    {
    
        String s = "hello world";
    
        // Printing original string
        System.out.println("Input : " + s);
    
        // Printing result
        System.out.println("Output : "
                        + deleteConsecutiveStrings(s));

       

    }
    }
    

