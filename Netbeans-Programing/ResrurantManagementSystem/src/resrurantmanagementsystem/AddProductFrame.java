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
public class AddProductFrame extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form AddProductFrame
     */
    int len = 0;

    public AddProductFrame() {
        initComponents();
        setVisible(true);
        setTitle("This is ADD PAGE..");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        tableMethod();

        backJButton.addActionListener(this);
        addJButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backJButton) {
            setVisible(false);
            MainFrame main = new MainFrame();
        }
        if (e.getSource() == addJButton) {
            addMethod();
        }
    }

    private void addMethod() {
        String sl1;
        String nm;
        String price;
        String st1;

        sl1 = serialJLabel1.getText();
        nm = nameJTextField.getText().toUpperCase();
        price = priceJTextField.getText();
        st1 = stockJTextField.getText();

        int sl = Integer.parseInt(sl1);
        int st = 0;
        float p = 0;

        boolean check;
        boolean check1;
        boolean check2;
        
        String ch = "";
        String ch1 = "";
        String ch2 = "";

        if (sl1.equals("") || nm.equals("") || price.equals("") || st1.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Fill Up All Accurately.....");
        } else {
            check = isInteger(st1);
            if ((check == true) && (!st1.isEmpty())) {
                st = Integer.parseInt(st1);
                ch = "yes";
            }
            check1 = isInteger(price);
            if ((check1 == true) && (!price.isEmpty())) {
                p = Float.parseFloat(price);
                ch1 = "yes";
            }
            check2 = isFloat(price);
            if ((check2 == true) && (!price.isEmpty())) {
                p = Float.parseFloat(price);
                ch1 = "yes";
            }
            
            if((ch.equals("yes"))&&(ch1.equals("yes")||ch2.equals("yes"))){
                JOptionPane.showMessageDialog(rootPane, "YOUR DATA IS SAVED..");
            ConnectorClass obj = new ConnectorClass();
            String query = "INSERT INTO food " + "VALUES ('" + sl + "', '" + nm + "', '" + p + "', '" + st + "')";
            try {

                obj.stmt.executeUpdate(query);
                obj.con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            for (int j = 0; j < len; j++) {
                DefaultTableModel model1 = (DefaultTableModel) listJTable.getModel();
                model1.removeRow(0);
            }

            tableMethod();
            }

        }
    }

    private static boolean isInteger(String st1) {
        try {
            Integer.parseInt(st1);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    private static boolean isFloat(String price) {
        try {
            Float.parseFloat(price);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    private void tableMethod() {
        String[] sl = new String[100];
        String[] nm = new String[100];
        String[] price = new String[100];
        String[] st = new String[100];

        int i = 0;

        ConnectorClass obj = new ConnectorClass();
        String query = "Select * FROM food";
        try {

            obj.rs = obj.stmt.executeQuery(query);

            while (obj.rs.next()) {

                sl[i] = obj.rs.getString(1);
                nm[i] = obj.rs.getString(2);
                price[i] = obj.rs.getString(3);
                st[i] = obj.rs.getString(4);

                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        len = i;

        for (int j = 0; j < len; j++) {
            Object[] row = {sl[j], nm[j], price[j], st[j]};
            DefaultTableModel model = (DefaultTableModel) listJTable.getModel();
            model.addRow(row);
        }
        len = len + 1;;
        
        String sl1 = "" + len;
        serialJLabel1.setText(sl1);
        nameJTextField.setText("");
        priceJTextField.setText("");
        stockJTextField.setText("");
        len = len - 1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always;
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        listJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listJTable = new javax.swing.JTable();
        serialTitleJLabel = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        priceTitleJLabel = new javax.swing.JLabel();
        naneTitleJLabel = new javax.swing.JLabel();
        priceJTextField = new javax.swing.JTextField();
        stockTitleJLabel = new javax.swing.JLabel();
        stockJTextField = new javax.swing.JTextField();
        addJButton = new javax.swing.JButton();
        serialJLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backJButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        backJButton.setText("BACK");

        listJLabel.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        listJLabel.setText("List Of Food");
        listJLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        listJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SERIAL", "NAME OF FOOD", "PRICE (per)", "STOCK"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(listJTable);

        serialTitleJLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        serialTitleJLabel.setText("Enter The  Serial no.         ");

        nameJTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextFieldActionPerformed(evt);
            }
        });

        priceTitleJLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        priceTitleJLabel.setText("Enter The Price (per)         ");

        naneTitleJLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        naneTitleJLabel.setText("Enter The Name Of Food  ");

        priceJTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        stockTitleJLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        stockTitleJLabel.setText("Enter The Stock Amount");

        stockJTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        addJButton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        addJButton.setText("ADD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 67, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(serialTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(naneTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stockTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(stockJTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(priceJTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(39, 39, 39)
                                .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serialJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(listJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(serialJLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(serialTitleJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(naneTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(priceTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stockTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stockJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(addJButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AddProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProductFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel listJLabel;
    private javax.swing.JTable listJTable;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JLabel naneTitleJLabel;
    private javax.swing.JTextField priceJTextField;
    private javax.swing.JLabel priceTitleJLabel;
    private javax.swing.JLabel serialJLabel1;
    private javax.swing.JLabel serialTitleJLabel;
    private javax.swing.JTextField stockJTextField;
    private javax.swing.JLabel stockTitleJLabel;
    // End of variables declaration//GEN-END:variables
}
