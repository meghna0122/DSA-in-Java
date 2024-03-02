public class m_66_remove_duplicate_using_recursion {

    public static void RemoveDuplicate(String str, int idx,StringBuilder newstr,Boolean arr[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
      char curr = str.charAt(idx);
            if(arr[curr -'a']!=null){
                RemoveDuplicate(str, idx+1, newstr, arr);
            }
            else{
                arr[curr -'a']=true;
                RemoveDuplicate(str, idx+1, newstr.append(curr), arr);
            }
        
    }

    public static void main(String[] args) {
        String str="helloworld";
        RemoveDuplicate(str, 0, new StringBuilder(""), new Boolean [26]);

    }
}