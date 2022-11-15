/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vehicleparkingmenegement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_ENTER;
import javax.swing.JOptionPane;


public class FrontPage extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form FrontPage
     */
    public FrontPage() {
        initComponents();
        setVisible(true);
        setTitle("Vehicle Parking Front Page");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        openJButton.addActionListener(this);
        aboutJButton.addActionListener(this);
        closeJButton.addActionListener(this);
        exitJMenuItem.addActionListener(this);
        helpJMenuItem.addActionListener(this);
        
        //openJButton.setMnemonic('o');
        //openJButton.setMnemonic(KeyEvent.VK_ENTER);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==openJButton){
            setVisible(false);
            MainPage mainPage = new MainPage();
        }
        
        if(e.getSource()==aboutJButton){
            aboutMethod();
        }
        
        if(e.getSource()==closeJButton){
            System.exit(0);
        }
        if(e.getSource()==exitJMenuItem){
            System.exit(0);
        }
        if(e.getSource()==helpJMenuItem){

            JOptionPane.showMessageDialog(rootPane,"ABOUT THIS PAGE...\n"
                    + "'OPEN' button will open this project.\n"
                    + "'CLOSE' button will close this project.\n"
                    + "'ABOUT' button will show about the history of this project.");
        }
    
    }
    
    private void aboutMethod() {
        JOptionPane.showMessageDialog(null, "This is a Parking-System Menegment Software\n"
                + "Made By :\n"
                + "1. SABUJ CHANDRA PAUL\n"
                + "&\n"
                + "2. NURUL ISLAM CHOWDHURY");
    
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
        footerJLabel = new javax.swing.JLabel();
        vehicleParkingMenegementJLabel = new javax.swing.JLabel();
        imageJLabel = new javax.swing.JLabel();
        buttonJPanel = new javax.swing.JPanel();
        openJButton = new javax.swing.JButton();
        aboutJButton = new javax.swing.JButton();
        closeJButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        exitJMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        helpJMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundJPanel.setBackground(new java.awt.Color(51, 255, 255));
        backgroundJPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(255, 0, 255)));

        footerJLabel.setBackground(new java.awt.Color(0, 0, 255));
        footerJLabel.setFont(new java.awt.Font("Wide Latin", 3, 12)); // NOI18N
        footerJLabel.setForeground(new java.awt.Color(255, 255, 51));
        footerJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        footerJLabel.setText("copyright@sabuj&nurul");

        vehicleParkingMenegementJLabel.setBackground(new java.awt.Color(153, 153, 0));
        vehicleParkingMenegementJLabel.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        vehicleParkingMenegementJLabel.setForeground(new java.awt.Color(153, 0, 153));
        vehicleParkingMenegementJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vehicleParkingMenegementJLabel.setText("VEHICLE   PARKING   MENEGEMENT");
        vehicleParkingMenegementJLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 204)));

        imageJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehicleparkingmenegement/car-park.jpg"))); // NOI18N

        buttonJPanel.setBackground(new java.awt.Color(0, 102, 102));
        buttonJPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(255, 0, 0)));

        openJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehicleparkingmenegement/open.jpeg"))); // NOI18N
        openJButton.setText("OPEN");

        aboutJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehicleparkingmenegement/about.jpeg"))); // NOI18N
        aboutJButton.setText("ABOUT");

        closeJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehicleparkingmenegement/close.jpeg"))); // NOI18N
        closeJButton.setText("CLOSE");

        javax.swing.GroupLayout buttonJPanelLayout = new javax.swing.GroupLayout(buttonJPanel);
        buttonJPanel.setLayout(buttonJPanelLayout);
        buttonJPanelLayout.setHorizontalGroup(
            buttonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonJPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(openJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(aboutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(closeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        buttonJPanelLayout.setVerticalGroup(
            buttonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(aboutJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(closeJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(openJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout backgroundJPanelLayout = new javax.swing.GroupLayout(backgroundJPanel);
        backgroundJPanel.setLayout(backgroundJPanelLayout);
        backgroundJPanelLayout.setHorizontalGroup(
            backgroundJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundJPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(backgroundJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundJPanelLayout.createSequentialGroup()
                        .addComponent(vehicleParkingMenegementJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundJPanelLayout.createSequentialGroup()
                        .addComponent(footerJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248))))
        );
        backgroundJPanelLayout.setVerticalGroup(
            backgroundJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundJPanelLayout.createSequentialGroup()
                .addComponent(vehicleParkingMenegementJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(imageJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(footerJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("File");

        exitJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
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
            .addComponent(backgroundJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 672, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            java.util.logging.Logger.getLogger(FrontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrontPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutJButton;
    private javax.swing.JPanel backgroundJPanel;
    private javax.swing.JPanel buttonJPanel;
    private javax.swing.JButton closeJButton;
    private javax.swing.JMenuItem exitJMenuItem;
    private javax.swing.JLabel footerJLabel;
    private javax.swing.JMenuItem helpJMenuItem;
    private javax.swing.JLabel imageJLabel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton openJButton;
    private javax.swing.JLabel vehicleParkingMenegementJLabel;
    // End of variables declaration//GEN-END:variables

    

}
