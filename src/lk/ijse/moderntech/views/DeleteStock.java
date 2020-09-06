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
import lk.ijse.moderntech.controler.DeleteStockController;
import lk.ijse.moderntech.controler.UpdateStockController;
import lk.ijse.moderntech.model.StockModel;

/**
 *
 * @author Shamal
 */
public class DeleteStock extends javax.swing.JInternalFrame {

    boolean state;

    public DeleteStock(boolean state) {
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
        lblStockid = new javax.swing.JLabel();
        txtStockid = new javax.swing.JTextField();
        btnClear = new keeptoo.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStock = new javax.swing.JTable();
        btnDelete = new keeptoo.KButton();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1310, 820));

        pnlBack.setBackground(new java.awt.Color(255, 255, 255));
        pnlBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStockid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblStockid.setText("Stock ID :");
        pnlBack.add(lblStockid, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        txtStockid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtStockid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        txtStockid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockidActionPerformed(evt);
            }
        });
        pnlBack.add(txtStockid, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 320, -1));

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
        pnlBack.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 160, -1, -1));

        tblStock.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        tblStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stock ID", "ItemID", "Qty", "Buying price", "Profit precentage", "Selling price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStock.setRowHeight(20);
        tblStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStockMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStock);

        pnlBack.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 1270, 550));

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
        pnlBack.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 160, -1, -1));

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
        if (txtStockid.getText().trim().length() > 0) {
            try {
                boolean deleted = new DeleteStockController().deleteStock(txtStockid.getText());
                if(deleted){
                    new InformationBox(new javax.swing.JFrame(), true, "Deleted successfully.").setVisible(true);
                }else{
                    new InformationBox(new javax.swing.JFrame(), true, "Something went wrong, Try again.").setVisible(true);
                }
            } catch (ClassNotFoundException ex) {
                new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
            } catch (SQLException ex) {
                new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStockMouseClicked
        int row = tblStock.getSelectedRow();
        txtStockid.setText(tblStock.getValueAt(row, 0).toString());
    }//GEN-LAST:event_tblStockMouseClicked

    private void txtStockidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockidActionPerformed
        if (txtStockid.getText().trim().length() > 0) {
            try {
                StockModel stock = new DeleteStockController().getStock(txtStockid.getText());
                DefaultTableModel model = (DefaultTableModel) tblStock.getModel();
                model.setRowCount(0);
                String itemID = null;
                if (stock.getComputerID() != null) {
                    itemID = stock.getComputerID();
                } else if (stock.getPartID() != null) {
                    itemID = stock.getPartID();
                }
                model.addRow(new Object[]{
                    stock.getStockID(),
                    itemID,
                    stock.getQTYonhand(),
                    stock.getBuyingPrice(),
                    stock.getProfitPrecentage(),
                    stock.getSellingPricel()
                });

            } catch (ClassNotFoundException ex) {
                new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
            } catch (SQLException ex) {
                new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
            }
        }
    }//GEN-LAST:event_txtStockidActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnClear;
    private keeptoo.KButton btnDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblStockid;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JTable tblStock;
    private javax.swing.JTextField txtStockid;
    // End of variables declaration//GEN-END:variables

    private void setTheam() {
        if (state) {
            pnlBack.setBackground(Color.BLACK);
            lblStockid.setForeground(Color.WHITE);
            txtStockid.setForeground(Color.WHITE);
            txtStockid.setBackground(Color.BLACK);
        } else {
        }
    }

    private void clearAll() {
        txtStockid.setText("");
    }

    private void loadTable() {
        try {
            List<StockModel> list = new DeleteStockController().getAllItems();
            DefaultTableModel model = (DefaultTableModel) tblStock.getModel();
            model.setRowCount(0);

            for (StockModel stockModel : list) {
                String itemID = null;
                if (stockModel.getComputerID() != null) {
                    itemID = stockModel.getComputerID();
                } else if (stockModel.getPartID() != null) {
                    itemID = stockModel.getPartID();
                }
                model.addRow(new Object[]{
                    stockModel.getStockID(),
                    itemID,
                    stockModel.getQTYonhand(),
                    stockModel.getBuyingPrice(),
                    stockModel.getProfitPrecentage(),
                    stockModel.getSellingPricel()
                });
            }
            } catch (ClassNotFoundException ex) {
                new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
            } catch (SQLException ex) {
                new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
            }
    }
}
