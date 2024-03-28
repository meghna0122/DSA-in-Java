import java.util.Stack;

public class m_127_Stack_max_histogram_area {
    public static int MaxHistogramArea(int arr[]) {

        // next smallest right
        int SmallestRight[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        s.push(arr.length - 1);
        SmallestRight[arr.length-1]=-1;
        for (int i = arr.length-2; i>=0; i--) {
            while (!s.isEmpty() && arr[i]<=arr[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()){
SmallestRight[i]=arr.length;
            }else{
SmallestRight[i]=s.peek();
            }
            s.push(i);

        }
        // next smallest left
        int SmallestLeft[] = new int[arr.length];
        SmallestLeft[0]=-1;
        s.push(0);
        for (int i = 1; i < arr.length; i++) {
while (!s.isEmpty() && arr[i]<=arr[s.peek()]) {
    s.pop();
    
}
if(s.isEmpty()){
    SmallestRight[i]=-1;
                }else{
    SmallestRight[i]=s.peek();
                }
                s.push(i);

        }

        // current area
        int ht;
        int new_area;
        int width;
        int area=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            ht=arr[i];
            width= SmallestRight[i]  -SmallestLeft[i] -1;
new_area= ht*width;  
if(new_area>area){
    area=new_area;
}
           
            

        }
        return area;

    }

    public static void main(String[] args) {
        int arr[] = { 7, 6,2 };
        int area=MaxHistogramArea(arr);
        System.out.println(area);

    }
}
