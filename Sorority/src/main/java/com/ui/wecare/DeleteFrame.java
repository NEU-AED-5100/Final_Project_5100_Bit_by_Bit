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
 * @author Sreyoshi Ghosh
 */
public class DeleteFrame extends javax.swing.JFrame {

        //Connection con=null;
          Connection con2=null;
String ngo_user = "";
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

//              con = DriverManager.getConnection(
//                    "jdbc:oracle:thin:@localhost:1521:xe","system","admin");
Connection con = null;
try {
                
                if (con == null) {
                    String url = "jdbc:oracle:thin:@10.0.0.107:1521:xe";
                    String user = "SYSTEM";
                    String password = "trisha";
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    con = DriverManager.getConnection(url, user, password);
                }
               
            } catch (Exception e) {
            }
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
public void ngoUser(String user){
String ngo_user = user;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnllawheadingss = new javax.swing.JPanel();
        lblheadinglawyer = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(200, 200));

        pnllawheadingss.setBackground(new java.awt.Color(102, 0, 153));

        lblheadinglawyer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblheadinglawyer.setForeground(new java.awt.Color(255, 102, 255));
        lblheadinglawyer.setText("Remove NGO Details");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Trisha\\Downloads\\womenlogo.jpeg")); // NOI18N

        javax.swing.GroupLayout pnllawheadingssLayout = new javax.swing.GroupLayout(pnllawheadingss);
        pnllawheadingss.setLayout(pnllawheadingssLayout);
        pnllawheadingssLayout.setHorizontalGroup(
            pnllawheadingssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnllawheadingssLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(lblheadinglawyer, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnllawheadingssLayout.setVerticalGroup(
            pnllawheadingssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnllawheadingssLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnllawheadingssLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblheadinglawyer, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
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

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(51, 0, 153));
        jLabel6.setText("**********************************************************************************");

        jLabel7.setForeground(new java.awt.Color(51, 0, 153));
        jLabel7.setText("**********************************************************************************");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Trisha\\Downloads\\deletengo.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(184, 184, 184)
                                        .addComponent(jButton1)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, Short.MAX_VALUE)
            .addComponent(pnllawheadingss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnllawheadingss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

//                        con2 = DriverManager.getConnection(
//                               "jdbc:oracle:thin:@localhost:1521:xe","system","admin");
try {
                Connection con = null;
                if (con == null) {
                    String url = "jdbc:oracle:thin:@10.0.0.107:1521:xe";
                    String user = "SYSTEM";
                    String password = "trisha";
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    con = DriverManager.getConnection(url, user, password);
                }
               
            } catch (Exception e) {
            }
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
                            
//                             con = DriverManager.getConnection(
//                                      "jdbc:oracle:thin:@localhost:1521:xe","system","admin");
Connection con = null;
try {
                
                if (con == null) {
                    String url = "jdbc:oracle:thin:@10.0.0.107:1521:xe";
                    String user = "SYSTEM";
                    String password = "trisha";
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    con = DriverManager.getConnection(url, user, password);
                }
               
            } catch (Exception e) {
            }
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
                     MainFrame.ngoPanel.updateTableForNgo(ngo_user);
                     
                     updateCombobox1();
                 
             }
         else
             return;
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    void updateCombobox1(){
        
           try {

//              con = DriverManager.getConnection(
//                    "jdbc:oracle:thin:@localhost:1521:xe","system","admin");
Connection con = null;
try {
                
                if (con == null) {
                    String url = "jdbc:oracle:thin:@10.0.0.107:1521:xe";
                    String user = "SYSTEM";
                    String password = "trisha";
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    con = DriverManager.getConnection(url, user, password);
                }
               
            } catch (Exception e) {
            }
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblheadinglawyer;
    private javax.swing.JPanel pnllawheadingss;
    // End of variables declaration//GEN-END:variables
}
