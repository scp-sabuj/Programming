/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class GuiProject extends JFrame{

    JLabel label;
    JTextField text;
    JButton btn;
    //Panel panel
    
    public GuiProject()
    {
        super();
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout( new FlowLayout() );
        label = new JLabel();
        label.setText("Name");
        add(label);
        text = new JTextField(10);
        text.setText("");
        add(text);
        
        btn = new JButton();
        btn.setText("OK");
        add(btn);
        
        btn.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Your Name: "+text.getText(), "my title", JOptionPane.INFORMATION_MESSAGE);
            }
          
            
        });
        
    }
    
}

public class MyFrame {

    public static void main(String[] args) {
        GuiProject obj = new GuiProject();
        obj.setVisible(true);
    }
    
}
