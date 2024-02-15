public class m_23_String_compare {
    public static void main(String[] args) {
        String str ="meghna";
        String str3=new String("meghna");
// Here == check whether two strings are same at object level i.e they point at same address or different address
        if(str==str3){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
// Here .equal checks the value of the strings that whether the value stored at str and str3 are equal or not 
        if(str.equals(str3)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
