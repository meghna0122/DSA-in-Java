import java.util.Stack;

public class m_120_Stack_push_at_bottom {
   

    public static void PushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
int a= s.pop();
PushAtBottom(s, data);
s.push(a);

    }
    public static void main(String[] args) {
       Stack<Integer> s =new Stack<>();
       s.push(1);
       s.push(2);
       s.push(3);
System.out.println(s);
       PushAtBottom(s, 0);
       System.out.println(s);

    }

}
