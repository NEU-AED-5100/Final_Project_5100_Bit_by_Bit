/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui.wecare;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Malay Ganguly
 */
public class MedicineInventoryPanel extends javax.swing.JPanel {

//     Connection con=null;
    Statement st = null;
    Statement st1 = null;
    ResultSet rs = null;
    ResultSet rs1 = null;
    DefaultTableModel model;
    int total;
    String enterpriseName = "";
//            String user_name=enterpriseLoginFrame.enterprise_name;

    public MedicineInventoryPanel() {
        initComponents();
        model = new DefaultTableModel();
               
        jTable1.setModel(model);
        model.addColumn("Medicine Name");
        model.addColumn("Quantity");
        clearMedicineInventoryTable();
        try {
//               con = DriverManager.getConnection(
//                    "jdbc:oracle:thin:@localhost:1522:xe","SYSTEM","Mihi@1234");
            Connection con = null;
            if (con == null) {
                String url = "jdbc:oracle:thin:@10.0.0.107:1521:xe";
                String user = "SYSTEM";
                String password = "trisha";
                //Class.forName("oracle.jdbc.driver.OracleDriver");
                Class.forName("oracle.jdbc.driver.OracleDriver");
                con = DriverManager.getConnection(url, user, password);
            }
            st = con.createStatement();

//            String user_name=enterpriseLoginFrame.enterprise_name;
            String enterpriseid = getEnterpriseId();
            String s = "select * from medicineinventory where enterpriseid='" + enterpriseid + "'";
            rs = st.executeQuery(s);  // execute query
            jComboBox1.removeAllItems();

            while (rs.next()) {

                jComboBox1.addItem(rs.getString(2));

            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //----------------------------
        //creating chart
        DefaultCategoryDataset dataset
                = new DefaultCategoryDataset();

        try {
//               con = DriverManager.getConnection(
//                    "jdbc:oracle:thin:@localhost:1522:xe","SYSTEM","Mihi@1234");
            Connection con = null;
            if (con == null) {
                String url = "jdbc:oracle:thin:@10.0.0.107:1521:xe";
                String user = "SYSTEM";
                String password = "trisha";
                //Class.forName("oracle.jdbc.driver.OracleDriver");
                Class.forName("oracle.jdbc.driver.OracleDriver");
                con = DriverManager.getConnection(url, user, password);
            }
            st = con.createStatement();

//            String user_name=enterpriseLoginFrame.enterprise_name;
            String enterpriseid = getEnterpriseId();

            String s = "select * from medicineinventory where enterpriseid='" + enterpriseid + "'";
            rs = st.executeQuery(s);  // execute query

            while (rs.next()) {
                //setting values in chart
                dataset.setValue(rs.getInt(3), rs.getString(2), rs.getString(2));

            }

            con.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
        }

        JFreeChart barChart = ChartFactory.createBarChart(
                "Medicine Inventory Chart",
                "",
                "Stock",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        jPanel5.removeAll();
        BorderLayout bl = new BorderLayout();
        jPanel5.setLayout(bl);
        jPanel5.add(chartPanel);
        chartPanel.setPreferredSize(new java.awt.Dimension(450, 250));
        jPanel5.validate();

        //------------------------
        setSize(new Dimension(700, 700));

        setVisible(true);
        jComboBox2.removeAllItems();

        for (int i = 1; i < 11; i++) {
            jComboBox2.addItem(i + "");
        }

    }

    public void displayPatient() {
        Connection conn = null;
        try {
            if (conn == null) {
                String url = "jdbc:oracle:thin:@10.0.0.107:1521:xe";
                String user = "SYSTEM";
                String password = "trisha";
                Class.forName("oracle.jdbc.driver.OracleDriver");
                conn = DriverManager.getConnection(url, user, password);
            }
            String sql = "select p.PATIENTID , p.NAME, h.REPORTGENERATIONDATE,h.PRESCRIPTION from patient p ,patienthistory h where p.PATIENTID = h.PATIENTUSERNAME";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            conn.close();
            updateMedicineNameCombobox();
        } catch (Exception e) {
            System.out.print(e.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setMinimumSize(new java.awt.Dimension(860, 690));
        setPreferredSize(new java.awt.Dimension(1900, 1397));

        jPanel1.setBackground(new java.awt.Color(102, 0, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 255));
        jLabel1.setText("Drug Store- Always Available Pharma");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Trisha\\Downloads\\womenlogo.jpeg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(104, 104, 104))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(184, 184, 184))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(860, 690));
        jPanel2.setPreferredSize(new java.awt.Dimension(1900, 1397));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Choose the Medicine");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 737, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 153));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Details of Prescription");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel6)
                .addContainerGap(535, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 720, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Medicine Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Amount");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 120, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 120, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 254, 76));

        jLabel8.setText("Amount");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        jTextField2.setEnabled(false);
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 104, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Next to add in Inventory");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 182, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 220, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Enter Name : ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 100, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("View All");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 60));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Quantity");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(831, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //add button
        String medicineName = (String) jComboBox1.getSelectedItem();
        int qty = Integer.parseInt((String) jComboBox2.getSelectedItem());

        total += qty * 10;
        model.addRow(new Object[]{medicineName, qty});

        jTextField2.setText("$" + String.valueOf(total));

        //--------------------------------------
        String enterpriseid = getEnterpriseId();
        try {

//                   con = DriverManager.getConnection(
//                    "jdbc:oracle:thin:@localhost:1522:xe","SYSTEM","Mihi@1234");
            Connection con = null;
            if (con == null) {
                String url = "jdbc:oracle:thin:@10.0.0.107:1521:xe";
                String user = "SYSTEM";
                String password = "trisha";
                //Class.forName("oracle.jdbc.driver.OracleDriver");
                Class.forName("oracle.jdbc.driver.OracleDriver");
                con = DriverManager.getConnection(url, user, password);
            }
            st = con.createStatement();

            String s = String.format("update MedicineInventory set quantityAvailable=quantityAvailable-%s where medicinename='%s' and enterpriseId='%s'", qty, medicineName, enterpriseid);
            int n = st.executeUpdate(s);  // execute query
            if (n > 0) {
                updateChartOfMedicineInventoryPanel();
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();

        } catch (Exception e) {
        }

        jComboBox2.removeAllItems();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //next to add inventory button
        MainFrame.add_Inventory_panel.setVisible(true);
        MainFrame.add_Inventory_panel.updateInventoryTable();
        MainFrame.add_Inventory_panel.addMedicineListInDropDown(EmployeeLoginFrame.Emp_name);
        setVisible(false);
        clearMedicineInventoryTable();
        jTextField2.setText("");
        total = 0;

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        //select medicine combobox

        if (jComboBox1.hasFocus()) {

            try {
                String enterpriseid = getEnterpriseId();
//                                con = DriverManager.getConnection(
//                                      "jdbc:oracle:thin:@localhost:1522:xe","SYSTEM","Mihi@1234");
                Connection con = null;
                if (con == null) {
                    String url = "jdbc:oracle:thin:@10.0.0.107:1521:xe";
                    String user = "SYSTEM";
                    String password = "trisha";
                    //Class.forName("oracle.jdbc.driver.OracleDriver");
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    con = DriverManager.getConnection(url, user, password);
                }
                st = con.createStatement();

                String s = String.format("select quantityAvailable from MedicineInventory where medicineName='%s' and  enterpriseId='%s'", (String) jComboBox1.getSelectedItem(), enterpriseid);
                rs = st.executeQuery(s);  // execute query
                jComboBox2.removeAllItems();

                if (rs.next()) {

                    int qty = rs.getInt(1);
                    for (int i = 1; i <= qty; i++) {
                        jComboBox2.addItem(i + "");
                    }
                }
                con.close();

            } catch (SQLException ex) {

            } catch (Exception e) {
            }

        }


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Connection conn = null;
            if (conn == null) {
                String url = "jdbc:oracle:thin:@10.0.0.107:1521:xe";
                String user = "SYSTEM";
                String password = "trisha";
                Class.forName("oracle.jdbc.driver.OracleDriver");
                conn = DriverManager.getConnection(url, user, password);
            }
            String sql = "select p.PATIENTID , p.NAME, h.REPORTGENERATIONDATE,h.PRESCRIPTION from patient p ,patienthistory h where p.PATIENTID = h.PATIENTUSERNAME and p.NAME = '" + jTextField1.getText().trim() + "'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            jTable2.removeAll();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            conn.close();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            Connection conn = null;
            if (conn == null) {
                String url = "jdbc:oracle:thin:@10.0.0.107:1521:xe";
                String user = "SYSTEM";
                String password = "trisha";
                Class.forName("oracle.jdbc.driver.OracleDriver");
                conn = DriverManager.getConnection(url, user, password);
            }
            String sql = "select p.PATIENTID , p.NAME, h.REPORTGENERATIONDATE,h.PRESCRIPTION from patient p ,patienthistory h where p.PATIENTID = h.PATIENTUSERNAME";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            conn.close();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public void updateMedicineNameCombobox() {
//         String user_name=enterpriseLoginFrame.enterprise_name;

        try {
//               con = DriverManager.getConnection(
//                    "jdbc:oracle:thin:@localhost:1521:xe","system","admin");
            Connection con1 = null;
            if (con1 == null) {
                String url = "jdbc:oracle:thin:@10.0.0.107:1521:xe";
                String user = "SYSTEM";
                String password = "trisha";
                //Class.forName("oracle.jdbc.driver.OracleDriver");
                Class.forName("oracle.jdbc.driver.OracleDriver");
                con1 = DriverManager.getConnection(url, user, password);
            }
            st1 = con1.createStatement();

            String enterpriseid = getEnterpriseId();
            String s = "select * from medicineinventory where enterpriseId='" + enterpriseid + "'";
            rs1 = st1.executeQuery(s);  // execute query
            jComboBox1.removeAllItems();

            while (rs1.next()) {

                jComboBox1.addItem(rs1.getString(2));

            }

            con1.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
        }

    }

    void updateChartOfMedicineInventoryPanel() {

//         String user_name=enterpriseLoginFrame.enterprise_name;
        //creating chart
        DefaultCategoryDataset dataset
                = new DefaultCategoryDataset();

        try {
//               con = DriverManager.getConnection(
//                    "jdbc:oracle:thin:@localhost:1522:xe","SYSTEM","Mihi@1234");
            Connection con2 = null;
            if (con2 == null) {
                String url = "jdbc:oracle:thin:@10.0.0.107:1521:xe";
                String user = "SYSTEM";
                String password = "trisha";
                //Class.forName("oracle.jdbc.driver.OracleDriver");
                Class.forName("oracle.jdbc.driver.OracleDriver");
                con2 = DriverManager.getConnection(url, user, password);
            }
            Statement st2 = con2.createStatement();
            String enterpriseid = getEnterpriseId();
            String s = "select * from medicineinventory where enterpriseid='" + enterpriseid + "'";
            ResultSet rs2 = st2.executeQuery(s);  // execute query

            while (rs2.next()) {
                //setting values in chart
                dataset.setValue(rs2.getInt(3), rs2.getString(2), rs2.getString(2));

            }

            con2.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
        }

        JFreeChart barChart = ChartFactory.createBarChart(
                "Medicine inventory chart",
                "",
                "Stock",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        jPanel5.removeAll();
        BorderLayout bl = new BorderLayout();
        jPanel5.setLayout(bl);
        jPanel5.add(chartPanel);
        chartPanel.setPreferredSize(new java.awt.Dimension(450, 250));
        jPanel5.validate();

        //------------------------
        setSize(new Dimension(700, 700));

    }

    String getEnterpriseId() {

        String enterprise_id = "";

        try {

//                    con = DriverManager.getConnection(
//                          "jdbc:oracle:thin:@localhost:1522:xe","SYSTEM","Mihi@1234");
            Connection con = null;
            if (con == null) {
                String url = "jdbc:oracle:thin:@10.0.0.107:1521:xe";
                String user = "SYSTEM";
                String password = "trisha";
                //Class.forName("oracle.jdbc.driver.OracleDriver");
                Class.forName("oracle.jdbc.driver.OracleDriver");
                con = DriverManager.getConnection(url, user, password);
            }
            st = con.createStatement();

            //employee name can be PH1h1 
            //enterprise_name can be h1, h2 etc
            //we have to collect h1 or h2 enterprise for PH1h1 employee
            String s = String.format("select enterprise_name from work_area where username='%s'", EmployeeLoginFrame.Emp_name);
            rs = st.executeQuery(s);  // execute query

            if (rs.next()) {

                enterprise_id = rs.getString(1);
            }

            con.close();
        } catch (SQLException ex) {

        } catch (Exception e) {
        }

        return enterprise_id;

    }

    void clearMedicineInventoryTable() {

//          if (jTable1.getRowCount() > 0) {
//                        for (int i = jTable1.getRowCount() - 1; i >=0; i--) {
//                            model.removeRow(i);
//                        }
//                 }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
