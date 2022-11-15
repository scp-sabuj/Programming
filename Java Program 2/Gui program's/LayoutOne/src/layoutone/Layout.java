package layoutone;

 
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Layout extends JFrame {
    
    JButton button1,button2,button3;
    JLabel label1,label2,label3;
    
    public Layout(){
        
        setLayout(new GridLayout(2,3));
        
        button1 = new JButton("Button1");
        add(button1);
        label1 = new JLabel("Label1");
        add(label1);
        
        button2 = new JButton("Button2");
        add(button2);
        label2 = new JLabel("Label2");
        add(label2);
        
        button3 = new JButton("Button3");
        add(button3);
        label3 = new JLabel("Label3");
        add(label3);
        
    }

    

    public static void main(String[] args) {
        
        Layout lay = new Layout();
        lay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lay.setSize(400,400);
        lay.setVisible(true);
        lay.setTitle("This is wonderfull Layout");
        
    }
    
}
