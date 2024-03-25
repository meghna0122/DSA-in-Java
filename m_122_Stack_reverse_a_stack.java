import java.util.Stack;

public class m_122_Stack_reverse_a_stack {
    public static void PushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
int a= s.pop();
PushAtBottom(s, data);
s.push(a);

    }
    public static void reverse_stack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int a=s.pop();
        reverse_stack(s);
        PushAtBottom(s, a);


    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        reverse_stack(s);
        System.out.println(s);
    }
}
