/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ui.wecare;

/**
 *
 * @author Sreyoshi
 */
public class Pharmacy extends javax.swing.JPanel {

    /**
     * Creates new form Pharmacy
     */
    public Pharmacy() {
        initComponents();
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
        lblheading = new javax.swing.JLabel();
        lblmedicinepic = new javax.swing.JLabel();
        lblpurplecolor = new javax.swing.JPanel();
        lblpname = new javax.swing.JLabel();
        txtpname = new javax.swing.JTextField();
        lblmedicinename = new javax.swing.JLabel();
        cmbmedicinename = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lblprescriptionimage = new javax.swing.JLabel();
        lblprescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtprescriptionview = new javax.swing.JTextArea();
        lblquantity = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblamount = new javax.swing.JLabel();
        txtamount = new javax.swing.JTextField();
        btnpharmacyadd = new javax.swing.JButton();
        scrlpnlpharmatable = new javax.swing.JScrollPane();
        tblmedicineview = new javax.swing.JTable();
        lblmoneypicture = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));

        lblheading.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblheading.setForeground(new java.awt.Color(255, 255, 255));
        lblheading.setText("DRUG STORE-  Always Available Pharma");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblmedicinepic, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblheading, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblmedicinepic, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblheading, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        lblpurplecolor.setBackground(new java.awt.Color(204, 204, 255));

        lblpname.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblpname.setForeground(new java.awt.Color(0, 0, 204));
        lblpname.setText("Patient Name-");

        lblmedicinename.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblmedicinename.setForeground(new java.awt.Color(0, 0, 204));
        lblmedicinename.setText("Medicine Name-");

        cmbmedicinename.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paracetamol", "EcoSprin", "FlavadonMR.CaberGolin" }));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");

        lblprescription.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblprescription.setForeground(new java.awt.Color(0, 0, 204));
        lblprescription.setText("Prescription-");

        txtprescriptionview.setColumns(20);
        txtprescriptionview.setRows(5);
        jScrollPane1.setViewportView(txtprescriptionview);

        lblquantity.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblquantity.setForeground(new java.awt.Color(0, 0, 204));
        lblquantity.setText("Quanity-");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        lblamount.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblamount.setForeground(new java.awt.Color(0, 0, 204));
        lblamount.setText("Amount-");

        txtamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtamountActionPerformed(evt);
            }
        });

        btnpharmacyadd.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnpharmacyadd.setText("Add");

        tblmedicineview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Medicine", "Quantity"
            }
        ));
        scrlpnlpharmatable.setViewportView(tblmedicineview);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("Next to add in Inventory>>");

        jTextField1.setBackground(new java.awt.Color(0, 0, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Details Of Prescription:-");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(0, 0, 204));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Choose the Medicine:-");

        javax.swing.GroupLayout lblpurplecolorLayout = new javax.swing.GroupLayout(lblpurplecolor);
        lblpurplecolor.setLayout(lblpurplecolorLayout);
        lblpurplecolorLayout.setHorizontalGroup(
            lblpurplecolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblpurplecolorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblpurplecolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblpurplecolorLayout.createSequentialGroup()
                        .addComponent(lblamount)
                        .addGap(64, 64, 64)
                        .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblpurplecolorLayout.createSequentialGroup()
                        .addGroup(lblpurplecolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(lblpurplecolorLayout.createSequentialGroup()
                                .addGroup(lblpurplecolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(lblpurplecolorLayout.createSequentialGroup()
                                        .addComponent(lblmedicinename)
                                        .addGap(29, 29, 29)
                                        .addGroup(lblpurplecolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbmedicinename, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(lblquantity)
                                    .addGroup(lblpurplecolorLayout.createSequentialGroup()
                                        .addGap(190, 190, 190)
                                        .addComponent(btnpharmacyadd))
                                    .addComponent(scrlpnlpharmatable, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(lblpurplecolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblpurplecolorLayout.createSequentialGroup()
                                        .addComponent(lblmoneypicture, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32))
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(lblpurplecolorLayout.createSequentialGroup()
                                .addGroup(lblpurplecolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(lblpurplecolorLayout.createSequentialGroup()
                                        .addGroup(lblpurplecolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblpname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblprescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(lblpurplecolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(lblpurplecolorLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(lblpurplecolorLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextField1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblprescriptionimage, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33))))
        );
        lblpurplecolorLayout.setVerticalGroup(
            lblpurplecolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblpurplecolorLayout.createSequentialGroup()
                .addGroup(lblpurplecolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblpurplecolorLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(lblpurplecolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpname)
                            .addGroup(lblpurplecolorLayout.createSequentialGroup()
                                .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(lblpurplecolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblprescription)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(lblpurplecolorLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblprescriptionimage)))
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(lblpurplecolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblpurplecolorLayout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(lblpurplecolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblmedicinename)
                            .addComponent(cmbmedicinename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(lblpurplecolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblquantity)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(btnpharmacyadd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrlpnlpharmatable, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(lblpurplecolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblamount)
                            .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblpurplecolorLayout.createSequentialGroup()
                        .addComponent(lblmoneypicture)
                        .addGap(33, 33, 33)
                        .addComponent(jButton1)
                        .addGap(278, 278, 278))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblpurplecolor, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblpurplecolor, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtamountActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnpharmacyadd;
    private javax.swing.JComboBox<String> cmbmedicinename;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblamount;
    private javax.swing.JLabel lblheading;
    private javax.swing.JLabel lblmedicinename;
    private javax.swing.JLabel lblmedicinepic;
    private javax.swing.JLabel lblmoneypicture;
    private javax.swing.JLabel lblpname;
    private javax.swing.JLabel lblprescription;
    private javax.swing.JLabel lblprescriptionimage;
    private javax.swing.JPanel lblpurplecolor;
    private javax.swing.JLabel lblquantity;
    private javax.swing.JScrollPane scrlpnlpharmatable;
    private javax.swing.JTable tblmedicineview;
    private javax.swing.JTextField txtamount;
    private javax.swing.JTextField txtpname;
    private javax.swing.JTextArea txtprescriptionview;
    // End of variables declaration//GEN-END:variables
}