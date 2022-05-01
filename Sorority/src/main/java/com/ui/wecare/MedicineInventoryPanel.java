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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
        Statement st=null;
        ResultSet rs=null;
          DefaultTableModel model ;
          int total;
          String enterpriseName="";
//            String user_name=enterpriseLoginFrame.enterprise_name;
            
    public MedicineInventoryPanel() {
        initComponents();
//      enterpriseName=enterpriseLoginFrame.enterprise_name;
      
     
               
        //Paracetamol, EcoSprin, FlavadonMR, CaberGolin
        
      
        
        model = new DefaultTableModel();
               
        jTable1.setModel(model);
        model.addColumn("Medicine Name");
        model.addColumn("Quantity");
       
        
          clearMedicineInventoryTable();
        
//        user_name=enterpriseLoginFrame.enterprise_name;
        
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
            st=con.createStatement();
            
//            String user_name=enterpriseLoginFrame.enterprise_name;
             String enterpriseid=getEnterpriseId();
            String s= "select * from medicineinventory where enterpriseid='"+enterpriseid+"'"  ;
            rs=st.executeQuery(s);  // execute query
            jComboBox1.removeAllItems();
            
            while(rs.next()){

               jComboBox1.addItem(rs.getString(2));

            }
            
           
con.close();
        } catch (SQLException ex) {
                    ex.printStackTrace();
        }catch(Exception e){}
         
          
           
           
           //----------------------------
           //creating chart
           
              DefaultCategoryDataset dataset = 
            new DefaultCategoryDataset( );  

           
         
           
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
            st=con.createStatement();

//            String user_name=enterpriseLoginFrame.enterprise_name;
            
            String enterpriseid=getEnterpriseId();
            
            String s= "select * from medicineinventory where enterpriseid='"+enterpriseid+"'"  ;
            rs=st.executeQuery(s);  // execute query
           
            
            while(rs.next()){
                        //setting values in chart
               dataset.setValue( rs.getInt(3) ,rs.getString(2) , rs.getString(2) );        

            }
            
           con.close();

        } catch (SQLException ex) {
                    ex.printStackTrace();
        }catch(Exception e){}
           
           
       
         JFreeChart barChart = ChartFactory.createBarChart(
         "Medicine Inventory Chart",           
         "",            
         "Stock",            
         dataset,          
         PlotOrientation.VERTICAL,           
         true, true, false);
         
      ChartPanel chartPanel = new ChartPanel( barChart );  
           jPanel5.removeAll();
           BorderLayout bl= new BorderLayout();
           jPanel5.setLayout(bl);
           jPanel5.add(chartPanel);
            chartPanel.setPreferredSize(new java.awt.Dimension( 450 , 250 ) );
           jPanel5.validate();
        
       
           //------------------------
           setSize(new Dimension(700,700));
          
         
        setVisible(true);
          jComboBox2.removeAllItems();  
        
       
        
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
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

        setPreferredSize(new java.awt.Dimension(750, 832));

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Drug Store- Always Available Pharma");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 771));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 737, -1));

        jLabel3.setText("Patient Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel4.setText("Prescription");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 66, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 166, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, 40));

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Details of Prescription");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel6)
                .addContainerGap(557, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel5.setText("Medicine Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel7.setText("Quantity");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 120, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 120, -1));

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

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

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 254, 76));

        jLabel8.setText("Amount");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        jTextField2.setEnabled(false);
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 104, -1));

        jButton2.setText("Next to add in Inventory");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

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

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 220, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //add button
        String medicineName=(String) jComboBox1.getSelectedItem();
        int qty= Integer.parseInt((String) jComboBox2.getSelectedItem());  
        
          
            total+=qty*10;
              model.addRow(new Object[]{medicineName,qty});

            jTextField2.setText("$"+String.valueOf(total));
            
            //--------------------------------------
           String enterpriseid=getEnterpriseId();
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
                    st=con.createStatement();
                        
                    String s=String.format("update MedicineInventory set quantityAvailable=quantityAvailable-%s where medicinename='%s' and enterpriseId='%s'",qty,medicineName,enterpriseid);
                    int n=st.executeUpdate(s);  // execute query
                   if(n>0)
                   {
                       updateChartOfMedicineInventoryPanel();
                   }
