/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancemanagementapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;

/**
 *
 * @author F.C
 */
public class ResistrationJFrame extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form ResistrationJFrame
     */
    public ResistrationJFrame() {
        initComponents();
        setVisible(true);
        setTitle("This is Resstration Page..");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        visiableMethod();

        ButtonGroup group, group1;
        group = new ButtonGroup();
        group.add(teacherResistationJRadioButton);
        group.add(studentResistationJRadioButton);
        
        teacherResistationJRadioButton.addActionListener(this);
        studentResistationJRadioButton.addActionListener(this);
        okJButton.addActionListener(this);
        backJButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == teacherResistationJRadioButton) {
            visiableMethod();
            teacherCourseCodeJLabel.setVisible(true);
            teacherCourseCodeJTextField.setVisible(true);
            teacherCourseJLabel.setVisible(true);
            teacherCourseJTextField.setVisible(true);
            teacherDeptmentJLabel.setVisible(true);
            teacherDeptmentJTextField.setVisible(true);
            teacherIdFieldJLabel.setVisible(true);
            teacherIdJLabel.setVisible(true);
            teacherNameJLabel.setVisible(true);
            teacherNameJTextField.setVisible(true);
            teacherResistrationFromTitleJLabel.setVisible(true);
            teacherSeaasionJComboBox.setVisible(true);
            teacherSeasionJLabel.setVisible(true);
            teacherSectionJComboBox.setVisible(true);
            teacherSectionJLabel.setVisible(true);
            teacherYearJLabel.setVisible(true);
            teacherYearJTextField.setVisible(true);

        }
        if (e.getSource() == studentResistationJRadioButton) {
            visiableMethod();
            studentCourseCodeJLabel.setVisible(true);
            studentCourseCodeJTextField.setVisible(true);
            studentCourseJLabel.setVisible(true);
            studentCourseJTextField.setVisible(true);
            studentCourseTeacherJLabel.setVisible(true);
            studentCourseTeacherJTextField.setVisible(true);
            studentDeptmentJLabel.setVisible(true);
            studentDeptmentJTextField.setVisible(true);
            studentIdFieldJLabel.setVisible(true);
            studentIdJLabel.setVisible(true);
            studentNameJLabel.setVisible(true);
            studentNameJTextField.setVisible(true);
            studentResistrationFromTitleJLabel.setVisible(true);
            studentSeaasionJComboBox.setVisible(true);
            studentSeasionJLabel.setVisible(true);
            studentSectionJComboBox.setVisible(true);
            studentSectionJLabel.setVisible(true);
            studentYearJLabel.setVisible(true);
            studentYearJTextField.setVisible(true);
        }
        if(e.getSource()==backJButton){
            setVisible(false);
            MainJFrame1 mJF = new MainJFrame1();
        }
        if(e.getSource()==okJButton){
            
        }
    }

    private void visiableMethod() {
        studentCourseCodeJLabel.setVisible(false);
        studentCourseCodeJTextField.setVisible(false);
        studentCourseJLabel.setVisible(false);
        studentCourseJTextField.setVisible(false);
        studentCourseTeacherJLabel.setVisible(false);
        studentCourseTeacherJTextField.setVisible(false);
        studentDeptmentJLabel.setVisible(false);
        studentDeptmentJTextField.setVisible(false);
        studentIdFieldJLabel.setVisible(false);
        studentIdJLabel.setVisible(false);
        studentNameJLabel.setVisible(false);
        studentNameJTextField.setVisible(false);
        studentResistrationFromTitleJLabel.setVisible(false);
        studentSeaasionJComboBox.setVisible(false);
        studentSeasionJLabel.setVisible(false);
        studentSectionJComboBox.setVisible(false);
        studentSectionJLabel.setVisible(false);
        studentYearJLabel.setVisible(false);
        studentYearJTextField.setVisible(false);
        teacherCourseCodeJLabel.setVisible(false);
        teacherCourseCodeJTextField.setVisible(false);
        teacherCourseJLabel.setVisible(false);
        teacherCourseJTextField.setVisible(false);
        teacherDeptmentJLabel.setVisible(false);
        teacherDeptmentJTextField.setVisible(false);
        teacherIdFieldJLabel.setVisible(false);
        teacherIdJLabel.setVisible(false);
        teacherNameJLabel.setVisible(false);
        teacherNameJTextField.setVisible(false);
        teacherResistrationFromTitleJLabel.setVisible(false);
        teacherSeaasionJComboBox.setVisible(false);
        teacherSeasionJLabel.setVisible(false);
        teacherSectionJComboBox.setVisible(false);
        teacherSectionJLabel.setVisible(false);
        teacherYearJLabel.setVisible(false);
        teacherYearJTextField.setVisible(false);
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
        formJPanel = new javax.swing.JPanel();
        teacherIdFieldJLabel = new javax.swing.JLabel();
        teacherIdJLabel = new javax.swing.JLabel();
        teacherNameJLabel = new javax.swing.JLabel();
        teacherCourseJTextField = new javax.swing.JTextField();
        teacherNameJTextField = new javax.swing.JTextField();
        teacherCourseJLabel = new javax.swing.JLabel();
        teacherCourseCodeJTextField = new javax.swing.JTextField();
        teacherCourseCodeJLabel = new javax.swing.JLabel();
        teacherDeptmentJTextField = new javax.swing.JTextField();
        teacherDeptmentJLabel = new javax.swing.JLabel();
        teacherSeasionJLabel = new javax.swing.JLabel();
        teacherSeaasionJComboBox = new javax.swing.JComboBox();
        teacherYearJLabel = new javax.swing.JLabel();
        teacherYearJTextField = new javax.swing.JTextField();
        studentSectionJComboBox = new javax.swing.JComboBox();
        studentSectionJLabel = new javax.swing.JLabel();
        studentCourseTeacherJLabel = new javax.swing.JLabel();
        studentCourseTeacherJTextField = new javax.swing.JTextField();
        studentResistrationFromTitleJLabel = new javax.swing.JLabel();
        teacherResistrationFromTitleJLabel = new javax.swing.JLabel();
        studentIdJLabel = new javax.swing.JLabel();
        studentIdFieldJLabel = new javax.swing.JLabel();
        studentNameJTextField = new javax.swing.JTextField();
        studentNameJLabel = new javax.swing.JLabel();
        studentCourseJTextField = new javax.swing.JTextField();
        studentCourseJLabel = new javax.swing.JLabel();
        studentCourseCodeJLabel = new javax.swing.JLabel();
        studentCourseCodeJTextField = new javax.swing.JTextField();
        studentDeptmentJLabel = new javax.swing.JLabel();
        studentDeptmentJTextField = new javax.swing.JTextField();
        studentSeasionJLabel = new javax.swing.JLabel();
        studentSeaasionJComboBox = new javax.swing.JComboBox();
        studentYearJLabel = new javax.swing.JLabel();
        studentYearJTextField = new javax.swing.JTextField();
        teacherSectionJComboBox = new javax.swing.JComboBox();
        teacherSectionJLabel = new javax.swing.JLabel();
        teacherResistationJRadioButton = new javax.swing.JRadioButton();
        studentResistationJRadioButton = new javax.swing.JRadioButton();
        okJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        formJPanel.setBackground(new java.awt.Color(0, 0, 0));
        formJPanel.setLayout(null);

        teacherIdFieldJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherIdFieldJLabel.setForeground(new java.awt.Color(204, 0, 204));
        formJPanel.add(teacherIdFieldJLabel);
        teacherIdFieldJLabel.setBounds(240, 100, 340, 30);

        teacherIdJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherIdJLabel.setForeground(new java.awt.Color(204, 0, 204));
        teacherIdJLabel.setText("Teacher ID           :");
        formJPanel.add(teacherIdJLabel);
        teacherIdJLabel.setBounds(20, 100, 210, 30);

        teacherNameJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherNameJLabel.setForeground(new java.awt.Color(204, 0, 204));
        teacherNameJLabel.setText("Teacher Name    :");
        formJPanel.add(teacherNameJLabel);
        teacherNameJLabel.setBounds(20, 140, 204, 30);

        teacherCourseJTextField.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherCourseJTextField.setForeground(new java.awt.Color(204, 0, 204));
        formJPanel.add(teacherCourseJTextField);
        teacherCourseJTextField.setBounds(240, 180, 340, 30);

        teacherNameJTextField.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherNameJTextField.setForeground(new java.awt.Color(204, 0, 204));
        formJPanel.add(teacherNameJTextField);
        teacherNameJTextField.setBounds(240, 140, 340, 30);

        teacherCourseJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherCourseJLabel.setForeground(new java.awt.Color(204, 0, 204));
        teacherCourseJLabel.setText("Course Title        :");
        formJPanel.add(teacherCourseJLabel);
        teacherCourseJLabel.setBounds(20, 180, 204, 30);

        teacherCourseCodeJTextField.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherCourseCodeJTextField.setForeground(new java.awt.Color(204, 0, 204));
        formJPanel.add(teacherCourseCodeJTextField);
        teacherCourseCodeJTextField.setBounds(240, 220, 340, 30);

        teacherCourseCodeJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherCourseCodeJLabel.setForeground(new java.awt.Color(204, 0, 204));
        teacherCourseCodeJLabel.setText("Course Code       :");
        formJPanel.add(teacherCourseCodeJLabel);
        teacherCourseCodeJLabel.setBounds(20, 220, 210, 30);

        teacherDeptmentJTextField.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherDeptmentJTextField.setForeground(new java.awt.Color(204, 0, 204));
        teacherDeptmentJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherDeptmentJTextFieldActionPerformed(evt);
            }
        });
        formJPanel.add(teacherDeptmentJTextField);
        teacherDeptmentJTextField.setBounds(240, 260, 340, 30);

        teacherDeptmentJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherDeptmentJLabel.setForeground(new java.awt.Color(204, 0, 204));
        teacherDeptmentJLabel.setText("Departnent          :");
        formJPanel.add(teacherDeptmentJLabel);
        teacherDeptmentJLabel.setBounds(20, 260, 210, 29);

        teacherSeasionJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherSeasionJLabel.setForeground(new java.awt.Color(204, 0, 204));
        teacherSeasionJLabel.setText("Seasion                 :");
        formJPanel.add(teacherSeasionJLabel);
        teacherSeasionJLabel.setBounds(20, 300, 204, 30);

        teacherSeaasionJComboBox.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherSeaasionJComboBox.setForeground(new java.awt.Color(204, 0, 204));
        teacherSeaasionJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Spring", "Summer", "Winter" }));
        formJPanel.add(teacherSeaasionJComboBox);
        teacherSeaasionJComboBox.setBounds(240, 300, 132, 30);

        teacherYearJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherYearJLabel.setForeground(new java.awt.Color(204, 0, 204));
        teacherYearJLabel.setText("Year :");
        formJPanel.add(teacherYearJLabel);
        teacherYearJLabel.setBounds(380, 300, 71, 30);

        teacherYearJTextField.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherYearJTextField.setForeground(new java.awt.Color(204, 0, 204));
        formJPanel.add(teacherYearJTextField);
        teacherYearJTextField.setBounds(460, 300, 120, 30);

        studentSectionJComboBox.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentSectionJComboBox.setForeground(new java.awt.Color(204, 0, 204));
        studentSectionJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D" }));
        formJPanel.add(studentSectionJComboBox);
        studentSectionJComboBox.setBounds(240, 340, 111, 30);

        studentSectionJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentSectionJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentSectionJLabel.setText("Section                  :");
        formJPanel.add(studentSectionJLabel);
        studentSectionJLabel.setBounds(20, 340, 204, 30);

        studentCourseTeacherJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentCourseTeacherJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentCourseTeacherJLabel.setText("Course Teacher :");
        formJPanel.add(studentCourseTeacherJLabel);
        studentCourseTeacherJLabel.setBounds(20, 380, 210, 30);

        studentCourseTeacherJTextField.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentCourseTeacherJTextField.setForeground(new java.awt.Color(204, 0, 204));
        formJPanel.add(studentCourseTeacherJTextField);
        studentCourseTeacherJTextField.setBounds(240, 380, 340, 30);

        studentResistrationFromTitleJLabel.setFont(new java.awt.Font("Papyrus", 3, 36)); // NOI18N
        studentResistrationFromTitleJLabel.setForeground(new java.awt.Color(255, 0, 51));
        studentResistrationFromTitleJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        studentResistrationFromTitleJLabel.setText("This Is Student Resistration Form...");
        formJPanel.add(studentResistrationFromTitleJLabel);
        studentResistrationFromTitleJLabel.setBounds(10, 20, 650, 57);

        teacherResistrationFromTitleJLabel.setFont(new java.awt.Font("Papyrus", 3, 36)); // NOI18N
        teacherResistrationFromTitleJLabel.setForeground(new java.awt.Color(255, 0, 51));
        teacherResistrationFromTitleJLabel.setText("This Is Teacher Resistration Form...");
        formJPanel.add(teacherResistrationFromTitleJLabel);
        teacherResistrationFromTitleJLabel.setBounds(10, 20, 646, 57);

        studentIdJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentIdJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentIdJLabel.setText("Student ID            :");
        formJPanel.add(studentIdJLabel);
        studentIdJLabel.setBounds(20, 100, 200, 29);

        studentIdFieldJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentIdFieldJLabel.setForeground(new java.awt.Color(204, 0, 204));
        formJPanel.add(studentIdFieldJLabel);
        studentIdFieldJLabel.setBounds(240, 100, 340, 0);

        studentNameJTextField.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentNameJTextField.setForeground(new java.awt.Color(204, 0, 204));
        formJPanel.add(studentNameJTextField);
        studentNameJTextField.setBounds(240, 140, 340, 30);

        studentNameJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentNameJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentNameJLabel.setText("Student Name     :");
        formJPanel.add(studentNameJLabel);
        studentNameJLabel.setBounds(20, 140, 210, 29);

        studentCourseJTextField.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentCourseJTextField.setForeground(new java.awt.Color(204, 0, 204));
        formJPanel.add(studentCourseJTextField);
        studentCourseJTextField.setBounds(240, 180, 340, 30);

        studentCourseJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentCourseJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentCourseJLabel.setText("Course Title        :");
        formJPanel.add(studentCourseJLabel);
        studentCourseJLabel.setBounds(20, 180, 210, 29);

        studentCourseCodeJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentCourseCodeJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentCourseCodeJLabel.setText("Course Code       :");
        formJPanel.add(studentCourseCodeJLabel);
        studentCourseCodeJLabel.setBounds(20, 220, 200, 30);

        studentCourseCodeJTextField.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentCourseCodeJTextField.setForeground(new java.awt.Color(204, 0, 204));
        formJPanel.add(studentCourseCodeJTextField);
        studentCourseCodeJTextField.setBounds(240, 220, 340, 30);

        studentDeptmentJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentDeptmentJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentDeptmentJLabel.setText("Departnent          :");
        formJPanel.add(studentDeptmentJLabel);
        studentDeptmentJLabel.setBounds(20, 259, 210, 30);

        studentDeptmentJTextField.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentDeptmentJTextField.setForeground(new java.awt.Color(204, 0, 204));
        studentDeptmentJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentDeptmentJTextFieldActionPerformed(evt);
            }
        });
        formJPanel.add(studentDeptmentJTextField);
        studentDeptmentJTextField.setBounds(240, 260, 340, 30);

        studentSeasionJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentSeasionJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentSeasionJLabel.setText("Seasion                 :");
        formJPanel.add(studentSeasionJLabel);
        studentSeasionJLabel.setBounds(20, 300, 210, 29);

        studentSeaasionJComboBox.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentSeaasionJComboBox.setForeground(new java.awt.Color(204, 0, 204));
        studentSeaasionJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Spring", "Summer", "Winter" }));
        formJPanel.add(studentSeaasionJComboBox);
        studentSeaasionJComboBox.setBounds(240, 300, 130, 30);

        studentYearJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentYearJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentYearJLabel.setText("Year :");
        formJPanel.add(studentYearJLabel);
        studentYearJLabel.setBounds(380, 300, 66, 29);

        studentYearJTextField.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentYearJTextField.setForeground(new java.awt.Color(204, 0, 204));
        formJPanel.add(studentYearJTextField);
        studentYearJTextField.setBounds(460, 300, 120, 30);

        teacherSectionJComboBox.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherSectionJComboBox.setForeground(new java.awt.Color(204, 0, 204));
        teacherSectionJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D" }));
        formJPanel.add(teacherSectionJComboBox);
        teacherSectionJComboBox.setBounds(240, 340, 110, 30);

        teacherSectionJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherSectionJLabel.setForeground(new java.awt.Color(204, 0, 204));
        teacherSectionJLabel.setText("Section                  :");
        formJPanel.add(teacherSectionJLabel);
        teacherSectionJLabel.setBounds(20, 340, 210, 29);

        teacherResistationJRadioButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        teacherResistationJRadioButton.setForeground(new java.awt.Color(0, 0, 204));
        teacherResistationJRadioButton.setText("Teacher Resistation");
        teacherResistationJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherResistationJRadioButtonActionPerformed(evt);
            }
        });

        studentResistationJRadioButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        studentResistationJRadioButton.setForeground(new java.awt.Color(0, 0, 204));
        studentResistationJRadioButton.setText("Student Resistation");
        studentResistationJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentResistationJRadioButtonActionPerformed(evt);
            }
        });

        okJButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        okJButton.setText("OK");

        backJButton.setText("BACK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(okJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(formJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(teacherResistationJRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(studentResistationJRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(teacherResistationJRadioButton)
                            .addComponent(studentResistationJRadioButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(okJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teacherResistationJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherResistationJRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherResistationJRadioButtonActionPerformed

    private void studentResistationJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentResistationJRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentResistationJRadioButtonActionPerformed

    private void teacherDeptmentJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherDeptmentJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherDeptmentJTextFieldActionPerformed

    private void studentDeptmentJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentDeptmentJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentDeptmentJTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(ResistrationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResistrationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResistrationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResistrationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResistrationJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JPanel formJPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton okJButton;
    private javax.swing.JLabel studentCourseCodeJLabel;
    private javax.swing.JTextField studentCourseCodeJTextField;
    private javax.swing.JLabel studentCourseJLabel;
    private javax.swing.JTextField studentCourseJTextField;
    private javax.swing.JLabel studentCourseTeacherJLabel;
    private javax.swing.JTextField studentCourseTeacherJTextField;
    private javax.swing.JLabel studentDeptmentJLabel;
    private javax.swing.JTextField studentDeptmentJTextField;
    private javax.swing.JLabel studentIdFieldJLabel;
    private javax.swing.JLabel studentIdJLabel;
    private javax.swing.JLabel studentNameJLabel;
    private javax.swing.JTextField studentNameJTextField;
    private javax.swing.JRadioButton studentResistationJRadioButton;
    private javax.swing.JLabel studentResistrationFromTitleJLabel;
    private javax.swing.JComboBox studentSeaasionJComboBox;
    private javax.swing.JLabel studentSeasionJLabel;
    private javax.swing.JComboBox studentSectionJComboBox;
    private javax.swing.JLabel studentSectionJLabel;
    private javax.swing.JLabel studentYearJLabel;
    private javax.swing.JTextField studentYearJTextField;
    private javax.swing.JLabel teacherCourseCodeJLabel;
    private javax.swing.JTextField teacherCourseCodeJTextField;
    private javax.swing.JLabel teacherCourseJLabel;
    private javax.swing.JTextField teacherCourseJTextField;
    private javax.swing.JLabel teacherDeptmentJLabel;
    private javax.swing.JTextField teacherDeptmentJTextField;
    private javax.swing.JLabel teacherIdFieldJLabel;
    private javax.swing.JLabel teacherIdJLabel;
    private javax.swing.JLabel teacherNameJLabel;
    private javax.swing.JTextField teacherNameJTextField;
    private javax.swing.JRadioButton teacherResistationJRadioButton;
    private javax.swing.JLabel teacherResistrationFromTitleJLabel;
    private javax.swing.JComboBox teacherSeaasionJComboBox;
    private javax.swing.JLabel teacherSeasionJLabel;
    private javax.swing.JComboBox teacherSectionJComboBox;
    private javax.swing.JLabel teacherSectionJLabel;
    private javax.swing.JLabel teacherYearJLabel;
    private javax.swing.JTextField teacherYearJTextField;
    // End of variables declaration//GEN-END:variables
}
