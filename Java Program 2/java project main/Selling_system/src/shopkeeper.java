import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
public class shopkeeper implements ActionListener,MenuListener{
    ArrayList arr2;
    JFrame jfm;
    JPanel jp1,jp2,jp3;
    JLabel jl1;
    JTextField jtf1;
    JButton b1,b2,b3;
    ImageIcon img;
    JMenuBar mb;
    JMenu m,m2;
    shopkeeper(ArrayList arr)
    {
        arr2=arr;
        jfm=new JFrame("Selling System");
        jfm.setSize(500,500);
        jfm.setResizable(false);
        jfm.setLocationRelativeTo(null);
        jfm.setDefaultCloseOperation(jfm.EXIT_ON_CLOSE);
        jfm.setLayout(new GridLayout(3,1));
        
        mb=new JMenuBar();
        m=new JMenu("Home");
        m2=new JMenu("Exit");
        m2.addMenuListener(this);
        m.addMenuListener(this);
        mb.add(m);
        mb.add(m2);
        jfm.setJMenuBar(mb);
        
        jp1=new JPanel();
        b1=new JButton("Add Product");
        b1.addActionListener(this);
        jp1.add(b1);
        jfm.add(jp1);
        jp1=new JPanel();
        b2=new JButton("Delete Product");
        b2.addActionListener(this);
        jp1.add(b2);
        jfm.add(jp1);
        jp1=new JPanel();
        b3=new JButton("Edit Product");
        b3.addActionListener(this);
        jp1.add(b3);
        jfm.add(jp1);
        
        jfm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            jfm.setVisible(false);
            Add ob=new Add(arr2);
        }
        if(e.getSource()==b2){
            jfm.setVisible(false);
            Delete ob=new Delete(arr2);
        }
        if(e.getSource()==b3){
            jfm.setVisible(false);
            Edt_Product ob=new Edt_Product(arr2);
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
