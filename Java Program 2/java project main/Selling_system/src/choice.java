
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class choice implements ActionListener, MenuListener {

    JFrame jfm;
    JPanel jp1, jp2, jp3;
    JLabel jl1, jl2;
    JTextField jtf1;
    JButton b1, b2;
    ImageIcon img;
    ArrayList arr2;
    JMenuBar mb;
    JMenu m, m2;
    double amou;

    choice(double amount, ArrayList arr) {
        arr2 = arr;
        amou = amount;

        jfm = new JFrame("Selling System");
        jfm.setSize(500, 500);
        jfm.setResizable(false);
        jfm.setLocationRelativeTo(null);
        jfm.setDefaultCloseOperation(jfm.EXIT_ON_CLOSE);
        jfm.setLayout(new FlowLayout());
        jp1 = new JPanel();
        mb = new JMenuBar();
        m = new JMenu("Home");
        m2 = new JMenu("Exit");
        m2.addMenuListener(this);
        m.addMenuListener(this);
        mb.add(m);
        mb.add(m2);
        jfm.setJMenuBar(mb);
        
        b1 = new JButton("Enter");
        
        b1.addActionListener(this);

        jtf1 = new JTextField();

        jp1.setLayout(new GridLayout(1, 5));

        jl1 = new JLabel(" ");
        jp1.add(jl1);

        jp1.add(jtf1);

        jl1 = new JLabel(" ");
        jp1.add(jl1);

        jp1.add(b1);

        jl1 = new JLabel(" ");
        jp1.add(jl1);

        jfm.add(jp1);
        if (arr.size() == 0) {
            jl2 = new JLabel("<html><h1 style=\"margin-left:130px;padding-right:200px;color:red;\">\"Your current amount: " + amou + "/= \"</h1></html>");
            jfm.add(jl2);
            jl1 = new JLabel("<html><h1 style=\"margin-left:80px;padding-right:200px;color:red;\">\"No product available.\"</h1></html>");
            jfm.add(jl1);
        } else {
            jl2 = new JLabel("<html><h1 style=\"margin-left:130px;padding-right:200px;color:red;\">\"Your current amount: " + amou + "/= \"</h1></html>");
            jfm.add(jl2);
            int ind = 0;
            for (int i = 0; i < arr.size(); i += 2) {
                String str = (String) arr.get(i);
                String str2 = (String) arr.get(i + 1);
                jl1 = new JLabel();
                jl1.setText((++ind) + ") " + str + ".  Price: " + str2 + "/=   \n");
                jfm.add(jl1);
            }
        }
        jfm.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int index=0;
        String str=jtf1.getText().trim();
        try {
            index=Integer.parseInt(str);
        } catch (Exception ea) {
               //System.out.println("ERROR");
            JOptionPane.showMessageDialog(jfm, "ERROR!!! IN YOUR INDEX NUMBER", "Notification", JOptionPane.INFORMATION_MESSAGE);
        }
        if((arr2.size()>=(index*2-1))&&(index>=1)){
            jfm.setVisible(false);
            Calcu ob=new Calcu(arr2, amou, index);
            
        }else{
            JOptionPane.showMessageDialog(jfm, "ERROR!!! IN YOUR INDEX NUMBER", "Notification", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void menuSelected(MenuEvent e) {
        if (e.getSource() == m) {
            jfm.setVisible(false);
            home ob = new home(arr2);
        }
        if (e.getSource() == m2) {
            System.exit(0);
        }
    }

    public void menuDeselected(MenuEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void menuCanceled(MenuEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
