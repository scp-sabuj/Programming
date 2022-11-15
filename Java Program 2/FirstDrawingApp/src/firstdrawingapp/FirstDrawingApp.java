package firstdrawingapp;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

class DrawPanel extends JPanel{
    
    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        
        g.drawLine(0, 0, width, height);
        g.drawLine(0, width, height, 0);
    }
    
}

public class FirstDrawingApp {

    public static void main(String[] args) {
        
        DrawPanel panel = new DrawPanel();
        
        JFrame application  = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(250,250);
        application.setVisible(true);
        
    }
    
}
