package TicTacToe;

import java.util.Scanner;

public class Game {

    Board board;
    public Game(){
        initializeGame();
    }
    XPieceType xPieceType=new XPieceType();
    OPieceType oPieceType=new OPieceType();
    public void initializeGame(){

        Players players1=new Players("Player1",xPieceType);

        Players players2=new Players("Player2",oPieceType);

        board=new Board(3);
    }

    public String startGame(){
        boolean noWinner=true;
        boolean turn=true;
        while(noWinner){
            board.printBoard();
            Scanner sc=new Scanner(System.in);
            if(!board.freeSpace()){
                noWinner=false;
                continue;
            }

            System.out.println("Enter the row number");
            int row=sc.nextInt();
            System.out.println("Enter the col number");
            int col=sc.nextInt();
            if(turn){
                if(board.addPiece(row,col,xPieceType)==false) {
                    System.out.println("Position occupied! try again");
                    continue;
                }
            }
            else{
                if(board.addPiece(row,col,oPieceType)==false){
                    System.out.println("Position occupied or Invalid Entry ! try again");
                    continue;
                }
            }
            turn=!turn;
        }
        return "tie";
    }

}
