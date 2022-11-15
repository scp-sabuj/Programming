/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author F.C
 */
public class NewClass {

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentattendancemonitoringsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.Action;


import javax.swing.ButtonGroup;

/**
 *
 * @author F.C
 */
public class RegistrationPage extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form RegistrationPage
     */
    String select = "";

    public RegistrationPage() {
        initComponents();
        setTitle("This is Registration Page..");
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ButtonGroup group;
        group = new ButtonGroup();
        group.add(teacherResistationJRadioButton);
        group.add(studentResistationJRadioButton);

        visiableMethod();

        teacherResistationJRadioButton.addActionListener(this);
        studentResistationJRadioButton.addActionListener(this);
        studentDeptmentJComboBox.addActionListener(this);
        studentIdJComboBox.addActionListener(this);
        studentCourseCodeJComboBox.addActionListener(this);

        teacherDeptmentJComboBox.addActionListener(this);
        teacherIdJComboBox.addActionListener(this);
        teacherCourseCodeComboBox.addActionListener(this);

        okJButton.addActionListener(this);
        backJButton.addActionListener(this);

        fillComboboxDepartment();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == teacherResistationJRadioButton) {
            visiableMethod();

            select = "teacher";

            teacherResistrationFromTitleJLabel.setVisible(true);

            teacherDeptmentJLabel.setVisible(true);
            teacherIdJTitleLabel.setVisible(true);
            teacherNameTitleJLabel.setVisible(true);
            teacherCourseCodeJLabel.setVisible(true);
            teacherCourseTitleJLabel.setVisible(true);
            teacherSeasionJLabel.setVisible(true);
            teacherYearJLabel.setVisible(true);
            teacherSectionJLabel.setVisible(true);

            teacherDeptmentJComboBox.setVisible(true);

        }
        if (e.getSource() == studentResistationJRadioButton) {
            visiableMethod();

            select = "student";

            studentResistrationFromTitleJLabel.setVisible(true);

            studentCourseTeacherJLabel.setVisible(true);
            studentCourseTitleJLabel.setVisible(true);
            studentCourseCodeJLabel.setVisible(true);
            studentDeptmentJLabel.setVisible(true);
            studentIdJLabel.setVisible(true);
            studentNameFieldJLabel.setVisible(true);
            studentResistrationFromTitleJLabel.setVisible(true);
            studentSeasionJLabel.setVisible(true);
            studentSectionJLabel.setVisible(true);
            studentYearJLabel.setVisible(true);
            studentNameTitleJLabel.setVisible(true);

            studentDeptmentJComboBox.setVisible(true);

        }
        if (e.getSource() == backJButton) {
            setVisible(false);
            AuthorHandlingFrame aHF = new AuthorHandlingFrame();
        }
        if (e.getSource() == okJButton) {
            if (select.equals("student")) {
                studentInformatinTakingMethod();
            }
            if (select.equals("teacher")) {
                teacherInformatinTakingMethod();
            }
        }
        if (e.getSource() == studentDeptmentJComboBox) {
            studentIdJComboBox.setVisible(true);
            fillStudentId();

        }
        if (e.getSource() == studentIdJComboBox) {
            studentCourseCodeJComboBox.setVisible(true);
            fillComboboxCourseCode();
            fillStudentName();
        }
        if (e.getSource() == studentCourseCodeJComboBox) {
            fillStudentCourseTitle();
        }
        if (e.getSource() == teacherDeptmentJComboBox) {
            teacherIdJComboBox.setVisible(true);
            fillTeacherIdJComboBoxMethod();
        }
        if (e.getSource() == teacherIdJComboBox) {
            fillTeacherNameFieldMethod();
        }
        if (e.getSource() == teacherCourseCodeComboBox) {
            fillTeacherCourseFieldMethod();
        }
    }

    //1st
    private void fillComboboxDepartment() {
        ConnectorClass obj = new ConnectorClass();
        String query = "Select * from department";
        try {

            obj.rs = obj.stmt.executeQuery(query);

            while (obj.rs.next()) {
                String dept = obj.rs.getString("Dept_name");
                studentDeptmentJComboBox.addItem(dept);
                teacherDeptmentJComboBox.addItem(dept);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    //2nd
    private void fillStudentName() {
        String stId = studentIdJComboBox.getSelectedItem().toString();
        ConnectorClass obj = new ConnectorClass();
        String query = "SELECT * FROM `student` WHERE S_id = '" + stId + "'";
        try {

            obj.rs = obj.stmt.executeQuery(query);

            while (obj.rs.next()) {
                String nm = obj.rs.getString("S_name");
                studentNameFieldJLabel.setText(nm);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    //3nd
    private void fillStudentId() {
        String sDept = studentDeptmentJComboBox.getSelectedItem().toString();
        ConnectorClass obj = new ConnectorClass();
        String query = "SELECT * FROM `student` WHERE Dept_name = '" + sDept + "'";
        try {

            obj.rs = obj.stmt.executeQuery(query);

            while (obj.rs.next()) {
                String sId = obj.rs.getString("S_id");
                studentIdJComboBox.addItem(sId);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        studentNameFieldJLabel.setVisible(true);

    }

    //4th
    private void fillComboboxCourseCode() {
        String sDept = studentDeptmentJComboBox.getSelectedItem().toString();
        ConnectorClass obj = new ConnectorClass();
        String query = "SELECT * FROM `course` WHERE dept_name = '" + sDept + "'";
        try {

            obj.rs = obj.stmt.executeQuery(query);

            while (obj.rs.next()) {
                String cCode = obj.rs.getString("C_code");
                studentCourseCodeJComboBox.addItem(cCode);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        studentCourseJLabel.setVisible(true);

    }

    //5th
    private void fillStudentCourseTitle() {
        studentSeaasionJComboBox.setVisible(true);
        studentYearJTextField.setVisible(true);
        studentSectionJComboBox.setVisible(true);
        String cCode = studentCourseCodeJComboBox.getSelectedItem().toString();
        ConnectorClass obj = new ConnectorClass();
        String query = "SELECT * FROM `course` WHERE C_code = '" + cCode + "'";
        try {

            obj.rs = obj.stmt.executeQuery(query);

            while (obj.rs.next()) {
                String nm = obj.rs.getString("C_title");
                studentCourseJLabel.setText(nm);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        fillComboboxCourseTeacher();
    }

    //6th
    private void fillComboboxCourseTeacher() {

        String sDept = studentDeptmentJComboBox.getSelectedItem().toString();
        ConnectorClass obj = new ConnectorClass();
        String query = "SELECT * FROM `teacher` WHERE dept_name = '" + sDept + "'";
        try {

            obj.rs = obj.stmt.executeQuery(query);

            while (obj.rs.next()) {
                String nm = obj.rs.getString("T_name");
                studentCourseTeacherJComboBox.addItem(nm);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        studentCourseTeacherJComboBox.setVisible(true);
        okJButton.setVisible(true);
    }

    //t-1
    private void fillTeacherIdJComboBoxMethod() {
        String sDept = teacherDeptmentJComboBox.getSelectedItem().toString();
        ConnectorClass obj = new ConnectorClass();
        String query = "SELECT * FROM `teacher` WHERE 	dept_name = '" + sDept + "'";
        try {

            obj.rs = obj.stmt.executeQuery(query);

            while (obj.rs.next()) {
                String tId = obj.rs.getString("T_id");
                teacherIdJComboBox.addItem(tId);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //t-2
    private void fillTeacherNameFieldMethod() {
        String tId = teacherIdJComboBox.getSelectedItem().toString();
        ConnectorClass obj = new ConnectorClass();
        String query = "SELECT * FROM `teacher` WHERE 	T_id = '" + tId + "'";

        System.out.println(tId);
        try {

            obj.rs = obj.stmt.executeQuery(query);

            while (obj.rs.next()) {
                String tName = obj.rs.getString("T_name");
                teacherNameJLabel.setVisible(true);
                teacherNameJLabel.setText(tName);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        teacherCourseCodeComboBox.setVisible(true);
        fillTeacherCourseCodeMethod();
    }

    //t-3
    private void fillTeacherCourseCodeMethod() {
        String sDept = teacherDeptmentJComboBox.getSelectedItem().toString();
        ConnectorClass obj = new ConnectorClass();
        String query = "SELECT * FROM `course` WHERE dept_name = '" + sDept + "'";
        try {

            obj.rs = obj.stmt.executeQuery(query);

            while (obj.rs.next()) {
                String cCode = obj.rs.getString("C_code");
                teacherCourseCodeComboBox.addItem(cCode);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        teacherCourseJLabel.setVisible(true);
    }

    //t-4
    private void fillTeacherCourseFieldMethod() {
        String cCode = teacherCourseCodeComboBox.getSelectedItem().toString();
        ConnectorClass obj = new ConnectorClass();
        String query = "SELECT * FROM `course` WHERE C_code = '" + cCode + "'";
        try {

            obj.rs = obj.stmt.executeQuery(query);

            while (obj.rs.next()) {
                String nm = obj.rs.getString("C_title");
                teacherCourseJLabel.setText(nm);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        teacherSeaasionJComboBox.setVisible(true);
        teacherSectionJComboBox.setVisible(true);
        teacherYearJTextField.setVisible(true);
        okJButton.setVisible(true);
    }

    private void visiableMethod() {

        

    }

    private void studentInformatinTakingMethod() {
        String dept = studentDeptmentJComboBox.getSelectedItem().toString();
        String id = studentIdJComboBox.getSelectedItem().toString();
        String nm = studentNameFieldJLabel.getText();
        String cCode = studentCourseCodeJComboBox.getSelectedItem().toString();
        String cTitle = studentCourseJLabel.getText();
        String session = studentSeaasionJComboBox.getSelectedItem().toString();
        String year = studentYearJTextField.getText();
        String section = studentSectionJComboBox.getSelectedItem().toString();
        String cT = studentCourseTeacherJComboBox.getSelectedItem().toString();

        ConnectorClass obj = new ConnectorClass();
        String query = "INSERT INTO student_registration " + "VALUES ('" + id + "','" + nm + "','" + cCode + "','" + cTitle + "'\n"
                + ",'" + dept + "','" + session + "','" + year + "','" + section + "','" + cT + "')";
        try {

            obj.stmt.executeUpdate(query);
            obj.con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        studentDeptmentJLabel.setVisible(false);
        studentDeptmentJComboBox.setVisible(false);
        studentIdJLabel.setVisible(false);
        studentIdJComboBox.setVisible(false);
        studentNameTitleJLabel.setVisible(false);
        studentNameFieldJLabel.setVisible(false);
        studentCourseCodeJLabel.setVisible(false);
        studentCourseCodeJComboBox.setVisible(false);
        studentCourseTitleJLabel.setVisible(false);
        studentCourseJLabel.setVisible(false);
        studentSeasionJLabel.setVisible(false);
        studentSeaasionJComboBox.setVisible(false);
        studentYearJLabel.setVisible(false);
        studentYearJTextField.setVisible(false);
        studentSectionJLabel.setVisible(false);
        studentSectionJComboBox.setVisible(false);
        studentCourseTeacherJLabel.setVisible(false);
        studentCourseTeacherJComboBox.setVisible(false);
    }

    private void teacherInformatinTakingMethod() {

        String dept = teacherDeptmentJComboBox.getSelectedItem().toString();
        String id = teacherIdJComboBox.getSelectedItem().toString();
        String nm = teacherNameJLabel.getText();
        String cCode = teacherCourseCodeComboBox.getSelectedItem().toString();
        String cTitle = teacherCourseJLabel.getText();
        String session = teacherSeaasionJComboBox.getSelectedItem().toString();
        String year = teacherYearJTextField.getText();
        String section = teacherSectionJComboBox.getSelectedItem().toString();

        ConnectorClass obj = new ConnectorClass();
        String query = "INSERT INTO teacher_registration " + "VALUES ('" + id + "','" + nm + "','" + cCode + "','" + cTitle + "'\n"
                + ",'" + dept + "','" + session + "','" + year + "','" + section + "')";
        try {

            obj.stmt.executeUpdate(query);
            obj.con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        teacherDeptmentJLabel.setVisible(false);
        teacherDeptmentJComboBox.setVisible(false);
        teacherIdJTitleLabel.setVisible(false);
        teacherIdJComboBox.setVisible(false);
        teacherNameTitleJLabel.setVisible(false);
        teacherNameJLabel.setVisible(false);
        teacherCourseCodeJLabel.setVisible(false);
        teacherCourseCodeComboBox.setVisible(false);
        teacherCourseTitleJLabel.setVisible(false);
        teacherCourseJLabel.setVisible(false);
        teacherSeasionJLabel.setVisible(false);
        teacherSeaasionJComboBox.setVisible(false);
        teacherYearJLabel.setVisible(false);
        teacherYearJTextField.setVisible(false);
        teacherSectionJLabel.setVisible(false);
        teacherSectionJComboBox.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        teacherResistationJRadioButton = new javax.swing.JRadioButton();
        studentResistationJRadioButton = new javax.swing.JRadioButton();
        formJPanel = new javax.swing.JPanel();
        studentCourseTeacherJLabel = new javax.swing.JLabel();
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
        studentCourseTeacherJComboBox = new javax.swing.JComboBox();
        studentIdJComboBox = new javax.swing.JComboBox();
        teacherResistrationFromTitleJLabel = new javax.swing.JLabel();
        teacherIdJTitleLabel = new javax.swing.JLabel();
        teacherNameJLabel = new javax.swing.JLabel();
        teacherIdJComboBox = new javax.swing.JComboBox();
        studentIdJLabel = new javax.swing.JLabel();
        teacherNameTitleJLabel = new javax.swing.JLabel();
        teacherCourseTitleJLabel = new javax.swing.JLabel();
        teacherCourseCodeJLabel = new javax.swing.JLabel();
        teacherCourseJLabel = new javax.swing.JLabel();
        teacherCourseCodeComboBox = new javax.swing.JComboBox();
        teacherDeptmentJLabel = new javax.swing.JLabel();
        teacherDeptmentJComboBox = new javax.swing.JComboBox();
        teacherYearJTextField = new javax.swing.JTextField();
        teacherYearJLabel = new javax.swing.JLabel();
        teacherSeaasionJComboBox = new javax.swing.JComboBox();
        teacherSeasionJLabel = new javax.swing.JLabel();
        teacherSectionJLabel = new javax.swing.JLabel();
        teacherSectionJComboBox = new javax.swing.JComboBox();
        studentDeptmentJComboBox = new javax.swing.JComboBox();
        okJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        teacherResistationJRadioButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        teacherResistationJRadioButton.setForeground(new java.awt.Color(0, 0, 204));
        teacherResistationJRadioButton.setText("Teacher Registration");
        teacherResistationJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherResistationJRadioButtonActionPerformed(evt);
            }
        });

        studentResistationJRadioButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        studentResistationJRadioButton.setForeground(new java.awt.Color(0, 0, 204));
        studentResistationJRadioButton.setText("Student Registration");
        studentResistationJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentResistationJRadioButtonActionPerformed(evt);
            }
        });

        formJPanel.setBackground(new java.awt.Color(0, 204, 204));
        formJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentCourseTeacherJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentCourseTeacherJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentCourseTeacherJLabel.setText("Course Teacher :");
        formJPanel.add(studentCourseTeacherJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 210, 30));

        studentNameFieldJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentNameFieldJLabel.setForeground(new java.awt.Color(204, 0, 204));
        formJPanel.add(studentNameFieldJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 340, 30));

        studentNameTitleJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentNameTitleJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentNameTitleJLabel.setText("Student Name     :");
        formJPanel.add(studentNameTitleJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 210, -1));

        studentCourseTitleJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentCourseTitleJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentCourseTitleJLabel.setText("Course Title        :");
        formJPanel.add(studentCourseTitleJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 210, -1));

        studentCourseCodeJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentCourseCodeJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentCourseCodeJLabel.setText("Course Code       :");
        formJPanel.add(studentCourseCodeJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 210, 30));

        studentDeptmentJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentDeptmentJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentDeptmentJLabel.setText("Departnent          :");
        formJPanel.add(studentDeptmentJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 210, 30));

        studentSeasionJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentSeasionJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentSeasionJLabel.setText("Session                 :");
        formJPanel.add(studentSeasionJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 210, -1));

        studentSeaasionJComboBox.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentSeaasionJComboBox.setForeground(new java.awt.Color(204, 0, 204));
        studentSeaasionJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Spring", "Summer", "Fall"}));
        formJPanel.add(studentSeaasionJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 130, 30));

        studentYearJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentYearJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentYearJLabel.setText("Year :");
        formJPanel.add(studentYearJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        studentYearJTextField.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentYearJTextField.setForeground(new java.awt.Color(204, 0, 204));
        formJPanel.add(studentYearJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 120, 30));

        studentSectionJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentSectionJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentSectionJLabel.setText("Section                  :");
        formJPanel.add(studentSectionJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 204, 30));

        studentSectionJComboBox.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentSectionJComboBox.setForeground(new java.awt.Color(204, 0, 204));
        studentSectionJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"A", "B", "C", "D"}));
        studentSectionJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentSectionJComboBoxActionPerformed(evt);
            }
        });
        formJPanel.add(studentSectionJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 111, 30));

        studentResistrationFromTitleJLabel.setFont(new java.awt.Font("Papyrus", 3, 36)); // NOI18N
        studentResistrationFromTitleJLabel.setForeground(new java.awt.Color(255, 0, 51));
        studentResistrationFromTitleJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        studentResistrationFromTitleJLabel.setText("This Is Student Registration Form...");
        formJPanel.add(studentResistrationFromTitleJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 650, -1));

        studentCourseCodeJComboBox.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentCourseCodeJComboBox.setForeground(new java.awt.Color(204, 0, 204));
        studentCourseCodeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Select Course Code"}));
        formJPanel.add(studentCourseCodeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 340, 30));

        studentCourseJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentCourseJLabel.setForeground(new java.awt.Color(204, 0, 204));
        formJPanel.add(studentCourseJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 340, 30));

        studentCourseTeacherJComboBox.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentCourseTeacherJComboBox.setForeground(new java.awt.Color(204, 0, 204));
        studentCourseTeacherJComboBox.setMaximumRowCount(1000);
        studentCourseTeacherJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Select The Teacher"}));
        formJPanel.add(studentCourseTeacherJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 340, 30));

        studentIdJComboBox.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentIdJComboBox.setForeground(new java.awt.Color(204, 0, 204));
        studentIdJComboBox.setMaximumRowCount(1000);
        studentIdJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Select An ID"}));
        studentIdJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdJComboBoxActionPerformed(evt);
            }
        });
        formJPanel.add(studentIdJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 340, 30));

        teacherResistrationFromTitleJLabel.setFont(new java.awt.Font("Papyrus", 3, 36)); // NOI18N
        teacherResistrationFromTitleJLabel.setForeground(new java.awt.Color(255, 0, 51));
        teacherResistrationFromTitleJLabel.setText("This Is Teacher Registration Form...");
        formJPanel.add(teacherResistrationFromTitleJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        teacherIdJTitleLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherIdJTitleLabel.setForeground(new java.awt.Color(204, 0, 204));
        teacherIdJTitleLabel.setText("Teacher ID           :");
        formJPanel.add(teacherIdJTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 210, 30));

        teacherNameJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherNameJLabel.setForeground(new java.awt.Color(204, 0, 204));
        formJPanel.add(teacherNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 340, 30));

        teacherIdJComboBox.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherIdJComboBox.setForeground(new java.awt.Color(204, 0, 204));
        teacherIdJComboBox.setMaximumRowCount(1000);
        teacherIdJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Select An ID"}));
        teacherIdJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherIdJComboBoxActionPerformed(evt);
            }
        });
        formJPanel.add(teacherIdJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 340, 30));

        studentIdJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentIdJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentIdJLabel.setText("Student ID            :");
        formJPanel.add(studentIdJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 210, -1));

        teacherNameTitleJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherNameTitleJLabel.setForeground(new java.awt.Color(204, 0, 204));
        teacherNameTitleJLabel.setText("Teacher Name    :");
        formJPanel.add(teacherNameTitleJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 204, 30));

        teacherCourseTitleJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherCourseTitleJLabel.setForeground(new java.awt.Color(204, 0, 204));
        teacherCourseTitleJLabel.setText("Course Title        :");
        formJPanel.add(teacherCourseTitleJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 210, 30));

        teacherCourseCodeJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherCourseCodeJLabel.setForeground(new java.awt.Color(204, 0, 204));
        teacherCourseCodeJLabel.setText("Course Code       :");
        formJPanel.add(teacherCourseCodeJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 210, 30));

        teacherCourseJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherCourseJLabel.setForeground(new java.awt.Color(204, 0, 204));
        formJPanel.add(teacherCourseJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 340, 30));

        teacherCourseCodeComboBox.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherCourseCodeComboBox.setForeground(new java.awt.Color(204, 0, 204));
        teacherCourseCodeComboBox.setMaximumRowCount(1000);
        teacherCourseCodeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Select Course Code"}));
        teacherCourseCodeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherCourseCodeComboBoxActionPerformed(evt);
            }
        });
        formJPanel.add(teacherCourseCodeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 337, 30));

        teacherDeptmentJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherDeptmentJLabel.setForeground(new java.awt.Color(204, 0, 204));
        teacherDeptmentJLabel.setText("Departnent          :");
        formJPanel.add(teacherDeptmentJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 210, -1));

        teacherDeptmentJComboBox.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherDeptmentJComboBox.setForeground(new java.awt.Color(204, 0, 204));
        teacherDeptmentJComboBox.setMaximumRowCount(1000);
        teacherDeptmentJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Select Department"}));
        teacherDeptmentJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherDeptmentJComboBoxActionPerformed(evt);
            }
        });
        formJPanel.add(teacherDeptmentJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 340, 29));

        teacherYearJTextField.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherYearJTextField.setForeground(new java.awt.Color(204, 0, 204));
        teacherYearJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherYearJTextFieldActionPerformed(evt);
            }
        });
        formJPanel.add(teacherYearJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 120, 30));

        teacherYearJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherYearJLabel.setForeground(new java.awt.Color(204, 0, 204));
        teacherYearJLabel.setText("Year :");
        formJPanel.add(teacherYearJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 71, 30));

        teacherSeaasionJComboBox.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherSeaasionJComboBox.setForeground(new java.awt.Color(204, 0, 204));
        teacherSeaasionJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Spring", "Summer", "Fall"}));
        teacherSeaasionJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherSeaasionJComboBoxActionPerformed(evt);
            }
        });
        formJPanel.add(teacherSeaasionJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 132, 30));

        teacherSeasionJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherSeasionJLabel.setForeground(new java.awt.Color(204, 0, 204));
        teacherSeasionJLabel.setText("Session                 :");
        formJPanel.add(teacherSeasionJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 204, 30));

        teacherSectionJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherSectionJLabel.setForeground(new java.awt.Color(204, 0, 204));
        teacherSectionJLabel.setText("Section                  :");
        formJPanel.add(teacherSectionJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 210, -1));

        teacherSectionJComboBox.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        teacherSectionJComboBox.setForeground(new java.awt.Color(204, 0, 204));
        teacherSectionJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"A", "B", "C", "D"}));
        formJPanel.add(teacherSectionJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 110, 30));

        studentDeptmentJComboBox.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        studentDeptmentJComboBox.setForeground(new java.awt.Color(204, 0, 204));
        studentDeptmentJComboBox.setMaximumRowCount(1000);
        studentDeptmentJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Select Department"}));
        studentDeptmentJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentDeptmentJComboBoxActionPerformed(evt);
            }
        });
        formJPanel.add(studentDeptmentJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 340, 30));

        okJButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        okJButton.setForeground(new java.awt.Color(204, 0, 204));
        okJButton.setText("OK");
        formJPanel.add(okJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 161, -1));

        backJButton.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(formJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(teacherResistationJRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(136, 136, 136)
                                        .addComponent(studentResistationJRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(teacherResistationJRadioButton)
                                .addComponent(studentResistationJRadioButton))
                        .addGap(18, 18, 18)
                        .addComponent(formJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void teacherResistationJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void studentResistationJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void teacherSeaasionJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void teacherYearJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void studentSectionJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void studentDeptmentJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void teacherCourseCodeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void studentIdJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void teacherIdJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void teacherDeptmentJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

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
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton backJButton;
    private javax.swing.JPanel formJPanel;
    private javax.swing.JButton okJButton;
    private javax.swing.JComboBox studentCourseCodeJComboBox;
    private javax.swing.JLabel studentCourseCodeJLabel;
    private javax.swing.JLabel studentCourseJLabel;
    private javax.swing.JComboBox studentCourseTeacherJComboBox;
    private javax.swing.JLabel studentCourseTeacherJLabel;
    private javax.swing.JLabel studentCourseTitleJLabel;
    private javax.swing.JComboBox studentDeptmentJComboBox;
    private javax.swing.JLabel studentDeptmentJLabel;
    private javax.swing.JComboBox studentIdJComboBox;
    private javax.swing.JLabel studentIdJLabel;
    private javax.swing.JLabel studentNameFieldJLabel;
    private javax.swing.JLabel studentNameTitleJLabel;
    private javax.swing.JRadioButton studentResistationJRadioButton;
    private javax.swing.JLabel studentResistrationFromTitleJLabel;
    private javax.swing.JComboBox studentSeaasionJComboBox;
    private javax.swing.JLabel studentSeasionJLabel;
    private javax.swing.JComboBox studentSectionJComboBox;
    private javax.swing.JLabel studentSectionJLabel;
    private javax.swing.JLabel studentYearJLabel;
    private javax.swing.JTextField studentYearJTextField;
    private javax.swing.JComboBox teacherCourseCodeComboBox;
    private javax.swing.JLabel teacherCourseCodeJLabel;
    private javax.swing.JLabel teacherCourseJLabel;
    private javax.swing.JLabel teacherCourseTitleJLabel;
    private javax.swing.JComboBox teacherDeptmentJComboBox;
    private javax.swing.JLabel teacherDeptmentJLabel;
    private javax.swing.JComboBox teacherIdJComboBox;
    private javax.swing.JLabel teacherIdJTitleLabel;
    private javax.swing.JLabel teacherNameJLabel;
    private javax.swing.JLabel teacherNameTitleJLabel;
    private javax.swing.JRadioButton teacherResistationJRadioButton;
    private javax.swing.JLabel teacherResistrationFromTitleJLabel;
    private javax.swing.JComboBox teacherSeaasionJComboBox;
    private javax.swing.JLabel teacherSeasionJLabel;
    private javax.swing.JComboBox teacherSectionJComboBox;
    private javax.swing.JLabel teacherSectionJLabel;
    private javax.swing.JLabel teacherYearJLabel;
    private javax.swing.JTextField teacherYearJTextField;
    // End of variables declaration                   
}
