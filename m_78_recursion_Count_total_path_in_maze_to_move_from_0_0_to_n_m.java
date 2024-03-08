public class m_78_recursion_Count_total_path_in_maze_to_move_from_0_0_to_n_m {
    public static int CountPath(int n, int m, int i, int j) {
        
        if (i==n || j==m) {
            return 0;
            
        }
        if(i==n-1 & j==m-1){
            return 1;
        }
     int right=CountPath(n, m, i, j+1);
     int down=CountPath(n, m, i+1, j);
     return right+down;

    }

    public static void main(String[] args) {
int a=CountPath(3, 3, 0, 0);
System.out.println(a);
    }
}
