public class m_70_recursion_convert_number_into_strings {
    public static void NumberToString(String arr[],int i){
if(i==0){
    return;
}
int lastdig = i%10;
NumberToString(arr,i/10);
System.out.print(arr[lastdig]+" ");
    }
    public static void main(String[] args) {
        //Input:123 --> Output:one two three
        String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
        NumberToString(arr,123);

    }
}
