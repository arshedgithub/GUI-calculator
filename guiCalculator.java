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
        
        Container container = frame.getContentPane(); 
        
        FlowLayout layout = new FlowLayout();
        container.setLayout(layout);
        
        JTextField txtName = new JTextField(20);
        JButton btnShow = new JButton("Show");
        JLabel lblDisplay = new JLabel("Type and Click");
        
        container.add(txtName);
        container.add(btnShow);
        container.add(lblDisplay);
        
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}