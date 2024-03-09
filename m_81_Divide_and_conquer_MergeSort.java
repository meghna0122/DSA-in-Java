public class m_81_Divide_and_conquer_MergeSort {
    public static void mergeSort(int arr[],int i, int j){
        if(i>=j){
            return ;
        }
        int mid = i +(j-i)/2;
        mergeSort(arr, i, mid);
        mergeSort(arr, mid+1, j);
        merge(arr, i, mid, j);
    }

    public static void merge(int arr[] , int i , int mid, int j){
        int temp[] = new int[j-i+1];
        int si = i ;
        int sj = mid+1;
        int k = 0;
        while(si<=mid && sj<=j){

            if(arr[si]<arr[sj]){
                
                temp[k]=arr[si];
                si++;

            }
            else{
               
                temp[k]=arr[sj];
                sj++;
            }
            k++;

        }

        while(si<=mid){
temp[k++]= arr[si++];
        }
        while(sj<=j){
temp[k++]=arr[sj++];
        }
        for( int a=0,b=i;a<temp.length;a++,b++){
arr[b] = temp[a];
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length ;i++){
            System.out.println(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={2,5,1,3,7,2};
        mergeSort(arr, 0,arr.length-1);
        printArray(arr);

    }
}
