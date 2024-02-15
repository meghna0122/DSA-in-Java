public class m_24_substring {
    public static String Getsubstring(String str, int si,int ei){
String substring ="";
for(int i=si;i<ei;i++){
substring+=str.charAt(i);
}
return substring;
    }
    public static void main(String[] args) {
        String str="Helloworl";
        System.out.println(Getsubstring(str, 0, 5));
        //direct  method
        System.out.println(str.substring(0,5));

    }
}
