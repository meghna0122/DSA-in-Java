public class m_11_Trapping_Rainwater {

    public static void rainwater(int height[]) {
        int bar = height.length;
        int max_left[] = new int[bar];
        int max_right[] = new int[bar];

        if (bar <= 2) {
            System.out.println("NO WATER TRAPPED");
        } else {
            max_left[0] = height[0];
            for (int i = 1; i < bar; i++) {
                max_left[i] = Math.max(max_left[i - 1], height[i]);
            }
            max_right[bar - 1] = height[bar - 1];
            for (int i = bar - 2; i >= 0; i--) {
                max_right[i] = Math.max(max_right[i + 1], height[i]);
            }
        }
        int area;
        int min;
        int sum = 0;
        for (int i = 0; i < bar; i++) {
            min = Math.min(max_left[i], max_right[i]);
            area = min - height[i];
            if (area < 0) {
                area = 0;
            }
            sum = sum + area;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        rainwater(height);
    }
}
