package indialogbox;

import javax.swing.JOptionPane;

public class InDialogBox {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        
        String s1 = String.format("Welcome, "+name+", to Java Programming." );
        JOptionPane.showMessageDialog(null,s1);
    }
    
}
