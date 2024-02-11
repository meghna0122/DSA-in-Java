public class m_07_ARRAY_Pair_in_array {
    public static void main(String[] args) {
        int array[]={2,3,4,5,6};
        int size=array.length;
        int sum=0;
        // for(int i=array.length-1;i>0;i--){
        //    sum= sum + i;
        // }
        // System.out.println(sum);

        // to print number of pairs
         sum = ((size)*(size-1))/2 ;
        System.out.println("Number of pairs: "+sum);

        int a;
        for(int i=0;i<array.length;i++){
            a =array[i];
            for(int j=i+1;j<array.length;j++){
                System.out.print("("+a+","+array[j]+") ");
            }
            System.out.println();
        }
    }

}
