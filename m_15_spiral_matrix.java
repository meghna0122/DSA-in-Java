public class m_15_spiral_matrix {

    public static void printspiral(int matrix[][]){

        int startrow=0;
        int endrow=matrix.length-1;
        int startcol=0;
        int endcol=matrix[0].length-1;

        while(startrow<=endrow && startcol<=endcol){

            for(int i=startcol;i<=endcol;i++){
                       System.out.print(matrix[startrow][i]);
            }
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]);
     }
     for(int i=endcol-1;i>=startcol;i--){
        if(startrow==endrow){
            break;
        }
        System.out.print(matrix[endrow][i]);
}
for(int i=endrow-1;i>=startrow+1;i--){
    if(startcol==endcol){
        break;
    }
    System.out.print(matrix[i][startcol]);
}

startrow++;
endrow--;
startcol++;
endcol--;

        }
    }
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                           { 5, 6, 7 },
                           { 4, 7, 8 },
                           { 8, 9, 6 } };
                           printspiral(matrix);


    }
}
