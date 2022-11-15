package file_search_by_extension;

import java.awt.event.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

import java.util.*;
import java.util.concurrent.TimeUnit;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Masum Khan
 */
public class First_Way extends javax.swing.JFrame implements ActionListener {

    String extension, directory;
    JOptionPane jpane;
    DefaultTableModel model;
    ArrayList<String> arr = new ArrayList<>();

    public First_Way() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        btn_Search.addActionListener(this);
        btn_Refresh.addActionListener(this);
        btn_Restart.addActionListener(this);
        btn_Shutdown.addActionListener(this);
        txt_Directory.addActionListener(this);
        txt_Ext.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == btn_Search) {
            extension = txt_Ext.getText();
            directory = txt_Directory.getText();
            if (extension.equals("") || directory.equals("")) {
//              jpane  = new JOptionPane("Extension Or Directory Field Left Empty!", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(new JPanel(), "Extension or directory field left empty!", "Pokath!",
                        JOptionPane.WARNING_MESSAGE);
                System.out.println("fghjkl");
            } else if (extension.charAt(0) != '.') {
                JOptionPane.showMessageDialog(new JPanel(), "Extension not given in valid format", "Pokath!",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                enlist_Subdirectories();
            }

        }
        if (ae.getSource() == btn_Restart) {
            //    restart();
        }
        if (ae.getSource() == btn_Shutdown) {
            //   shutdown();
        }
        if (ae.getSource() == btn_Refresh) {
            refresh_Result_Table();
        }
    }

    public void shutdown() {

        Runtime r = Runtime.getRuntime();
        try {
            r.exec("shutdown -s");
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

    public void restart() {

        Runtime r = Runtime.getRuntime();
        try {
            r.exec("shutdown -r");
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

    public void enlist_Subdirectories() {

        // tbl_Search_Result_Exhibition.removeAll();
        arr.clear();
        System.out.println(directory + "  " + extension);
//        System.out.println(directory);
        int row = 0, clm = 0;
        Double file_Size;
        String str;                                             // C:\Users\Masum Khan\Downloads    C:\Users\Masum Khan\Desktop\@

        arr.add(directory);
        int i = 0;

        while (true) {

            try {

                File file = new File(arr.get(i));
                File[] files = file.listFiles();
                i++;

                for (File file1 : files) {

                    if (file1.isDirectory()) {
                        arr.add(file1.getCanonicalPath());
                        System.out.println(i + " > " + file1.getCanonicalPath());
                    }
                }
                //this block ensure that All directories comes in arr , the list of directory . 
                if (i == arr.size()) {
                    show_Result_From_Directories();
                    break;
                }
            } catch (IOException ex2) {
                System.out.println(ex2);
            } catch (NullPointerException ee) {
                System.out.println(ee);
            }
        }
    }

    public void show_Result_From_Directories() {

        int j = 0;
        ArrayList<String> fileName = new ArrayList<>();
        model = (DefaultTableModel) tbl_Search_Result_Exhibition.getModel();
        for (int i = 0; i < arr.size(); i++) {

            File file = new File(arr.get(i));
            File[] files = file.listFiles();
            try {
                for (File f : files) {
                    if (f.isFile() && f.getName().endsWith(extension)) {
                        System.out.println(f.getName());
                        model.setValueAt(f.getName(), j, 0);
                        j++;
                    }
                }
            } catch (Exception ee) {
                continue;
            }
        }
    }

    public void refresh_Result_Table() {
        System.out.println("should be removed everything!");

//        TableModel tbl = tbl_Search_Result_Exhibition.getModel();
//        tbl_Search_Result_Exhibition.setModel(tbl);
//        tbl_Search_Result_Exhibition.removeAll();
//        DefaultTableModel dm = (DefaultTableModel) tbl_Search_Result_Exhibition.getModel();
//        dm.getDataVector().removeAllElements();
//        dm.fireTableDataChanged();
//        for (int i = 0; i < dtm.getRowCount(); i++) {
//            dtm.removeRow(i);
//            mortgageTable.revalidate();
//        }


    }

//        try {
//
//            for (File file1 : files) {
//                if (file1.isDirectory()) {
//                    // System.out.println("directory:" + file1.getCanonicalPath());
//                    str = directory + "\\" + file1.getCanonicalPath();
//                    arr.add(str);
//
//                    System.out.println(str);
//                }
////            else {
////                System.out.println("     file:" + file1.getCanonicalPath());
////            }
//            }
//
//        } catch (Exception ex) {
//
//        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_Ext = new javax.swing.JTextField();
        txt_Directory = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Search_Result_Exhibition = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btn_Restart = new javax.swing.JButton();
        btn_Shutdown = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        btn_Refresh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_Search = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        txt_Ext.setBackground(new java.awt.Color(0, 51, 51));
        txt_Ext.setFont(new java.awt.Font("Traditional Arabic", 1, 16)); // NOI18N
        txt_Ext.setForeground(new java.awt.Color(255, 255, 153));
        txt_Ext.setToolTipText("extension here...");
        txt_Ext.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Extension:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Urdu Typesetting", 1, 12), new java.awt.Color(255, 204, 102))); // NOI18N

        txt_Directory.setBackground(new java.awt.Color(0, 51, 51));
        txt_Directory.setFont(new java.awt.Font("Traditional Arabic", 1, 16)); // NOI18N
        txt_Directory.setForeground(new java.awt.Color(255, 255, 153));
        txt_Directory.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Directory Path:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Urdu Typesetting", 1, 12), new java.awt.Color(255, 204, 102))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pokath ! By Extension Program");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 2, 0, new java.awt.Color(255, 255, 204)));

        tbl_Search_Result_Exhibition.setAutoCreateRowSorter(true);
        tbl_Search_Result_Exhibition.setBackground(new java.awt.Color(255, 255, 204));
        tbl_Search_Result_Exhibition.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 51), new java.awt.Color(0, 0, 153), new java.awt.Color(153, 51, 0), new java.awt.Color(51, 51, 0)));
        tbl_Search_Result_Exhibition.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        tbl_Search_Result_Exhibition.setForeground(new java.awt.Color(102, 0, 0));
        tbl_Search_Result_Exhibition.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "File Name", "File Size", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Search_Result_Exhibition.setFillsViewportHeight(true);
        tbl_Search_Result_Exhibition.setGridColor(new java.awt.Color(255, 102, 0));
        tbl_Search_Result_Exhibition.setName("Result"); // NOI18N
        tbl_Search_Result_Exhibition.setRowHeight(25);
        tbl_Search_Result_Exhibition.setRowMargin(3);
        tbl_Search_Result_Exhibition.setSelectionBackground(new java.awt.Color(0, 51, 51));
        tbl_Search_Result_Exhibition.setSelectionForeground(new java.awt.Color(255, 255, 153));
        jScrollPane1.setViewportView(tbl_Search_Result_Exhibition);

        jPanel2.setBackground(new java.awt.Color(204, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(0, 51, 51));

        btn_Restart.setBackground(new java.awt.Color(153, 153, 255));
        btn_Restart.setFont(new java.awt.Font("Urdu Typesetting", 1, 18)); // NOI18N
        btn_Restart.setForeground(new java.awt.Color(153, 51, 0));
        btn_Restart.setText("rESTART");
        btn_Restart.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RestartActionPerformed(evt);
            }
        });

        btn_Shutdown.setBackground(new java.awt.Color(153, 153, 255));
        btn_Shutdown.setFont(new java.awt.Font("Urdu Typesetting", 1, 18)); // NOI18N
        btn_Shutdown.setForeground(new java.awt.Color(153, 51, 0));
        btn_Shutdown.setText("sHUTDOWN");
        btn_Shutdown.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setFont(new java.awt.Font("Urdu Typesetting", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 51, 0));
        jButton3.setText("sLEEP");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setFont(new java.awt.Font("Urdu Typesetting", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(153, 51, 0));
        jButton4.setText("hIBERNATE");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setBackground(new java.awt.Color(204, 255, 153));
        jButton1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 0));
        jButton1.setText("EXIT");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton7.setBackground(new java.awt.Color(153, 153, 255));
        jButton7.setFont(new java.awt.Font("Urdu Typesetting", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(153, 51, 0));
        jButton7.setText("pROCESS");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton8.setBackground(new java.awt.Color(153, 153, 255));
        jButton8.setFont(new java.awt.Font("Urdu Typesetting", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(153, 51, 0));
        jButton8.setText("pROGRAMS");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_Refresh.setBackground(new java.awt.Color(153, 153, 255));
        btn_Refresh.setFont(new java.awt.Font("Urdu Typesetting", 1, 16)); // NOI18N
        btn_Refresh.setForeground(new java.awt.Color(153, 51, 0));
        btn_Refresh.setText("rFRESH");
        btn_Refresh.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Shutdown, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                        .addComponent(btn_Restart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Restart, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Shutdown, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        btn_Search.setBackground(new java.awt.Color(0, 51, 51));
        btn_Search.setFont(new java.awt.Font("Traditional Arabic", 1, 20)); // NOI18N
        btn_Search.setForeground(new java.awt.Color(255, 255, 153));
        btn_Search.setText("Search");
        btn_Search.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setBackground(new java.awt.Color(255, 204, 102));
        jButton2.setFont(new java.awt.Font("Traditional Arabic", 3, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 51));
        jButton2.setText("Sort By Name");

        jButton5.setBackground(new java.awt.Color(255, 204, 102));
        jButton5.setFont(new java.awt.Font("Traditional Arabic", 3, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 51, 51));
        jButton5.setText("Sort By Date");

        jButton6.setBackground(new java.awt.Color(255, 204, 102));
        jButton6.setFont(new java.awt.Font("Traditional Arabic", 3, 16)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 51, 51));
        jButton6.setText("Sort By File Size");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txt_Ext, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_Directory)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Ext, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Directory, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btn_RestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RestartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_RestartActionPerformed

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
            java.util.logging.Logger.getLogger(First_Way.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(First_Way.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(First_Way.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(First_Way.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new First_Way().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Refresh;
    private javax.swing.JButton btn_Restart;
    private javax.swing.JButton btn_Search;
    private javax.swing.JButton btn_Shutdown;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_Search_Result_Exhibition;
    private javax.swing.JTextField txt_Directory;
    private javax.swing.JTextField txt_Ext;
    // End of variables declaration//GEN-END:variables

}
