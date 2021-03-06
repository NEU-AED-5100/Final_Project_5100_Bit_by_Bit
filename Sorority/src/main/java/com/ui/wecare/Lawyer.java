/**
* Author:     Bit-by-Bit
* Subject:    INFO5100 - Application Engineer & Development 
* Purpose:   Sorority
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
Connection conn = null;
 
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
conn.close();
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
        jLabel1 = new javax.swing.JLabel();
        lblawpicsss = new javax.swing.JLabel();
        btnapproverequest = new javax.swing.JButton();
        lblevidencepic = new javax.swing.JLabel();
        txtheadingvictimlawyer = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setMinimumSize(new java.awt.Dimension(860, 690));
        setPreferredSize(new java.awt.Dimension(1900, 1397));

        pnllawheadingss.setBackground(new java.awt.Color(102, 0, 153));

        lblheadinglawyer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblheadinglawyer.setForeground(new java.awt.Color(255, 102, 255));
        lblheadinglawyer.setText("Lawyer Profile- Place of Justice");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Trisha\\Downloads\\womenlogo.jpeg")); // NOI18N

        javax.swing.GroupLayout pnllawheadingssLayout = new javax.swing.GroupLayout(pnllawheadingss);
        pnllawheadingss.setLayout(pnllawheadingssLayout);
        pnllawheadingssLayout.setHorizontalGroup(
            pnllawheadingssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnllawheadingssLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(lblheadinglawyer, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnllawheadingssLayout.setVerticalGroup(
            pnllawheadingssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnllawheadingssLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnllawheadingssLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblheadinglawyer, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        btnapproverequest.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnapproverequest.setText("Approve the Request");
        btnapproverequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnapproverequestActionPerformed(evt);
            }
        });

        txtheadingvictimlawyer.setBackground(new java.awt.Color(0, 0, 153));
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

        jLabel4.setForeground(new java.awt.Color(51, 0, 153));
        jLabel4.setText("************************************************************************************************");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Trisha\\Downloads\\LAW.jpg")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 153));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 153));
        jLabel6.setText("**********************************************************************");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 153));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 153));
        jLabel8.setText("**********************************************************************");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(750, 750, 750)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblevidencepic, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblawpicsss, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pnllawheadingss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtheadingvictimlawyer, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnapproverequest)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(lblawpicsss))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnllawheadingss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel6)
                        .addGap(21, 21, 21)
                        .addComponent(txtheadingvictimlawyer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnapproverequest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(67, 67, 67)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 850, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblevidencepic))
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
Connection conn = null;
 
try {

            if (conn == null) {
                String url = "jdbc:oracle:thin:@10.0.0.107:1521:xe";
                String user = "SYSTEM";
                String password = "trisha";
                Class.forName("oracle.jdbc.driver.OracleDriver");
                conn = DriverManager.getConnection(url, user, password);
            }
            int selectedrow = jTable1.getSelectedRow();
            int selectedcolumn = 0;
            String femaleUsername = (String) jTable1.getValueAt(selectedrow, selectedcolumn);
            Statement stmt = conn.createStatement();
            String sql4 = "update REGISTEREDCASES set LAWYERUSERNAME = '"+EmployeeLoginFrame.Emp_name+"' where FEMALEID = '"+femaleUsername+"'";
            int result4 = stmt.executeUpdate(sql4);
            //System.out.print("result: " + result);

//get lawyer emailid
            String emailid = "";
            String sql = "select email from work_area where username = '"+EmployeeLoginFrame.Emp_name+"'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            emailid= rs.getString(1);
            }
            
            Statement stmt7 = conn.createStatement();
            String sql7 = String.format("insert into examinerrequest (FEMALEID,police_lawyer,ispolice,islawyer,police_lawyer_emailID) values('%s','%s','%s','%s','%s')", femaleUsername, EmployeeLoginFrame.Emp_name, 'N', 'Y', emailid);
            int result7 = stmt7.executeUpdate(sql7);
            JOptionPane.showMessageDialog(null, "Task asigned successfully!! Request for all test report raised successfully");
            JOptionPane.showMessageDialog(null, "Record Updated successfully");
conn.close();
        } 
        catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_btnapproverequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnapproverequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblawpicsss;
    private javax.swing.JLabel lblevidencepic;
    private javax.swing.JLabel lblheadinglawyer;
    private javax.swing.JPanel pnllawheadingss;
    private javax.swing.JTextField txtheadingvictimlawyer;
    // End of variables declaration//GEN-END:variables
}
