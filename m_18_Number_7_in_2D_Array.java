public class m_18_Number_7_in_2D_Array {

    public static void number7(int matrix[][],int key){

        //brute force
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    count++;
                    System.out.println(i+","+j);
                }
            }
        }
        System.out.println(count);
        
    }

    public static void sum_of_second_row(int matrix[][]) {

        int sum=0;
        for(int i=0;i<matrix[0].length;i++){
            sum+=matrix[1][i];
        }
        System.out.println(sum);
        
    }
    public static void main(String[] args) {
        int matrix[][] = { { 4, 7, 8 },
                { 8, 8, 7 } };
                int key=7;

                number7(matrix,key);
                sum_of_second_row(matrix);
    }

}
