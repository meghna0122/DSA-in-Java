import java.util.ArrayList;

public class m_97_ArrayList_Container_with_most_water {
    public static void BruteForce(ArrayList<Integer> height) {
        int max_water_trapped = Integer.MIN_VALUE;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int width = j - i;
                int ht = Math.min(height.get(i), height.get(j));
                int a = ht * width;
                if (max_water_trapped < a) {
                    max_water_trapped = a;
                }
            }
        }

        System.out.println("Maximum water that can be trapped is :" + max_water_trapped);
    }

    public static void Optimal_solution(ArrayList<Integer> height) {
        int i = 0;
        int width;
        int ht;
        int area = 0;
        int j = height.size() - 1;
        int max = Integer.MIN_VALUE;
        while (i < j) {
            width = j - i;
            ht = Math.min(height.get(i), height.get(j));
            area = width * ht;
            if (area > max) {
                max = area;
            }
            if (height.get(i) > height.get(j)) {
                j--;
            } else {
                i++;
            }

        }
        System.out.println("Maximum water that can be trapped is :" + max);
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(height);
        BruteForce(height);
        Optimal_solution(height);

    }
}
