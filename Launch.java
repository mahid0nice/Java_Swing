package Java_Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

class launchnew implements ActionListener {
    JFrame f= new JFrame();
    JButton b= new JButton("New Window");
    launchnew(){
        b.setBounds(100,160,200,40);
        b.setFocusable(false);
        b.addActionListener(this);
        
        f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(420,420);
        f.setLayout(null);
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b){
            f.dispose();
            New_win mywin = new New_win();
        }
    }
}
