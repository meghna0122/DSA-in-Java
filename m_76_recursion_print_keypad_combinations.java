public class m_76_recursion_print_keypad_combinations {
    public static String[] keypad ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printcomb(String str, int idx, String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
          char currchar = str.charAt(idx);
          String mapp = keypad[currchar -'0'];
          for(int i=0;i<mapp.length();i++){
            printcomb(str, idx+1, combination+mapp.charAt(i));
          }
    }
    public static void main(String[] args) {
        String str="23";
        String combination =new String("");
        printcomb(str, 0, combination);
       
    }
}
