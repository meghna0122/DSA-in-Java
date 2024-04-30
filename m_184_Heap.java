import java.util.*;
public class m_184_Heap {
static class heap{

    ArrayList<Integer> arr =new ArrayList<>();

    public void add(int data){
        arr.add(data);
        int x = arr.size()-1;
        int par = (x-1)/2;
        while (arr.get(x)<arr.get(par)) {
            int temp = arr.get(x);
            arr.set(x, arr.get(par));
            arr.set(par, temp);
        }


    }

    public int peek(){
        return arr.get(0);
    }

    static void heapify(int arr[], int n, int i)
    {
        int largest = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2; 
 
        if (l < n && arr[l] > arr[largest])
            largest = l;
 
        if (r < n && arr[r] > arr[largest])
            largest = r;
 
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            heapify(arr, n, largest);
        }
    }
    static int deleteRoot(int arr[], int n)
    {
        int lastElement = arr[n - 1];
 
        arr[0] = lastElement;
 
        n = n - 1;
 
        heapify(arr, n, 0);
 
        return n;
    }
 
}

    public static void main(String[] args) {
        
    }
}
