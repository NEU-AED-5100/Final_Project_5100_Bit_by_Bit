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
public class EditFrame extends javax.swing.JFrame {

      
      Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        
        String ngo="";
    public EditFrame() {
        initComponents();
        setVisible(false);
        jTextField1.setVisible(false);
        jLabel1.setVisible(false);
        
        
        //---------------------
         try {

              con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe","system","admin");
            st=con.createStatement();

           String  s=String.format("select ngo_id from ngo_detail");
           rs=st.executeQuery(s);  // execute query
           jComboBox1.removeAllItems();
           
            while(rs.next()){
               
               jComboBox1.addItem(rs.getString(1));
               
                
           }
            
            con.close();
            
          }
          catch(Exception e){
              
              
          }
         
         //-------------------------------
                    jComboBox2.addItem("New Jersey");
                     jComboBox2.addItem("Boston");
                    jComboBox2.addItem("California");
                 
      
        
        jComboBox5.addItem("Private");
        jComboBox5.addItem("Government");
        
        //--------------------------
        
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(200, 200));

        jLabel1.setText("Select  Id to Edit");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Location");

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Zip Code");

        jLabel5.setText("Authorization Type");

        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jLabel6.setText("Enter ID");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("NGO Edit ");

        jLabel8.setText("Address");

        jLabel9.setText("Functionality");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blood donation camp", "Free food stall", "Empowerment of women", "Health and nutrition plan" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2)
                            .addComponent(jComboBox6, 0, 201, Short.MAX_VALUE)
                            .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel4)))))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(165, 165, 165)
                    .addComponent(jLabel2)
                    .addContainerGap(363, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(6, 6, 6))
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(105, 105, 105)
                    .addComponent(jLabel2)
                    .addContainerGap(261, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //submit button Govt ID
        
        //submit button Govt ID
        int id=Integer.parseInt((String) jComboBox1.getSelectedItem());
        String ngo_name=enterpriseLoginFrame.NGO_name;//collect the NGO name 
         String location=(String) jComboBox2.getSelectedItem();
        
           String zip=(String) jComboBox4.getSelectedItem();
          String auth=(String) jComboBox5.getSelectedItem();
          String address=jTextField2.getText();
         String functionality=(String) jComboBox6.getSelectedItem();
         
         String s="";
          if(auth.equals("Government")){
              
              
                        try {

                                con = DriverManager.getConnection(
                                      "jdbc:oracle:thin:@localhost:1521:xe","system","admin");

                                st=con.createStatement();

                                 s="select * from govt_ids where id='"+jTextField1.getText()+"'";
                               rs=st.executeQuery(s);  // execute query

         
                          if(!rs.next()){

                               JOptionPane.showMessageDialog(null, "Invalid ID");
                                return;

                            }
                                        
                                              


                            } catch (SQLException ex) {
                                         System.out.println(ex.getMessage()); 
                            }

              
              
              
          }
          
                        
          try{
                            
                             con = DriverManager.getConnection(
                                      "jdbc:oracle:thin:@localhost:1521:xe","system","admin");
                                st=con.createStatement();
                                String sql="update ngo_detail set ngo_name='%s',location='%s',zipcode='%s',authorization_type='%s',address='%s',functionality='%s' where ngo_id=%s ";

                                s=String.format(sql,ngo_name,location,zip,auth,address,functionality,id);
                               int n=st.executeUpdate(s);  // execute query
                               if(n>0)
                                   JOptionPane.showMessageDialog(null, "Record updated");
                               else
                                   JOptionPane.showMessageDialog(null, "Record could not be updated");
                               
                                con.close(); 
                        
          }   
                        
          catch(Exception e){
                            System.out.println(e.getMessage());
                        
          }
                    
          //update the ngo detail table       
          MainFrame.p3.updateTableForNgo();
          
       jTextField2.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:

        //location combobox click event
        
        jComboBox4.removeAllItems();
        if (((String)jComboBox1.getSelectedItem()).equalsIgnoreCase("new jersey")){
            
            jComboBox4.addItem("07302");
             jComboBox4.addItem("07303");
              jComboBox4.addItem("07304");
              jComboBox4.addItem("07305");
               jComboBox4.addItem("07306");
        }
        else if(((String)jComboBox1.getSelectedItem()).equalsIgnoreCase("Boston")){
             jComboBox4.addItem("02101");
              jComboBox4.addItem("02102");
               jComboBox4.addItem("02103");
               jComboBox4.addItem("02104");
               jComboBox4.addItem("02105");
               
        }
        else{
            
            jComboBox4.addItem("90241");
              jComboBox4.addItem("90242");
               jComboBox4.addItem("90245");
                jComboBox4.addItem("90247");
                 jComboBox4.addItem("91331");
            
        }


    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
        //aythorization button
      
        String s=(String) jComboBox5.getSelectedItem();
        if(s.equals("Government"))
        {
            jLabel6.setVisible(true);
            jTextField1.setVisible(true);
        }
        else{

            jLabel6.setVisible(false);
            jTextField1.setVisible(false);
        }

    }//GEN-LAST:event_jComboBox5ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
