/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui.wecare;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sreyoshi Ghosh
 */
public class MainFrame extends javax.swing.JFrame {

    GridBagLayout gl = new GridBagLayout();
    static Panel1 p1;
    static Panel2 p2;

    static FeatureForFemalePanel femalePanel;
    static WorkAreaAdminPanel workArea;
    static EmployeeLoginFrame employeeLoginFrame;

    static ngoManagementPanel ngoPanel;
    static Police policePanel;
    static Lawyer lawyerPanel;
    static NurseReading nurseReading;
    static Reception reception;
   // static Pharmacy pharmacy;
    static DiagonasticCenter diagonasticCenter;

static RegisterPatient registerPatient;
static AppointmentFirst appointmentFirst;
static AppointmentRegister appointmentRegister;
static DoctorsPanel doctorePanel;
static ExaminerAllRequestView examinerAllRequestView;

static MedicineInventoryPanel medicine_Inventory_Panel;
    static AddInventoryPanel add_Inventory_panel;
    static InventoryUpdatePanel inventory_update_panel;
static MedicalHistoryToFemale medicalHistoryToFemale;
static RegisteredCasesForFemale registeredCasesForFemale;
static ManageWorkArea manageWorkArea;

    public void tickTock() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        jLabel6.setText((java.time.LocalTime.now()).format(dtf));
    }

    public MainFrame() {

        initComponents();
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton3);
        buttonGroup1.add(jRadioButton4);

//setSize(900,1000);
//setLocation(300,200);
//this.setExtendedState(MainFrame.MAXIMIZED_BOTH);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");

        Timer t = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tickTock();

            }
        });
        t.setRepeats(true);
        t.setCoalesce(true);
        t.setInitialDelay(0);
        t.start();

        //------------------------------------------
        dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        jLabel3.setText((java.time.LocalDate.now()).format(dtf));

        //-------------------------------------------
        p1 = new Panel1();
        p2 = new Panel2();
        ngoPanel = new ngoManagementPanel();
        femalePanel = new FeatureForFemalePanel();
        workArea = new WorkAreaAdminPanel();
        policePanel = new Police();
        lawyerPanel = new Lawyer();
        nurseReading = new NurseReading();
        reception = new Reception();
        //pharmacy = new Pharmacy();
        diagonasticCenter = new DiagonasticCenter();
registerPatient = new  RegisterPatient() ;
appointmentFirst = new  AppointmentFirst() ;
appointmentRegister = new  AppointmentRegister() ;
doctorePanel = new DoctorsPanel();
examinerAllRequestView = new ExaminerAllRequestView();
 medicine_Inventory_Panel = new MedicineInventoryPanel();
      add_Inventory_panel = new AddInventoryPanel();
     inventory_update_panel = new InventoryUpdatePanel();

 medicalHistoryToFemale = new MedicalHistoryToFemale();
 registeredCasesForFemale = new RegisteredCasesForFemale();
 manageWorkArea = new ManageWorkArea();
        //----------------------
        targetPanel.setLayout(gl);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        targetPanel.add(p1, c);
        p1.setVisible(false);

        targetPanel.add(p2, c);
        p2.setVisible(false);

        targetPanel.add(ngoPanel, c);
        ngoPanel.setVisible(false);

        targetPanel.add(femalePanel, c);
        femalePanel.setVisible(false);

        targetPanel.add(workArea, c);
        workArea.setVisible(false);

        targetPanel.add(policePanel, c);
        policePanel.setVisible(false);

        targetPanel.add(lawyerPanel, c);
        lawyerPanel.setVisible(false);

        targetPanel.add(nurseReading, c);
        nurseReading.setVisible(false);

        targetPanel.add(reception, c);
        reception.setVisible(false);

//        targetPanel.add(pharmacy, c);
//        pharmacy.setVisible(false);

        targetPanel.add(diagonasticCenter, c);
        diagonasticCenter.setVisible(false);

        targetPanel.add(registerPatient, c);
                registerPatient.setVisible(false);
        targetPanel.add(appointmentFirst, c);
                appointmentFirst.setVisible(false);
        targetPanel.add(appointmentRegister, c);
                appointmentRegister.setVisible(false);
targetPanel.add(doctorePanel,c);
doctorePanel.setVisible(false);
targetPanel.add(examinerAllRequestView,c);
examinerAllRequestView.setVisible(false);

targetPanel.add(medicine_Inventory_Panel,c);
        medicine_Inventory_Panel.setVisible(false);
                 
      
         targetPanel.add(add_Inventory_panel,c);
        add_Inventory_panel.setVisible(false);
        
         targetPanel.add(inventory_update_panel,c);
         inventory_update_panel.setVisible(false);

