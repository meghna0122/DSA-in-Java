public class m_89_Backtracking_find_subsets {
    public static void subset(String str,int i,String s){
       if(i==str.length()){
        if(s.length()==0){
            System.out.println("null");
        }else{
            System.out.println(s);
            
        }
        return;
       }

       subset(str, i+1, s);
       subset(str, i+1, s+str.charAt(i));
      
    }
    public static void main(String[] args) {
        String str="abc";
        String s ="";
        subset(str,0,s);
    }
}