con.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();

                }catch(Exception e){}
            
            
        jComboBox2.removeAllItems();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //next to add inventory button
        MainFrame.add_Inventory_panel.setVisible(true);
        MainFrame.add_Inventory_panel.updateInventoryTable();
        setVisible(false);
         clearMedicineInventoryTable();
         jTextField2.setText("");
         total=0;
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        //select medicine combobox
        
        
        if(jComboBox1.hasFocus()){
            
                try {
                                String enterpriseid=getEnterpriseId();
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
                              st=con.createStatement();

                              String s=String.format("select quantityAvailable from MedicineInventory where medicineName='%s' and  enterpriseId='%s'",(String)jComboBox1.getSelectedItem(),enterpriseid);
                             rs=st.executeQuery(s);  // execute query
                             jComboBox2.removeAllItems();

                            if(rs.next()){

                                int qty=rs.getInt(1);
                                for(int i=1;i<=qty;i++)
                                     jComboBox2.addItem(i+"");
                            }
           con.close();
          
                    } catch (SQLException ex) {

                    }catch(Exception e){}
            
            
        }
         
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    void updateMedicineNameCombobox(){
//         String user_name=enterpriseLoginFrame.enterprise_name;
        
           try {
//               con = DriverManager.getConnection(
//                    "jdbc:oracle:thin:@localhost:1521:xe","system","admin");
Connection con = null;
            if (con == null) {
                String url = "jdbc:oracle:thin:@10.0.0.107:1521:xe";
                String user = "SYSTEM";
                String password = "trisha";
                //Class.forName("oracle.jdbc.driver.OracleDriver");
                Class.forName("oracle.jdbc.driver.OracleDriver");
                con = DriverManager.getConnection(url, user, password);
            }
            st=con.createStatement();
            
        String enterpriseid=getEnterpriseId();
            String s= "select * from medicineinventory where enterpriseId='"+  enterpriseid+"'"  ;
            rs=st.executeQuery(s);  // execute query
            jComboBox1.removeAllItems();
            
            while(rs.next()){

               jComboBox1.addItem(rs.getString(2));

            }
            
           con.close();

        } catch (SQLException ex) {
                    ex.printStackTrace();
        }catch(Exception e){}
         
        
        
    }
    
    
    void updateChartOfMedicineInventoryPanel(){
        
//         String user_name=enterpriseLoginFrame.enterprise_name;
         //creating chart
           
              DefaultCategoryDataset dataset = 
            new DefaultCategoryDataset( );  

           
         
           
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
            st=con.createStatement();
                String enterpriseid=getEnterpriseId();
            String s= "select * from medicineinventory where enterpriseid='"+enterpriseid+"'"  ;
            rs=st.executeQuery(s);  // execute query
           
            
            while(rs.next()){
                        //setting values in chart
               dataset.setValue( rs.getInt(3) ,rs.getString(2) , rs.getString(2) );        

            }
            
           con.close();

        } catch (SQLException ex) {
                    ex.printStackTrace();
        }
           catch(Exception e){}
           
       
         JFreeChart barChart = ChartFactory.createBarChart(
         "Medicine inventory chart",           
         "",            
         "Stock",            
         dataset,          
         PlotOrientation.VERTICAL,           
         true, true, false);
         
      ChartPanel chartPanel = new ChartPanel( barChart );  
           jPanel5.removeAll();
           BorderLayout bl= new BorderLayout();
           jPanel5.setLayout(bl);
           jPanel5.add(chartPanel);
            chartPanel.setPreferredSize(new java.awt.Dimension( 450 , 250 ) );
           jPanel5.validate();
        
       
           //------------------------
           setSize(new Dimension(700,700));
           
        
        
        
    }
   
     String getEnterpriseId(){
        
        
        String enterprise_id="";
        
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
                  st=con.createStatement();

                  //employee name can be PH1h1 
                  //enterprise_name can be h1, h2 etc
                  //we have to collect h1 or h2 enterprise for PH1h1 employee
                  String s=String.format("select enterprise_name from work_area where username='%s'",EmployeeLoginFrame.Emp_name);
                 rs=st.executeQuery(s);  // execute query

                    if(rs.next()){

                         enterprise_id=rs.getString(1);
                     }

con.close();
          } catch (SQLException ex) {

          } catch(Exception e){}
        
        return enterprise_id;
        
    }
     
     void clearMedicineInventoryTable(){
         
          if (jTable1.getRowCount() > 0) {
                        for (int i = jTable1.getRowCount() - 1; i >=0; i--) {
                            model.removeRow(i);
                        }
                 }
         
     }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
