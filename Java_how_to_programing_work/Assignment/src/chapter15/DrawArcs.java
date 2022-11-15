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
public class DrawArcs {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Drawing Arcs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ArcsJPanel arcsJPanel = new ArcsJPanel(); // create ArcsJPanel
        frame.add(arcsJPanel); // add arcsJPanel to frame
        frame.setSize(300, 210); // set frame size
        frame.setVisible(true); // display frame
    }
}
class ArcsJPanel extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.setColor(Color.RED);
        g.drawRect(15, 35, 80, 80);
        g.setColor(Color.BLACK);
        g.drawArc(15, 35, 80, 80, 0, 360);

        g.setColor(Color.RED);
        g.drawRect(100, 35, 80, 80);
        g.setColor(Color.BLACK);
        g.drawArc(100, 35, 80, 80, 0, 110);

        g.setColor(Color.RED);
        g.drawRect(185, 35, 80, 80);
        g.setColor(Color.BLACK);
        g.drawArc(185, 35, 80, 80, 0, -270);

        g.fillArc(15, 120, 80, 40, 0, 360);
        g.fillArc(100, 120, 80, 40, 270, -90);
        g.fillArc(185, 120, 80, 40, 0, -270);

    }

}