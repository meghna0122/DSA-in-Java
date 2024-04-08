public class m_155_GreedyAlgorithm_Max_balanced_string_partition {

    public static int BalancedString(String s){
        int ans=0;
        int l =0;
        int r=0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if(s.charAt(i)=='L'){
                l++;
            }
            else if(s.charAt(i)=='R'){
                r++;
            }
            if (l==r){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s ="LRRRRLLRLLRL";
        System.out.println(BalancedString(s));
    }
}
