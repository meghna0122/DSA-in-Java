public class m_09_ARRAY_Max_subarray_sum {
    public static void Max_subarray(int array[]) {

        int prefix[] = new int[array.length];
        prefix[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            prefix[i] = prefix[i - 1] + array[i];
        }
        for(int i=0;i<array.length;i++){
            System.out.print(prefix[i]+" ");
           
        }
        System.out.println();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (i == 0) {
                    sum = prefix[j];
                } else {
                    sum = prefix[j] - prefix[i - 1];
                }

                if (max < sum) {
                    max = sum;
                }

            }
        }
        System.out.println(max);

    }

    public static void main(String[] args) {
        int array[] = { 2,4,6,8,0 };
        Max_subarray(array);

    }
}
