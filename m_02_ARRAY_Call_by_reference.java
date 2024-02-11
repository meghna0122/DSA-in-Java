public class m_02_ARRAY_Call_by_reference {

    public static void updated_array(int newarray[],int a){
        a=5;
        for(int i=0;i<newarray.length;i++){
            newarray[i]=newarray[i]+1;
        }

    }
    public static void main(String[] args) {
        int array[]=new int[10];
        int newarray[]={1,2,3};
        int a=10;
        updated_array(newarray,a);
        System.out.println("value of array:");
        for(int i=0;i<newarray.length;i++){
            System.out.println(newarray[i]);
        }
        System.out.println("value of 'a' after:"+a);

    }
}
