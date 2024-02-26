public class m_61_Recursion_firstOccurence_lastOccurence {
    public static int fo(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
      
          return  fo(arr, key, i+1);
        
     
    }
    public static int lo(int arr[],int key,int i){
        if(i==0 && arr[i]!=key){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lo(arr, key, i-1);
    }
    public static void main(String[] args) {
        int arr[]={1,3,3,3};
       System.out.println( fo(arr,4,0));
       System.out.println( fo(arr,3,arr.length-1));

    }
}
