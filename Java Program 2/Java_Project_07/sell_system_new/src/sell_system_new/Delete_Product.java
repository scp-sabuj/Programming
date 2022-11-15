package sell_system_new;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Delete_Product implements ActionListener, MenuListener {

    private JFrame jfm;
    ArrayList arr2;
    JPanel jp1, jp2, jp3;
    JLabel jl1, jl2;
    JTextField jtf1, jtf2;
    JButton b1, b2, b3;
    ImageIcon img;
    JMenuBar mb;
    JMenu m, m2, m1;
    JTable jt1;
    String str3[][] = new String[100][100];
    private JTable t1;

    public Delete_Product(ArrayList arr) {
        arr2 = arr;

        jfm = new JFrame("Selling System");
        jfm.setSize(500, 500);
        jfm.setResizable(false);
        jfm.setLocationRelativeTo(null);
        jfm.setDefaultCloseOperation(jfm.EXIT_ON_CLOSE);
        jfm.setLayout(new FlowLayout());

        mb = new JMenuBar();
        m = new JMenu("Home");
        m2 = new JMenu("Exit");
        m1 = new JMenu("Shopkeeper");
        m1.addMenuListener(this);
        m2.addMenuListener(this);
        m.addMenuListener(this);
        mb.add(m);
        mb.add(m1);
        mb.add(m2);
        jfm.setJMenuBar(mb);

        b1 = new JButton("Enter");
        b1.setBackground(Color.red);
        b1.addActionListener(this);

        jp1 = new JPanel();
        jp1.setBackground(Color.YELLOW);
        jp1.setLayout(new GridLayout(arr2.size() + 4, 4));
        jtf1 = new JTextField("");

//        
//        if (arr2.size() == 0) {
//            jl2 = new JLabel("<html><h1>Nathing Product:</h1></html>");
//            jp1.add(jl2);
//            
//        } else {
//            
//            int ind = 0;
////            for (int i = 0; i < arr.size(); i += 2,ind++) {
////                String str = (String) arr.get(i);
////          
////                 //    String str2 = (String) arr.get((i + 1));
////               // String str4=(String) arr.get((i+2));
////////                jl1 = new JLabel();
////////                jl1.setText((++ind) + ") " + str + ".  Price: " + str2 + "/=   \n");
////////                jp1.add(jl1);
////               // str3[ind][0]=""+ind;
////                str3[ind][0]=Integer.toString(ind+1);
////                str3[ind][1]=str;
//////                str3[ind][2]=str2;
//////                str3[ind][3]=str4;
////            }
        if (arr2.size() == 0) {
//            jl2 = new JLabel("<html><h1 style=\"margin-left:130px;padding-right:200px;color:red;\">\"Your current amount: " + amou + "/= \"</h1></html>");
//            jfm.add(jl2);
            jl1 = new JLabel("<html><h1 style=\"margin-left:80px;padding-right:200px;color:red;\">\"No product available.\"</h1></html>");
            jfm.add(jl1);
        } else {
//            jl2 = new JLabel("<html><h1 style=\"margin-left:130px;padding-right:200px;color:red;\">\"Your current amount: " + amou + "/= \"</h1></html>");
//            jfm.add(jl2);
            int ind = 0;
            for (int i = 0; i < arr2.size(); i += 3, ind++) {
                String str = (String) arr2.get(i);
                String str2 = (String) arr2.get(i + 1);
                String str4 = (String) arr2.get(i + 2);
              //  jl1 = new JLabel();
                //jl1.setText((++ind) + ") " + str + ".  Price: " + str2 + "/=   \n");
                //jfm.add(jl1);

//                str3[ind][1]=str;
//                str3[ind][2]=str2;
                str3[ind][0] = "" + (1 + ind);
                //str3[ind][0]=Integer.toString(ind+1);
                str3[ind][1] = str;
                str3[ind][2] = str2;
                str3[ind][3] = str4;

            }
            String[] collam = {"NO", "name", "price", "Unit"};

            t1 = new JTable(str3, collam);
            t1.setPreferredScrollableViewportSize(new Dimension(400, 320));
            t1.setFillsViewportHeight(true);
            JScrollPane scrol = new JScrollPane(t1);
            jfm.add(scrol);
            jl1 = new JLabel("Enter Deleting Product Serial Number:");
            jp1.add(jl1);
            jp1.add(jtf1);
            jp1.add(b1);
        }
        jfm.add(jp1);
        jfm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = jtf1.getText();
        int temp;
        try {
            temp = Integer.parseInt(str);
            temp = (temp - 1) * 3;
            if (temp < arr2.size()) {
                arr2.remove(temp + 2);
                arr2.remove(temp + 1);
                arr2.remove(temp);
                JOptionPane.showMessageDialog(jfm, " Deleted This Product ", "Notification", JOptionPane.INFORMATION_MESSAGE);
                jfm.setVisible(false);
                Delete_Product ob = new Delete_Product(arr2);
            } else {
                JOptionPane.showMessageDialog(jfm, "ERROR!!!", "Notification", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception ea) {
            JOptionPane.showMessageDialog(jfm, "ERROR!!!", "Notification", JOptionPane.INFORMATION_MESSAGE);

        }

    }

    @Override
    public void menuSelected(MenuEvent e) {
        if (e.getSource() == m) {
            jfm.setVisible(false);
            home ob = new home(arr2);
        }
        if (e.getSource() == m2) {
            System.exit(0);
        }
        if (e.getSource() == m1) {
            jfm.setVisible(false);
            shopkeeper ob = new shopkeeper(arr2);
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
