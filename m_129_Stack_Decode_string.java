import java.util.Stack;

public class m_129_Stack_Decode_string {

    public static String DecodeString(String s){
        Stack<Integer> st =new Stack<>();
        Stack<StringBuilder> st1 =new Stack<>();
        int n=0;
        StringBuilder sb=new StringBuilder("");

        for (char c: s.toCharArray()) {
            if(Character.isDigit(c)){
                n=n*10+ (c-'0');
            }else if( c=='['){
                st.push(n);
                n=0;
                st1.push(sb);
                sb= new StringBuilder();

            }else if(c==']'){
                int k=st.pop();
                StringBuilder temp=sb;
                sb=st1.pop();
                while (k!=0) {
                    sb.append(temp);
                    k--;
                }
            }else{
                sb.append(c);
            }
            
        }
        return sb.toString();


    }
    public static void main(String[] args) {
        String s="2[3[ba]2[r]]";
    String str=DecodeString(s);
    System.out.println(str);
    }
}
