
public class m_05_ARRAY_BinarySearch {
    public static int BinarySearch(int numbers[],int num) {
        int low=0;
        int high =numbers.length-1;
        int mid;
        while(high>=low){
            mid=(low+high)/2;
            if(numbers[mid]==num){
                return mid;
            }
            if (num>numbers[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
                
        
        }
        return -1;
        
    }
public static void main(String[] args) {
    int numbers[]={4,6,7,8,9};
    int key = 4;
    int a =BinarySearch(numbers, key);
    System.out.println(a);

}
    
}