/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wicare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sreyoshi Ghosh
 */
public class NewWorkAreaFrame extends javax.swing.JFrame {

      Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        
    public NewWorkAreaFrame() {
        initComponents();
        setVisible(true);
        
        //-----------------------
        //Doctor,Nurse,Receptionist,Pharma,Examination
        
         if(enterpriseLoginFrame.NGO_name.equalsIgnoreCase("h1")|| 
                 enterpriseLoginFrame.NGO_name.equalsIgnoreCase("h2")
                 
                 ||enterpriseLoginFrame.NGO_name.equalsIgnoreCase("h3")
                  ||enterpriseLoginFrame.NGO_name.equalsIgnoreCase("h4")||
                  enterpriseLoginFrame.NGO_name.equalsIgnoreCase("h5")
                 
                 )
         {
             
             jComboBox1.addItem("Doctor");
               jComboBox1.addItem("Nurse");
                 jComboBox1.addItem("Receptionist");
                   jComboBox1.addItem("Pharma");
                     jComboBox1.addItem("Examination");
             
         }
         else if(enterpriseLoginFrame.NGO_name.equalsIgnoreCase("n1")|| 
                 enterpriseLoginFrame.NGO_name.equalsIgnoreCase("n2")
                 
                 ||enterpriseLoginFrame.NGO_name.equalsIgnoreCase("n3")
                  ||enterpriseLoginFrame.NGO_name.equalsIgnoreCase("n4")||
                  enterpriseLoginFrame.NGO_name.equalsIgnoreCase("n5")
                 
                 ){
             
             
             jComboBox1.addItem("NGO");
             
         }
         
          else if(enterpriseLoginFrame.NGO_name.equalsIgnoreCase("p1")|| 
                 enterpriseLoginFrame.NGO_name.equalsIgnoreCase("p2")
                  ||enterpriseLoginFrame.NGO_name.equalsIgnoreCase("p3")
                  ||enterpriseLoginFrame.NGO_name.equalsIgnoreCase("p4")||
                  enterpriseLoginFrame.NGO_name.equalsIgnoreCase("p5")
                  
                  ){
             
             
             jComboBox1.addItem("Police");
             
         }
         
          else if(enterpriseLoginFrame.NGO_name.equalsIgnoreCase("j1")|| 
                 enterpriseLoginFrame.NGO_name.equalsIgnoreCase("j2")||
             enterpriseLoginFrame.NGO_name.equalsIgnoreCase("j3")
                  ||enterpriseLoginFrame.NGO_name.equalsIgnoreCase("j4")||
                  enterpriseLoginFrame.NGO_name.equalsIgnoreCase("j5")
                  
                  ){
             
             jComboBox1.addItem("Lawyer");
             
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
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(220, 50));

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("New Work Area");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Select Organization");

        jLabel3.setText("Employee Full Name");

        jLabel4.setText("Email Address");

        jLabel5.setText("Contact Number");

        jLabel6.setText("User Name");

        jLabel7.setText("Password");

        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, 124, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jButton1)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //create work area
        String organization , emp_name ,email ,contact_no ,username ,password ;
        
        organization=(String) jComboBox1.getSelectedItem();
        emp_name=jTextField1.getText();
        email=jTextField2.getText();
        contact_no=jTextField3.getText();
        username=jTextField4.getText();
        password=jTextField5.getText();
        
        
         try {
             
             con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe","system","admin");

            st=con.createStatement();

             String s=String.format("insert into work_area(organization , emp_name ,email ,contact_no ,username ,password) values('%s','%s','%s','%s','%s','%s')",organization , emp_name ,email ,contact_no ,username ,password );
            int n=st.executeUpdate(s);  // execute query
            if(n>0)
                JOptionPane.showMessageDialog(null, "Record saved successfully");
            else
                 JOptionPane.showMessageDialog(null, "Record could not be added");

           

            con.close();
            
        } catch (SQLException ex) {

        }
        
        
        jTextField1.setText("");
         jTextField2.setText("");
           jTextField3.setText("");
             jTextField4.setText("");
               jTextField5.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
