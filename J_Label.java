package Java_Swing;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.Border;

public class J_Label {
    public static void main(String[] args){
        
        Border border = BorderFactory.createLineBorder(Color.yellow, 3);// Create a border with yellow color and thickness of 3
        ImageIcon image = new ImageIcon("D:\\learning_java\\Java_Swing\\A Normal Day_.. _ Monster Girls X Male Reader - 8.jpg");// Load an image from the specified path
        JLabel label = new JLabel();// Create a new JLabel
    
        label.setIcon(image);// Set the icon of the label to the loaded image
        label.setText("welcome to my code"); // Set the text of the label
        label.setHorizontalTextPosition(JLabel.CENTER);// Set the horizontal position of the text relative to the icon
        label.setVerticalTextPosition(JLabel.TOP);// Set the vertical position of the text relative to the icon
        label.setForeground(Color.RED);// Set the text color to red
        label.setFont(new Font("MV Boli", Font.PLAIN, 30));// Set the font of the text
        label.setIconTextGap(50);// Set the gap between the text and the icon
        label.setBackground(Color.gray);// Set the background color of the label
        label.setOpaque(true);// Make the background color visible
        label.setBorder(border);// Set the border of the label
        label.setVerticalAlignment(JLabel.CENTER);// Set the vertical alignment of the label content
        label.setHorizontalAlignment(JLabel.CENTER);// Set the horizontal alignment of the label content
        label.setBounds(100, 50, 500, 500);// Set the bounds of the label


        JFrame frame = new JFrame();
        frame.setTitle("mairebap11");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        //frame.pack();
        
    }
}
