package Java_Swing;
import javax.swing.*;
import java.awt.*;

class JLayeredpane {
    public static void main(String[] args){
        JLabel l1= new JLabel();
        l1.setOpaque(true);
        l1.setBackground(Color.BLUE);
        l1.setBounds(50,50,200,200);

        JLabel l2= new JLabel();
        l2.setOpaque(true);
        l2.setBackground(Color.BLACK);
        l2.setBounds(100,100,200,200);

        JLabel l3= new JLabel();
        l3.setOpaque(true);
        l3.setBackground(Color.GREEN);
        l3.setBounds(150,150,200,200);

        JLayeredPane layeredpane= new JLayeredPane();
        layeredpane.setBounds(0,0,500,500);
        layeredpane.add(l1,Integer.valueOf(0));
        layeredpane.add(l2,Integer.valueOf(2));
        layeredpane.add(l3,Integer.valueOf(1));

        JFrame f=new JFrame("JLayeredPane");
        f.add(layeredpane);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(new Dimension(500,500));
        f.setLayout(null);
        f.setVisible(true);

    }
    
}
