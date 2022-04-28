/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ui.wecare;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.*;
import java.text.Format;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 *
 */
public class Lawyer extends javax.swing.JPanel {

    /**
     * Creates new form Lawyer
     */
    Connection con = null;
 Connection conn = null;
    Statement st = null;
    Statement st1 = null;
    ResultSet rs = null;
ResultSet rs1 = null;
    PreparedStatement pst;
    DefaultTableModel Model;

    public Lawyer() {
        initComponents();
        setVisible(true);
        try {
        if(con ==null){
            try {
                String url = "jdbc:oracle:thin:@10.0.0.107:1521:xe";
                String user = "SYSTEM";
                String password = "trisha";
                Class.forName("oracle.jdbc.driver.OracleDriver");
                con = DriverManager.getConnection(url, user, password);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }}
            Model = new DefaultTableModel();

            st = con.createStatement();
            //String s = "select a.USERNAME, a.name, b.CASEDETAIL,a.EMAILID, a.MOBILENO from FEMALE a, REGISTEREDCASES b where a.USERNAME = b.FEMALEID";
String s = "select * from REGISTEREDCASES";             
rs = st.executeQuery(s);
            //if (rs.next()) {
               jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            //}
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

public void updateTableForLawyer(){
try {
            if (conn == null) {
                String url = "jdbc:oracle:thin:@10.0.0.107:1521:xe";
                String user = "SYSTEM";
                String password = "trisha";
                Class.forName("oracle.jdbc.driver.OracleDriver");
                conn = DriverManager.getConnection(url, user, password);
            }

            String sql = "select a.USERNAME, a.name, b.CASEDETAIL,a.EMAILID, a.MOBILENO from FEMALE a, REGISTEREDCASES b where a.USERNAME = b.FEMALEID";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
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

        pnllawheadingss = new javax.swing.JPanel();
        lblheadinglawyer = new javax.swing.JLabel();
        lbljusticepic = new javax.swing.JLabel();
        lblawpicsss = new javax.swing.JLabel();
        btnapproverequest = new javax.swing.JButton();
        lblevidencepic = new javax.swing.JLabel();
        txtheadingvictimlawyer = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 255));

        pnllawheadingss.setBackground(new java.awt.Color(51, 0, 102));

        lblheadinglawyer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblheadinglawyer.setForeground(new java.awt.Color(255, 255, 255));
        lblheadinglawyer.setText("Lawyer Profile- Place of Justice");

        javax.swing.GroupLayout pnllawheadingssLayout = new javax.swing.GroupLayout(pnllawheadingss);
        pnllawheadingss.setLayout(pnllawheadingssLayout);
        pnllawheadingssLayout.setHorizontalGroup(
            pnllawheadingssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnllawheadingssLayout.createSequentialGroup()
                .addComponent(lbljusticepic, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lblheadinglawyer, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnllawheadingssLayout.setVerticalGroup(
            pnllawheadingssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnllawheadingssLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblheadinglawyer, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(lbljusticepic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
        );

        btnapproverequest.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnapproverequest.setText("Approve the Request");
        btnapproverequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnapproverequestActionPerformed(evt);
            }
        });

        txtheadingvictimlawyer.setBackground(new java.awt.Color(0, 0, 204));
        txtheadingvictimlawyer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtheadingvictimlawyer.setForeground(new java.awt.Color(255, 255, 255));
        txtheadingvictimlawyer.setText("History of the Victim");
        txtheadingvictimlawyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtheadingvictimlawyerActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnllawheadingss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtheadingvictimlawyer, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblevidencepic, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblawpicsss, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(btnapproverequest)))
                .addGap(86, 86, 86))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnllawheadingss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtheadingvictimlawyer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblawpicsss)
                        .addGap(3, 3, 3)
                        .addComponent(lblevidencepic)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(btnapproverequest)
                .addContainerGap(150, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtheadingvictimlawyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtheadingvictimlawyerActionPerformed
                                                 
//        try {
//
//            if (conn == null) {
//                String url = "jdbc:oracle:thin:@10.0.0.107:1521:xe";
//                String user = "SYSTEM";
//                String password = "trisha";
//                Class.forName("oracle.jdbc.driver.OracleDriver");
//                Connection conn = DriverManager.getConnection(url, user, password);
//            }
//int selectedrow = jTable1.getSelectedRow();
//int selectedcolumn = 0;
//String femaleUsername = (String) jTable1.getValueAt(selectedrow, selectedcolumn);
//Statement stmt = conn.createStatement();
//            String sql4 = "update REGISTEREDCASES set LAWYERUSERNAME = "+EmployeeLoginFrame.Emp_name+" where FEMALEID = "+femaleUsername;
//            int result4 = stmt.executeUpdate(sql4);
//            //System.out.print("result: " + result);
//            JOptionPane.showMessageDialog(null, "Record Updated successfully");
//        } catch (Exception e) {
//            System.out.print(e.getMessage());
//        }
    }//GEN-LAST:event_txtheadingvictimlawyerActionPerformed

    private void btnapproverequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnapproverequestActionPerformed
        // TODO add your handling code here:
try {

            if (conn == null) {
                String url = "jdbc:oracle:thin:@10.0.0.107:1521:xe";
                String user = "SYSTEM";
                String password = "trisha";
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection conn = DriverManager.getConnection(url, user, password);
            }
            int selectedrow = jTable1.getSelectedRow();
            int selectedcolumn = 0;
            String femaleUsername = (String) jTable1.getValueAt(selectedrow, selectedcolumn);
            Statement stmt = conn.createStatement();
            String sql4 = "update REGISTEREDCASES set LAWYERUSERNAME = '"+EmployeeLoginFrame.Emp_name+"' where FEMALEID = '"+femaleUsername+"'";
            int result4 = stmt.executeUpdate(sql4);
            //System.out.print("result: " + result);
            JOptionPane.showMessageDialog(null, "Record Updated successfully");
        } 
        catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_btnapproverequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnapproverequest;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblawpicsss;
    private javax.swing.JLabel lblevidencepic;
    private javax.swing.JLabel lblheadinglawyer;
    private javax.swing.JLabel lbljusticepic;
    private javax.swing.JPanel pnllawheadingss;
    private javax.swing.JTextField txtheadingvictimlawyer;
    // End of variables declaration//GEN-END:variables
}
