

public class m_156_GreedyAlgorithm_kth_largest_odd_number_in_range {

    public static int  KthLargestOddNumber(int L, int R, int K){
        if(K<=0){
return 0;
        }
int a=0;
//even
        if(R%2==0){
          a=   (int)Math.floor(R-L+1)/2;
          if(K>a){
            return 0;
          }else{
            return R - 2 * K + 1;
          }
        }
        //odd
        else{
            a=   (int)Math.ceil(R-L+1)/2;
            if(K>a){
              return 0;
            }else{
               
              return (R-K*2 +2);
            }

        }


    }
    public static void main(String[] args) {
        int L=-3;
        int R=3;
        int K=3;
        KthLargestOddNumber(L,R,K);

    }
}
