public class m_80_Divide_and_conquer_QuickSort {
    public static void quick(int arr[],int start,int end){

if(start <end){
    int p= partition(arr,start,end);
    quick(arr, start, p-1);
    quick(arr, p+1, end);
    }}

    public static int partition(int arr[],int start, int end){
        int pivot = arr[start];
        int i=start;
        int j = end;
        while(i<j){   
            while(arr[i]<=pivot &&i<=end-1 ){
            i++;
        }
        while(arr[j]>pivot && j>=start+1){
            j--;
        }

       if(i<j){ 
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;}
        
    }

        int temp1 =arr[j];
        arr[j]=arr[start];
        arr[start]=temp1;
        
        
           return j;
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length ;i++){
            System.out.println(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,6,7};
        int n = arr.length-1;
        quick(arr, 0, n);
        printArray(arr);

    }
    
}
