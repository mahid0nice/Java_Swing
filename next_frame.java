package Java_Swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class next_frame extends JFrame implements ActionListener {
    JButton button;
    next_frame(){
         button = new JButton();
        button.setBounds(200,200,100,50);
        button.addActionListener(this);
        button.addActionListener(e -> System.out.println("hola amigos")); 

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);


        }
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==button){
                System.out.println("poop");
            }
        }
    }


