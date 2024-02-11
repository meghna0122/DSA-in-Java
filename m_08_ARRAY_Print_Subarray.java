/**
 * m_08_ARRAY_Print_Subarray
 */
public class m_08_ARRAY_Print_Subarray {
    public static void MaxMin(int array_sum[]) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<array_sum.length;i++){
            if(array_sum[i]>max){
                max=array_sum[i];
            }
            if(array_sum[i]<min){
                min=array_sum[i];
            }
        }
        System.out.println();
        System.out.println("Maximum : "+max);
        System.out.println("Minimum : "+min);

    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 0 };
        System.out.println("Number of subarrays:");
        int size = array.length;
        int subarray = (size * (size + 1)) / 2;
        System.out.println(subarray);

        // to print subarrays and their sum
        int sum = 0;
        int count = -1;
        int array_sum[] = new int[subarray];

        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k]);
                    sum = sum + array[k];
                }
                System.out.print(" SUM :" + sum);
                count++;
                array_sum[count] = sum;
                sum = 0;
                System.out.println();
            }
        }
        // array of sum of each subarray
        System.out.println("ARRAY OF SUMS IS:");
        for (int i = 0; i < subarray; i++) {
            System.out.print("" + array_sum[i] + ",");
        }

        MaxMin(array_sum);

    }
}