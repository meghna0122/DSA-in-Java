public class m_85_Divide_and_conquer_inversion_count_in_array {
//Brute Force --O(n^2)
    public static void FindInvCount(int arr[]){
int n = arr.length;
int count=0;
for(int i=0;i<n-1;i++){
    for(int j =i+1;j<n;j++){
        if(arr[i]>arr[j]){
            count++;
        }
    }

}

System.out.println(count);
    }

    //Optimized Approach -- O(nlogn)
public static int FindInvCountOptimized(int arr[],int start,int end){
    int invcount=0;

if(end>start){int mid = (start+end)/2;

invcount=FindInvCountOptimized(arr, start, mid);
invcount+=FindInvCountOptimized(arr, mid+1, end);
invcount=invcount+ merge(arr,start,mid+1,end);

}

return invcount;}

public static int merge(int arr[],int start,int mid,int end){
    int i=start;
    int j = mid;
    int k =0;
    int temp[] =new int[end-start+1];
    int count=0;
    while(i<mid && j<=end){
        if(arr[j]<arr[i]){
            count=count+(mid-i);
            temp[k]=arr[j];
            k++;
            j++;
        }else{
            temp[k]=arr[i];
            k++;
            i++;
        }
    }

    while (i<mid) {
        temp[k]=arr[i];
        i++;
        k++;
        
    }
    while (j<=end) {
        temp[k]=arr[j];
        j++;
        k++;
        
    }

    for(int m=start,l=0;m<end;m++,l++){
        arr[m]=temp[l];
    }
    return count;
}


    public static void main(String[] args) {
        int arr[]={2,3,1,5,4};
        // FindInvCount(arr);
        int a =FindInvCountOptimized(arr, 0, arr.length-1);
        System.out.println(a);

    }
}
