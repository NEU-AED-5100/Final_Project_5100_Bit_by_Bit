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
public class DeleteFrame extends javax.swing.JFrame {

        Connection con=null;
          Connection con2=null;
        Statement st=null;
        ResultSet rs=null;
          DefaultTableModel model ;
          
          
    public DeleteFrame() {
        initComponents();
        setVisible(true);
        
        //-------------------
        model = new DefaultTableModel();
        jTable1.setModel(model);
        model.addColumn("NGO Id");
        model.addColumn("NGO Name");
        model.addColumn("Location");
        model.addColumn("Zip Code");
        model.addColumn("Authorization");
        
        //----------------------
        
         try {

              con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe","system","admin");
            st=con.createStatement();

           String  s=("select ngo_id from ngo_detail");
           rs=st.executeQuery(s);  // execute query
           jComboBox1.removeAllItems();
           
            while(rs.next()){
               
               jComboBox1.addItem(String.valueOf(rs.getInt(1)));
               
                
           }
            
            con.close();
            
          }
          catch(Exception e){
              e.printStackTrace();
              
          }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(200, 200));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Delete NGO");

        jLabel2.setText("Select ID");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
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

        jButton1.setText("Delete");
        jButton1.setActionCommand("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jButton1)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
        //id combo box click
      if(jComboBox1.hasFocus()) {
                    if (jTable1.getRowCount() > 0) {
                     for (int i = jTable1.getRowCount() - 1; i >=0; i--) {
                         model.removeRow(i);
                     }
                 }
        
                    try {

                        con2 = DriverManager.getConnection(
                               "jdbc:oracle:thin:@localhost:1521:xe","system","admin");

                       st=con2.createStatement();

                       String s= "select * from ngo_detail where ngo_id="+jComboBox1.getSelectedItem()  ;
                       rs=st.executeQuery(s);  // execute query

                       while(rs.next()){

                           model.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});

                       }

                       con2.close();
                       

                   } catch (SQLException ex) {

                   }
          
          
      } 
         
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //delete button
       int result= JOptionPane.showConfirmDialog(null, "Are you sure to delete ?");
         if(result == JOptionPane.YES_OPTION){
             
                 
                    try{
                            
                             con = DriverManager.getConnection(
                                      "jdbc:oracle:thin:@localhost:1521:xe","system","admin");
                                st=con.createStatement();
                                String sql="delete from ngo_detail  where ngo_id=%s";
                                    int id= Integer.parseInt((String) jComboBox1.getSelectedItem());
                                String s=String.format(sql,id);
                               int n=st.executeUpdate(s);  // execute query
                               if(n>0)
                                   JOptionPane.showMessageDialog(null, "Record Deleted");
                               else
                                   JOptionPane.showMessageDialog(null, "Record could not be deleted");
                               
                                con.close(); 
                        }   
                        catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                 
                    
                    //-----------------------clear the table
                    if (jTable1.getRowCount() > 0) {
                     for (int i = jTable1.getRowCount() - 1; i >=0; i--) {
                         model.removeRow(i);
                     }
                 }
                     
                   //------------------------  
                     MainFrame.p3.updateTableForNgo();
                     
                     updateCombobox1();
                 
             }
         else
             return;
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    void updateCombobox1(){
        
           try {

              con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe","system","admin");
            st=con.createStatement();

           String  s=("select ngo_id from ngo_detail");
           rs=st.executeQuery(s);  // execute query
           jComboBox1.removeAllItems();
           
            while(rs.next()){
               
               jComboBox1.addItem(String.valueOf(rs.getInt(1)));
               
                
           }
            
            con.close();
            
          }
          catch(Exception e){
              e.printStackTrace();
              
          }
        
        
    }
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
