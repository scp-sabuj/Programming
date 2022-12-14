/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.plaf.SplitPaneUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author F.C
 */
public class JFrame1 extends javax.swing.JFrame implements ActionListener {
    private final JSplitPane splitPane;

    /**
     * Creates new form JFrame1
     */
    public JFrame1() {
        initComponents();
        setVisible(true);
        setSize(855, 525);
        //setResizable(false);
        setLocationRelativeTo(null);
        setTitle("This is a simple project...");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        splitPane= new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

        addJButton1.addActionListener(this);
        clearJButton.addActionListener(this);
        closeJButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == closeJButton) {
            System.exit(0);
        }
        if (e.getSource() == clearJButton) {
            serialNoJTextField.setText(null);
            idJTextField.setText(null);
            nameJTextField.setText(null);
            deptJTextField.setText(null);
        }
        if (e.getSource() == addJButton1) {
            String sl = serialNoJTextField.getText();
            String id = idJTextField.getText();
            String nm = nameJTextField.getText();
            String dp = deptJTextField.getText();
            if ((sl.equals("")) || (id.equals("")) || (nm.equals("")) || (dp.equals("")) ) {
                JOptionPane.showMessageDialog(null, "Fill Up All Content Accuratuly");
            } else {
                Object[] row = {sl, id, nm, dp};
                DefaultTableModel model = (DefaultTableModel) jTable.getModel();
                model.addRow(row);
            }

            serialNoJTextField.setText(null);
            idJTextField.setText(null);
            nameJTextField.setText(null);
            deptJTextField.setText(null);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        closeJButton = new javax.swing.JButton();
        clearJButton = new javax.swing.JButton();
        addJButton1 = new javax.swing.JButton();
        serialNoJLabel = new javax.swing.JLabel();
        serialNoJTextField = new javax.swing.JTextField();
        idJLabel = new javax.swing.JLabel();
        idJTextField = new javax.swing.JTextField();
        nameJLabel = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        deptJLabel = new javax.swing.JLabel();
        deptJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SERIAL NO", "ID", "NAME", "DEPARTMENT"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(370, 110, 470, 240);

        closeJButton.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        closeJButton.setText("CLOSE");
        closeJButton.setPreferredSize(new java.awt.Dimension(80, 23));
        getContentPane().add(closeJButton);
        closeJButton.setBounds(330, 420, 152, 51);

        clearJButton.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        clearJButton.setText("CLEAR");
        clearJButton.setPreferredSize(new java.awt.Dimension(80, 23));
        getContentPane().add(clearJButton);
        clearJButton.setBounds(630, 420, 158, 51);

        addJButton1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        addJButton1.setText("ADD");
        addJButton1.setPreferredSize(new java.awt.Dimension(80, 23));
        getContentPane().add(addJButton1);
        addJButton1.setBounds(50, 420, 152, 51);

        serialNoJLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        serialNoJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        serialNoJLabel.setText("Serial No. :");
        serialNoJLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(serialNoJLabel);
        serialNoJLabel.setBounds(20, 120, 102, 22);

        serialNoJTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(serialNoJTextField);
        serialNoJTextField.setBounds(150, 110, 160, 28);

        idJLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        idJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        idJLabel.setText("ID            :");
        idJLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(idJLabel);
        idJLabel.setBounds(20, 190, 102, 22);

        idJTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(idJTextField);
        idJTextField.setBounds(150, 190, 160, 28);

        nameJLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nameJLabel.setText("Name       :");
        nameJLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(nameJLabel);
        nameJLabel.setBounds(20, 260, 102, 22);

        nameJTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(nameJTextField);
        nameJTextField.setBounds(150, 260, 160, 28);

        deptJLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        deptJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        deptJLabel.setText("Dept.        :");
        deptJLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(deptJLabel);
        deptJLabel.setBounds(20, 330, 102, 22);

        deptJTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        deptJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptJTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(deptJTextField);
        deptJTextField.setBounds(150, 320, 160, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simple_project/Capture.PNG"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setAutoscrolls(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 870, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deptJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deptJTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton1;
    private javax.swing.JButton clearJButton;
    private javax.swing.JButton closeJButton;
    private javax.swing.JLabel deptJLabel;
    private javax.swing.JTextField deptJTextField;
    private javax.swing.JLabel idJLabel;
    private javax.swing.JTextField idJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JLabel serialNoJLabel;
    private javax.swing.JTextField serialNoJTextField;
    // End of variables declaration//GEN-END:variables

}
