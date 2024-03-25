import java.util.Stack;

public class m_121_Stack_reverse_string_using_stack {

    public static void reverse(String s,Stack<Character> str){

        for (int i = 0; i < s.length(); i++) {
            str.push(s.charAt(i));

        }
        StringBuilder ptr = new StringBuilder("");
        while (!str.isEmpty()) {
            char a = str.pop();
            ptr.append(a);
        }
        System.out.println(ptr);
        
    }
    public static void main(String[] args) {
        String s  ="meghna";
        Stack<Character> str = new Stack<>();
        reverse(s, str);



    }
}
