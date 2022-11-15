/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentattendancemonitoringsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author F.C
 */
public class TeacherShowAttendanceJFrame extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form TeacherShowAttendanceJFrame
     */
    int p;
    int a;

    int i = 0;
    int len = 0;

    public TeacherShowAttendanceJFrame(String tId, String tNm, String tCC, String tDept, String tSession, String tYear, String sDept, String sSession, String sYear, String sSection, String cTitle) {
        initComponents();
        setTitle("This is Student attendance view Page..");
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        String tIdGet = tId;
        String tNmGet = tNm;
        String tCCGet = tCC;
        String tDeptGet = tDept;
        String tSessionGet = tSession;
        String tYearGet = tYear;

        String sDeptGet = sDept;
        String sSessionGet = sSession;
        String sYearGet = sYear;
        String sSectionGet = sSection;
        String cTitleGet = cTitle;

        teacherIdJLabel1.setText(tIdGet);
        teacherNameJLabel.setText(tNmGet);
        teacherDeptJLabelLabel.setText(tDeptGet);
        courseJLabel.setText(tCCGet);
        teacherSessionJLabel.setText(tSessionGet);
        yearTeacherJLabel.setText(tYearGet);

        studentDepartmentJLabel.setText(sDeptGet);
        sessionStudentJLabel.setText(sSessionGet);
        sessionStudentYearJLabel.setText(sYearGet);
        studentSectionJLabel1.setText(sSectionGet);
        courseTitliLabel.setText(cTitleGet);

        studentIdJComboBox.addActionListener(this);
        backJButton.addActionListener(this);

        fillStudentIdComboBoxMethod();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == studentIdJComboBox) {
            String chech = studentIdJComboBox.getSelectedItem().toString();
            if (chech.equals("Select one")) {
                JOptionPane.showMessageDialog(rootPane, "Select An ID...");
            } else {
                collectInformationMethod();
            }
        }
        if(e.getSource()==backJButton){
            setVisible(false);
        }
    }

    private void collectInformationMethod() {

        String[] date = new String[100];
        String[] st = new String[100];

        String sId = studentIdJComboBox.getSelectedItem().toString();
        String cCode = courseJLabel.getText();
        String dept = studentDepartmentJLabel.getText();
        for (int j = 0; j < len; j++) {
            DefaultTableModel model1 = (DefaultTableModel) viewJTable.getModel();
            model1.removeRow(0);
        }
        
        i = 0;
        len = 0;
        p = 0;
        a = 0;

        ConnectorClass obj = new ConnectorClass();
        String query = "SELECT * FROM `attendance` WHERE S_id = '" + sId + "' And c_code = '" + cCode + "' And dept = '" + dept + "'";
        try {

            obj.rs = obj.stmt.executeQuery(query);

            while (obj.rs.next()) {

                date[i] = obj.rs.getString("date");
                st[i] = obj.rs.getString(6);

                if (st[i].equals("Present")) {
                    p++;
                } else {
                    a++;
                }

                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        len = i;

        for (int j = 0; j < len; j++) {
            Object[] row = {date[j], st[j]};
            DefaultTableModel model = (DefaultTableModel) viewJTable.getModel();
            model.addRow(row);
        }
        presentJLabel.setText("" + p);
        absencesJLabel.setText("" + a);
    }

    private void fillStudentIdComboBoxMethod() {
        studentIdJComboBox.removeActionListener(this);
        String dept = studentDepartmentJLabel.getText();
        String cCode = courseJLabel.getText();
        String session = sessionStudentJLabel.getText();
        String year = sessionStudentYearJLabel.getText();
        String section = studentSectionJLabel1.getText();
        String cTeacher = teacherNameJLabel.getText();

        studentIdJComboBox.removeAllItems();
        studentIdJComboBox.addItem("Select one");
        ConnectorClass obj = new ConnectorClass();
        String query = "SELECT * FROM `student_registration` WHERE Dept = '" + dept + "' And C_code = '" + cCode + "'And Session = '" + session + "'And Year = '" + year + "'And Section = '" + section + "'And C_teacher = '" + cTeacher + "'";
        try {

            obj.rs = obj.stmt.executeQuery(query);

            while (obj.rs.next()) {
                String sId = obj.rs.getString("S_id");
                studentIdJComboBox.addItem(sId);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        studentIdJComboBox.addActionListener(this);
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
        teacherNameTitleJLabel1 = new javax.swing.JLabel();
        teacherIdTitleJLabel = new javax.swing.JLabel();
        teacherDeptTitleJLabel = new javax.swing.JLabel();
        sessionTitleJLabel = new javax.swing.JLabel();
        yearTeacherTitleJLabel = new javax.swing.JLabel();
        courseTitleJLabel = new javax.swing.JLabel();
        teacherNameJLabel = new javax.swing.JLabel();
        teacherIdJLabel1 = new javax.swing.JLabel();
        teacherDeptJLabelLabel = new javax.swing.JLabel();
        yearTeacherJLabel = new javax.swing.JLabel();
        teacherSessionJLabel = new javax.swing.JLabel();
        courseJLabel = new javax.swing.JLabel();
        studentIdJComboBox = new javax.swing.JComboBox();
        studentIdTitleJLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sessionStudentTitleJLabel = new javax.swing.JLabel();
        sessionStudentJLabel = new javax.swing.JLabel();
        sessionStudentYearJLabel = new javax.swing.JLabel();
        studentSectionTitleJLabel = new javax.swing.JLabel();
        studentSectionJLabel1 = new javax.swing.JLabel();
        studentDeptmentTitleJLabel = new javax.swing.JLabel();
        studentDepartmentJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        presentJLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        absencesJLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        courseTitliLabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        teacherNameTitleJLabel1.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        teacherNameTitleJLabel1.setForeground(new java.awt.Color(204, 0, 204));
        teacherNameTitleJLabel1.setText("Teacher Name  :");

        teacherIdTitleJLabel.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        teacherIdTitleJLabel.setForeground(new java.awt.Color(204, 0, 204));
        teacherIdTitleJLabel.setText("Teacher Id         :");

        teacherDeptTitleJLabel.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        teacherDeptTitleJLabel.setForeground(new java.awt.Color(204, 0, 204));
        teacherDeptTitleJLabel.setText("Department       :");

        sessionTitleJLabel.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        sessionTitleJLabel.setForeground(new java.awt.Color(204, 0, 204));
        sessionTitleJLabel.setText("Session :");

        yearTeacherTitleJLabel.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        yearTeacherTitleJLabel.setForeground(new java.awt.Color(204, 0, 204));
        yearTeacherTitleJLabel.setText("Year :");

        courseTitleJLabel.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        courseTitleJLabel.setForeground(new java.awt.Color(204, 0, 204));
        courseTitleJLabel.setText("Course Code :");

        teacherNameJLabel.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        teacherNameJLabel.setForeground(new java.awt.Color(204, 0, 204));

        teacherIdJLabel1.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        teacherIdJLabel1.setForeground(new java.awt.Color(204, 0, 204));

        teacherDeptJLabelLabel.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        teacherDeptJLabelLabel.setForeground(new java.awt.Color(204, 0, 204));

        yearTeacherJLabel.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        yearTeacherJLabel.setForeground(new java.awt.Color(204, 0, 204));

        teacherSessionJLabel.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        teacherSessionJLabel.setForeground(new java.awt.Color(204, 0, 204));

        courseJLabel.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        courseJLabel.setForeground(new java.awt.Color(204, 0, 204));

        studentIdJComboBox.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        studentIdJComboBox.setForeground(new java.awt.Color(204, 0, 204));
        studentIdJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        studentIdTitleJLabel.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        studentIdTitleJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentIdTitleJLabel.setText("Student Id  :");

        jLabel3.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("STUDENT  INFORMATIN:");

        jLabel4.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Course Registration Batch :");

        sessionStudentTitleJLabel.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        sessionStudentTitleJLabel.setForeground(new java.awt.Color(204, 0, 204));
        sessionStudentTitleJLabel.setText("Session :");

        sessionStudentJLabel.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        sessionStudentJLabel.setForeground(new java.awt.Color(204, 0, 204));

        sessionStudentYearJLabel.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        sessionStudentYearJLabel.setForeground(new java.awt.Color(204, 0, 204));

        studentSectionTitleJLabel.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        studentSectionTitleJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentSectionTitleJLabel.setText("Section:");

        studentSectionJLabel1.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N

        studentDeptmentTitleJLabel.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        studentDeptmentTitleJLabel.setForeground(new java.awt.Color(204, 0, 204));
        studentDeptmentTitleJLabel.setText("Departnent :");

        studentDepartmentJLabel.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(teacherNameTitleJLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(teacherIdTitleJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(teacherDeptTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(teacherNameJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                            .addComponent(teacherIdJLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(teacherDeptJLabelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yearTeacherTitleJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(courseTitleJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(sessionTitleJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yearTeacherJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(courseJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teacherSessionJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(sessionStudentTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sessionStudentJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sessionStudentYearJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(studentSectionTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(studentSectionJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(studentDeptmentTitleJLabel)
                        .addGap(18, 18, 18)
                        .addComponent(studentDepartmentJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(studentIdTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentIdJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(teacherIdTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(teacherNameTitleJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teacherDeptTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(courseTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(courseJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sessionTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teacherSessionJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yearTeacherJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearTeacherTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(teacherIdJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(teacherNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teacherDeptJLabelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sessionStudentTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sessionStudentJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sessionStudentYearJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(studentSectionTitleJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(studentSectionJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentDepartmentJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentDeptmentTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(studentIdJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(studentIdTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        viewJTable.setBackground(new java.awt.Color(141, 141, 141));
        viewJTable.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        viewJTable.setForeground(new java.awt.Color(204, 0, 204));
        viewJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewJTable);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("YOU WERE PRESENT :");

        presentJLabel.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        presentJLabel.setForeground(new java.awt.Color(255, 0, 0));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("DAYS");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("YOU WERE ABSENCES :");

        absencesJLabel.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        absencesJLabel.setForeground(new java.awt.Color(255, 0, 0));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("DAYS");

        jPanel3.setBackground(new java.awt.Color(141, 141, 141));

        courseTitliLabel.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        courseTitliLabel.setForeground(new java.awt.Color(255, 0, 0));
        courseTitliLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        courseTitliLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        backJButton.setText("BACK");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(courseTitliLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseTitliLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(absencesJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(presentJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(presentJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(absencesJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel absencesJLabel;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel courseJLabel;
    private javax.swing.JLabel courseTitleJLabel;
    private javax.swing.JLabel courseTitliLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel presentJLabel;
    private javax.swing.JLabel sessionStudentJLabel;
    private javax.swing.JLabel sessionStudentTitleJLabel;
    private javax.swing.JLabel sessionStudentYearJLabel;
    private javax.swing.JLabel sessionTitleJLabel;
    private javax.swing.JLabel studentDepartmentJLabel;
    private javax.swing.JLabel studentDeptmentTitleJLabel;
    private javax.swing.JComboBox studentIdJComboBox;
    private javax.swing.JLabel studentIdTitleJLabel;
    private javax.swing.JLabel studentSectionJLabel1;
    private javax.swing.JLabel studentSectionTitleJLabel;
    private javax.swing.JLabel teacherDeptJLabelLabel;
    private javax.swing.JLabel teacherDeptTitleJLabel;
    private javax.swing.JLabel teacherIdJLabel1;
    private javax.swing.JLabel teacherIdTitleJLabel;
    private javax.swing.JLabel teacherNameJLabel;
    private javax.swing.JLabel teacherNameTitleJLabel1;
    private javax.swing.JLabel teacherSessionJLabel;
    private javax.swing.JTable viewJTable;
    private javax.swing.JLabel yearTeacherJLabel;
    private javax.swing.JLabel yearTeacherTitleJLabel;
    // End of variables declaration//GEN-END:variables

}
