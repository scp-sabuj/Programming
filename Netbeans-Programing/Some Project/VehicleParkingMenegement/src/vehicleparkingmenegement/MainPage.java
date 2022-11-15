/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleparkingmenegement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Stack;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo_pc
 */
public class MainPage extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form MainPage
     */
    public MainPage() {
        initComponents();
        setVisible(true);
        setTitle("Vehicle Parking Home  ");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        String serial = rendomMethod();
        serialNoJTextField.setText(serial);

        viewJButton.addActionListener(this);
        clearJButton.addActionListener(this);
        editJButton.addActionListener(this);
        saveJButton.addActionListener(this);
        exitJMenuItem.addActionListener(this);
        helpJMenuItem.addActionListener(this);

        saveJButton.setMnemonic('s');
        //saveJButton.setMnemonic(KeyEvent.VK_ENTER);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (viewJButton == e.getSource()) {
            viewMethod();
        }

        if (e.getSource() == editJButton) {
            editMethod();
        }

        if (e.getSource() == clearJButton) {
            clearMethod();
        }

        if (e.getSource() == saveJButton) {
            saveMethod();
        }
        if (e.getSource() == exitJMenuItem) {
            System.exit(0);
        }
        if (e.getSource() == helpJMenuItem) {

            JOptionPane.showMessageDialog(rootPane, "ABOUT THIS PAGE...\n"
                    + "'SAVE' button will save your data.\n"
                    + "'CLEAR' button will clear all information that you are entered in the text field.\n"
                    + "'VIEW' button will show your saved data.\n"
                    + "'EDIT' button will show you a page where you can edit data.");
        }

    }

    private void viewMethod() {
        setVisible(false);
        ViewPage viewPage = new ViewPage();
        //View obj = new View();
    }

    private void editMethod() {
        setVisible(false);
        EditPage editPage = new EditPage();
    }

    private void clearMethod() {

        String serial = rendomMethod();
        serialNoJTextField.setText(serial);

        serialNoJTextField.setText(serial);
        nameJTextField.setText("");
        addressJTextArea.setText("");
        mobileNoJTextField.setText("");
        licenseNoJTextField.setText("");
        vehicleNoJTextField.setText("");
        //parkingTimeJTextField.setText("");

    }

    public void saveMethod() {

        String sl = serialNoJTextField.getText();
        String n = nameJTextField.getText();
        String add = addressJTextArea.getText();
        String m = mobileNoJTextField.getText();
        String l = licenseNoJTextField.getText();
        String v = vehicleNoJTextField.getText();

        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss a zzz " + " & " + "\nE dd.mm.yyyy");

        String tD = ft.format(dNow);
        if ((n.equals("")) || (add.equals("")) || (m.equals("")) || (l.equals("")) || (v.equals(""))) {
            JOptionPane.showMessageDialog(null, "Fill Up All Content Accuratuly");
        } else {
            JOptionPane.showMessageDialog(rootPane, "YOUR DATA IS SAVED..");
            Conection ob3 = new Conection();
            String query = "INSERT INTO informationlist " + "VALUES ('" + sl + "', '" + n + "', '" + add + "', '" + m + "', '" + l + "', '" + v + "', '" + tD + "', '" + "YES" + "')";
            try {

                ob3.stmt.executeUpdate(query);
                ob3.con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            serialNoJTextField.setText("");
            nameJTextField.setText("");
            addressJTextArea.setText("");
            mobileNoJTextField.setText("");
            licenseNoJTextField.setText("");
            vehicleNoJTextField.setText("");

        }

        String serial = rendomMethod();
        serialNoJTextField.setText(serial);
    }

    private String rendomMethod() {
        Random rn = new Random();
        long sln = 150010 + (rn.nextInt(100) + 1);

        String slnRan = "" + sln;
        return slnRan;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundJPanel = new javax.swing.JPanel();
        nameJLabel = new javax.swing.JLabel();
        serialNoJLabel = new javax.swing.JLabel();
        addressJLabel = new javax.swing.JLabel();
        mobileNoJLabel = new javax.swing.JLabel();
        licenseNoJLabel = new javax.swing.JLabel();
        vehicleNoJLabel = new javax.swing.JLabel();
        parkingTimeJLabel = new javax.swing.JLabel();
        footerJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressJTextArea = new javax.swing.JTextArea();
        serialNoJTextField = new javax.swing.JTextField();
        nameJTextField = new javax.swing.JTextField();
        mobileNoJTextField = new javax.swing.JTextField();
        licenseNoJTextField = new javax.swing.JTextField();
        vehicleNoJTextField = new javax.swing.JTextField();
        buttonJPanel = new javax.swing.JPanel();
        viewJButton = new javax.swing.JButton();
        editJButton = new javax.swing.JButton();
        clearJButton = new javax.swing.JButton();
        saveJButton = new javax.swing.JButton();
        vehicleParkingMenegementJLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        exitJMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        helpJMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.black);

        backgroundJPanel.setBackground(new java.awt.Color(0, 255, 255));
        backgroundJPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 204)));

        nameJLabel.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        nameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nameJLabel.setText("Name                  :");

        serialNoJLabel.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        serialNoJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        serialNoJLabel.setText("Serial No.            :");

        addressJLabel.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        addressJLabel.setText("Address              :");

        mobileNoJLabel.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        mobileNoJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mobileNoJLabel.setText("Mobile No.         :");

        licenseNoJLabel.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        licenseNoJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        licenseNoJLabel.setText("License No.        :");

        vehicleNoJLabel.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        vehicleNoJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        vehicleNoJLabel.setText("Vehicle No.        :");

        parkingTimeJLabel.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        parkingTimeJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        parkingTimeJLabel.setText("Parking Time     :");

        footerJLabel.setBackground(new java.awt.Color(0, 0, 255));
        footerJLabel.setFont(new java.awt.Font("Yu Mincho Light", 3, 14)); // NOI18N
        footerJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        footerJLabel.setText("copyright@sabuj&nurul");

        addressJTextArea.setColumns(20);
        addressJTextArea.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        addressJTextArea.setRows(5);
        jScrollPane1.setViewportView(addressJTextArea);

        serialNoJTextField.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N

        nameJTextField.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N

        mobileNoJTextField.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N

        licenseNoJTextField.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N

        vehicleNoJTextField.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        vehicleNoJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleNoJTextFieldActionPerformed(evt);
            }
        });

        buttonJPanel.setBackground(new java.awt.Color(0, 102, 102));
        buttonJPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 87, 84), 3, true));

        viewJButton.setBackground(new java.awt.Color(255, 255, 255));
        viewJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehicleparkingmenegement/view.jpeg"))); // NOI18N
        viewJButton.setText("VIEW");
        viewJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewJButtonActionPerformed(evt);
            }
        });

        editJButton.setBackground(new java.awt.Color(255, 255, 255));
        editJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehicleparkingmenegement/edit.png"))); // NOI18N
        editJButton.setText("EDIT");
        editJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJButtonActionPerformed(evt);
            }
        });

        clearJButton.setBackground(new java.awt.Color(255, 255, 255));
        clearJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehicleparkingmenegement/clear.jpeg"))); // NOI18N
        clearJButton.setText("CLEAR");
        clearJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJButtonActionPerformed(evt);
            }
        });

        saveJButton.setBackground(new java.awt.Color(255, 255, 255));
        saveJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehicleparkingmenegement/Save-icon.png"))); // NOI18N
        saveJButton.setText("SAVE");
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonJPanelLayout = new javax.swing.GroupLayout(buttonJPanel);
        buttonJPanel.setLayout(buttonJPanelLayout);
        buttonJPanelLayout.setHorizontalGroup(
            buttonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonJPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(buttonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clearJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(viewJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        buttonJPanelLayout.setVerticalGroup(
            buttonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonJPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(saveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(viewJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(editJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(clearJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        vehicleParkingMenegementJLabel.setBackground(new java.awt.Color(0, 0, 0));
        vehicleParkingMenegementJLabel.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        vehicleParkingMenegementJLabel.setForeground(new java.awt.Color(153, 0, 153));
        vehicleParkingMenegementJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vehicleParkingMenegementJLabel.setText("VEHICLE   PARKING   MENEGEMENT");
        vehicleParkingMenegementJLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 204)));

        jLabel1.setBackground(new java.awt.Color(255, 0, 255));
        jLabel1.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("This Will be automatically Fill Up, No Need To Fill Up It.");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout backgroundJPanelLayout = new javax.swing.GroupLayout(backgroundJPanel);
        backgroundJPanel.setLayout(backgroundJPanelLayout);
        backgroundJPanelLayout.setHorizontalGroup(
            backgroundJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vehicleParkingMenegementJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundJPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(backgroundJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundJPanelLayout.createSequentialGroup()
                        .addComponent(mobileNoJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(454, 454, 454))
                    .addGroup(backgroundJPanelLayout.createSequentialGroup()
                        .addGroup(backgroundJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(vehicleNoJLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(parkingTimeJLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(serialNoJLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameJLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addressJLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(licenseNoJLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(backgroundJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(backgroundJPanelLayout.createSequentialGroup()
                                .addGroup(backgroundJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(serialNoJTextField)
                                    .addComponent(nameJTextField)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                    .addComponent(licenseNoJTextField)
                                    .addComponent(vehicleNoJTextField)
                                    .addComponent(mobileNoJTextField))
                                .addGap(44, 44, 44)
                                .addComponent(buttonJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(36, Short.MAX_VALUE))))
            .addComponent(footerJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backgroundJPanelLayout.setVerticalGroup(
            backgroundJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundJPanelLayout.createSequentialGroup()
                .addComponent(vehicleParkingMenegementJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(backgroundJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundJPanelLayout.createSequentialGroup()
                        .addGroup(backgroundJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serialNoJLabel)
                            .addComponent(serialNoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(backgroundJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameJLabel)
                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(backgroundJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundJPanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundJPanelLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(addressJLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(backgroundJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(licenseNoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(licenseNoJLabel))
                        .addGap(18, 18, 18)
                        .addGroup(backgroundJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mobileNoJLabel)
                            .addComponent(mobileNoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(backgroundJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vehicleNoJLabel)
                            .addComponent(vehicleNoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(buttonJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(backgroundJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(backgroundJPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(parkingTimeJLabel))
                    .addGroup(backgroundJPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(29, 29, 29)
                .addComponent(footerJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("File");

        exitJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        exitJMenuItem.setText("Exit");
        jMenu1.add(exitJMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        helpJMenuItem.setText("Help");
        jMenu2.add(helpJMenuItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editJButtonActionPerformed

    private void vehicleNoJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleNoJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicleNoJTextFieldActionPerformed

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveJButtonActionPerformed

    private void viewJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewJButtonActionPerformed

    private void clearJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearJButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressJLabel;
    private javax.swing.JTextArea addressJTextArea;
    private javax.swing.JPanel backgroundJPanel;
    private javax.swing.JPanel buttonJPanel;
    private javax.swing.JButton clearJButton;
    private javax.swing.JButton editJButton;
    private javax.swing.JMenuItem exitJMenuItem;
    private javax.swing.JLabel footerJLabel;
    private javax.swing.JMenuItem helpJMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel licenseNoJLabel;
    private javax.swing.JTextField licenseNoJTextField;
    private javax.swing.JLabel mobileNoJLabel;
    private javax.swing.JTextField mobileNoJTextField;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JLabel parkingTimeJLabel;
    private javax.swing.JButton saveJButton;
    private javax.swing.JLabel serialNoJLabel;
    private javax.swing.JTextField serialNoJTextField;
    private javax.swing.JLabel vehicleNoJLabel;
    private javax.swing.JTextField vehicleNoJTextField;
    private javax.swing.JLabel vehicleParkingMenegementJLabel;
    private javax.swing.JButton viewJButton;
    // End of variables declaration//GEN-END:variables

}
