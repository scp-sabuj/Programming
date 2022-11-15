import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
public class Delete implements ActionListener,MenuListener{
    private JFrame jfm;
    ArrayList arr2;
    JPanel jp1,jp2,jp3;
    JLabel jl1,jl2;
    JTextField jtf1,jtf2;
    JButton b1,b2,b3;
    ImageIcon img;
    JMenuBar mb;
    JMenu m,m2,m1;
    public Delete(ArrayList arr){
        arr2=arr;
        
        
        jfm=new JFrame("Selling System");
        jfm.setSize(500,500);
        jfm.setResizable(false);
        jfm.setLocationRelativeTo(null);
        jfm.setDefaultCloseOperation(jfm.EXIT_ON_CLOSE);
        jfm.setLayout(new GridLayout(arr2.size()+4,1));
        
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
        
        b1 = new JButton("Enter");        
        b1.addActionListener(this);
        
        
        jtf1=new JTextField("");
        
        
        if (arr2.size() == 0) {
            jl2 = new JLabel("<html><h1>Nathing Product:</h1></html>");
            jfm.add(jl2);
            
        } else {
            
            int ind = 0;
            for (int i = 0; i < arr.size(); i += 2) {
                String str = (String) arr.get(i);
                String str2 = (String) arr.get(i + 1);
                jl1 = new JLabel();
                jl1.setText((++ind) + ") " + str + ".  Price: " + str2 + "/=   \n");
                jfm.add(jl1);
            }
        
        jl1=new JLabel("Enter Deleting Product Serial Number:");
        jfm.add(jl1);
        jfm.add(jtf1);
        jfm.add(b1);}
        
        jfm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str=jtf1.getText();
        int temp;
        try{
            temp=Integer.parseInt(str);
            temp=(temp-1)*2;
            if(temp<arr2.size()){
            arr2.remove(temp+1);
            arr2.remove(temp);
            JOptionPane.showMessageDialog(jfm, " Deleted This Product ", "Notification", JOptionPane.INFORMATION_MESSAGE);
            jfm.setVisible(false);
            Delete ob=new Delete(arr2);}
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
