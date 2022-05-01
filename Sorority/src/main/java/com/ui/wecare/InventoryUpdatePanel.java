/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui.wecare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Malay Ganguly
 */
public class InventoryUpdatePanel extends javax.swing.JPanel {

    // Connection con=null;
    Statement st = null;
    ResultSet rs = null;
    DefaultTableModel model;
//             String user_name=enterpriseLoginFrame.enterprise_name;

    public InventoryUpdatePanel() {
        initComponents();
        model = new DefaultTableModel();
        jTable1.setModel(model);
        model.addColumn("Inventory ID");
        model.addColumn("Medicine Name");
        model.addColumn("Quantity Available");
        model.addColumn("Enterprise ID");

        if (jTable1.getRowCount() > 0) {
            for (int i = jTable1.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
        }

        /*
               try {
                    con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe","system","admin");
                    st=con.createStatement();

                    String s= "select * from medicineinventory where enterpriseid='"+user_name.substring(user_name.length()-2)+"'"  ;
                    rs=st.executeQuery(s);  // execute query

                    jComboBox3.removeAllItems();
                    while(rs.next()){

                        jComboBox3.addItem(rs.getInt(1)+"");

                    }

                    } catch (SQLException ex) {

                    }
               
               //-----------------------
               //populate the table
          

          

            try {

                    st=con.createStatement();

                    String s= "select * from medicineinventory where enterpriseid='"+user_name.substring(user_name.length()-2)+"'"  ;
                    rs=st.executeQuery(s);  // execute query

                    while(rs.next()){

                        model.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4)});

                    }

                    } catch (SQLException ex) {

                    }
               
               
             
             
         */
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
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Drug Store- Always Available Pharma");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Update Inventory");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel6)
                .addContainerGap(218, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Medicine Name");

        jLabel7.setText("Quantity");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paracetamol", "EcoSprin", "FlavadonMR", "CaberGolin", "None" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        jLabel2.setText("New Medicine");

        jTextField1.setEnabled(false);

        jButton4.setText("<<Go Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Select ID");

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel7)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(jTextField1)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(92, 92, 92)
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(42, 42, 42)))
                                    .addComponent(jButton1)
                                    .addGap(28, 28, 28))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton4)
                            .addGap(23, 23, 23)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(371, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(60, 60, 60))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        //medicine name combobox click
        if (((String) jComboBox1.getSelectedItem()).equalsIgnoreCase("None")) {
            jTextField1.enable(true);

        } else {
            jTextField1.enable(false);
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //save button
        String medicine_name = "";
        int qty = 0;

        try {

//            con = DriverManager.getConnection(
//                "jdbc:oracle:thin:@localhost:1522:xe","SYSTEM","Mihi@1234");
            Connection con = null;
            if (con == null) {
                String url = "jdbc:oracle:thin:@10.0.0.107:1521:xe";
                String user = "SYSTEM";
                String password = "trisha";
                //Class.forName("oracle.jdbc.driver.OracleDriver");
                Class.forName("oracle.jdbc.driver.OracleDriver");
                con = DriverManager.getConnection(url, user, password);
            }

        } catch (SQLException ex) {

        } catch (Exception e) {
        }

        if (((String) jComboBox1.getSelectedItem()).equalsIgnoreCase("None")) {
            medicine_name = jTextField1.getText();
        } else {
            medicine_name = (String) jComboBox1.getSelectedItem();
        }

        try {
            qty = Integer.parseInt(jTextField2.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid quantity");
            return;
        }

        int id = Integer.parseInt((String) jComboBox3.getSelectedItem());

        //-------------------------------------
        //checking whether medicine with same name already there or not
        try {
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

            String enterpriseid = getEnterpriseId();
            String s = "select * from medicineinventory where medicinename='" + medicine_name + "'" + "and inventory_id<>" + id + " and enterpriseid='" + enterpriseid + "'";
            rs = st.executeQuery(s);  // execute query

            if (rs.next()) {

                JOptionPane.showMessageDialog(null, "Medicine Already Exists");
                return;

            }
con.close();
        } catch (SQLException ex) {

        }catch(Exception e){}

        //--------------------------------
        try {
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

            String enterpriseid = getEnterpriseId();

            String s = String.format("update MedicineInventory set medicinename='%s',quantityAvailable=%s where inventory_id=%s and enterpriseid='%s'", medicine_name, qty, id, enterpriseid);
            int n = st.executeUpdate(s);  // execute query
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Record updated successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Record could not be updated");
            }

            jTextField1.setText("");
            jTextField2.setText("");
con.close();
        } catch (SQLException ex) {

        }catch(Exception e){}

        //--------------------------
        //update the table
        model = new DefaultTableModel();
        jTable1.setModel(model);
        model.addColumn("Inventory ID");
        model.addColumn("Medicine Name");
        model.addColumn("Quantity Available");
        model.addColumn("Enterprise ID");

        if (jTable1.getRowCount() > 0) {
            for (int i = jTable1.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
        }

        try {
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

            String enterpriseid = getEnterpriseId();
            String s = "select * from medicineinventory where enterpriseid='" + enterpriseid + "'";
            rs = st.executeQuery(s);  // execute query

            while (rs.next()) {

                model.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)});

            }
