import java.util.Stack;

public class m_125_Stack_valid_parenthesis {
    public static boolean validParenthesis(String str){
Stack<Character> s = new Stack<>();
int n = str.length();
for (int i = 0; i <n; i++) {
    if(str.charAt(i)== '{' || str.charAt(i)== '[' || str.charAt(i)== '(' ){
        s.push(str.charAt(i));
    }else{
        if(s.isEmpty()){return false;}
        char b = str.charAt(i);
        {if(s.peek()=='(' && b==')'  ||s.peek()=='{' && b=='}' 
        ||s.peek()=='[' && b==']' ){
            s.pop();
        }else{
            return false;
        }
    }
}}
if(s.isEmpty()){
    return true;
}else{
    return false;
}
    }

    public static void main(String[] args) {
        String str ="{()}";
        boolean a=validParenthesis(str);
        System.out.println(a);
    }
}
