package mousemover;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MouseMover extends JFrame {
     
    JLabel label1,label2,label3,errorlabel;
    JTextField tf1,tf2,tf3;
    JButton button;
    
    public MouseMover(){
        setLayout(new GridLayout(5,2,3,3));
        
        label1 =new JLabel("Enter number of movements:");
        add(label1);
        tf1 = new JTextField();
        add(tf1);
        
        label2 =new JLabel("Enter number of movements:");
        add(label2);
        tf2 = new JTextField();
        add(tf2);
        
        label3 =new JLabel("Enter number of movements:");
        add(label3);
        tf3 = new JTextField();
        add(tf3);
        
        button =new JButton("Start");
        add(button);
        
        errorlabel = new JLabel();
        add(errorlabel);
        
    }

    public static void main(String[] args) {
        
    }
    
}
