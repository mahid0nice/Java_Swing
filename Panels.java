package Java_Swing;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;

public class Panels {
    public static void main(String[] args){
        //jPanel= a GUI component that function as a container to hold other components.
        ImageIcon image = new ImageIcon("D:\\learning_java\\Java_Swing\\arnob.jpg");

        JLabel label =new JLabel();
        label.setText("HI");
        label.setIcon(image);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setBounds(0,0,200,200);

        JPanel graypanel = new JPanel();
        graypanel.setBackground(Color.gray);
        graypanel.setBounds(0,0,200,200);
        graypanel.setLayout(null);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(200,0,200,200);
        bluepanel.setLayout(null);

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(400,0,200,200);
        graypanel.setLayout(null);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0,200,600,400);
        greenpanel.setLayout(new BorderLayout());

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(800,800);
        frame.setVisible(true);

        frame.add(graypanel);
        frame.add(bluepanel);
        frame.add(redpanel);
        frame.add(greenpanel);

        graypanel.add(label);
    }
}
