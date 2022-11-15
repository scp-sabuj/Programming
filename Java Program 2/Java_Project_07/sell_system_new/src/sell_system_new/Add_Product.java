package sell_system_new;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Add_Product implements  ActionListener ,MenuListener{
 
    private JFrame jfm;
    ArrayList arr2;
    JPanel jp1,jp2,jp3,jp4;
    JLabel jl1;
    JTextField jtf1,jtf2,jtf3;
    JButton b1,b2,b3;
    ImageIcon img;
    JMenuBar mb;
    JMenu m,m2,m1;
    public Add_Product(ArrayList arr){
        arr2=arr;
        jfm=new JFrame("Selling System");
        jfm.setSize(500,500);
        jfm.setResizable(false);
        jfm.setLocationRelativeTo(null);
        jfm.setDefaultCloseOperation(jfm.EXIT_ON_CLOSE);
        jfm.setLayout(new GridLayout(4,1));
        
        jp1=new JPanel();
        jp1.setBackground(Color.GREEN);
        jp1.setLayout(new GridLayout(1,2));
        jp2=new JPanel();
        jp2.setBackground(Color.BLUE);
        jp2.setLayout(new GridLayout(1,2));
        jp3=new JPanel();
        jp4=new JPanel(new GridLayout(1,2));
        jp3.setBackground(Color.LIGHT_GRAY);
        jp3.setLayout(new GridLayout(1,2));
        
        mb=new JMenuBar();
        m=new JMenu("Home");
        m2=new JMenu("Exit");
        m1=new JMenu("Shopkeeper");
        m1.addMenuListener(this);
        m2.addMenuListener(this);
        m.addMenuListener(this);
        mb.add(m);
        mb.add(m1);
        mb.add(m2);
        jfm.setJMenuBar(mb);
        
        jl1=new JLabel("<html><h1>Enter Product Name: </h1></html>");
        jp1.add(jl1);
        jtf1=new JTextField("");
        jp1.add(jtf1);
        jl1=new JLabel("<html><h1>Enter Product price: </h1></html>");
        jp2.add(jl1);
        jtf2=new JTextField("");
        jp2.add(jtf2);
        jl1=new JLabel("");
        jp3.add(jl1);
        jl1=new JLabel("<html><h1>Enter unit: </h1></html>");
        jp4.add(jl1);
        jtf3=new JTextField("");
        jp4.add(jtf3);
        
        b1=new JButton("Add");
        b1.addActionListener(this);
        jp3.add(b1);
        
        jfm.add(jp1);
        jfm.add(jp2);
        jfm.add(jp4);
        jfm.add(jp3);
        
        jfm.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str1,str2,str3;
        int temp;
        str1=jtf1.getText();
        str2=jtf2.getText();
        str3=jtf3.getText();
        //System.out.println(str1+str2);
//        jtf1=new JTextField("");
//        jtf2=new JTextField("");
        
        try{
            temp=Integer.parseInt(str2);
            arr2.add(str1);
            arr2.add(str2);
            arr2.add(str3);
            
           // System.out.println("Yess");
            JOptionPane.showMessageDialog(jfm, " Added Product ", "Notification", JOptionPane.INFORMATION_MESSAGE);
             jfm.setVisible(false);
            Add_Product ob=new Add_Product(arr2);
        }catch(Exception ea){
           
           JOptionPane.showMessageDialog(jfm, "ERROR!!!", "Notification", JOptionPane.INFORMATION_MESSAGE);
            jfm.setVisible(false);
            Add_Product ob=new Add_Product(arr2);
           
        }
        

    }

    @Override
    public void menuSelected(MenuEvent e) {
        if(e.getSource()==m)
        {
            jfm.setVisible(false);
            home ob=new home(arr2);
        }
        if(e.getSource()==m2)
        {
            System.exit(0);
        }
        if(e.getSource()==m1){
            jfm.setVisible(false);
            shopkeeper ob=new shopkeeper(arr2);
        }
    }

    @Override
    public void menuDeselected(MenuEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void menuCanceled(MenuEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    

