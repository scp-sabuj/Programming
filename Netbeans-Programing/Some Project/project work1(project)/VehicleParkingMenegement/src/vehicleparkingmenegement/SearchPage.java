/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vehicleparkingmenegement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author SABUJ CHANDRA PAUL
 */
public class SearchPage extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form SearchPage
     */
    public SearchPage() {
        initComponents();
        setVisible(true);
        setTitle("Vehicle Parking Search Page");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        backJButton.addActionListener(this);
        okJButton.addActionListener(this);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==backJButton){
            backMethod();
        }
        if(e.getSource()==okJButton){
            okMethod();
        }
    }
    
    private void backMethod() {
        setVisible(false);
        EditPage editPage = new EditPage();
    }
    private void okMethod() {
        
        SearchItemPage searchItemPage = new SearchItemPage();
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
        backJButton = new javax.swing.JButton();
        searchNoJLabel = new javax.swing.JLabel();
        searchNoJTextField = new javax.swing.JTextField();
        okJButton = new javax.swing.JButton();
        footerJLabel = new javax.swing.JLabel();
        vehicleParkingMenegementJLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundJPanel.setBackground(new java.awt.Color(0, 255, 255));
        backgroundJPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 255)));

        backJButton.setBackground(new java.awt.Color(153, 0, 153));
        backJButton.setForeground(new java.awt.Color(255, 255, 51));
        backJButton.setText("BACK");

        searchNoJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        searchNoJLabel.setForeground(new java.awt.Color(255, 0, 0));
        searchNoJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchNoJLabel.setText("Enter The Search Serial No. :");

        searchNoJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchNoJTextFieldActionPerformed(evt);
            }
        });

        okJButton.setBackground(new java.awt.Color(153, 0, 153));
        okJButton.setForeground(new java.awt.Color(255, 255, 51));
        okJButton.setText("OK");

        footerJLabel.setBackground(new java.awt.Color(0, 255, 153));
        footerJLabel.setFont(new java.awt.Font("Wide Latin", 3, 12)); // NOI18N
        footerJLabel.setForeground(new java.awt.Color(255, 255, 51));
        footerJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        footerJLabel.setText("copyright@sabuj&nurul");

        vehicleParkingMenegementJLabel.setFont(new java.awt.Font("Viner Hand ITC", 3, 36)); // NOI18N
        vehicleParkingMenegementJLabel.setForeground(new java.awt.Color(153, 0, 153));
        vehicleParkingMenegementJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vehicleParkingMenegementJLabel.setText("VEHICLE PARKING MENEGEMENT");
        vehicleParkingMenegementJLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 255, 51)));

        javax.swing.GroupLayout backgroundJPanelLayout = new javax.swing.GroupLayout(backgroundJPanel);
        backgroundJPanel.setLayout(backgroundJPanelLayout);
        backgroundJPanelLayout.setHorizontalGroup(
            backgroundJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundJPanelLayout.createSequentialGroup()
                .addGroup(backgroundJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(footerJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vehicleParkingMenegementJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(backgroundJPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(backgroundJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundJPanelLayout.createSequentialGroup()
                        .addComponent(searchNoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchNoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(okJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundJPanelLayout.setVerticalGroup(
            backgroundJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundJPanelLayout.createSequentialGroup()
                .addComponent(vehicleParkingMenegementJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(backgroundJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundJPanelLayout.createSequentialGroup()
                        .addGroup(backgroundJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(okJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchNoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addComponent(searchNoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(151, 151, 151)
                .addComponent(footerJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchNoJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchNoJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchNoJTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JPanel backgroundJPanel;
    private javax.swing.JLabel footerJLabel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton okJButton;
    private javax.swing.JLabel searchNoJLabel;
    private javax.swing.JTextField searchNoJTextField;
    private javax.swing.JLabel vehicleParkingMenegementJLabel;
    // End of variables declaration//GEN-END:variables

}