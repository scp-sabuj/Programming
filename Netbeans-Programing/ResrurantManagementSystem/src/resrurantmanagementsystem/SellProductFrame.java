package resrurantmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author F.C
 */
public class SellProductFrame extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form SellProductFrame
     */
    int total = 0;
    int len = 0;
    int k;
    int listOfBuyJTable2Row = 0;
    int buyNumber = 0;

    public SellProductFrame() {
        initComponents();
        setVisible(true);
        setTitle("This is SELL PAGE..");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        returnTitleJLabel.setVisible(false);
        returnProductNameJLabel.setVisible(false);
        returnProductAmountTitleJLabel.setVisible(false);
        returnProductAmountJTextField.setVisible(false);
        returnProductJButton.setVisible(false);

        tableMethod();

        backJButton.addActionListener(this);
        okJButton.addActionListener(this);
        buyJButton.addActionListener(this);
        returnProductJButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backJButton) {
            returnAllMethod();
            setVisible(false);
            MainFrame main = new MainFrame();
        }
        if (e.getSource() == okJButton) {

            calculationMethod();

        }
        if (e.getSource() == buyJButton) {

            buyMethod();

        }

        if (e.getSource() == returnProductJButton) {
            returnMethod();
        }

    }

    private void buyMethod() {
        String[] dt = new String[100];
        int taka = 0;
        int i = 0;
        int lenDt = 0;
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");

        String tD = ft.format(dNow);
        ConnectorClass obj = new ConnectorClass();
        String query = "SELECT * FROM `dateSell`";
        try {

            obj.rs = obj.stmt.executeQuery(query);
            while (obj.rs.next()) {

                dt[i] = obj.rs.getString("Date");
                String am = obj.rs.getString("SellAmount");
                taka = Integer.parseInt(am);
                i++;

            }
        } catch (SQLException ev) {
            ev.printStackTrace();

        }
        lenDt = i;

        String st = "no";

        for (int j = 0; j < lenDt; j++) {
            if (tD.equals(dt[j])) {
                st = "yes";
                break;
            }
        }

        if (st.equals("no")) {
            String query1 = "INSERT INTO dateSell " + "VALUES ('" + tD + "', '" + total + "')";
            try {

                obj.stmt.executeUpdate(query1);
                obj.con.close();
            } catch (SQLException ev) {
                ev.printStackTrace();
            }
        } else {
            String tTaka = totalJLabel2.getText();
            int tTakaInt = Integer.parseInt(tTaka);
            taka = taka + tTakaInt;
            String temp = "" + taka;
            String query1 = "Update `dateSell` SET SellAmount = '" + temp + "' WHERE Date = '" + tD + "'";
            try {

                obj.stmt.executeUpdate(query1);
                obj.con.close();
            } catch (SQLException ev) {
                ev.printStackTrace();
            }
        }

        setVisible(false);
        SellProductFrame sFP = new SellProductFrame();
    }

    private void returnAllMethod() {
        if (listOfBuyJTable2Row == 0) {
            if (buyNumber == 1) {
                int am2Int = 0;
                DefaultTableModel model = (DefaultTableModel) listOfBuyJTable2.getModel();
                String getNm = (model.getValueAt(0, 0).toString());
                String getAm = (model.getValueAt(0, 1).toString());
                String getPrice = (model.getValueAt(0, 2).toString());

                int getAmInt = Integer.parseInt(getAm);
                String query = "SELECT * FROM `food` WHERE Name = '" + getNm + "'";

                ConnectorClass ob3 = new ConnectorClass();
                try {

                    ob3.rs = ob3.stmt.executeQuery(query);
                    while (ob3.rs.next()) {

                        String st = ob3.rs.getString("Stock");
                        am2Int = Integer.parseInt(st) + getAmInt;

                    }

                    String temp = "" + am2Int;
                    String query1 = "Update `food` SET Stock = '" + temp + "' WHERE Name = '" + getNm + "'";
                    try {

                        ob3.stmt.executeUpdate(query1);
                        ob3.con.close();
                    } catch (SQLException ev) {
                        ev.printStackTrace();
                    }

                } catch (SQLException ev) {
                    ev.printStackTrace();
                }
            }

        } else {

            int am2Int = 0;
            for (int i = 0; i < listOfBuyJTable2Row; i++) {
                DefaultTableModel model = (DefaultTableModel) listOfBuyJTable2.getModel();
                String getNm = (model.getValueAt(i, 0).toString());
                String getAm = (model.getValueAt(i, 1).toString());
                String getPrice = (model.getValueAt(i, 2).toString());

                int getAmInt = Integer.parseInt(getAm);

                System.out.println(getNm);
                System.out.println(getAm);

                String query = "SELECT * FROM `food` WHERE Name = '" + getNm + "'";

                ConnectorClass ob3 = new ConnectorClass();
                try {

                    ob3.rs = ob3.stmt.executeQuery(query);
                    while (ob3.rs.next()) {

                        String st = ob3.rs.getString("Stock");
                        am2Int = Integer.parseInt(st) + getAmInt;

                    }

                    String temp = "" + am2Int;
                    String query1 = "Update `food` SET Stock = '" + temp + "' WHERE Name = '" + getNm + "'";
                    try {

                        ob3.stmt.executeUpdate(query1);
                        ob3.con.close();
                    } catch (SQLException ev) {
                        ev.printStackTrace();
                    }

                } catch (SQLException ev) {
                    ev.printStackTrace();
                }
            }
        }

    }

    private void returnMethod() {
        listOfBuyJTable2Row = listOfBuyJTable2Row - 1;
        buyNumber = buyNumber -1;
        String nm = returnProductNameJLabel.getText();
        String am = returnProductAmountJTextField.getText();

        DefaultTableModel model = (DefaultTableModel) listOfBuyJTable2.getModel();
        String getAm = (model.getValueAt(k, 1).toString());
        String getPrice = (model.getValueAt(k, 2).toString());

        int amInt = Integer.parseInt(am);
        int getAmInt = Integer.parseInt(getAm);
        int am2Int = 0;

        if (amInt > getAmInt) {
            JOptionPane.showMessageDialog(rootPane, "It's over.... ");
        } else {
            String query = "SELECT * FROM `food` WHERE Name = '" + nm + "'";

            ConnectorClass ob3 = new ConnectorClass();
            try {

                ob3.rs = ob3.stmt.executeQuery(query);
                while (ob3.rs.next()) {

                    String st = ob3.rs.getString("Stock");
                    am2Int = Integer.parseInt(st) + amInt;

                }

                String temp = "" + am2Int;
                String query1 = "Update `food` SET Stock = '" + temp + "' WHERE Name = '" + nm + "'";
                try {

                    ob3.stmt.executeUpdate(query1);
                    ob3.con.close();
                } catch (SQLException ev) {
                    ev.printStackTrace();
                }

            } catch (SQLException ev) {
                ev.printStackTrace();
            }

            int getPriceInt = Integer.parseInt(getPrice);
            int perPrice = getPriceInt / getAmInt;

            int sub = getAmInt - amInt;
            int multiply = sub * perPrice;
            int multiply1 = getAmInt * perPrice;

            total = total - (multiply1 - multiply);
            totalJLabel2.setText("" + total);

            model.setValueAt("" + sub, k, 1);
            model.setValueAt("" + multiply, k, 2);

            if (amInt == getAmInt) {
                DefaultTableModel model1 = (DefaultTableModel) listOfBuyJTable2.getModel();
                model1.removeRow(k);
            }
            returnTitleJLabel.setVisible(false);
            returnProductNameJLabel.setVisible(false);
            returnProductAmountTitleJLabel.setVisible(false);
            returnProductAmountJTextField.setVisible(false);
            returnProductJButton.setVisible(false);

            for (int j = 0; j < len; j++) {
                DefaultTableModel model1 = (DefaultTableModel) listJTable.getModel();
                model1.removeRow(0);
            }

            tableMethod();
        }
        System.out.println(listOfBuyJTable2Row);
        System.out.println(buyNumber);
    }

    private static boolean isInteger(String st1) {
        try {
            Integer.parseInt(st1);
            return true;
        } catch (NumberFormatException e) {
            
            System.out.println("false");
            return false;
        }

    }

    private void calculationMethod() {
        String sl1;
        String am;

        String sl = "";
        String nm = "";
        String price = "";
        String st = "";
        
        int slInt = 0;
        int amInt = 0;

        sl1 = serialJTextField.getText();
        am = amountJTextField.getText();
        
        boolean check = isInteger(sl1);

        if ((check == true) && (!sl1.isEmpty())) {
            slInt = Integer.parseInt(sl1);
        }
        boolean check1 = isInteger(am);
        if ((check1 == true) && (!am.isEmpty())) {
            amInt = Integer.parseInt(am);
        }
        
        if ((sl1.equals("")) || (am.equals(""))||(check == false) || (check1 == false)) {
            JOptionPane.showMessageDialog(rootPane, "fill-Up all accurately..");
        } else if (slInt > (len)||slInt<0) {
            JOptionPane.showMessageDialog(rootPane, "Invalid Serial.....");
        } else if (amInt == 0||amInt<0) {
            JOptionPane.showMessageDialog(rootPane, "Invalid Amount.....");
        } else {
            String query1 = "SELECT * FROM `food` WHERE Sl = '" + sl1 + "'";
            ConnectorClass ob3 = new ConnectorClass();
            try {

                ob3.rs = ob3.stmt.executeQuery(query1);

                while (ob3.rs.next()) {

                    sl = ob3.rs.getString(1);
                    nm = ob3.rs.getString(2);
                    price = ob3.rs.getString(3);
                    st = ob3.rs.getString(4);

                }

            } catch (SQLException ev) {
                ev.printStackTrace();
            }

            int st2 = Integer.parseInt(st);
            int am1 = Integer.parseInt(am);
            if (am1 > st2) {
                JOptionPane.showMessageDialog(rootPane, "Out of amount.....");
            }
            else if(st2==0){
                JOptionPane.showMessageDialog(rootPane, "Stock is Over.....");
            }
            else {
                int sub = st2 - am1;
                int price1 = Integer.parseInt(price);
                int totalPer = price1 * am1;

                String status = "no";

                if (listOfBuyJTable2Row == 0) {

                } else {
                    for (int i = 0; i < listOfBuyJTable2Row; i++) {

                        DefaultTableModel model = (DefaultTableModel) listOfBuyJTable2.getModel();
                        String getName = (model.getValueAt(i, 0).toString());
                        String getAm = (model.getValueAt(i, 1).toString());
                        String getPrice1 = (model.getValueAt(i, 2).toString());

                        if (nm.equals(getName)) {
                            int getAmInt = Integer.parseInt(getAm) + amInt;
                            int getPrice1Int = Integer.parseInt(getPrice1);
                            total = total - getPrice1Int;
                            int getPriceInt = getAmInt * price1;

                            model.setValueAt("" + getAmInt, i, 1);
                            model.setValueAt("" + getPriceInt, i, 2);
                            total = total + getPriceInt;
                            status = "yes";
                        }

                    }
                }

                if (status.equals("no")) {
                    buyNumber = 1;
                    Object[] row = {nm, am1, totalPer};
                    DefaultTableModel model = (DefaultTableModel) listOfBuyJTable2.getModel();
                    model.addRow(row);
                    total = total + totalPer;
                    listOfBuyJTable2Row = listOfBuyJTable2Row + 1;
                }

                totalJLabel2.setText("" + total);

                String sub1 = "" + sub;

                String query = "UPDATE food SET Stock = '" + sub1 + "' WHERE Sl = '" + sl1 + "';";

                try {

                    ob3.stmt.executeUpdate(query);
                    ob3.con.close();
                } catch (SQLException ev) {
                    ev.printStackTrace();
                }

                for (int j = 0; j < len; j++) {
                    DefaultTableModel model1 = (DefaultTableModel) listJTable.getModel();
                    model1.removeRow(0);
                }

                tableMethod();

                serialJTextField.setText("");
                amountJTextField.setText("");
            }

        }

    }

    private void tableMethod() {

        String[] sl = new String[100];
        String[] nm = new String[100];
        String[] price = new String[100];
        String[] st = new String[100];

        int i = 0;

        ConnectorClass obj = new ConnectorClass();
        String query = "Select * FROM food order by Sl asc";
        //String query = "Select * FROM food order by Sl desc";

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
        jScrollPane1 = new javax.swing.JScrollPane();
        listJTable = new javax.swing.JTable();
        listJLabel = new javax.swing.JLabel();
        serialJTextField = new javax.swing.JTextField();
        serialJLabel = new javax.swing.JLabel();
        amountJLabel = new javax.swing.JLabel();
        amountJTextField = new javax.swing.JTextField();
        okJButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listOfBuyJTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        totalJLabel2 = new javax.swing.JLabel();
        listOfBuyJLabel = new javax.swing.JLabel();
        buyJButton = new javax.swing.JButton();
        returnTitleJLabel = new javax.swing.JLabel();
        returnProductNameJLabel = new javax.swing.JLabel();
        returnProductAmountTitleJLabel = new javax.swing.JLabel();
        returnProductAmountJTextField = new javax.swing.JTextField();
        returnProductJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backJButton.setText("BACK");

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

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(listJTable);

        listJLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        listJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listJLabel.setText("List Of Food");

        serialJTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        serialJLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        serialJLabel.setText("ENTER THE SERIAL NO");

        amountJLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        amountJLabel.setText("ENTER THE ANOUNT");

        amountJTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        okJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        okJButton.setText("OK");
        okJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okJButtonActionPerformed(evt);
            }
        });

        listOfBuyJTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "AMOUNT", "TAKA"
            }
        ));
        listOfBuyJTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listOfBuyJTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listOfBuyJTable2);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("TOTAL PRICE :");

        totalJLabel2.setBackground(new java.awt.Color(255, 255, 255));
        totalJLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        totalJLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        listOfBuyJLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        listOfBuyJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listOfBuyJLabel.setText("List Of Buy Food");

        buyJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buyJButton.setText("BUY");

        returnTitleJLabel.setText("RETURN PRODUCT :");

        returnProductNameJLabel.setText("jLabel3");

        returnProductAmountTitleJLabel.setText("Amount :");

        returnProductAmountJTextField.setText("jTextField1");

        returnProductJButton.setText("OK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(returnTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(returnProductNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(returnProductAmountTitleJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(returnProductAmountJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(returnProductJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalJLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buyJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(backJButton))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(178, 178, 178)
                            .addComponent(listJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(247, 247, 247)
                            .addComponent(listOfBuyJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(serialJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(amountJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(serialJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(amountJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(66, 66, 66)
                            .addComponent(okJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(83, 83, 83))
                .addGroup(layout.createSequentialGroup()
                    .addGap(656, 656, 656)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(returnProductAmountTitleJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(returnProductNameJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(returnTitleJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(returnProductAmountJTextField)
                            .addComponent(returnProductJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buyJButton)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(backJButton)
                    .addGap(6, 6, 6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(listJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(listOfBuyJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(serialJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(amountJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(serialJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(amountJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(okJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listOfBuyJTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listOfBuyJTable2MouseClicked
        // TODO add your handling code here:
        returnTitleJLabel.setVisible(true);
        returnProductNameJLabel.setVisible(true);
        returnProductAmountTitleJLabel.setVisible(true);
        returnProductAmountJTextField.setVisible(true);
        returnProductJButton.setVisible(true);

        DefaultTableModel model = (DefaultTableModel) listOfBuyJTable2.getModel();
        k = listOfBuyJTable2.getSelectedRow();
        returnProductNameJLabel.setText(model.getValueAt(k, 0).toString());
        returnProductAmountJTextField.setText(model.getValueAt(k, 1).toString());

    }//GEN-LAST:event_listOfBuyJTable2MouseClicked

    private void okJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_okJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SellProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellProductFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountJLabel;
    private javax.swing.JTextField amountJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton buyJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel listJLabel;
    private javax.swing.JTable listJTable;
    private javax.swing.JLabel listOfBuyJLabel;
    private javax.swing.JTable listOfBuyJTable2;
    private javax.swing.JButton okJButton;
    private javax.swing.JTextField returnProductAmountJTextField;
    private javax.swing.JLabel returnProductAmountTitleJLabel;
    private javax.swing.JButton returnProductJButton;
    private javax.swing.JLabel returnProductNameJLabel;
    private javax.swing.JLabel returnTitleJLabel;
    private javax.swing.JLabel serialJLabel;
    private javax.swing.JTextField serialJTextField;
    private javax.swing.JLabel totalJLabel2;
    // End of variables declaration//GEN-END:variables
}
