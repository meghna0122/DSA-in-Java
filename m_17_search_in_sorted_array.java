public class m_17_search_in_sorted_array {
    public static boolean staircasesearch(int matrix[][],int key){
        int row =0,col = matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("found key");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                           { 5, 6, 7 },
                           { 4, 7, 8 }
                            };
                           int key =4;
        staircasesearch(matrix,key);
    }
}
