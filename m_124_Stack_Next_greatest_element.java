import java.util.Stack;

public class m_124_Stack_Next_greatest_element {

    public static void NextGreaterElement(int arr[], int newarr[]) {
        // Brute force  --> O(n^2)
        // int k=0;
        // int count =0;
        // for (int i = 0; i < newarr.length; i++) {
        //     count=0;
        //     for (int j = i+1; j < arr.length; j++) {
        //           if(arr[j]>arr[i]){
        //             newarr[k]=arr[j];
        //             k++;
        //             count++;
        //             break;
        //           }
        //     }
        //     if(count==0){
        //         newarr[k]=-1;
        //         k++;
        //     }

        // }

        //  optimal approach --> Stack --> T.C O(n)
        Stack<Integer> s = new Stack<>();
        s.push(arr.length-1);
        newarr[arr.length-1]=-1;
        for (int i = arr.length-2; i>=0; i--) {
            while (!s.isEmpty() && arr[i]>=arr[s.peek()]) {
                s.pop();
                
            }
            if(s.isEmpty()){
                newarr[i]=-1;
            }else{
                newarr[i]=arr[s.peek()];
            }
            s.push(i);
        }
        

    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        int newarray[] = new int[arr.length];
        NextGreaterElement(arr, newarray);

        for (int i = 0; i < newarray.length; i++) {
         System.out.print(newarray[i]+" ");   
        }

    }
}
