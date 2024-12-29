package Java_Swing;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class next_frame extends JFrame implements ActionListener {
    JButton button;
    next_frame(){
        ImageIcon icon = new ImageIcon("D:\\learning_java\\Java_Swing\\A Normal Day_.. _ Monster Girls X Male Reader - 8.jpg");

        button = new JButton();
        button.setBounds(100,100,500,500);
        button.addActionListener(this);
        button.addActionListener(e -> System.out.println("hola amigos"));
        button.setText("fuck you");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);
         

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1000,1000);
        this.setVisible(true);
        this.add(button);


        }
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==button){
                System.out.println("poop");
                button.setEnabled(false);
            }
        }
    }


