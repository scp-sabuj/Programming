package sell_system_new;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import static sell_system_new.home.arr2;

public class customer implements ActionListener, MenuListener {

    JFrame jfm;
    JPanel jp1, jp2, jp3;
    JLabel jl1, jl2;
    JTextField jtf1,jtf2;
    JButton b1, b2;
    ImageIcon img;
    JTable t1;
    float intutal=0;
    Object obj1[][]=new Object[100][100];
    String str3[][]=new String[100][100];
    ArrayList arr2;
    ArrayList memo=new ArrayList();
    
    JMenuBar mb;
    JMenu m, m2;
    double amou;
    private String[][] obj;

    customer(ArrayList arr,ArrayList Memo,float t) {
        arr2 = arr;

        intutal =t;
        memo=Memo;
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
        
        b1 = new JButton("OK");
        b1.addActionListener(this);
        b2=new JButton("FINISH");
        b2.addActionListener(this);

        jtf1 = new JTextField();
        jp1.setLayout(new GridLayout(3,6));

        jl1 = new JLabel(" ");
        jp1.add(jl1);
        
        jl1 = new JLabel("Enter Sereal NO:");
        jp1.add(jl1);
        jp1.add(jtf1);
        jl1 = new JLabel(" ");
        jp1.add(jl1);
        
        jp1.add(b2);
        jl1 = new JLabel(" ");
        jp1.add(jl1);
        jl1 = new JLabel(" ");
        jp1.add(jl1);
        
        jl1 = new JLabel("And Meassurment : ");
        jp1.add(jl1);

        jtf2=new JTextField();
        
        jp1.add(jtf2);
        
        jl1 = new JLabel(" ");
        jp1.add(jl1);
        
        jp1.add(b1);

        jl1 = new JLabel(" ");
        jp1.add(jl1);
        jl1 = new JLabel(" ");
        jp1.add(jl1);
        jl1 = new JLabel(" ");
        jp1.add(jl1);
        jl1 = new JLabel(" ");
        jp1.add(jl1);
        jl1 = new JLabel(" ");
        jp1.add(jl1);

        jfm.add(jp1);
        if (arr2.size() == 0) {
//            jl2 = new JLabel("<html><h1 style=\"margin-left:130px;padding-right:200px;color:red;\">\"Your current amount: " + amou + "/= \"</h1></html>");
//            jfm.add(jl2);
            jl1 = new JLabel("<html><h1 style=\"margin-left:80px;padding-right:200px;color:red;\">\"No product available.\"</h1></html>");
            jfm.add(jl1);
        } else {
//            jl2 = new JLabel("<html><h1 style=\"margin-left:130px;padding-right:200px;color:red;\">\"Your current amount: " + amou + "/= \"</h1></html>");
//            jfm.add(jl2);
            int ind = 0;
            for (int i = 0; i < arr2.size(); i += 3,ind++) {
                String str = (String) arr2.get(i);
                String str2 = (String) arr2.get(i + 1);
                String str4 = (String) arr2.get(i + 2);
              //  jl1 = new JLabel();
                //jl1.setText((++ind) + ") " + str + ".  Price: " + str2 + "/=   \n");
                //jfm.add(jl1);
                
//                str3[ind][1]=str;
//                str3[ind][2]=str2;
                str3[ind][0]=""+(1+ind);
                //str3[ind][0]=Integer.toString(ind+1);
                str3[ind][1]=str;
                str3[ind][2]=str2;
                str3[ind][3]=str4;
                
            }
            String[] collam={"NO","name","price","Unit"};
            
            t1=new JTable(str3,collam);
            t1.setPreferredScrollableViewportSize(new Dimension(400,500));
            t1.setFillsViewportHeight(true);
            JScrollPane scrol=new JScrollPane(t1);
            jfm.add(scrol);
        }
        jfm.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
        int index=0;
        float meg=0;
        String str=jtf1.getText().trim();
        String str1=jtf2.getText().trim();
        try {
            index=Integer.parseInt(str);
            meg=Float.parseFloat(str1);
          //  System.out.println(index+"   "+meg);
        } catch (Exception ea) {
            JOptionPane.showMessageDialog(jfm, "ERROR!!! IN YOUR INDEX NUMBER", "Notification", JOptionPane.INFORMATION_MESSAGE);
        }
        if((arr2.size()>=(index*3-1))&&(index>=1)){
           // jfm.setVisible(false);
       //     Calcu ob=new Calcu(arr2, amou, index);
          //  memo.add("gh");
             int temp=(index-1)*3;
             //System.out.println(temp);
             float total=0;
             String s1,s2,s3,s4;
             s1=(String) arr2.get(temp);
             s4=(String) arr2.get(temp+1);
             float t1=Float.parseFloat(s4);
//             s3=(String) arr2.get(temp+2);
//             s4=(String) arr2.get(temp+3);
             
            // memo.add(s1);
           // System.out.println(s1);
            s2=""+meg;
            total= (meg*t1);
            s3=""+total;
            intutal+=total;
            memo.add(s1);
            memo.add(s2);
            memo.add(s3);
           // memo.add(""+s1+"meger "+s2+"  totel  "+s3);
            
          JOptionPane.showMessageDialog(jfm, "BUY SUCXSESFULL", "Notification", JOptionPane.INFORMATION_MESSAGE);
        
        jfm.setVisible(false);
        customer oa=new customer(arr2,memo,intutal);
        }else{
            JOptionPane.showMessageDialog(jfm, "ERROR!!! IN YOUR INDEX NUMBER", "Notification", JOptionPane.INFORMATION_MESSAGE);
        }
    }
        if(e.getSource()==b2)
        {
            int i;
            System.out.println("size "+memo.size());
            jfm.setVisible(false);
            MEMO obj=new MEMO(memo,intutal);
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


