import java.util.Arrays;
import java.util.Comparator;

public class m_147_GreedyAlgorithm_FractionalKnapsack {

    public static void FractionalKnapsack(int weight[], int value[], int w) {
        double ratio[][]=new double[weight.length][2];
        // 1st col-->idx  2nd col-->ratio(value/weight)
        for (int i = 0; i < ratio.length; i++) {
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
        }
       //ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
        int max_value = 0;
        for (int j = ratio.length-1; j >=0; j--) {
            if (w > weight[(int)ratio[j][0]]) {
                max_value += value[(int)ratio[j][0]];
                w = w - weight[(int)ratio[j][0]];
            } else {
                max_value += (double)w * ratio[j][1];;   
                w = 0;
                break;
            }
        }
        System.out.println(max_value);

    }

    public static void main(String[] args) {
        int weight[] = { 10, 20, 30 };
        int value[] = { 60, 100, 120 };
        int w = 50;
        FractionalKnapsack(weight, value, w);

    }
}
