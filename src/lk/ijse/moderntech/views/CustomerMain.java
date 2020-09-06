/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.moderntech.views;

import java.awt.Color;

/**
 *
 * @author Shamal
 */
public class CustomerMain extends javax.swing.JInternalFrame {
    Main main;
    boolean state;
    /**
     * Creates new form BillMain
     */
    public CustomerMain(Main main, boolean state) {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.main = main;
        setTheme(state);
        this.state = state;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLeft = new javax.swing.JPanel();
        btnBack = new keeptoo.KButton();
        btnAddcustomer = new keeptoo.KButton();
        btnUpdatecustomer = new keeptoo.KButton();
        btnDeletecustomer = new keeptoo.KButton();
        pnlCenter = new javax.swing.JPanel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1600, 820));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLeft.setBackground(new java.awt.Color(230, 230, 230));
        pnlLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBorder(null);
        btnBack.setForeground(new java.awt.Color(51, 51, 51));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/moderntech/img/icons8_left_arrow_30px.png"))); // NOI18N
        btnBack.setAlignmentY(0.0F);
        btnBack.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btnBack.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBack.setIconTextGap(30);
        btnBack.setkAllowGradient(false);
        btnBack.setkAllowTab(true);
        btnBack.setkBackGroundColor(new java.awt.Color(230, 230, 230));
        btnBack.setkBorderRadius(0);
        btnBack.setkForeGround(new java.awt.Color(51, 51, 51));
        btnBack.setkHoverColor(new java.awt.Color(212, 212, 212));
        btnBack.setkSelectedColor(new java.awt.Color(102, 102, 102));
        btnBack.setkStartColor(new java.awt.Color(255, 102, 102));
        btnBack.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        pnlLeft.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 60));

        btnAddcustomer.setBorder(null);
        btnAddcustomer.setForeground(new java.awt.Color(0, 0, 0));
        btnAddcustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/moderntech/img/icons8_add_30px.png"))); // NOI18N
        btnAddcustomer.setText("Add customer");
        btnAddcustomer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAddcustomer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAddcustomer.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnAddcustomer.setIconTextGap(20);
        btnAddcustomer.setkAllowGradient(false);
        btnAddcustomer.setkAllowTab(true);
        btnAddcustomer.setkBackGroundColor(new java.awt.Color(230, 230, 230));
        btnAddcustomer.setkBorderRadius(0);
        btnAddcustomer.setkForeGround(new java.awt.Color(0, 0, 0));
        btnAddcustomer.setkHoverColor(new java.awt.Color(212, 212, 212));
        btnAddcustomer.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnAddcustomer.setkIndicatorColor(new java.awt.Color(0, 120, 215));
        btnAddcustomer.setkIndicatorThickness(5);
        btnAddcustomer.setkSelectedColor(new java.awt.Color(200, 200, 200));
        btnAddcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddcustomerActionPerformed(evt);
            }
        });
        pnlLeft.add(btnAddcustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 290, 70));

        btnUpdatecustomer.setBorder(null);
        btnUpdatecustomer.setForeground(new java.awt.Color(0, 0, 0));
        btnUpdatecustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/moderntech/img/icons8_Update_Left_Rotation_30px.png"))); // NOI18N
        btnUpdatecustomer.setText("Update customer");
        btnUpdatecustomer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnUpdatecustomer.setIconTextGap(20);
        btnUpdatecustomer.setkAllowGradient(false);
        btnUpdatecustomer.setkAllowTab(true);
        btnUpdatecustomer.setkBackGroundColor(new java.awt.Color(230, 230, 230));
        btnUpdatecustomer.setkBorderRadius(0);
        btnUpdatecustomer.setkForeGround(new java.awt.Color(0, 0, 0));
        btnUpdatecustomer.setkHoverColor(new java.awt.Color(212, 212, 212));
        btnUpdatecustomer.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnUpdatecustomer.setkIndicatorColor(new java.awt.Color(0, 120, 215));
        btnUpdatecustomer.setkIndicatorThickness(5);
        btnUpdatecustomer.setkSelectedColor(new java.awt.Color(200, 200, 200));
        btnUpdatecustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatecustomerActionPerformed(evt);
            }
        });
        pnlLeft.add(btnUpdatecustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 290, 70));

        btnDeletecustomer.setBorder(null);
        btnDeletecustomer.setForeground(new java.awt.Color(0, 0, 0));
        btnDeletecustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/moderntech/img/icons8_delete_sign_30px.png"))); // NOI18N
        btnDeletecustomer.setText("Delete customer");
        btnDeletecustomer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnDeletecustomer.setIconTextGap(20);
        btnDeletecustomer.setkAllowGradient(false);
        btnDeletecustomer.setkAllowTab(true);
        btnDeletecustomer.setkBackGroundColor(new java.awt.Color(230, 230, 230));
        btnDeletecustomer.setkBorderRadius(0);
        btnDeletecustomer.setkForeGround(new java.awt.Color(0, 0, 0));
        btnDeletecustomer.setkHoverColor(new java.awt.Color(212, 212, 212));
        btnDeletecustomer.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnDeletecustomer.setkIndicatorColor(new java.awt.Color(0, 120, 215));
        btnDeletecustomer.setkIndicatorThickness(5);
        btnDeletecustomer.setkSelectedColor(new java.awt.Color(200, 200, 200));
        btnDeletecustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletecustomerActionPerformed(evt);
            }
        });
        pnlLeft.add(btnDeletecustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 290, 70));

        getContentPane().add(pnlLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 820));

        pnlCenter.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlCenterLayout = new javax.swing.GroupLayout(pnlCenter);
        pnlCenter.setLayout(pnlCenterLayout);
        pnlCenterLayout.setHorizontalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1310, Short.MAX_VALUE)
        );
        pnlCenterLayout.setVerticalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );

        getContentPane().add(pnlCenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1310, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        main.pnlMain.removeAll();
        main.pnlMain.repaint();
        main.pnlMain.add(new MainIcons(main, state)).setVisible(true);
        main.lblTitle.setText("Main");
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddcustomerActionPerformed
        pnlCenter.removeAll();
        pnlCenter.repaint();
        pnlCenter.add(new AddCustomer(state)).setVisible(true);
    }//GEN-LAST:event_btnAddcustomerActionPerformed

    private void btnUpdatecustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatecustomerActionPerformed
        pnlCenter.removeAll();
        pnlCenter.repaint();
        pnlCenter.add(new UpdateCustomer(state)).setVisible(true);
    }//GEN-LAST:event_btnUpdatecustomerActionPerformed

    private void btnDeletecustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletecustomerActionPerformed
        pnlCenter.removeAll();
        pnlCenter.repaint();
        pnlCenter.add(new DeleteCustomer(state)).setVisible(true);
    }//GEN-LAST:event_btnDeletecustomerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnAddcustomer;
    private keeptoo.KButton btnBack;
    private keeptoo.KButton btnDeletecustomer;
    private keeptoo.KButton btnUpdatecustomer;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlLeft;
    // End of variables declaration//GEN-END:variables

    private void setTheme(boolean state) {
                if (state) {
            pnlLeft.setBackground(new Color(99, 100, 100));
            pnlCenter.setBackground(Color.BLACK);

            btnBack.setkBackGroundColor(new Color(99, 100, 100));
            btnBack.setkForeGround(Color.WHITE);
            btnAddcustomer.setkBackGroundColor(new Color(99, 100, 100));
            btnAddcustomer.setForeground(Color.WHITE);
            btnAddcustomer.setkForeGround(Color.WHITE);
            btnUpdatecustomer.setkBackGroundColor(new Color(99, 100, 100));
            btnUpdatecustomer.setForeground(Color.WHITE);
            btnUpdatecustomer.setkForeGround(Color.WHITE);
            btnDeletecustomer.setkBackGroundColor(new Color(99, 100, 100));
            btnDeletecustomer.setForeground(Color.WHITE);
            btnDeletecustomer.setkForeGround(Color.WHITE);
        } else {
            pnlLeft.setBackground(new Color(230, 230, 230));
            pnlCenter.setBackground(Color.WHITE);

            btnBack.setkBackGroundColor(new Color(230, 230, 230));
            btnBack.setkForeGround(Color.BLACK);
            btnAddcustomer.setkBackGroundColor(new Color(230, 230, 230));
            btnAddcustomer.setkForeGround(Color.BLACK);
            btnUpdatecustomer.setkBackGroundColor(new Color(230, 230, 230));
            btnUpdatecustomer.setkForeGround(Color.BLACK);
            btnDeletecustomer.setkBackGroundColor(new Color(230, 230, 230));
            btnDeletecustomer.setkForeGround(Color.BLACK);            
        }
    }
}
