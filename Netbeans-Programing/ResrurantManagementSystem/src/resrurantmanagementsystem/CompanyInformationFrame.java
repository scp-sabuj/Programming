/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resrurantmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author F.C
 */
public class CompanyInformationFrame extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form CompanyInformation
     */
    int len = 0;

    public CompanyInformationFrame() {
        initComponents();
        setVisible(true);
        setTitle("This is ADD PAGE..");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        backJButton.addActionListener(this);
        okAddJButton.addActionListener(this);
        deleteEmployeeJButton.addActionListener(this);
        addEmployeeJButton.addActionListener(this);
        okDeleteJButton.addActionListener(this);

        visiableMethod();
        tableMethod();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backJButton) {
            setVisible(false);
            MainFrame mF = new MainFrame();
        }
        if (e.getSource() == okAddJButton) {
            addEmployeeJButton.setEnabled(true);
            okMethod();
            visiableMethod();
        }
        if (e.getSource() == deleteEmployeeJButton) {
            visiableMethod();
            nameToDeleteJTextField.setVisible(true);
            okDeleteJButton.setVisible(true);
            deleteEmployeeJButton.setEnabled(false);

        }
        if (e.getSource() == addEmployeeJButton) {
            addEmployeeJButton.setEnabled(false);
            addMethod();
        }
        if (e.getSource() == okDeleteJButton) {
            deleteMethod();
            visiableMethod();
            deleteEmployeeJButton.setEnabled(true);

        }

    }

    private void deleteMethod() {

        String[] nm1 = new String[100];
        int i = 0;
        int len = 0;

        String nm = nameToDeleteJTextField.getText().toUpperCase();

        ConnectorClass obj = new ConnectorClass();
        String query1 = "Select * FROM employee";
        try {

            obj.rs = obj.stmt.executeQuery(query1);

            while (obj.rs.next()) {

                nm1[i] = obj.rs.getString(2);

                i++;
                len = i;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String ch = "no";

        for (int j = 0; j < len; j++) {
            if (nm1[j].equals(nm)) {
                ch = "yes";
            }
        }

        if (ch.equals("yes")) {
            String query = "Delete FROM employee where Name = '" + nm + "'";
            try {

                obj.stmt.executeUpdate(query);
                obj.con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            for (int j = 0; j < len; j++) {
                DefaultTableModel model1 = (DefaultTableModel) empolyeeJTable.getModel();
                model1.removeRow(0);
            }
            tableMethod();
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Not Found...");
            ch = "no";
        }

    }

    private void okMethod() {
        String id;
        String nm;
        String type;
        String address;
        String phone;
        String salary;

        nm = nameJTextField.getText().toUpperCase();
        type = typeJTextField.getText();
        address = addressJTextField.getText();
        phone = phoneJTextField.getText();
        salary = salaryJTextField.getText();
        id = idJLabel.getText();

        int idInt = Integer.parseInt(id);

        if ((nm.equals("")) || (type.equals("")) || (address.equals("")) || (phone.equals("")) || (salary.equals(""))) {
            JOptionPane.showMessageDialog(null, "Fill Up All Content Accuratuly");
        } else {
            JOptionPane.showMessageDialog(rootPane, "YOUR DATA IS SAVED..");
            ConnectorClass ob3 = new ConnectorClass();
            String query = "INSERT INTO employee " + "VALUES ('" + idInt + "','" + nm + "', '" + type + "', '" + address + "', '" + phone + "', '" + salary + "')";
            try {

                ob3.stmt.executeUpdate(query);
                ob3.con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            for (int j = 0; j < len; j++) {
                DefaultTableModel model1 = (DefaultTableModel) empolyeeJTable.getModel();
                model1.removeRow(0);
            }

            tableMethod();

            nameJTextField.setText("");
            typeJTextField.setText("");
            addressJTextField.setText("");
            phoneJTextField.setText("");
            salaryJTextField.setText("");
        }
    }

    private String rendomMethod() {
        Random rn = new Random();
        long sln = 150010 + (rn.nextInt(100) + 1);

        String slnRan = "" + sln;
        return slnRan;
    }

    private static boolean isInteger(String nm) {
        try {
            Integer.parseInt(nm);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    private void addMethod() {
        idTitleJLabel.setVisible(true);
        idJLabel.setVisible(true);
        addressJLabel.setVisible(true);
        addressJTextField.setVisible(true);
        nameJLabel.setVisible(true);
        nameJTextField.setVisible(true);
        phoneJLabel.setVisible(true);
        phoneJTextField.setVisible(true);
        salaryJLabel.setVisible(true);
        salaryJTextField.setVisible(true);
        typeJLabel.setVisible(true);
        typeJTextField.setVisible(true);
        okAddJButton.setVisible(true);

        String serial = rendomMethod();
        idJLabel.setText(serial);

    }

    private void tableMethod() {
        int[] id = new int[100];
        String[] nm1 = new String[100];
        String[] type1 = new String[100];
        String[] address1 = new String[100];
        String[] phone1 = new String[100];
        String[] salary1 = new String[100];

        int i = 0;

        ConnectorClass ob3 = new ConnectorClass();
        String query1 = "Select * FROM employee";
        try {

            ob3.rs = ob3.stmt.executeQuery(query1);

            while (ob3.rs.next()) {

                id[i] = ob3.rs.getInt(1);
                nm1[i] = ob3.rs.getString(2);
                type1[i] = ob3.rs.getString(3);
                address1[i] = ob3.rs.getString(4);
                phone1[i] = ob3.rs.getString(5);
                salary1[i] = ob3.rs.getString(6);

                i++;
            }
        } catch (SQLException ev) {
            ev.printStackTrace();
        }

        len = i;

        for (int j = 0; j < len; j++) {
            Object[] row = {id[j], nm1[j], type1[j], address1[j], phone1[j], salary1[j]};
            DefaultTableModel model = (DefaultTableModel) empolyeeJTable.getModel();
            model.addRow(row);
        }
    }

    private void visiableMethod() {
        idTitleJLabel.setVisible(false);
        idJLabel.setVisible(false);
        addressJLabel.setVisible(false);
        addressJTextField.setVisible(false);
        nameJLabel.setVisible(false);
        nameJTextField.setVisible(false);
        phoneJLabel.setVisible(false);
        phoneJTextField.setVisible(false);
        salaryJLabel.setVisible(false);
        salaryJTextField.setVisible(false);
        typeJLabel.setVisible(false);
        typeJTextField.setVisible(false);
        okAddJButton.setVisible(false);
        nameToDeleteJTextField.setVisible(false);
        okDeleteJButton.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addEmployeeJButton = new javax.swing.JButton();
        deleteEmployeeJButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        empolyeeJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        nameJLabel = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        typeJLabel = new javax.swing.JLabel();
        typeJTextField = new javax.swing.JTextField();
        okAddJButton = new javax.swing.JButton();
        addressJTextField = new javax.swing.JTextField();
        phoneJTextField = new javax.swing.JTextField();
        phoneJLabel = new javax.swing.JLabel();
        addressJLabel = new javax.swing.JLabel();
        salaryJLabel = new javax.swing.JLabel();
        salaryJTextField = new javax.swing.JTextField();
        idTitleJLabel = new javax.swing.JLabel();
        idJLabel = new javax.swing.JLabel();
        nameToDeleteJTextField = new javax.swing.JTextField();
        okDeleteJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addEmployeeJButton.setText("Add Employee");

        deleteEmployeeJButton.setText("Delete Employee");

        empolyeeJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "TYPE", "ADDRESS", "PHONE NO", "SALARY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        empolyeeJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empolyeeJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(empolyeeJTable);

        backJButton.setText("BACK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameJLabel.setText("Name          :");
        jPanel2.add(nameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, 31));
        jPanel2.add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 155, 31));

        typeJLabel.setText("Type              :");
        jPanel2.add(typeJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 82, 31));

        typeJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeJTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(typeJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 101, 31));

        okAddJButton.setText("OK");
        jPanel2.add(okAddJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 113, 83, 30));
        jPanel2.add(addressJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 305, 35));
        jPanel2.add(phoneJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 155, 31));

        phoneJLabel.setText("Phone        :");
        jPanel2.add(phoneJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 70, 31));

        addressJLabel.setText("Address     :");
        jPanel2.add(addressJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 70, 35));

        salaryJLabel.setText("Salary            :");
        jPanel2.add(salaryJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 82, 31));
        jPanel2.add(salaryJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 101, 31));

        idTitleJLabel.setText("ID               :");
        jPanel2.add(idTitleJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 40));

        idJLabel.setText("ID");
        jPanel2.add(idJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 11, 155, 40));

        okDeleteJButton.setText("OK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(deleteEmployeeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameToDeleteJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(okDeleteJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addEmployeeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(addEmployeeJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(okDeleteJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameToDeleteJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteEmployeeJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typeJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeJTextFieldActionPerformed

    private void empolyeeJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empolyeeJTableMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_empolyeeJTableMouseClicked

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
            java.util.logging.Logger.getLogger(CompanyInformationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompanyInformationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompanyInformationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompanyInformationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompanyInformationFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmployeeJButton;
    private javax.swing.JLabel addressJLabel;
    private javax.swing.JTextField addressJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton deleteEmployeeJButton;
    private javax.swing.JTable empolyeeJTable;
    private javax.swing.JLabel idJLabel;
    private javax.swing.JLabel idTitleJLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTextField nameToDeleteJTextField;
    private javax.swing.JButton okAddJButton;
    private javax.swing.JButton okDeleteJButton;
    private javax.swing.JLabel phoneJLabel;
    private javax.swing.JTextField phoneJTextField;
    private javax.swing.JLabel salaryJLabel;
    private javax.swing.JTextField salaryJTextField;
    private javax.swing.JLabel typeJLabel;
    private javax.swing.JTextField typeJTextField;
    // End of variables declaration//GEN-END:variables

}
