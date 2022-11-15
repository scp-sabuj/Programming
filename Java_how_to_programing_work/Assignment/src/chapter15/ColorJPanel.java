/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter15;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author REZAUL KARIM
 */

public class ColorJPanel extends JPanel {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Using colors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ColorJPanel colorJPanel = new ColorJPanel();
        frame.add(colorJPanel);
        frame.setSize(400, 180);
        frame.setVisible(true);
    }


        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            this.setBackground(Color.WHITE);


            g.setColor(new Color(255, 0, 0));
            g.fillRect(15, 25, 100, 20);
            g.drawString("Current RGB: " + g.getColor(), 130, 40);


            g.setColor(new Color(0.50f, 0.75f, 0.0f));
            g.fillRect(15, 50, 100, 20);
            g.drawString("Current RGB: " + g.getColor(), 130, 65);


            g.setColor(Color.BLUE);
            g.fillRect(15, 75, 100, 20);
            g.drawString("Current RGB: " + g.getColor(), 130, 90);

            Color color = Color.MAGENTA;
            g.setColor(color);
            g.fillRect(15, 100, 100, 20);
            g.drawString("RGB values: " + color.getRed() + ", "
                    + color.getGreen() + ", " + color.getBlue(), 130, 115);
        }
    } 
