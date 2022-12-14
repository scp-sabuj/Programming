/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resrurantmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author F.C
 */
public class SellHistoryFrame extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form SellHistoryFrame
     */
    int len = 0;

    public SellHistoryFrame() {
        initComponents();
        setVisible(true);
        setTitle("Vehicle Parking Home  ");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        okJButton.addActionListener(this);
        backJButton.addActionListener(this);
        tableMethod();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == okJButton) {
            okMethod();
        }
        if (e.getSource() == backJButton) {
            setVisible(false);
            MainFrame mF = new MainFrame();
        }
    }

    private void okMethod() {
        String date = dateJTextField.getText();
        String invest = investmentJTextField.getText();
        if ((date.equals("")) || (invest.equals(""))) {
            JOptionPane.showMessageDialog(rootPane, "fill-Up all accurately..");
        } else {
            int total = 0;
            String sAm;
            int sellAm = 0;
            String query1 = "SELECT * FROM `datesell` WHERE Date = '" + date + "'";
            ConnectorClass ob3 = new ConnectorClass();
            try {

                ob3.rs = ob3.stmt.executeQuery(query1);

                while (ob3.rs.next()) {

                    sAm = ob3.rs.getString(2);
                    int sAm1 = Integer.parseInt(sAm);
                    total = total + sAm1;

                }

            } catch (SQLException ev) {
                ev.printStackTrace();
            }

            int invest1 = Integer.parseInt(invest);
            int benefit = total - invest1;
            String show = "" + benefit;

            profitJLabel.setText(show);
            dateJTextField.setText("");
            investmentJTextField.setText("");
        }

    }

    private void tableMethod() {
        String[] date = new String[100];
        String[] sell = new String[100];

        int i = 0;

        ConnectorClass ob3 = new ConnectorClass();
        String query1 = "Select * FROM datesell";
        try {

            ob3.rs = ob3.stmt.executeQuery(query1);

            while (ob3.rs.next()) {

                date[i] = ob3.rs.getString(1);
                sell[i] = ob3.rs.getString(2);

                i++;
            }
        } catch (SQLException ev) {
            ev.printStackTrace();
        }

        len = i;

        for (int j = 0; j < len; j++) {
            Object[] row = {date[j], sell[j]};
            DefaultTableModel model = (DefaultTableModel) sellJTable.getModel();
            model.addRow(row);
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
        sellJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        dateJLabel = new javax.swing.JLabel();
        investmentJLabel = new javax.swing.JLabel();
        investmentJTextField = new javax.swing.JTextField();
        profitTitleJLabel = new javax.swing.JLabel();
        profitJLabel = new javax.swing.JLabel();
        okJButton = new javax.swing.JButton();
        takeJLabel = new javax.swing.JLabel();
        dateJTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sellJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATE", "Sell Amount"
            }
        ));
        jScrollPane1.setViewportView(sellJTable);

        backJButton.setText("BACK");

        dateJLabel.setText("Date     :");

        investmentJLabel.setText("Investment    :");

        profitTitleJLabel.setText("Your Entered Date Profit is   :");

        okJButton.setText("OK");

        takeJLabel.setText("TAKA");

        dateJTextField.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(investmentJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(investmentJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(profitTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(profitJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(takeJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(okJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(okJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                .addComponent(investmentJTextField)
                                .addComponent(investmentJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(takeJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(profitJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(profitTitleJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(SellHistoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellHistoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellHistoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellHistoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellHistoryFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel dateJLabel;
    private javax.swing.JTextField dateJTextField;
    private javax.swing.JLabel investmentJLabel;
    private javax.swing.JTextField investmentJTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton okJButton;
    private javax.swing.JLabel profitJLabel;
    private javax.swing.JLabel profitTitleJLabel;
    private javax.swing.JTable sellJTable;
    private javax.swing.JLabel takeJLabel;
    // End of variables declaration//GEN-END:variables

}
