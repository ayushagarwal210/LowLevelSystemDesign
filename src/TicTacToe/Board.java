package TicTacToe;

public class Board {
    public int size;
    public GamePieces board[][];

    public Board(int size){
        this.size=size;
        board=new GamePieces[size][size];
    }

    public boolean addPiece(int row,int col,PieceType pieceType){
        if(row>=size || col>=size || row<0 || col<0)
            return false;
        if(board[row][col]!=null)
            return false;
        board[row][col]=pieceType.gamePieces;
        return true;
    }
    public boolean freeSpace(){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==null)
                    return true;
            }
        }
        return false;
    }
    public void printBoard(){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print((board[i][j]==null?"_":board[i][j])+" | ");
            }
            System.out.println();
        }
    }
}
