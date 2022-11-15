package file_search_by_extension;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

/**
 *
 * @ Sorwar
 */
public class frame1 extends javax.swing.JFrame implements ActionListener {

    String path_Name, file_Name, directory;
    Double file_Size;
    ArrayList<String> arr;

    public frame1() {
        initComponents();
        setVisible(true);
        setDefaultCloseOperation(1);
        setLocationRelativeTo(null);
        txt_fileName.addActionListener(this);
        btn_search.addActionListener(this);
        result_Area.setText(null);
        setDefaultCloseOperation(1);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == btn_search) {
            now_Search();
        }

    }

    public void now_Search() {

        String result = " ";
        result_Area.setText("");
        file_Name = txt_fileName.getText();
        //  System.out.println(file_Name);
        path_Name = txt_Path.getText();
        arr = new ArrayList<>();
        arr.add(path_Name);
        int i = 0, ind;
        boolean bool = false;
        while (true) {

            try {
                System.out.println(arr.get(0));
                File file = new File(arr.get(i));
                File[] files = file.listFiles();
                i++;
                for (File file1 : files) {
                    System.out.println(file1.getCanonicalPath());

                }
               // bool = true;
                for (File file1 : files) {

                    if (file1.isDirectory()) {
                        arr.add(file1.getCanonicalPath());
                        System.out.println(file1.getName());
                    }

                    if ((!file1.isDirectory())) {
                        System.out.println(file1.getName());
                        ind = file1.getName().lastIndexOf(".");
                        if (file1.getName().substring(0, ind).equals(file_Name)) {

                            //  System.out.println(file1.getName());
                            path_Name = " File Found\n" + " File Name:   " + file1.getName()
                                  + "\n File Found In: " + file1.getCanonicalPath();
                            result_Area.setText(path_Name);
                            result_Area.setVisible(true);
                            bool = true;
                            break;
                        }

                    }
                }
                if (bool == true) {
                    System.out.println("found");
                    break;
                }

                if (i == arr.size()) {
                    System.out.println("not found");
                    result_Area.setText("gsjcjksdnjksdnjnsdkjnvjksnvnkjsnjnvjsjnjkj");
                    result_Area.setVisible(true);
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
        //  result_Area.setText("dfghj");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_search = new javax.swing.JButton();
        txt_fileName = new javax.swing.JTextField();
        txt_Path = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        result_Area = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));

        btn_search.setBackground(new java.awt.Color(204, 255, 204));
        btn_search.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btn_search.setText("Search");
        btn_search.setBorder(null);

        txt_fileName.setBackground(new java.awt.Color(255, 255, 204));
        txt_fileName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_fileName.setForeground(new java.awt.Color(0, 51, 51));
        txt_fileName.setToolTipText("File Name Here ....");

        txt_Path.setBackground(new java.awt.Color(255, 255, 204));
        txt_Path.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_Path.setForeground(new java.awt.Color(0, 51, 51));
        txt_Path.setToolTipText("Path Here");

        result_Area.setColumns(20);
        result_Area.setRows(5);
        jScrollPane1.setViewportView(result_Area);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_fileName, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(txt_Path))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_Path, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fileName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        Font banglaFont = new Font("Kalpurush", Font.PLAIN, 16);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame1().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_search;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea result_Area;
    private javax.swing.JTextField txt_Path;
    private javax.swing.JTextField txt_fileName;
    // End of variables declaration//GEN-END:variables

}
