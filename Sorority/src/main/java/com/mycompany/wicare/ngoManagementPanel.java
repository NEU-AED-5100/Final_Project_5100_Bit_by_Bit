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
    import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sreyoshi Ghosh
 */
public class ngoManagementPanel extends javax.swing.JPanel {

     Connection con=null;
        Statement st=null;
        ResultSet rs=null;
          DefaultTableModel model ;
         
   
    public ngoManagementPanel() {
        initComponents();
        jLabel1.setVisible(false);
        jTextField1.setVisible(false);
        
        
          model = new DefaultTableModel();
        jTable1.setModel(model);
        model.addColumn("NGO Id");
        model.addColumn("NGO Name");
        model.addColumn("Location");
        model.addColumn("Zip Code");
        model.addColumn("Authorization");
        
        //------------------------
             if (jTable1.getRowCount() > 0) {
            for (int i = jTable1.getRowCount() - 1; i >=0; i--) {
                model.removeRow(i);
            }
        }
        
         try {
             
             con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe","system","admin");

            st=con.createStatement();

            String s= "select * from ngo_detail"  ;
            rs=st.executeQuery(s);  // execute query

            while(rs.next()){

                model.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});

            }

            con.close();
            
        } catch (SQLException ex) {

        }
         
         //--------------------------
        
        
        
        jComboBox1.removeAllItems();
        try {

              con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe","system","admin");
                     
              st=con.createStatement();

            String s="select location from enterprise";
           rs=st.executeQuery(s);  // execute query
           
         /*
           while(rs.next()){
               
               jComboBox1.addItem(rs.getString(1));
              
                
           }
            */
                     jComboBox1.addItem("New Jersey");
                     jComboBox1.addItem("Boston");
                     jComboBox1.addItem("California");
                     
            con.close();
                     

        } catch (SQLException ex) {
                    
        }
        
                 
       
        
        jComboBox4.addItem("Private");
        jComboBox4.addItem("Government");
        
        
        
        
    }

    
    void updateTableForNgo(){
        
        
        model = new DefaultTableModel();
        jTable1.setModel(model);
        model.addColumn("NGO Id");
        model.addColumn("NGO Name");
        model.addColumn("Location");
        model.addColumn("Zip Code");
        model.addColumn("Authorization");
        model.addColumn("funtionality");
        //------------------------clear the table--------
             if (jTable1.getRowCount() > 0) {
            for (int i = jTable1.getRowCount() - 1; i >=0; i--) {
                model.removeRow(i);
            }
        }
        
             
             //---------------populate the table----------------
         try {
             
             con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe","system","admin");

            st=con.createStatement();

            String s= "select * from ngo_detail where ngo_name='"+enterpriseLoginFrame.NGO_name+"'"  ;
            rs=st.executeQuery(s);  // execute query

            while(rs.next()){

                model.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(7)});

            }

            con.close();
            
        } catch (SQLException ex) {

        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(1000, 397));

        jLabel2.setText("Location");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Zip Code");

        jLabel5.setText("Authorization Type");

        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
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
        jScrollPane1.setViewportView(jTable1);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("NGO Management");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setLabel("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter ID");

        jLabel7.setText("Address");

        jLabel8.setText("Functionality");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blood donation camp", "Free food stall", "Empowerment of women", "Health and nutrition plan" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel8))
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(716, 716, 716))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(318, 318, 318))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
        //location combobox click event
       
        
        jComboBox3.removeAllItems();
        
        if (((String)jComboBox1.getSelectedItem()).equalsIgnoreCase("new jersey")){
            
            jComboBox3.addItem("07302");
             jComboBox3.addItem("07303");
              jComboBox3.addItem("07304");
              jComboBox3.addItem("07305");
               jComboBox3.addItem("07306");
        }
        else{
             jComboBox3.addItem("02101");
              jComboBox3.addItem("02102");
               jComboBox3.addItem("02103");
               jComboBox3.addItem("02104");
               jComboBox3.addItem("02105");
               
        }
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
        //aythorization button
        EditFrame idfr=  new EditFrame();
        String s=(String) jComboBox4.getSelectedItem();
        if(s.equals("Government"))
        {
            jLabel1.setVisible(true);
            jTextField1.setVisible(true);
        }
        else{
            
             jLabel1.setVisible(false);
            jTextField1.setVisible(false);
        }
        
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //add button

//we are assuming user name is the NGO name        
         //submit button Govt ID
        String ngo_name=enterpriseLoginFrame.NGO_name;
         String location=(String) jComboBox1.getSelectedItem();
        
           String zip=(String) jComboBox3.getSelectedItem();
          String auth=(String) jComboBox4.getSelectedItem();
          String address=jTextField2.getText();
          String functionality=(String) jComboBox5.getSelectedItem();
          
          
         
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
                                String sql="insert into ngo_detail (ngo_name,location,zipcode,authorization_type,address,functionality ) values('%s','%s','%s','%s','%s','%s')";

                                s=String.format(sql,ngo_name,location,zip,auth,address,functionality);
                               int n=st.executeUpdate(s);  // execute query
                               if(n>0)
                                   JOptionPane.showMessageDialog(null, "Record saved");
                               else
                                   JOptionPane.showMessageDialog(null, "Record could not be saved");
                               
                                con.close(); 
                        
          }   
                        
          catch(Exception e){
                            System.out.println("error");
                        
          }
                    
                 
        //update the table             
          MainFrame.p3.updateTableForNgo();
          jTextField2.setText("");
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //edit button
        EditFrame e=new EditFrame();
        e.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //delete frame
        DeleteFrame df=new DeleteFrame();
        //df.setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
