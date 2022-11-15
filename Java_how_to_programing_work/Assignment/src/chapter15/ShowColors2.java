/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter15;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author REZAUL KARIM
 */
public class ShowColors2 {

    public static void main(String[] args) {

        ShowColors2JFrame application = new ShowColors2JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(400, 130);
        application.setVisible(true);
    }

}

class ShowColors2JFrame extends JFrame implements ActionListener {

    private JButton changeColorButton;
    private Color color = Color.LIGHT_GRAY;
    private JPanel colorJPanel;

    public ShowColors2JFrame() {

        setTitle("Using JColorChooser");

        colorJPanel = new JPanel();
        colorJPanel.setBackground(color);

        changeColorButton = new JButton("Change Color");
        changeColorButton.add(colorJPanel);
        changeColorButton.addActionListener(this);
        add(colorJPanel, BorderLayout.CENTER);
        add(changeColorButton, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        color = JColorChooser.showDialog(ShowColors2JFrame.this, "Choose a Cololr", color);
        
        if (color == null) {
            color = Color.LIGHT_GRAY;
            colorJPanel.setBackground(color);
        } else {

            color = color;
            colorJPanel.setBackground(color);

        }

    }

}
