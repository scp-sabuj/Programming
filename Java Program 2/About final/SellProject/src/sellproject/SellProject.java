package sellproject;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SellProject extends JFrame{
    JButton button1,button2;
    JLabel label1; 
   
    
    public SellProject(){
        setLayout(new FlowLayout(1));
        label1 = new JLabel("S & R Departmatel Store");
        add(label1,BorderLayout.NORTH);
        
                
        button1 = new JButton("SHOPKEEPER");
        add(button1,BorderLayout.WEST);
        button1.setSize(10, WIDTH);
        button2 = new JButton("CUSTOMER");
        add(button2,BorderLayout.EAST);
        
    }

    public static void main(String[] args) {
        
        SellProject obj1 = new SellProject();
        
        obj1.setVisible(true);
        obj1.setTitle("This is mai page...");
        obj1.setSize(500,300);
        obj1.setLocation(300,300);
        obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}