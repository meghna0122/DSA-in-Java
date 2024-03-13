public class m_90_Backtracking_NQueen {
    public static boolean IsSafe(char chessboard[][], int row, int i) {
        // up
        for (int j =row-1; j >=0; j--){
            if (chessboard[j][i] == 'Q') {
                return false;
            }
        }

        // left diagnol
        for (int n=row-1,j=i-1; n>=0 &&j>=0; j--,n--){
            if (chessboard[n][j] == 'Q') {
                return false;
            }
        }

        // right diagnol
        for (int n=row-1,j=i+1; n>=0 &&j<chessboard.length; j++,n--){
            if (chessboard[n][j] == 'Q') {
                return false;
            }
        }
        return true;

    }

    public static void NQueen(char chessboard[][], int row) {
        // base
        if (row == chessboard.length) {
            count++;
            print(chessboard);
            return;
        }

        for (int i = 0; i < chessboard.length; i++) {
            if (IsSafe(chessboard, row, i)) {
                chessboard[row][i] = 'Q';
                NQueen(chessboard, row + 1);
                chessboard[row][i] = '*';
            }
        }

    }

    public static void print(char arr[][]) {
        System.out.println("----------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    static int count=0;
    public static void main(String[] args) {
        int n = 4;
        char chessboard[][] = new char[n][n];
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
                chessboard[i][j] = '*';
            }
        }
        NQueen(chessboard, 0);
        System.out.println("total ways to solve n queen:"+count);

    }
}
