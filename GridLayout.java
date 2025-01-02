package Java_Swing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class Gridlayout {
    public static void main(String[] args) {
        JFrame f= new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setLayout(new GridLayout(5,2,5,5));
        f.add(new JButton("1"));
        f.add(new JButton("2"));
        f.add(new JButton("3"));
        f.add(new JButton("4"));
        f.add(new JButton("5"));
        f.add(new JButton("6"));
        f.add(new JButton("7"));
        f.add(new JButton("8"));
        f.add(new JButton("9"));
        f.add(new JButton("10"));

        f.setVisible(true);
    }
}













