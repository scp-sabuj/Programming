/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter15;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author REZAUL KARIM
 */
public class Fonts {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Using fonts");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FontJPanel fontJPanel = new FontJPanel();
        frame.add(fontJPanel);
        frame.setSize(420, 150);
        frame.setVisible(true);

    }
}
class FontJPanel extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setFont(new Font("Serif", Font.BOLD, 12));
        g.drawString("Serif 12 point bold.", 20, 30);

        g.setFont(new Font("Monospaced", Font.ITALIC, 24));
        g.drawString("Monospaced 24 point italic.", 20, 50);

        g.setFont(new Font("SansSerif", Font.PLAIN, 14));
        g.drawString("SansSerif 14 point plain.", 20, 70);
        g.setColor(Color.RED);
        g.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 18));
        g.drawString(g.getFont().getName() + " " + g.getFont().getSize()
                + " point bold italic.", 20, 90);
    }

}
