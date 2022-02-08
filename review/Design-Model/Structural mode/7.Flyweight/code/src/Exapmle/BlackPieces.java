package Exapmle;

import java.awt.*;

public class BlackPieces implements ChessPieces{

    @Override
    public void DownPieces(Graphics g, Point pt) {
        // TODO Auto-generated method stub
        g.setColor(Color.BLACK);
        g.fillOval(pt.x, pt.y, 30, 30);
    }
    
}
