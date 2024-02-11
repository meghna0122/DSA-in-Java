public class m_06_ReverseArray {
    public static void Reverse_Array(int array[]) {
        int start = 0;
        int end = array.length - 1;
        int temp;

        while (start <end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            end = end - 1;
            start = start + 1;
        }
    }

    public static void main(String[] args) {
        int array[] = { 3, 5, 7, 8 };
        Reverse_Array(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
