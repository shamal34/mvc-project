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
public class SearchMain extends javax.swing.JInternalFrame {

    Main main;
    boolean state;

    /**
     * Creates new form SearchMain
     */
    public SearchMain(Main main, boolean state) {
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
        btnMakepurchase = new keeptoo.KButton();
        btnDeletepurchase = new keeptoo.KButton();
        pnlCenter = new javax.swing.JPanel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1600, 820));

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

        btnMakepurchase.setBorder(null);
        btnMakepurchase.setForeground(new java.awt.Color(0, 0, 0));
        btnMakepurchase.setText("Find computer");
        btnMakepurchase.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnMakepurchase.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMakepurchase.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnMakepurchase.setIconTextGap(20);
        btnMakepurchase.setkAllowGradient(false);
        btnMakepurchase.setkAllowTab(true);
        btnMakepurchase.setkBackGroundColor(new java.awt.Color(230, 230, 230));
        btnMakepurchase.setkBorderRadius(0);
        btnMakepurchase.setkForeGround(new java.awt.Color(0, 0, 0));
        btnMakepurchase.setkHoverColor(new java.awt.Color(212, 212, 212));
        btnMakepurchase.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnMakepurchase.setkIndicatorColor(new java.awt.Color(0, 120, 215));
        btnMakepurchase.setkIndicatorThickness(5);
        btnMakepurchase.setkSelectedColor(new java.awt.Color(200, 200, 200));
        btnMakepurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakepurchaseActionPerformed(evt);
            }
        });
        pnlLeft.add(btnMakepurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 290, 70));

        btnDeletepurchase.setBorder(null);
        btnDeletepurchase.setForeground(new java.awt.Color(0, 0, 0));
        btnDeletepurchase.setText("Find parts");
        btnDeletepurchase.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnDeletepurchase.setIconTextGap(20);
        btnDeletepurchase.setkAllowGradient(false);
        btnDeletepurchase.setkAllowTab(true);
        btnDeletepurchase.setkBackGroundColor(new java.awt.Color(230, 230, 230));
        btnDeletepurchase.setkBorderRadius(0);
        btnDeletepurchase.setkForeGround(new java.awt.Color(0, 0, 0));
        btnDeletepurchase.setkHoverColor(new java.awt.Color(212, 212, 212));
        btnDeletepurchase.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnDeletepurchase.setkIndicatorColor(new java.awt.Color(0, 120, 215));
        btnDeletepurchase.setkIndicatorThickness(5);
        btnDeletepurchase.setkSelectedColor(new java.awt.Color(200, 200, 200));
        btnDeletepurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletepurchaseActionPerformed(evt);
            }
        });
        pnlLeft.add(btnDeletepurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 290, 70));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(pnlCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnlCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        main.pnlMain.removeAll();
        main.pnlMain.repaint();
        main.pnlMain.add(new MainIcons(main, state)).setVisible(true);
        main.lblTitle.setText("Main");
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnMakepurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakepurchaseActionPerformed
        pnlCenter.removeAll();
        pnlCenter.repaint();
        pnlCenter.add(new MakePurchase(state,main)).setVisible(true);
    }//GEN-LAST:event_btnMakepurchaseActionPerformed

    private void btnDeletepurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletepurchaseActionPerformed
        pnlCenter.removeAll();
        pnlCenter.repaint();
        pnlCenter.add(new DeletePurchase(state)).setVisible(true);
    }//GEN-LAST:event_btnDeletepurchaseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnBack;
    private keeptoo.KButton btnDeletepurchase;
    private keeptoo.KButton btnMakepurchase;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlLeft;
    // End of variables declaration//GEN-END:variables
    private void setTheme(boolean state) {
        if(state){
            pnlLeft.setBackground(new Color(99, 100, 100));
            pnlCenter.setBackground(Color.BLACK);
        }else{
            
        }
    }
}