con.close();
        } catch (SQLException ex) {

        }catch(Exception e){}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //go back button
        MainFrame.add_Inventory_panel.setVisible(true);
        MainFrame.add_Inventory_panel.updateInventoryTable();
        MainFrame.medicine_Inventory_Panel.updateChartOfMedicineInventoryPanel();
        setVisible(false);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:

        //select Inventory ID combo box
        if (jComboBox3.hasFocus()) {

            try {
                int id = Integer.parseInt((String) jComboBox3.getSelectedItem());
//                con = DriverManager.getConnection(
//                        "jdbc:oracle:thin:@localhost:1522:xe", "SYSTEM", "Mihi@1234");
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

                String enterpriseid = getEnterpriseId();
                String s = "select * from medicineinventory where inventory_id=" + id + " and enterpriseid='" + enterpriseid + "'";
                rs = st.executeQuery(s);  // execute query

                while (rs.next()) {

                    jComboBox1.addItem(rs.getString(2));

                }
con.close();
            } catch (SQLException ex) {

            }catch(Exception e){}

        }


    }//GEN-LAST:event_jComboBox3ActionPerformed

    void updateInventoryTable() {

//          String user_name=enterpriseLoginFrame.enterprise_name;
        if (jTable1.getRowCount() > 0) {
            for (int i = jTable1.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
        }

        try {
//            con = DriverManager.getConnection(
//                    "jdbc:oracle:thin:@localhost:1522:xe", "SYSTEM", "Mihi@1234");
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

            String enterpriseid = getEnterpriseId();
            String s = "select * from medicineinventory where enterpriseid='" + enterpriseid + "'";
            rs = st.executeQuery(s);  // execute query

            while (rs.next()) {

                model.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)});

            }
con.close();
        } catch (SQLException ex) {

        }catch(Exception e){}

    }

    void inventoryIdComboBoxUpdate() {

//          String user_name=enterpriseLoginFrame.enterprise_name;
        try {
//            con = DriverManager.getConnection(
//                    "jdbc:oracle:thin:@localhost:1522:xe", "SYSTEM", "Mihi@1234");
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
            String enterpriseid = getEnterpriseId();
            String s = "select * from medicineinventory where enterpriseid='" + enterpriseid + "'";
            rs = st.executeQuery(s);  // execute query

            jComboBox3.removeAllItems();
            while (rs.next()) {

                jComboBox3.addItem(rs.getInt(1) + "");

            }
con.close();
        } catch (SQLException ex) {

        }catch(Exception e){}

    }

    String getEnterpriseId() {

        String enterprise_id = "";

        try {

//            con = DriverManager.getConnection(
//                    "jdbc:oracle:thin:@localhost:1522:xe", "SYSTEM", "Mihi@1234");
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

        }catch(Exception e){}

        return enterprise_id;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
