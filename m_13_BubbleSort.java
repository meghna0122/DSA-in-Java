public class m_13_BubbleSort {
    public static void main(String[] args) {
        int array[] = { 4, 3, 6, 7, 1, 2 ,10,0};
        int temp;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                      if(array[j]>array[j+1]){
                        temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                      }
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
