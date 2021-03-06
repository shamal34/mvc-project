/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.moderntech.views;

import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import lk.ijse.moderntech.controler.DeletePurchaseController;
import lk.ijse.moderntech.model.PurchaseModel;

/**
 *
 * @author Shamal
 */
public class DeletePurchase extends javax.swing.JInternalFrame {

    boolean state;

    /**
     * Creates new form MakePrchase
     */
    public DeletePurchase(boolean state) {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.state = state;
        setTheam();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBack = new javax.swing.JPanel();
        txtPurchaseid = new javax.swing.JTextField();
        lblPurchaseid = new javax.swing.JLabel();
        btnClear = new keeptoo.KButton();
        btnDelete = new keeptoo.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPurchase = new javax.swing.JTable();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1310, 820));

        pnlBack.setBackground(new java.awt.Color(255, 255, 255));
        pnlBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPurchaseid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtPurchaseid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        txtPurchaseid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPurchaseidActionPerformed(evt);
            }
        });
        pnlBack.add(txtPurchaseid, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 320, -1));

        lblPurchaseid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblPurchaseid.setText("Purchase ID :");
        pnlBack.add(lblPurchaseid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 120, -1));

        btnClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 46, 50)));
        btnClear.setForeground(new java.awt.Color(255, 46, 50));
        btnClear.setText("Clear");
        btnClear.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btnClear.setkAllowGradient(false);
        btnClear.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        btnClear.setkBorderRadius(0);
        btnClear.setkForeGround(new java.awt.Color(255, 46, 50));
        btnClear.setkHoverColor(new java.awt.Color(255, 46, 50));
        btnClear.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        pnlBack.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, -1, -1));

        btnDelete.setBorder(null);
        btnDelete.setText("Delete");
        btnDelete.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btnDelete.setkAllowGradient(false);
        btnDelete.setkBackGroundColor(new java.awt.Color(231, 84, 78));
        btnDelete.setkBorderRadius(0);
        btnDelete.setkHoverColor(new java.awt.Color(232, 95, 95));
        btnDelete.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        pnlBack.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 200, -1, -1));

        tblPurchase.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        tblPurchase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Purchase ID", "Employee ID", "Supplier ID", "Amount", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPurchase.setRowHeight(20);
        tblPurchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPurchaseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPurchase);

        pnlBack.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 1270, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearAll();
        loadTable();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            boolean deleted = new DeletePurchaseController().deletePurchase(txtPurchaseid.getText());
            if (deleted) {
                new InformationBox(new javax.swing.JFrame(), true, "Deleted succesfully.").setVisible(true);
            } else {
                new InformationBox(new javax.swing.JFrame(), true, "Something went wrong, Try again. ").setVisible(true);
            }
        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
        loadTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtPurchaseidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPurchaseidActionPerformed
        try {
            PurchaseModel purchase = new DeletePurchaseController().getPurchase(txtPurchaseid.getText());
            if (purchase != null) {
                DefaultTableModel model = (DefaultTableModel) tblPurchase.getModel();
                model.setRowCount(0);

                model.addRow(new Object[]{
                    purchase.getPurchaseID(),
                    purchase.getEmployeeID(),
                    purchase.getSupplierID(),
                    purchase.getAmount(),
                    purchase.getPurchaseDate()
                });
            }else{
                new InformationBox(new javax.swing.JFrame(), true, "Check purchase ID.").setVisible(true);
            }
        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
    }//GEN-LAST:event_txtPurchaseidActionPerformed

    private void tblPurchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPurchaseMouseClicked
        int row = tblPurchase.getSelectedRow();
        txtPurchaseid.setText(tblPurchase.getValueAt(row, 0).toString());
    }//GEN-LAST:event_tblPurchaseMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnClear;
    private keeptoo.KButton btnDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPurchaseid;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JTable tblPurchase;
    private javax.swing.JTextField txtPurchaseid;
    // End of variables declaration//GEN-END:variables

    private void setTheam() {
        if (state) {
            pnlBack.setBackground(Color.BLACK);
            lblPurchaseid.setForeground(Color.WHITE);
            txtPurchaseid.setForeground(Color.WHITE);
            txtPurchaseid.setBackground(Color.BLACK);
        } else {
        }
    }

    private void clearAll() {
        txtPurchaseid.setText("");
    }

    private void loadTable() {
        try {
            List<PurchaseModel> list = new DeletePurchaseController().loadPurchase();
            DefaultTableModel model = (DefaultTableModel) tblPurchase.getModel();
            model.setRowCount(0);

            for (PurchaseModel purchaseModel : list) {
                model.addRow(new Object[]{
                    purchaseModel.getPurchaseID(),
                    purchaseModel.getEmployeeID(),
                    purchaseModel.getSupplierID(),
                    purchaseModel.getAmount(),
                    purchaseModel.getPurchaseDate()
                });
            }

        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
    }
}
