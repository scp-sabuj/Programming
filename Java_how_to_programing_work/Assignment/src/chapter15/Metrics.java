/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter15;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author REZAUL KARIM
 */
public class Metrics {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Demonstrating FontMetrics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MetricsJPanel metricsJPanel = new MetricsJPanel();
        frame.add(metricsJPanel); // add metricsJPanel to frame
        frame.setSize(510, 240); // set frame size
        frame.setVisible(true); // display frame
    }

}
class MetricsJPanel extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setFont(new Font("SansSerif", Font.BOLD, 12));
        FontMetrics metrics = g.getFontMetrics();

        g.drawString("Current font: " + g.getFont(), 10, 30);
        g.drawString("Ascent: " + metrics.getAscent(), 10, 45);
        g.drawString("Descent: " + metrics.getDescent(), 10, 60);
        g.drawString("Height: " + metrics.getHeight(), 10, 75);
        g.drawString("Leading: " + metrics.getLeading(), 10, 90);

        Font font = new Font("Serif", Font.ITALIC, 14);
        metrics = g.getFontMetrics(font);
        g.setFont(font);
        g.drawString("Current font: " + font, 10, 120);

        g.drawString("Current font: " + g.getFont(), 10, 120);
        g.drawString("Ascent: " + metrics.getAscent(), 10, 135);
        g.drawString("Descent: " + metrics.getDescent(), 10, 150);
        g.drawString("Height: " + metrics.getHeight(), 10, 165);
        g.drawString("Leading: " + metrics.getLeading(), 10, 180);
    }

}
