import java.util.ArrayList;
import java.util.List;

public class nQueen {

    public static List<List<String>> nqueen(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allBoards,0);
        return allBoards;
    }

    public static void helper(char[][] board, List<List<String>> allBoards, int col){
        if(col == board.length){
            //saveBoard(board,allBoards);
            return;
        }
        for(int row=0; row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col] = 'Q';
                helper(board,allBoards,col+1);
                board[row][col]='.';
            }
        }
    }

    public static boolean isSafe(int row, int col, char[][] board){
        //horizontal
        for(int j=0;j< board.length;j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        //Vertical
        for(int i=0; i< board.length;i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //UpperLeft
        int r = row;
        for(int c = col;c>=0 && r>=0;c--,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        //upper right
        return false;

    }

    public static void main(String[] args) {

    }
}