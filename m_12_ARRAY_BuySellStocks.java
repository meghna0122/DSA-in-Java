public class m_12_ARRAY_BuySellStocks {
    public static void main(String[] args) {
        int prices[]={2,1,4,5,6};
        int SP;
        int profit=0;
        int max_profit=0;
        int BP=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            SP=prices[i];
            if(BP<SP){
profit=SP-BP;
max_profit=Math.max(max_profit, profit);
            }
            else{
                BP=SP;
            }


        }
        System.out.println(max_profit);
    }
}
