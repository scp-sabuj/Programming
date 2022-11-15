/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package attendancemanagementapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

/**
 *
 * @author F.C
 */
public class MainJFrame1 extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form MainJFrame
     */
    String logIn = null;

    public MainJFrame1() {
        initComponents();

        setVisible(true);
        setTitle("This is ABOUT PAGE..");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        visiableMethod();

        ButtonGroup group, group1;
        group = new ButtonGroup();
        group.add(authorJRadioButton3);
        group.add(teacherLogInJRadioButton1);
        group.add(studentLogInJRadioButton2);

        authorJRadioButton3.addActionListener(this);
        teacherLogInJRadioButton1.addActionListener(this);
        studentLogInJRadioButton2.addActionListener(this);
        okJButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == authorJRadioButton3) {
            visiableMethod();
            logoJLabel.setVisible(false);
            authorUserNameJLabel.setVisible(true);
            userNameAuthorJTextField.setVisible(true);
            passwordAuthorJField.setVisible(true);
            passwordAuthorJLabel.setVisible(true);
            titeAuthorJLabel.setVisible(true);
            okJButton.setVisible(true);
            
            logIn="author";
        }
        if (e.getSource() == teacherLogInJRadioButton1) {
            visiableMethod();
            logoJLabel.setVisible(false);
            titleTeacherJLabel.setVisible(true);
            userNameTeacherJLabel.setVisible(true);
            passwordTeacherJLabel.setVisible(true);
            userNameTeacherJTextField.setVisible(true);
            passwordTeacherJField.setVisible(true);
            okJButton.setVisible(true);
            
            logIn = "teacher";
        }
        if (e.getSource() == studentLogInJRadioButton2) {
            visiableMethod();
            logoJLabel.setVisible(false);
            titleStudentJLabel.setVisible(true);
            userNameStudentJLabel1.setVisible(true);
            userNameStudentJTextField1.setVisible(true);
            passwordStudentJLabel1.setVisible(true);
            passwordStudentJField1.setVisible(true);
            okJButton.setVisible(true);

            logIn = "student";
        }
        if (e.getSource() == okJButton) {
            if (logIn.equals("teacher")) {
                if (userNameTeacherJTextField.getText().equals("") || passwordTeacherJField.getText().equals("")) {
                    JOptionPane.showMessageDialog(rootPane, "Enter you USER NAME and PASSWORD......");
                } else {
                    setVisible(false);
                    AttendanceJFrame aJF = new AttendanceJFrame();
                }
            }
            else if(logIn.equals("author")){
                if (userNameAuthorJTextField.getText().equals("NEUB") || passwordAuthorJField.getText().equals("neub12345")) {
                    setVisible(false);
                    ResistrationJFrame rJf = new ResistrationJFrame();
                } else {
                    
                    JOptionPane.showMessageDialog(rootPane, "Enter you USER NAME and PASSWORD......");
                }
            }
            else {
                if (userNameStudentJTextField1.getText().equals("") || passwordStudentJField1.getText().equals("")) {
                    JOptionPane.showMessageDialog(rootPane, "Enter you USER NAME and PASSWORD......");
                } else {
                    setVisible(false);
                    ViewJFrame vJF = new ViewJFrame();
                }

            }
        }

    }

    private void visiableMethod() {
        userNameTeacherJLabel.setVisible(false);
        passwordTeacherJLabel.setVisible(false);
        userNameTeacherJTextField.setVisible(false);
        passwordTeacherJField.setVisible(false);
        userNameStudentJLabel1.setVisible(false);
        userNameStudentJTextField1.setVisible(false);
        passwordStudentJLabel1.setVisible(false);
        passwordStudentJField1.setVisible(false);
        titleStudentJLabel.setVisible(false);
        titleTeacherJLabel.setVisible(false);
        authorUserNameJLabel.setVisible(false);
        userNameAuthorJTextField.setVisible(false);
        passwordAuthorJField.setVisible(false);
        passwordAuthorJLabel.setVisible(false);
        titeAuthorJLabel.setVisible(false);
        okJButton.setVisible(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        titleStudentJLabel = new javax.swing.JLabel();
        authorUserNameJLabel = new javax.swing.JLabel();
        userNameTeacherJLabel = new javax.swing.JLabel();
        userNameStudentJLabel1 = new javax.swing.JLabel();
        userNameAuthorJTextField = new javax.swing.JTextField();
        userNameTeacherJTextField = new javax.swing.JTextField();
        userNameStudentJTextField1 = new javax.swing.JTextField();
        passwordAuthorJLabel = new javax.swing.JLabel();
        passwordTeacherJLabel = new javax.swing.JLabel();
        passwordStudentJLabel1 = new javax.swing.JLabel();
        passwordTeacherJField = new javax.swing.JPasswordField();
        passwordStudentJField1 = new javax.swing.JPasswordField();
        passwordAuthorJField = new javax.swing.JPasswordField();
        titeAuthorJLabel = new javax.swing.JLabel();
        titleTeacherJLabel = new javax.swing.JLabel();
        okJButton = new javax.swing.JButton();
        logoJLabel = new javax.swing.JLabel();
        authorJRadioButton3 = new javax.swing.JRadioButton();
        studentLogInJRadioButton2 = new javax.swing.JRadioButton();
        teacherLogInJRadioButton1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleStudentJLabel.setFont(new java.awt.Font("LilyUPC", 3, 48)); // NOI18N
        titleStudentJLabel.setForeground(new java.awt.Color(255, 0, 51));
        titleStudentJLabel.setText("STUDENT LOG IN INFORMATION   :");
        jPanel1.add(titleStudentJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 550, 33));

        authorUserNameJLabel.setBackground(new java.awt.Color(255, 255, 255));
        authorUserNameJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        authorUserNameJLabel.setForeground(new java.awt.Color(204, 0, 204));
        authorUserNameJLabel.setText("USER NAME   :");
        jPanel1.add(authorUserNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 181, 40));

        userNameTeacherJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        userNameTeacherJLabel.setForeground(new java.awt.Color(204, 0, 204));
        userNameTeacherJLabel.setText("USER NAME   :");
        userNameTeacherJLabel.setToolTipText("");
        jPanel1.add(userNameTeacherJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 185, 40));

        userNameStudentJLabel1.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        userNameStudentJLabel1.setForeground(new java.awt.Color(204, 0, 204));
        userNameStudentJLabel1.setText("USER NAME   :");
        jPanel1.add(userNameStudentJLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 184, 40));

        userNameAuthorJTextField.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        userNameAuthorJTextField.setForeground(new java.awt.Color(204, 0, 204));
        userNameAuthorJTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(userNameAuthorJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 210, 40));

        userNameTeacherJTextField.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        userNameTeacherJTextField.setForeground(new java.awt.Color(204, 0, 204));
        userNameTeacherJTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(userNameTeacherJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 210, 40));

        userNameStudentJTextField1.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        userNameStudentJTextField1.setForeground(new java.awt.Color(204, 0, 204));
        userNameStudentJTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(userNameStudentJTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 210, 40));

        passwordAuthorJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        passwordAuthorJLabel.setForeground(new java.awt.Color(204, 0, 204));
        passwordAuthorJLabel.setText("PASWORD    :");
        jPanel1.add(passwordAuthorJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 177, 40));

        passwordTeacherJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        passwordTeacherJLabel.setForeground(new java.awt.Color(204, 0, 204));
        passwordTeacherJLabel.setText("PASWORD    :");
        jPanel1.add(passwordTeacherJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 176, 40));

        passwordStudentJLabel1.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        passwordStudentJLabel1.setForeground(new java.awt.Color(204, 0, 204));
        passwordStudentJLabel1.setText("PASWORD    :");
        jPanel1.add(passwordStudentJLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 180, 40));

        passwordTeacherJField.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        passwordTeacherJField.setForeground(new java.awt.Color(204, 0, 204));
        jPanel1.add(passwordTeacherJField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 210, 40));

        passwordStudentJField1.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        passwordStudentJField1.setForeground(new java.awt.Color(204, 0, 204));
        jPanel1.add(passwordStudentJField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 210, 40));

        passwordAuthorJField.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        passwordAuthorJField.setForeground(new java.awt.Color(204, 0, 204));
        jPanel1.add(passwordAuthorJField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 210, 40));

        titeAuthorJLabel.setFont(new java.awt.Font("LilyUPC", 3, 48)); // NOI18N
        titeAuthorJLabel.setForeground(new java.awt.Color(255, 0, 51));
        titeAuthorJLabel.setText("AUTHOR LOG IN INFORMATION   :");
        jPanel1.add(titeAuthorJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 548, 35));

        titleTeacherJLabel.setFont(new java.awt.Font("LilyUPC", 3, 48)); // NOI18N
        titleTeacherJLabel.setForeground(new java.awt.Color(255, 0, 51));
        titleTeacherJLabel.setText("TEACHER LOG IN INFORMATION  :");
        jPanel1.add(titleTeacherJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 548, 33));

        okJButton.setFont(new java.awt.Font("Curlz MT", 3, 24)); // NOI18N
        okJButton.setForeground(new java.awt.Color(0, 51, 255));
        okJButton.setText("Log In");
        jPanel1.add(okJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 123, 35));

        logoJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancemanagementapp/neublogo.jpeg"))); // NOI18N
        logoJLabel.setText("jLabel1");
        jPanel1.add(logoJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 330));

        authorJRadioButton3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        authorJRadioButton3.setForeground(new java.awt.Color(0, 0, 204));
        authorJRadioButton3.setText("UNIVERSITY AUTHOR");

        studentLogInJRadioButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        studentLogInJRadioButton2.setForeground(new java.awt.Color(0, 0, 204));
        studentLogInJRadioButton2.setText("STUDENT");

        teacherLogInJRadioButton1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        teacherLogInJRadioButton1.setForeground(new java.awt.Color(0, 0, 204));
        teacherLogInJRadioButton1.setText("TEACHER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(teacherLogInJRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(studentLogInJRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(authorJRadioButton3)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teacherLogInJRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentLogInJRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorJRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(MainJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton authorJRadioButton3;
    private javax.swing.JLabel authorUserNameJLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logoJLabel;
    private javax.swing.JButton okJButton;
    private javax.swing.JPasswordField passwordAuthorJField;
    private javax.swing.JLabel passwordAuthorJLabel;
    private javax.swing.JPasswordField passwordStudentJField1;
    private javax.swing.JLabel passwordStudentJLabel1;
    private javax.swing.JPasswordField passwordTeacherJField;
    private javax.swing.JLabel passwordTeacherJLabel;
    private javax.swing.JRadioButton studentLogInJRadioButton2;
    private javax.swing.JRadioButton teacherLogInJRadioButton1;
    private javax.swing.JLabel titeAuthorJLabel;
    private javax.swing.JLabel titleStudentJLabel;
    private javax.swing.JLabel titleTeacherJLabel;
    private javax.swing.JTextField userNameAuthorJTextField;
    private javax.swing.JLabel userNameStudentJLabel1;
    private javax.swing.JTextField userNameStudentJTextField1;
    private javax.swing.JLabel userNameTeacherJLabel;
    private javax.swing.JTextField userNameTeacherJTextField;
    // End of variables declaration//GEN-END:variables

}
