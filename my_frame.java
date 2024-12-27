package Java_Swing;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class my_frame extends JFrame {
    
    my_frame(){
        this.setTitle("mairebap11");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setSize(420,420);

        ImageIcon image = new ImageIcon("D:\\learning_java\\Java_Swing\\A Normal Day_.. _ Monster Girls X Male Reader - 8.jpg");
        this.setIconImage(image.getImage());
        //frame.getContentPane().setBackground(Color.red);
        this.getContentPane().setBackground(new Color(20,0,20));
    }
}

