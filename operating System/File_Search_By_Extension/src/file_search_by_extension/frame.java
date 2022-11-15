package file_search_by_extension;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Masum Khan
 */
public class frame extends javax.swing.JFrame implements ActionListener {

    String path, ext_Or_Name, directory;
    Double file_Size;
      ArrayList<String> dir, fileName, size, date;

    public frame() {
        initComponents();
        setVisible(true);
        setDefaultCloseOperation(1);
        setLocationRelativeTo(null);
        txt_Path.addActionListener(this);
        txt_ext.addActionListener(this);
        btn_search.addActionListener(this);
        btn_Exit.addActionListener(this);
        btn_Rfreash.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == btn_search) {

            if ((path = txt_Path.getText()).length() == 0 || (ext_Or_Name = txt_ext.getText()).length() == 0 || jComboBox1.getSelectedIndex() == -1) {
                method("Required Field Left Empty...........");
            }
            System.out.println(jComboBox1.getSelectedIndex());
            if (jComboBox1.getSelectedIndex() == 0) {
                now_Search_By_Extension();
            }
            if (jComboBox1.getSelectedIndex() == 1) {
                now_Search_By_Name();
            }
        }
        if (ae.getSource() == btn_Exit) {
            System.exit(0);
        }
        if (ae.getSource() == btn_Rfreash) {
            rfresh_Result_Area();
        }

    }

    public void now_Search_By_Name() {

        String result = " ";
        dir.clear();
        dir = new ArrayList<>();
        dir.add(path);
        int i = 0, ind;
        boolean bool = false;
        while (true) {

            try {
                System.out.println(dir.get(0));
                File file = new File(dir.get(i));
                File[] files = file.listFiles();
                i++;
                for (File file1 : files) {
                    System.out.println(file1.getCanonicalPath());

                }
                // bool = true;
                for (File file1 : files) {

                    if (file1.isDirectory()) {
                        dir.add(file1.getCanonicalPath());
                        System.out.println(file1.getName());
                    }

                    if ((!file1.isDirectory())) {
                        System.out.println(file1.getName());
                        ind = file1.getName().lastIndexOf(".");
                        if (file1.getName().substring(0, ind).equals(ext_Or_Name)) {

                            //  System.out.println(file1.getName());
                            path  = " File Found\n" + " File Name:   " + file1.getName()
                                  + "\n File Found In: " + file1.getCanonicalPath();
                            txtArea_Result.setText(path);
                            txtArea_Result.setVisible(true);
                            bool = true;
                            break;
                        }

                    }
                }
                if (bool == true) {
                    System.out.println("found");
                    break;
                }

                if (i == dir.size()) {
                    System.out.println("not found");
                    txtArea_Result.setText("gsjcjksdnjksdnjnsdkjnvjksnvnkjsnjnvjsjnjkj");
                    txtArea_Result.setVisible(true);
                    break;
                }
            } catch (NullPointerException npe) {
                System.out.println(npe);
            } catch (IOException ie) {
                System.out.println(ie);
            } catch (IndexOutOfBoundsException iobex) {
                System.out.println(iobex);
                // result_Area.setText("File Name:  " + iobex);
            }
        }

    }

    static void method(String warning_Msg) {
        JOptionPane jOptionPane = new JOptionPane(warning_Msg, JOptionPane.INFORMATION_MESSAGE);
        final JDialog dialog = jOptionPane.createDialog("pokath!");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                dialog.setVisible(false);

            }
        }).start();
        dialog.setVisible(true);
    }

    public void now_Search_By_Extension() {
        String result = "    File Name:                         File Size:   " + "\n";
        //  System.out.println(result.length());

        dir = new ArrayList<>();
        dir.add(path);
        int row = 0, clm = 0, i = 0;
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        while (true) {

            try {
                File file = new File(dir.get(i));
                File[] files = file.listFiles();
                i++;

                for (File file1 : files) {

                    if (file1.isDirectory()) {
                        dir.add(file1.getCanonicalPath());
                        System.out.println(i + " > " + file1.getCanonicalPath());
                    }
                    if (file1.getName().endsWith(ext_Or_Name)) {
                        // System.out.println(file1.length());
                        //  System.out.println(file1.getName());
                        result += file1.getName() + "                   " + numberFormat.format(file1.length() / 1048576.00) + " MB \n";
                    }
                }

                //this block ensure that All directories comes in arr , the list of directory . 
                if (i == dir.size()) {

                    if (result.length() == 53) {
                        txtArea_Result.setText("No\n\n          SUCH\n\n                    FILE\n\n                                FOUND!!!!!!!!!");
                    } else {
                        txtArea_Result.setText(result);
                    }
                    break;
                }
            } catch (NullPointerException npe) {
                //   System.out.println(npe);
            } catch (IOException ie) {
                //  System.out.println(ie);
            }
        }

    }

