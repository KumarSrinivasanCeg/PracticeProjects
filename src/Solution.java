public class Solution {

    public boolean exist(char[][] board, String word) {

        int rowLength = board.length;
        boolean found = false;
        for (int k = 0; k < word.length()-1; k++) {

            char given = word.charAt(k);
            char given1 = word.charAt(k+1);

        for (int row = 0; row < board.length -1 ; row++) {
            for (int column = 0; column < board[row].length - 1; column++) {

                int columnLength = board[row].length;


                if (
                        board[row][column] == given &&

                                findRight(board, row, column, rowLength, columnLength) == given1 ||
                               // findLeft(board, row, column, rowLength, columnLength) == given1 ||
                                findDown(board, row, column, rowLength, columnLength) == given1
                             //   findUp(board, row, column, rowLength, columnLength) == given1
                ) {
                    found = true;


                }


            }
        }
        }
        System.out.println(found);
        return found;


    }


    public char findLeft( char[][]  board, int row , int column ,int rowLength, int columnLength)
    {
        if(column < columnLength && column != 0){
            return board [row] [column-1];
        }
        return ' ';

    }
    public  char findRight( char[][]   board , int row , int column , int rowLength, int columnLength)
    {
        if(column < columnLength){
            return board [row] [column+1];
        }
        return ' ';

    }

    public  char findUp( char[][]   board , int row , int column , int rowLength, int columnLength)
    {
        if(row < rowLength &&  row != 0 ){
            return board [row-1] [column];
        }
        return ' ';

    }

    public char findDown( char[][]   board, int row , int column , int rowLength, int columnLength)
    {
        if(row < rowLength){
            return board [row+1] [column];
        }
        return ' ';

    }

    public static void main(String[] args) {

        char [] [] board  =    {
            {'A', 'B', 'C','E'},
            {'S', 'F', 'C','S'},
            {'A', 'D', 'E', 'E'}

        };
        String word = "ABCCED";

        char [] [] board1  =    {
                {'A', 'B', 'C','E'},
                {'S', 'F', 'C','S'},
                {'A', 'D', 'E', 'E'}

        };
        String word1 = "SEE";

        char [] [] board2  =    {
                {'A', 'B', 'C','E'},
                {'S', 'F', 'C','S'},
                {'A', 'D', 'E', 'E'}

        };
        String word2 = "ABCB";

        Solution s = new Solution();
        s.exist(board, word);
        s.exist(board1, word1);
        s.exist(board2, word2);
    }

}