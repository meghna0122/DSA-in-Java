import java.util.Stack;

public class m_126_Stack_Duplicate_parenthesis {
    public static boolean DuplicateParenthesis(String str) {
        Stack<Character> s = new Stack<>();
        
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if ( ch== ')') {

                int count = 0;
                while (s.peek()!='(') {
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }else{
                    s.pop();
                }
                
            }else{
                s.push(ch);
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        String str = "(a+(b))";
        System.out.println(DuplicateParenthesis(str));

    }
}
