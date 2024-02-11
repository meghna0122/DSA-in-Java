
public class m_03_LinearSearch {
    public static void main(String[] args) {
        int array[]=new int[5];
        for(int i=0;i<array.length;i++){
            array[i] = i+1;
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

        for(int i=0;i<array.length;i++){
            if(array[i]==4){
                System.out.println("Value Found "+array[i]+" at index "+i);
            }
        }


        

    }

}