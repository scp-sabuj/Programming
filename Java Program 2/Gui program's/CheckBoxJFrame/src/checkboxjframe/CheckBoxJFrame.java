package checkboxjframe;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxJFrame extends JFrame{
    
    JCheckBox cb1,cb2;
    JLabel label1,label2;
    
    public CheckBoxJFrame(){
        
        setLayout(new GridLayout(2,2));
        
        label1=new JLabel("");
        add(label1);
        label1=new JLabel("");
        add(label1);
        
        cb1= new JCheckBox("This is First chechbox.....");
        add(cb1);
        cb2= new JCheckBox("This is Second chechbox.....");
        add(cb2);
        
        event e = new event();
        cb1.addItemListener(e);
        cb1.addItemListener(e);
        
                
        
    }
    
    class event implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getSource()==cb1){
                cb2.
            }
        }
        
    }
    

    public static void main(String[] args) {
        
        CheckBoxJFrame obj = new CheckBoxJFrame();
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setSize(800,300);
        obj.setVisible(true);
        obj.setTitle("This is wonderfull Layout");
    }
    
}
