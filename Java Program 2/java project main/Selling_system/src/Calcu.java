
import java.util.ArrayList;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
public class Calcu implements ActionListener,MenuListener{
    JFrame jfm;
    JPanel jp1,jp2,jp3;
    JLabel jl1;
    JTextField jtf1;
    JButton b;
    ImageIcon img;
    JMenuBar mb;
    JMenu m,m2,m3;
    ArrayList arr2;
    double amou;
    int index;
    double meg;
    
    public Calcu(ArrayList arr,double am,int ind){
        arr2=arr;
        amou=am;
        index=ind;
        jfm = new JFrame("Calculation");
        jfm.setSize(500, 500);
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
        jp2=new JPanel();
        
        jl1=new JLabel();
        
        jp1.add(jl1);
        jfm.add(jp1);
        jp2.setLayout(new GridLayout(3,1));
        jl1=new JLabel("Enter The Measurement of per Unit : ");
        jp2.add(jl1);
        jp3=new JPanel();
        jp3.setLayout(new GridLayout(1,5));
        jl1=new JLabel(" ");
        jp3.add(jl1);
        jtf1=new JTextField();
        jtf1.setColumns(25);
        jp3.add(jtf1);
        jl1=new JLabel(" ");
        jp3.add(jl1);
        b=new JButton("Enter");
        b.addActionListener(this);
        jp3.add(b);
        jl1=new JLabel(" ");
        jp3.add(jl1);
        jp2.add(jp3);
        jl1=new JLabel(" ");
        jp2.add(jl1);
        jfm.add(jp2);
        
        jfm.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str=jtf1.getText();
        try{
            
            meg=Double.parseDouble(str);
        }catch(Exception ea){
            JOptionPane.showMessageDialog(jfm, "Please enter valid amount!!!", "Notification", JOptionPane.INFORMATION_MESSAGE);
        }
        jfm.setVisible(false);
        Am_calcu ob=new Am_calcu(arr2, amou, index,meg);
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
