public class m_21_Palindrom_in_String {
    public static void Palindrom(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                System.out.println("not palindrom");
break;
            }
        }
        System.out.println("palindrom");
    }
    public static void main(String[] args) {
        String str="aabbaa";
        Palindrom(str);

    }
}
