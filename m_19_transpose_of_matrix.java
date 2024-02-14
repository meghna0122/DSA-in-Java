public class m_19_transpose_of_matrix {

    public static void transpose(int matrix[][]){
        int row=matrix.length-1;
        int col=matrix[0].length-1;
        // System.out.println(row); //row=1
        // System.out.println(col);  //col=2
        int matrix_2[][]=new int[col+1][row+1]; 

        for(int i=0;i<=row;i++){
            for(int j=0;j<=col;j++){
                matrix_2[j][i]=matrix[i][j];
            }
        }

        for(int i=0;i<=col;i++){
            for(int j=0;j<=row;j++){
               System.out.print(matrix_2[i][j]+" ");
               
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
        { 5, 6, 7 }};

        transpose(matrix);

    }
}
