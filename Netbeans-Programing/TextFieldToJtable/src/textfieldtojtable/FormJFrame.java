/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package textfieldtojtable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author SABUJ CHANDRA PAUL
 */
public class FormJFrame extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form FormJFrame
     */
    public FormJFrame() {
        initComponents();
        setTitle("This is Form Page...");
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        okJButton.addActionListener(this);
        closeJButton.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==okJButton){
            String infomation;
            
            String fN = firstJTextField.getText();
            String lN = lastJTextField.getText();
            String mN = mobileJTextField.getText();
            String address = addressJTextArea.getText();
            
            TableJFrame tableJFrame = new TableJFrame(fN,lN,mN,address);
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

        firstJLabel = new javax.swing.JLabel();
        lastJLabel = new javax.swing.JLabel();
        mobileJLabel = new javax.swing.JLabel();
        addressJLabel = new javax.swing.JLabel();
        firstJTextField = new javax.swing.JTextField();
        lastJTextField = new javax.swing.JTextField();
        mobileJTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressJTextArea = new javax.swing.JTextArea();
        okJButton = new javax.swing.JButton();
        closeJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        firstJLabel.setText("First Name :");

        lastJLabel.setText("Last Name :");

        mobileJLabel.setText("Mobile No. :");

        addressJLabel.setText("Address :");

        firstJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstJTextFieldActionPerformed(evt);
            }
        });

        addressJTextArea.setColumns(20);
        addressJTextArea.setRows(5);
        jScrollPane1.setViewportView(addressJTextArea);

        okJButton.setText("OK");

        closeJButton.setText("CLOSE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstJLabel)
                    .addComponent(lastJLabel)
                    .addComponent(mobileJLabel)
                    .addComponent(addressJLabel))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(mobileJTextField)
                    .addComponent(firstJTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lastJTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(okJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(closeJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstJLabel)
                    .addComponent(firstJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(okJButton)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastJLabel)
                    .addComponent(lastJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileJLabel)
                    .addComponent(mobileJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addressJLabel)
                        .addGap(96, 96, 96))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(closeJButton)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(54, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstJTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(FormJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressJLabel;
    private javax.swing.JTextArea addressJTextArea;
    private javax.swing.JButton closeJButton;
    private javax.swing.JLabel firstJLabel;
    private javax.swing.JTextField firstJTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastJLabel;
    private javax.swing.JTextField lastJTextField;
    private javax.swing.JLabel mobileJLabel;
    private javax.swing.JTextField mobileJTextField;
    private javax.swing.JButton okJButton;
    // End of variables declaration//GEN-END:variables

    
}
