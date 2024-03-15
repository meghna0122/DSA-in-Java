public class m_92_Backtracking_rat_in_maze {
    //print final solution
    public static void printSolution(int sol[][]) {
        for (int i = 0; i<sol.length; i++) {
        for (int j = 0; j<sol.length; j++) {
        System.out.print(" " + sol[i][j] + " ");
        }
        System.out.println();
        }
        }


        public static boolean isSafe(int maze[][], int x, int y) {
        // if (x, y outside maze) return false
        return (x >= 0 && x < maze.length
        && y >= 0 && y < maze.length && maze[x][y] == 1);
        }
        
        public static boolean solveMaze(int maze[][]) {
        int N = maze.length;
        int sol[][] = new int[N][N];
        if (solveMazeUtil(maze, 0, 0, sol) == false) {
        System.out.print("Solution doesn't exist");
        return false;
        }
        printSolution(sol);
        return true;

        }
        
        public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
        if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
        sol[x][y] = 1;
        return true;
        }
        // Check if maze[x][y] is valid
        if (isSafe(maze, x, y) == true) {
        if (sol[x][y] == 1)
        return false;
        sol[x][y] = 1;
        if (solveMazeUtil(maze, x + 1, y, sol))
        return true;
        if (solveMazeUtil(maze, x, y + 1, sol))
        return true;
        sol[x][y] = 0;
        return false;
        }

        return false;
        }

    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 },
{ 1, 1, 0, 1 },
{ 0, 1, 0, 0 },
{ 1, 1, 1, 1 } };
        solveMaze(maze);

    }





// First solution which i made after understanding the question


//     public static void solveMaze(int maze[][],int i,int j){
//         if(i==maze.length || j==maze.length){
//          return ;
//         }
//         if(i==maze.length-1 && j== maze.length-1 && maze[i][j]==1){
//          cheesefound[i][j]=1;
//          print(cheesefound);
//          return;
//         }
// //right
//         if(maze[i][j+1] == 1 & j+1!=maze.length){
//          cheesefound[i][j+1]=1;
//          solveMaze(maze, i, j+1);
//          return;
         
        
         
//         }
// //down
//         if(maze[i+1][j]==1 & i+1!=maze.length){
//          cheesefound[i+1][j]=1;
//          solveMaze(maze, i+1, j);
//          return;
        
//         }
       
//         }
 

//  public static int cheesefound[][]={ { 1, 0, 0, 0 },
//  { 0, 0, 0, 0 },
//  { 0, 0, 0, 0 },
//  { 0, 0, 0, 0 } };

//  public static void print(int cheesefound[][]){
//      for (int i = 0; i < cheesefound.length; i++) {
//          for (int j = 0; j < cheesefound.length; j++) {
//              System.out.print(cheesefound[i][j]+" ");
//          }
//          System.out.println();
//      }
//  }
//  public static void main(String[] args) {
//      int maze[][] = { { 1, 0, 0, 0 },
//      { 1, 1, 0, 1 },
//      { 0, 1, 1, 0 },
//      { 1, 1, 1, 1 } };
//      // System.out.println(maze.length);
//              solveMaze(maze,0,0);
//  }
}
