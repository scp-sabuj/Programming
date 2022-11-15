package sell_system_new;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import static sell_system_new.home.arr2;

public class MEMO extends JFrame {

    static ArrayList Memo = new ArrayList();
    private JLabel l1;
    JTable jt1;
    JFrame jfm;
    JPanel jp1, jp2, jp3;
    JLabel jl1, jl2;
    JTextField jtf1;
    JButton b1, b2;
    ImageIcon img;
    
    public String str1[][] = new String[100][100];
    static ArrayList arr, arr2;
    String strm[][] = new String[100][100];
    String Col[] = new String[100];

    float tutal;

    public MEMO(ArrayList memo, float intutal) {
        Memo = memo;
        tutal = intutal;
        jfm = new JFrame("Selling System");
        jfm.setSize(500, 500);
        jfm.setResizable(false);
        jfm.setLocationRelativeTo(null);
        jfm.setDefaultCloseOperation(jfm.EXIT_ON_CLOSE);
        jfm.setLayout(new GridLayout(5+(memo.size()/3),1));

        jp1 = new JPanel();
        jp1.setBackground(Color.BLUE);

        jl1 = new JLabel("");
        //jl1.setText("<html><h1> Mamo</h1></html>");
        jp1.add(jl1);
        jl1 = new JLabel();
        jl1.setText("<html><h1> Mamo</h1></html>");
        jp1.add(jl1);
        jp1.setLayout(new GridLayout());
        int ind = 0;
        jp1.add(jl1);
        jfm.add(jp1);
        jp2=new JPanel(new GridLayout(memo.size()/3,1));
        int index=1;
        for (int i = 0; i < Memo.size(); i += 3) {
            String str = (String) Memo.get(i);
            String str2 = (String) Memo.get(i + 1);
            String str3 = (String) Memo.get(i + 2);
            // String str2 = (String) arr.get(i + 1);
            jl1 = new JLabel();
            //s  jl1.setText(  " " + str + "/=   \n");
              jl1.setText( index+"  "+" " + str + "   "+str2+"    "+str3 +"/=   \n");
              jp2.add(jl1);
//            strm[ind][0] = "" + (1 + ind);
//            strm[ind][1] = str;
//            strm[ind][2] = str2;
//            strm[ind][3] = str3;
//            ind++;
              index++;

        }

        
        Col[0] = "NO";
        Col[1] = "Product";
        Col[2] = "Intutal";
       // jt1 = new JTable();
       
//        jt1.setPreferredScrollableViewportSize(new Dimension(400, 500));
//        jt1.setFillsViewportHeight(true);
//        JScrollPane scrol = new JScrollPane(jt1);
//        jfm.add(scrol);
        jfm.add(jp2);
        jl1 = new JLabel();
        jl1=new JLabel();
        jl1.setText("       Total :" + intutal);
        jfm.add(jl1);
        jfm.setVisible(true);

    }
}
