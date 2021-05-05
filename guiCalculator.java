import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class guiCalculator{
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();

        frame.setTitle("Calculator");
        frame.setLocation(100,250);
        frame.setSize(500,300);

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        Container container = frame.getContentPane(); 

        frame.setVisible(true);

    }
}