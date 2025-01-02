package Java_Swing;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class New_win {
    JFrame f= new JFrame();
    JLabel l= new JLabel("HOLA_AMIGOS");

    New_win(){
        l.setBounds(0,0,100,50);
        l.setFont(new Font(null,Font.PLAIN,25));
        f.add(l);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(420,420);
        f.setLayout(null);
        f.setVisible(true);
    }
}
