public class m_63_recursion_tiling_problem {
       
            public static void main(String[] args) {
                int n = 7;
                System.out.println(titlingProblen(n));
            }

            public static int titlingProblen(int n) { // 2 X n (floor size) n = length of floor
               
                //base case
                if(n == 0 || n == 1){
                    return 1;
                }
                //kaam
                //vertical choice
                int fnm1 = titlingProblen(n-1);
        
                //horizontal choice
                int fnm2 = titlingProblen(n-2);
        
                int totalWays = fnm1 + fnm2;
        
                return totalWays;
            }
        }
            
        
    
