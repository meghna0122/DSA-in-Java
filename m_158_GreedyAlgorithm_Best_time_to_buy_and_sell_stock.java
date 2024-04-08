public class m_158_GreedyAlgorithm_Best_time_to_buy_and_sell_stock {
    public static void main(String[] args) {
        int arr[]={7,1,3,2,6,5};
        int buy=arr[0];
        int max_profit =0;
        for (int i = 0; i < arr.length; i++) {
            if(buy>arr[i]){
                buy=arr[i];
            }else{
                if(max_profit<arr[i]-buy){
                    max_profit =arr[i]-buy;
                }
            }
        }
        System.out.println(max_profit);
    }
}
