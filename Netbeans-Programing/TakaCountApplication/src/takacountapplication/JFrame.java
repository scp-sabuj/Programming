/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package takacountapplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author SABUJ CHANDRA PAUL
 */
public class JFrame extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form JFrame
     */
    public JFrame() {
        initComponents();

        setTitle("This another app......");
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        calculateJButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == calculateJButton) {
            calculateMethod();
        }
    }

    private void calculateMethod() {

        Long amount;

        String amountString = enterAmountJTextField.getText();
        Long[] lonArray = new Long[1000];

        int len = amountString.length();
        Double[] douarray = new Double[1000];

        amount = Long.parseLong(enterAmountJTextField.getText());
        System.out.println(amount);
        Long l1 = amount;
        for (int i = 0; i < len; i++) {
            int j = 1;
            Long t = 10 * (long) j;
            while (amount > t) {
                if (t + 10 > amount) {
                    break;
                }

                t = 10 * (long) j;
                j++;

            }
            Long get;
            if (amount < t) {
                get = amount;
                lonArray[i] = get;
                System.out.println(get);
                break;
            }
            get = amount - t;
            System.out.println(get);
            amount = amount / 10;
            lonArray[i] = get;
        }
        System.out.printf("\n\n\n");
        for (int i = 0; i < len; i++) {
            if( i == 0){
                String ekok = lonArray[i] + "";
            }
            if( i == 1){
                String doshok = lonArray[i] + "";
            }
            if( i == 0){
                String hun =lonArray[i] +  " Hundred";
            }
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

        jPanel1 = new javax.swing.JPanel();
        enterAmountJLabel = new javax.swing.JLabel();
        enterAmountJTextField = new javax.swing.JTextField();
        calculateJButton = new javax.swing.JButton();
        showJPanel = new javax.swing.JPanel();
        showJLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        enterAmountJLabel.setBackground(new java.awt.Color(255, 255, 0));
        enterAmountJLabel.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        enterAmountJLabel.setForeground(new java.awt.Color(204, 0, 204));
        enterAmountJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterAmountJLabel.setText("Enter Your Amount :");

        enterAmountJTextField.setBackground(new java.awt.Color(255, 255, 0));
        enterAmountJTextField.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        enterAmountJTextField.setForeground(new java.awt.Color(204, 0, 204));
        enterAmountJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        enterAmountJTextField.setToolTipText("");
        enterAmountJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterAmountJTextFieldActionPerformed(evt);
            }
        });

        calculateJButton.setText("CALCULATE");

        showJPanel.setBackground(new java.awt.Color(255, 255, 0));
        showJPanel.setForeground(new java.awt.Color(204, 0, 204));

        javax.swing.GroupLayout showJPanelLayout = new javax.swing.GroupLayout(showJPanel);
        showJPanel.setLayout(showJPanelLayout);
        showJPanelLayout.setHorizontalGroup(
            showJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );
        showJPanelLayout.setVerticalGroup(
            showJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        showJLabel.setBackground(new java.awt.Color(255, 255, 0));
        showJLabel.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        showJLabel.setForeground(new java.awt.Color(204, 0, 204));
        showJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showJLabel.setText("THE AMOUNT IS BELLOW DOWN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(enterAmountJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(enterAmountJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(291, 291, 291)
                                .addComponent(calculateJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(showJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(showJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enterAmountJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(enterAmountJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addComponent(calculateJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(showJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(showJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterAmountJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterAmountJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterAmountJTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateJButton;
    private javax.swing.JLabel enterAmountJLabel;
    private javax.swing.JTextField enterAmountJTextField;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel showJLabel;
    private javax.swing.JPanel showJPanel;
    // End of variables declaration//GEN-END:variables

}
