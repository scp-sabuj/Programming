package firstgui;

import javax.swing.JFrame;

public class FirstGui extends JFrame {

    public static void main(String[] args) {
        FirstGui gui =new FirstGui();
        gui.setVisible(true);
        gui.setSize(200,200);
        gui.setTitle("Created By Sabuj paul..");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
