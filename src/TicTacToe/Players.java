package TicTacToe;

public class Players {
    public String name;
    public PieceType pieceType;

    public Players(String name,PieceType pieceType){
        this.name=name;
        this.pieceType=pieceType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public void setPieceType(PieceType pieceType) {
        this.pieceType = pieceType;
    }
}
