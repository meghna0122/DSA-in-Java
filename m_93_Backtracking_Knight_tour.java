public class m_93_Backtracking_Knight_tour {
    public static void print(int sol[][]) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static boolean KnightMove(int sol[][], int i, int j, int num) {

        if(num==(N*N)+1){
            print(sol);
return true;
        }


        int[] xMove = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] yMove = {1, 2, 2, 1, -1, -2, -2, -1};
        for (int k = 0; k < 8; k++) {
            int nextrow = i+xMove[k];
            int nextcol = j+yMove[k];
            if(IsSafe(sol, nextrow, nextcol)){
                sol[nextrow][nextcol]=num;
               if( KnightMove(sol, nextrow, nextcol, num+1)){
                return true;
               }
               //backtrack
               sol[nextrow][nextcol]=0;
            }
        }

        return false;

    }

    public static boolean IsSafe(int sol[][], int i, int j) {
        return (i >= 0 && i < sol.length && j >= 0 && j < sol.length && sol[i][j] == 0);
    }
public static int N = 8;
    public static void main(String[] args) {
        // knight moves:
        // 2 square vertically and 1 square horizontally
        // or
        // 1 square vertically and 2 square horizontally
   
        int sol[][] = new int[N][N];
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                sol[i][j]=0;
            }
        }
        sol[0][0] = 1;
        int num = 2;
    KnightMove(sol, 0, 0, num);
    }

}
