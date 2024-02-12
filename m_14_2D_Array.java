import java.util.Scanner;

public class m_14_2D_Array {
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n =matrix.length;    //no. of rows
        int m =matrix[0].length;  //no.of columns
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

              System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
