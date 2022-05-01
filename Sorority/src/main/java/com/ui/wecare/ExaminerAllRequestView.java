/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ui.wecare;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
/**
 *
 * @author gloriasingh
 */
public class ExaminerAllRequestView extends javax.swing.JPanel {

    /**
     * Creates new form ExaminerAllRequestView
     */
    public ExaminerAllRequestView() {
        initComponents();
    }
    
    public void displayAllRequestTable(){
    Connection conn = null;
        try {
            if (conn == null) {
                String url = "jdbc:oracle:thin:@10.0.0.107:1521:xe";
                String user = "SYSTEM";
                String password = "trisha";
                Class.forName("oracle.jdbc.driver.OracleDriver");
                conn = DriverManager.getConnection(url, user, password);
            }
            String sql = "select * from examinerrequest";
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("View All Requests:");

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
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Fetch Report for selected request ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton2.setText("Send Email");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton2)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
            String femaleUsername = (String) jTable1.getValueAt(selectedrow, 0);//f1 from examinerrequest
            String sql1 = "select femaleid from female where username = '"+femaleUsername+"'";
            PreparedStatement ps1 = conn.prepareStatement(sql1);
            ResultSet rs1 = ps1.executeQuery();
BigDecimal FEMALEID = null;
while(rs1.next()){
FEMALEID = rs1.getBigDecimal(1);
}
if(FEMALEID!=null){
            String sql2 = "select testresult from examiner where femaleid = "+FEMALEID;
            PreparedStatement ps2 = conn.prepareStatement(sql2);
            ResultSet rs2 = ps2.executeQuery();
            StringBuffer report = new StringBuffer();
            while(rs2.next()){
                report.append("--------Report for female "+FEMALEID+"--------");
                report.append(rs2.getString(1));
            }
            jTextArea1.setText(report.toString());
            jTextArea1.setEnabled(false);
}else {
JOptionPane.showMessageDialog(null,"Invalid Female User. Contact Administration");
}
            conn.close();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedrow = jTable1.getSelectedRow();
        String emailId = (String) jTable1.getValueAt(selectedrow, 4);
        String contentForEmail = jTextArea1.getText().trim();
        //send email logic to add here
        String toEmail="judiciarymanagementsorority@gmail.com";
        String fromEmail="sororitywomenhealth@gmail.com";
        String emailPass="sorority@12";
        String Subject="Female patient medical Update";
        String body="The test report are given below:- "+ jTextArea1.getText().trim();
        //send email logic to add here
       
         Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        Session session= Session.getDefaultInstance(properties, new javax.mail.Authenticator(){
             protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(fromEmail,emailPass);
            }
        });
        
        // delete report from request table
        try {
            Connection con = null;
            if (con == null) {
                String url = "jdbc:oracle:thin:@10.0.0.107:1521:xe";
                String user = "SYSTEM";
                String password = "trisha";
                Class.forName("oracle.jdbc.driver.OracleDriver");
                con = DriverManager.getConnection(url, user, password);
            }
            Statement stmt1 = con.createStatement();
            String PATIENTID = (String) jTable1.getValueAt(selectedrow, 0);
            String email = (String) jTable1.getValueAt(selectedrow, 4);
            String sql4 = "delete from examinerrequest where femaleid = '"+PATIENTID+"' and POLICE_LAWYER_EMAILID = '"+email+"'";
            int result4 = stmt1.executeUpdate(sql4);
            if (result4 > 0) {
                JOptionPane.showConfirmDialog(null, "Test Report Saved Successfully!!");
            }
            MimeMessage message=new MimeMessage(session);
             message.setFrom(new InternetAddress(fromEmail));
             message.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
             message.setSubject(Subject);
             message.setText(body);
             Transport.send(message);
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Email sent successfully");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
