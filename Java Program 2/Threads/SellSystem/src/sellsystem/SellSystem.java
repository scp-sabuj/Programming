/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sellsystem;

import static java.awt.BorderLayout.CENTER;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class SellSystem extends JFrame{
    
    private JLabel label1;
    private JButton button1,button2;
    
    public SellSystem(){
        
        button1 = new JButton("coustomer");
        add(button1);
        
    }
    
    
    
    public static void main(String[] args) {
        
        SellSystem obj1 = new SellSystem();
        obj1.setVisible(true);
        obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj1.setSize(200, 150);
        obj1.setTitle("This is main page....");
    }
    
}
