package Exapmle;

import java.util.ArrayList;

public class QiFactory {
    private ArrayList<ChessPieces> qz;

    public QiFactory() {
        qz = new ArrayList<ChessPieces>();
        ChessPieces w = new WhitePieces();
        qz.add(w);
        ChessPieces b = new BlackPieces();
        qz.add(b);
    }
    public ChessPieces getChessPieces(String type){
        if(type.equalsIgnoreCase("w")){
            return (ChessPieces)qz.get(0);
        }else if(type.equalsIgnoreCase("b")){
            return (ChessPieces)qz.get(1);
        }else{
            return null;
        }
    }
}
