import java.util.*;

public class m_150_GreedyAlgorithm_IndianCoin {
    public static int IndianCoin(Integer coin[], int val) {
        Arrays.sort(coin,Comparator.reverseOrder());
        int i = 0;
        int a;
        int count=0;
        while (i < coin.length) {
            if (coin[i] <= val) {
                a = coin[i ];
                count++;
val= val-a;
                if(val>0){
                    i=-1;
                }else{
                    break;

                }
            }
            i++;
        }
        System.out.println(count);
    return count;
    }

    

    public static void main(String[] args) {
        Integer coin[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int val = 2001;
        IndianCoin(coin, val);
    }
}