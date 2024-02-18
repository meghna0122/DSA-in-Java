public class m_41_binary_gap {
    public static void main(String[] args) {
        int n = 22;
        int count = 0;
        String binary = Integer.toBinaryString(n);
        int len = binary.length();
        int count1 = 0;
        for (int i = 0; i < len; i++) {
            if (binary.charAt(i) == '1') {
                count1=0;
                for (int j = i + 1; j < len; j++) {
                    count1++;
                    if (binary.charAt(j) == '1') {
                        if (count1 >= count) {
                            count = count1;
                           
                        }
                        break;
                    }
                }
            }

        }

        System.out.println(count);
    }
}
