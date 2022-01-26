package GameExample;

import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Original extends JFrame implements Morrigan{
    private static final long serialVersionUID = 1L;
    private String t = "Morrigan0.jpg";
    public Original() {
        super("《恶魔战士》中的莫莉卡·安斯兰");
    }
    public void setImage(String t){
        this.t = t;
    }
    @Override
    public void display() {
        // TODO Auto-generated method stub
        this.setLayout(new FlowLayout());
        JLabel l1 = new JLabel(new ImageIcon("src/GameExample/" + t));
        this.add(l1);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);   
    }
    
}
