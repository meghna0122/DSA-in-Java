public class m_102_Beautiful_Array {
    public static int[] beautifulArray(int n){
        int[] res = new int[n];
        if(n==1){
            return new int[] {1};
        }
        else if(n==2){
            return new int[] {1,2};
        }else{
            int[] odds=beautifulArray((n+1)/2);
            int[] even=beautifulArray(n/2);

            for(int i =0;i<odds.length;i++){
                res[i] = odds[i]*2 -1;
            }
            for(int j=0;j<even.length;j++){
                res[odds.length +j]=even[j]*2;
            }
        }
        return res;
    }
    public static void main(String[] args) {
       int n=5;
       int[] arr;
       arr=beautifulArray(n);
       for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
       }
       System.out.println();
    }
}