targetPanel.add(medicalHistoryToFemale,c);
        medicalHistoryToFemale.setVisible(false);
        
         targetPanel.add(registeredCasesForFemale,c);
         registeredCasesForFemale.setVisible(false);
         targetPanel.add(manageWorkArea,c);
         manageWorkArea.setVisible(false);
 

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        targetPanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setLocation(new java.awt.Point(200, 200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 0, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 1200));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton1.setBackground(new java.awt.Color(102, 0, 153));
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Admin");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(102, 0, 153));
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Female User");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jRadioButton3.setBackground(new java.awt.Color(102, 0, 153));
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Enterprise");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jRadioButton4.setBackground(new java.awt.Color(102, 0, 153));
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Employee");
        jPanel2.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Trisha\\Downloads\\woemmnrights1.jpeg")); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 181, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("jLabel6");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 120, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 240, 640));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(102, 0, 153));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Trisha\\Downloads\\womenlogo.jpeg")); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 255));
        jLabel11.setText("Welcome To The Good Life");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 255));
        jLabel9.setText("SORORITY- ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addContainerGap(206, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 80));

        targetPanel.setBackground(new java.awt.Color(255, 255, 255));
        targetPanel.setPreferredSize(new java.awt.Dimension(1900, 1397));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Trisha\\Downloads\\sorority-group-1-975x390-1.png")); // NOI18N

        jPanel3.setBackground(new java.awt.Color(102, 0, 153));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("*");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("GET UP");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("*");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SHOW UP");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("DRESS UP");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(" *");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("NEVER GIVE UP");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel7)
                .addGap(34, 34, 34)
                .addComponent(jLabel12)
                .addGap(47, 47, 47)
                .addComponent(jLabel4)
                .addGap(48, 48, 48)
                .addComponent(jLabel8)
                .addGap(58, 58, 58)
                .addComponent(jLabel13)
                .addGap(30, 30, 30)
                .addComponent(jLabel14)
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(jLabel5)
                    .addContainerGap(798, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel12))
                .addContainerGap(116, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addComponent(jLabel5)
                    .addContainerGap(115, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout targetPanelLayout = new javax.swing.GroupLayout(targetPanel);
        targetPanel.setLayout(targetPanelLayout);
        targetPanelLayout.setHorizontalGroup(
            targetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, targetPanelLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        targetPanelLayout.setVerticalGroup(
            targetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(targetPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 950, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        //login button
        if (jRadioButton1.isSelected()) {

            adminLoginFrame ad = new adminLoginFrame();
//jLabel5.setVisible(false);
jLabel10.setVisible(false);
jLabel9.setVisible(false);
jLabel3.setVisible(false);
jLabel1.setVisible(false);
jLabel3.setVisible(false);
jPanel3.setVisible(false);
jPanel8.setVisible(false);


        } else if (jRadioButton2.isSelected()) {

            femaleUserLoginFrame fm = new femaleUserLoginFrame();
//jLabel5.setVisible(false);
jLabel10.setVisible(false);
jLabel9.setVisible(false);
jLabel3.setVisible(false);
jLabel1.setVisible(false);
jPanel3.setVisible(false);
jPanel8.setVisible(false);
        } else if (jRadioButton3.isSelected()) {

            enterpriseLoginFrame et = new enterpriseLoginFrame();
//jLabel5.setVisible(false);
jLabel10.setVisible(false);
jLabel9.setVisible(false);
jLabel3.setVisible(false);
jLabel1.setVisible(false);
jPanel3.setVisible(false);
jPanel8.setVisible(false);
        } else if (jRadioButton4.isSelected()) {

            EmployeeLoginFrame et = new EmployeeLoginFrame();
//jLabel5.setVisible(false);
jLabel10.setVisible(false);
jLabel9.setVisible(false);
jLabel3.setVisible(false);
jLabel1.setVisible(false);
jPanel3.setVisible(false);
jPanel8.setVisible(false);
        }else {
JOptionPane.showMessageDialog(null, "Select one from above options");return;
}


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        //logout button
        p1.setVisible(false);
        p2.setVisible(false);
        ngoPanel.setVisible(false);
        femalePanel.setVisible(false);
        workArea.setVisible(false);
        policePanel.setVisible(false);
        lawyerPanel.setVisible(false);
        reception.setVisible(false);
        nurseReading.setVisible(false);
//        pharmacy.setVisible(false);
        diagonasticCenter.setVisible(false);
registerPatient.setVisible(false);
appointmentFirst.setVisible(false);
appointmentRegister.setVisible(false);
doctorePanel.setVisible(false);
examinerAllRequestView.setVisible(false);
medicine_Inventory_Panel.setVisible(false);
         add_Inventory_panel.setVisible(false);
         inventory_update_panel.setVisible(false);

 medicalHistoryToFemale.setVisible(false);
 registeredCasesForFemale.setVisible(false);
manageWorkArea.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JPanel targetPanel;
    // End of variables declaration//GEN-END:variables
}
