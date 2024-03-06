public class m_71_recursion_length_of_string {
    public static int length(String str){
        if(str.length()==0){
            return 0;
        }
        return length(str.substring(1))+1;

}
    
    public static void main(String[] args) {
        String str = "Meghna";
        System.out.println(length(str));

        

    }
}
