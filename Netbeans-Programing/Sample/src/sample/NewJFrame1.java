/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sample;

/**
 *
 * @author F.C
 */
public class NewJFrame1 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public NewJFrame1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formJPanel = new javax.swing.JPanel();
        studentCourseTeacherJLabel = new javax.swing.JLabel();
        studentIdJLabel = new javax.swing.JLabel();
        studentNameFieldJLabel = new javax.swing.JLabel();
        studentNameTitleJLabel = new javax.swing.JLabel();
        studentCourseTitleJLabel = new javax.swing.JLabel();
        studentCourseCodeJLabel = new javax.swing.JLabel();
        studentDeptmentJLabel = new javax.swing.JLabel();
        studentSeasionJLabel = new javax.swing.JLabel();
        studentSeaasionJComboBox = new javax.swing.JComboBox();
        studentYearJLabel = new javax.swing.JLabel();
        studentYearJTextField = new javax.swing.JTextField();
        studentSectionJLabel = new javax.swing.JLabel();
        studentSectionJComboBox = new javax.swing.JComboBox();
        studentResistrationFromTitleJLabel = new javax.swing.JLabel();
        studentCourseCodeJComboBox = new javax.swing.JComboBox();
        studentCourseJLabel = new javax.swing.JLabel();
        studentDeptmentJComboBox = new javax.swing.JComboBox();
        studentCourseTeacherJComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        formJPanel.setBackground(new java.awt.Color(0, 0, 0));

        studentCourseTeacherJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentCourseTeacherJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentCourseTeacherJLabel.setText("Course Teacher :");

        studentIdJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentIdJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentIdJLabel.setText("Student ID            :");

        studentNameFieldJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentNameFieldJLabel.setForeground(new java.awt.Color(204, 0, 204));

        studentNameTitleJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentNameTitleJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentNameTitleJLabel.setText("Student Name     :");

        studentCourseTitleJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentCourseTitleJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentCourseTitleJLabel.setText("Course Title        :");

        studentCourseCodeJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentCourseCodeJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentCourseCodeJLabel.setText("Course Code       :");

        studentDeptmentJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentDeptmentJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentDeptmentJLabel.setText("Departnent          :");

        studentSeasionJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentSeasionJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentSeasionJLabel.setText("Session                 :");

        studentSeaasionJComboBox.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentSeaasionJComboBox.setForeground(new java.awt.Color(204, 0, 204));
        studentSeaasionJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Spring", "Summer", "Fall" }));

        studentYearJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentYearJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentYearJLabel.setText("Year :");

        studentYearJTextField.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentYearJTextField.setForeground(new java.awt.Color(204, 0, 204));

        studentSectionJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentSectionJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentSectionJLabel.setText("Section                  :");

        studentSectionJComboBox.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentSectionJComboBox.setForeground(new java.awt.Color(204, 0, 204));
        studentSectionJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D" }));
        studentSectionJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentSectionJComboBoxActionPerformed(evt);
            }
        });

        studentResistrationFromTitleJLabel.setFont(new java.awt.Font("Papyrus", 3, 36)); // NOI18N
        studentResistrationFromTitleJLabel.setForeground(new java.awt.Color(255, 0, 51));
        studentResistrationFromTitleJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        studentResistrationFromTitleJLabel.setText("This Is Student Resistration Form...");

        studentCourseCodeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        studentCourseJLabel.setText("jLabel1");

        studentDeptmentJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        studentCourseTeacherJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout formJPanelLayout = new javax.swing.GroupLayout(formJPanel);
        formJPanel.setLayout(formJPanelLayout);
        formJPanelLayout.setHorizontalGroup(
            formJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formJPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(formJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentResistrationFromTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formJPanelLayout.createSequentialGroup()
                        .addComponent(studentIdJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(studentNameFieldJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(studentNameTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formJPanelLayout.createSequentialGroup()
                        .addComponent(studentCourseCodeJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(studentCourseCodeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formJPanelLayout.createSequentialGroup()
                        .addComponent(studentCourseTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(studentCourseJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formJPanelLayout.createSequentialGroup()
                        .addComponent(studentDeptmentJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(studentDeptmentJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formJPanelLayout.createSequentialGroup()
                        .addComponent(studentSeasionJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(studentSeaasionJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(studentYearJLabel)
                        .addGap(14, 14, 14)
                        .addComponent(studentYearJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formJPanelLayout.createSequentialGroup()
                        .addComponent(studentSectionJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(studentSectionJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formJPanelLayout.createSequentialGroup()
                        .addComponent(studentCourseTeacherJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(studentCourseTeacherJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        formJPanelLayout.setVerticalGroup(
            formJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formJPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(studentResistrationFromTitleJLabel)
                .addGap(23, 23, 23)
                .addGroup(formJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentIdJLabel)
                    .addComponent(studentNameFieldJLabel))
                .addGap(11, 11, 11)
                .addComponent(studentNameTitleJLabel)
                .addGap(11, 11, 11)
                .addGroup(formJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentCourseCodeJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentCourseCodeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(formJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentCourseTitleJLabel)
                    .addComponent(studentCourseJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(formJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentDeptmentJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formJPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(studentDeptmentJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(formJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentSeasionJLabel)
                    .addComponent(studentSeaasionJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentYearJLabel)
                    .addComponent(studentYearJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(formJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentSectionJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentSectionJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(formJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentCourseTeacherJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentCourseTeacherJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(formJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(formJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentSectionJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentSectionJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentSectionJComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel formJPanel;
    private javax.swing.JComboBox studentCourseCodeJComboBox;
    private javax.swing.JLabel studentCourseCodeJLabel;
    private javax.swing.JLabel studentCourseJLabel;
    private javax.swing.JComboBox studentCourseTeacherJComboBox;
    private javax.swing.JLabel studentCourseTeacherJLabel;
    private javax.swing.JLabel studentCourseTitleJLabel;
    private javax.swing.JComboBox studentDeptmentJComboBox;
    private javax.swing.JLabel studentDeptmentJLabel;
    private javax.swing.JLabel studentIdJLabel;
    private javax.swing.JLabel studentNameFieldJLabel;
    private javax.swing.JLabel studentNameTitleJLabel;
    private javax.swing.JLabel studentResistrationFromTitleJLabel;
    private javax.swing.JComboBox studentSeaasionJComboBox;
    private javax.swing.JLabel studentSeasionJLabel;
    private javax.swing.JComboBox studentSectionJComboBox;
    private javax.swing.JLabel studentSectionJLabel;
    private javax.swing.JLabel studentYearJLabel;
    private javax.swing.JTextField studentYearJTextField;
    // End of variables declaration//GEN-END:variables
}
