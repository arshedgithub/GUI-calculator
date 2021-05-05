import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Calculator extends JFrame{
        
    Calculator(){
        
        setTitle("Calculator");
            setLocation(100,250);
            setSize(500,300);
            
            Container container = getContentPane(); 
            
            FlowLayout layout = new FlowLayout();
            container.setLayout(layout);
            
            JTextField txtName = new JTextField(20);
            JButton btnShow = new JButton("Show");
            JLabel lblDisplay = new JLabel("Type and Click");
            
            container.add(txtName);
            container.add(btnShow);
            container.add(lblDisplay);

        }    

}