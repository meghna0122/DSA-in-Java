public class m_77_recursion_print_all_permutations_of_string {
    public static void AllPermutations(String str , String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currchar = str.charAt(i);
            String newstring = str.substring(0, i) + str.substring(i+1);
            AllPermutations(newstring, permutation+currchar);
        
        }
    }
    public static void main(String[] args) {
        String str ="abc";
        String s ="";
        AllPermutations(str, s);

    }
}
