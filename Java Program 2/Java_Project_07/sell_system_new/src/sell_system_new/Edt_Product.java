
package sell_system_new;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import static sell_system_new.home.arr2;
public class Edt_Product implements ActionListener,MenuListener{
    
    private JFrame jfm;
    ArrayList arr2;
    JPanel jp1,jp2,jp3;
    JLabel jl1,jl2;
    JTextField jtf1,jtf2,jtf3,jtf4;
    JButton b1,b2,b3;
    ImageIcon img;
    JMenuBar mb;
    JTable jt1;
    String row[][]=new String[100][100];
    String col[]=new String[100];
    JMenu m,m2,m1;

    public Edt_Product(ArrayList arr) {
        
        arr2=arr;
        
        
        jfm=new JFrame("Selling System");
        jfm.setSize(500,600);
        jfm.setResizable(false);
        jfm.setLocationRelativeTo(null);
        jfm.setDefaultCloseOperation(jfm.EXIT_ON_CLOSE);
        jfm.setLayout(new FlowLayout());
        
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
        
        jp1=new JPanel();
        jp1.setLayout(new GridLayout(5,1));
        jp1.setBackground(Color.GREEN);
        
         b1 = new JButton("Enter");   
         b1.setBackground(Color.yellow);
        b1.addActionListener(this);
        
        
        jtf1=new JTextField("",5);
     //   jtf1.getColumns();
        jtf2=new JTextField("",5);
        jtf3=new JTextField("",5);
        jtf4=new JTextField("",5);
        
        
        if (arr2.size() == 0) {
            jl2 = new JLabel("<html><h1>Nathing Product:</h1></html>");
            jp1.add(jl2);
           // jfm.add(jp1);
            
        } else {
            
            int ind = 0;
            int j=0;
            for (int i = 0; i < arr.size(); j++) {
                String str = (String) arr.get(i);
                i++;
                String str2 = (String) arr.get((i++));
                String str3=(String) arr.get(i++);
                row[j][0]=""+(++ind);
                row[j][1]=str;
                row[j][2]=str2;
                row[j][3]=str3;
//                jl1 = new JLabel();
//                jl1.setText((++ind) + ") " + str + ".  Price: " + str2 + ""+str3+"/=   \n");
//                jp1.add(jl1);
            }
            
            String[] collam={"NO","name","price","Unit"};
        jt1=new JTable(row,collam);
        jt1.setPreferredScrollableViewportSize(new Dimension(400,300));
        jt1.setFillsViewportHeight(true);
         JScrollPane scrol=new JScrollPane(jt1);
         jfm.add(scrol);
         
         
        jl1=new JLabel("Enter Editing Product Serial Number:");
        jp1.add(jl1);
        jp1.add(jtf1);
        jl1=new JLabel("Enter Product Current Name:");
        jp1.add(jl1);
        jp1.add(jtf2);
        jl1=new JLabel("Enter Product Current Price:");
        jp1.add(jl1);
        jp1.add(jtf3);
        jl1=new JLabel("Enter Product Current Unit:");
        jp1.add(jl1);
        jp1.add(jtf4);
        
        jl1=new JLabel("");
        jp1.add(jl1);
        jp1.add(b1);}
        jfm.add(jp1);
        jfm.setVisible(true);
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        int temp1;
        double temp2;
        String str1,str2,str3,str4;
        str1=jtf1.getText();
        str2=jtf2.getText();
        str3=jtf3.getText();
         str4=jtf4.getText();
        
        try{
            temp1=Integer.parseInt(str1);
            temp1=(temp1-1)*3;
            if(arr2.size()>temp1)
            {
                try{
                    temp2=Double.parseDouble(str3);
                    arr2.remove(temp1+2);
                    arr2.remove(temp1+1);
                    
                    arr2.remove(temp1);
                    arr2.add(str2);
                    arr2.add(str3);
                    arr2.add(str4);
                    JOptionPane.showMessageDialog(jfm, " Edting This Product ", "Notification", JOptionPane.INFORMATION_MESSAGE);
                    jfm.setVisible(false);
                    Edt_Product ob=new Edt_Product(arr2);

                    
                }catch(Exception t){
                    JOptionPane.showMessageDialog(jfm, "ERROR!!!", "Notification", JOptionPane.INFORMATION_MESSAGE);

                }
            }
            else
               JOptionPane.showMessageDialog(jfm, "ERROR!!!", "Notification", JOptionPane.INFORMATION_MESSAGE);

        }catch(Exception ea){
            JOptionPane.showMessageDialog(jfm, "ERROR!!!", "Notification", JOptionPane.INFORMATION_MESSAGE);

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
