package addimgjframe;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AddImgJFrame extends JFrame{
    
    private ImageIcon image1,image2;
    private JLabel label1,label2;
    
    public AddImgJFrame(){
        setLayout(new GridLayout(0,2));
        
        image1=(new ImageIcon(getClass().getResource("sabuj1.jpg")));
        
        label1=new JLabel(image1);
        add(label1);
        
        image2=(new ImageIcon(getClass().getResource("sabuj2.jpg")));
        
        label2=new JLabel(image2);
        add(label2);
    }
    

    public static void main(String[] args) {
        
        AddImgJFrame obj = new AddImgJFrame();
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.pack();
        obj.setVisible(true);
        obj.setTitle("This is wonderfull Layout");
    }
    
}
