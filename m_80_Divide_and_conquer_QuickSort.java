public class m_80_Divide_and_conquer_QuickSort {
    public static void quick(int arr[],int start,int end){

if(start <end){
    int p= partition(arr,start,end);
    quick(arr, start, p-1);
    quick(arr, p+1, end);
    }}

    public static int partition(int arr[],int start, int end){
        int pivot=arr[start];
        int temp , temp1;
        int i=start+1;
        int j= end;
        while(i<=j){
            if(pivot>arr[i]){
i++;

            }
            if(pivot<arr[j]){
                j--;
            }

            if(i<j & pivot<arr[i] & pivot>arr[j]){
                temp1=arr[i];
                arr[i]=arr[j];
                arr[j]= temp1;
            }

        }
      if(i>j) { temp=pivot;
        arr[start] = arr[j];
        arr[j]=temp;
       }
       return j;
        
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length ;i++){
            System.out.println(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,6,9,8,2,1};
        quick(arr, 0, arr.length-1);
        printArray(arr);

    }
    
}
