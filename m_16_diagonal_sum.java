public class m_16_diagonal_sum {

    public static void diagnonal_sum(int matrix[][]){
        //APPROACH 1 : O(n^2)
        // int sum=0;
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix.length;j++){
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }
        //         if(i+j == matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }

        //APPROACH 2: O(n)
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+= matrix[i][i];
            if(i!=matrix.length-i-1){sum+=matrix[i][matrix.length-i-1];}
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
        { 5, 6, 7 },
        { 4, 7, 8 }
         };
        diagnonal_sum(matrix);

    }
}
