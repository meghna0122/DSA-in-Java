import java.util.Arrays;
import java.util.Collections;

public class m_152_GreedyAlgorithm_Chocalate_Problem {
    public static void main(String[] args) {
        int n=4;
        int m=6;
        Integer costVer[] ={2,1,3,1,4};
        Integer costHor[] ={4,1,2};
        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());
        int h=0 , v=0;
        int hp=1 , vp=1;
        int cost=0;
        while (h<costHor.length && v<costVer.length) {
            // costhor > costver  --> horizontal cut
            if(costHor[h]>=costVer[v]){
                cost+= vp*costHor[h];
                hp++;
                h++;
            }else if (costHor[h]<=costVer[v]){
                // vertical cut
                cost+= hp*costVer[v];
                vp++;
                v++;
            }
        }

        while (h<costHor.length) {
            cost+= vp*costHor[h];
                hp++;
                h++;
        }
        while (v<costVer.length) {
            cost+= hp*costVer[v];
                vp++;
                v++;
        }
        System.out.println(cost);

    }
}
