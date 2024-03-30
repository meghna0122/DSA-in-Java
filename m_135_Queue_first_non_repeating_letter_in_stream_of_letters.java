import java.util.*;

public class m_135_Queue_first_non_repeating_letter_in_stream_of_letters {

    public static void FirstLetter(String str){
        Queue<Character> q =new LinkedList<>();
        int arr[] =new int[26];
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            q.add(a);
            arr[a-'a']++;
          while(!q.isEmpty() && arr[q.peek() - 'a'] >1 ) {
            q.remove();
          }
            
           if(q.isEmpty()){
            System.out.print(-1+" ");
           }else{
            System.out.print(q.peek()+" ");
           }
        }

    }
    public static void main(String[] args) {
        String str="aabccxb";
FirstLetter(str);
    }
}