//    public void show_All_Pussies() {
//
//        for (int j = 0; j < dir.size(); j++) {
//
//        }
//
//    }
    public void rfresh_Result_Area() {

        txt_Path.setText("");
        txt_ext.setText("");
        txtArea_Result.setText("");
        jComboBox1.setSelectedIndex(-1);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_search = new javax.swing.JButton();
        txt_Path = new javax.swing.JTextField();
        txt_ext = new javax.swing.JTextField();
        lbl_Pokath = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea_Result = new javax.swing.JTextArea();
        btn_Rfreash = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 153));

        btn_search.setBackground(new java.awt.Color(0, 51, 51));
        btn_search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_search.setText("Search");
        btn_search.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        txt_Path.setBackground(new java.awt.Color(0, 51, 51));
        txt_Path.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_Path.setForeground(new java.awt.Color(255, 255, 204));
        txt_Path.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Path", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 51, 0))); // NOI18N

        txt_ext.setBackground(new java.awt.Color(0, 51, 51));
        txt_ext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_ext.setForeground(new java.awt.Color(255, 255, 204));
        txt_ext.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Extension/File Name", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 51, 0))); // NOI18N

        lbl_Pokath.setBackground(new java.awt.Color(153, 255, 153));
        lbl_Pokath.setFont(new java.awt.Font("Traditional Arabic", 3, 24)); // NOI18N
        lbl_Pokath.setForeground(new java.awt.Color(204, 102, 0));
        lbl_Pokath.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Pokath.setText("File Search Program");
        lbl_Pokath.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtArea_Result.setBackground(new java.awt.Color(0, 51, 51));
        txtArea_Result.setColumns(20);
        txtArea_Result.setFont(new java.awt.Font("Simplified Arabic", 1, 18)); // NOI18N
        txtArea_Result.setForeground(new java.awt.Color(204, 102, 0));
        txtArea_Result.setRows(5);
        jScrollPane1.setViewportView(txtArea_Result);

        btn_Rfreash.setBackground(new java.awt.Color(0, 51, 51));
        btn_Rfreash.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_Rfreash.setText("rFreash");
        btn_Rfreash.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btn_Exit.setBackground(new java.awt.Color(0, 51, 51));
        btn_Exit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_Exit.setText("eXiIT");
        btn_Exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jComboBox1.setBackground(new java.awt.Color(0, 51, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Extension", "File Name" }));
        jComboBox1.setSelectedIndex(-1);
        jComboBox1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Rfreash, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox1, 0, 192, Short.MAX_VALUE)
                            .addComponent(txt_ext))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txt_Path, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(lbl_Pokath, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 220, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_Pokath)
                        .addGap(20, 20, 20))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Path, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Rfreash, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frame.class
                  .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame.class
                  .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame.class
                  .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame.class
                  .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Font banglaFont = new Font("Kalpurush", Font.PLAIN, 16);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_Rfreash;
    private javax.swing.JButton btn_search;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Pokath;
    private javax.swing.JTextArea txtArea_Result;
    private javax.swing.JTextField txt_Path;
    private javax.swing.JTextField txt_ext;
    // End of variables declaration//GEN-END:variables

}
