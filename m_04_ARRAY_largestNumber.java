import java.util.*;
public class m_04_ARRAY_largestNumber {
    public static int LargestNumber(int numbers[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }

return max;
    }
    public static void main(String[] args) {
        int numbers[]={20,50,34,23};
int num = LargestNumber(numbers);
System.out.println(num);
    }
}
