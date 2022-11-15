/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fastfoodapplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author F.C
 */
public class AddJFrame extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form AddJFrame
     */
    
    int len = 0;
    
    public AddJFrame() {
        initComponents();
        
        setVisible(true);
        setTitle("This is ADD AND SELL PAGE..");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        tableMethod();
        
        backJButton.addActionListener(this);
        addJButton.addActionListener(this);
        
        searchJItem.addActionListener(this);
        sellJItem.addActionListener(this);
        modifyJItem.addActionListener(this);
        exitJItem.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backJButton) {
            setVisible(false);
            AddAndSellPage addAndSell = new AddAndSellPage();
        }
        if (e.getSource() == addJButton) {
            addMethod();
        }
        if (e.getSource() == searchJItem) {
            setVisible(false);
            SearchJFrame sJF = new SearchJFrame();
        }
        if (e.getSource() == sellJItem) {
            setVisible(false);
            SellFramePage sFP = new SellFramePage();
        }
        if (e.getSource() == modifyJItem) {
            setVisible(false);
            ModifyingJFrame mJF = new ModifyingJFrame();
        }
        if (e.getSource() == exitJItem) {
            System.exit(0);
        }
    }
    
    private static boolean isInteger(String nm) {
        try{
           Integer.parseInt(nm);
           return true;
        }catch(NumberFormatException e ){
            return false;
        }
         
    }

    private void addMethod() {
        String sl;
        String nm;
        String price;
        String st;
        sl = serialJLabel.getText();
        nm = nameJTextField.getText().toUpperCase();
        price = priceJTextField.getText();
        st = stockJTextField.getText();
        
        boolean check = isInteger(price);
        boolean check1 = isInteger(st);
        
        if((check== false) && (!price.isEmpty())){
            JOptionPane.showMessageDialog(null, "Price Is not Invalid..");
        }
        else if((check1== false) && (!st.isEmpty())){
            JOptionPane.showMessageDialog(null, "Stock Is not Invalid..");
        }

        else if (sl.equals("") || nm.equals("") || price.equals("") || st.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Fill Up All Accurately.....");
        } else {
            JOptionPane.showMessageDialog(rootPane, "YOUR DATA IS SAVED..");
            ConnectorClass obj = new ConnectorClass();
            String query = "INSERT INTO food " + "VALUES ('" + sl + "', '" + nm + "', '" + price + "', '" + st + "')";
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
        
        len = len +1;
        String sl1 = ""+len;
        serialJLabel.setText(sl1);
        nameJTextField.setText("");
        priceJTextField.setText("");
        stockJTextField.setText("");
        len = len-1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        listJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        nameJTextField = new javax.swing.JTextField();
        serialTitleJLabel = new javax.swing.JLabel();
        naneTitleJLabel = new javax.swing.JLabel();
        stockTitleJLabel = new javax.swing.JLabel();
        priceTitleJLabel = new javax.swing.JLabel();
        stockJTextField = new javax.swing.JTextField();
        priceJTextField = new javax.swing.JTextField();
        serialJLabel = new javax.swing.JLabel();
        modifyProductlJButton = new javax.swing.JButton();
        searchJButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        sellJItem = new javax.swing.JMenuItem();
        modifyJItem = new javax.swing.JMenuItem();
        searchJItem = new javax.swing.JMenuItem();
        exitJItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backJButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        backJButton.setText("BACK");

        listJLabel.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        listJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listJLabel.setText("***List Of Food***");
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
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(listJTable);

        addJButton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        addJButton.setText("ADD");

        nameJTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextFieldActionPerformed(evt);
            }
        });

        serialTitleJLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        serialTitleJLabel.setText("Enter The  Serial no.         ");

        naneTitleJLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        naneTitleJLabel.setText("Enter The Name Of Food  ");

        stockTitleJLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        stockTitleJLabel.setText("Enter The Stock Amount");

        priceTitleJLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        priceTitleJLabel.setText("Enter The Price (per)         ");

        stockJTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        priceJTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        modifyProductlJButton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        modifyProductlJButton.setText("MODIFY PRODUCT");
        modifyProductlJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyProductlJButtonActionPerformed(evt);
            }
        });

        searchJButton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        searchJButton.setText("SREARCH");
        searchJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        sellJItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        sellJItem.setText("Sell Page");
        jMenu1.add(sellJItem);

        modifyJItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        modifyJItem.setText("Modify Page");
        modifyJItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyJItemActionPerformed(evt);
            }
        });
        jMenu1.add(modifyJItem);

        searchJItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        searchJItem.setText("Search Page");
        searchJItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJItemActionPerformed(evt);
            }
        });
        jMenu1.add(searchJItem);

        exitJItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        exitJItem.setText("Exit");
        jMenu1.add(exitJItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serialTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(naneTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 263, 263))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(stockJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceJTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(serialJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(listJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(modifyProductlJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifyProductlJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(serialJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(serialTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addComponent(addJButton))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJTextFieldActionPerformed

    private void modifyJItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyJItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifyJItemActionPerformed

    private void searchJItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchJItemActionPerformed

    private void modifyProductlJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyProductlJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifyProductlJButtonActionPerformed

    private void searchJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JMenuItem exitJItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel listJLabel;
    private javax.swing.JTable listJTable;
    private javax.swing.JMenuItem modifyJItem;
    private javax.swing.JButton modifyProductlJButton;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JLabel naneTitleJLabel;
    private javax.swing.JTextField priceJTextField;
    private javax.swing.JLabel priceTitleJLabel;
    private javax.swing.JButton searchJButton;
    private javax.swing.JMenuItem searchJItem;
    private javax.swing.JMenuItem sellJItem;
    private javax.swing.JLabel serialJLabel;
    private javax.swing.JLabel serialTitleJLabel;
    private javax.swing.JTextField stockJTextField;
    private javax.swing.JLabel stockTitleJLabel;
    // End of variables declaration//GEN-END:variables
}
