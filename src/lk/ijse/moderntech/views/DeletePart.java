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
import lk.ijse.moderntech.controler.DeletePartController;
import lk.ijse.moderntech.controler.UpdatePartController;
import lk.ijse.moderntech.model.PartModel;

/**
 *
 * @author Shamal
 */
public class DeletePart extends javax.swing.JInternalFrame {

    boolean state;

    public DeletePart(boolean state) {
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
        txtPartID = new javax.swing.JTextField();
        lblPartid = new javax.swing.JLabel();
        btnClear = new keeptoo.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPart = new javax.swing.JTable();
        btnDelete = new keeptoo.KButton();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1310, 820));

        pnlBack.setBackground(new java.awt.Color(255, 255, 255));
        pnlBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPartID.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtPartID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        txtPartID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPartIDActionPerformed(evt);
            }
        });
        pnlBack.add(txtPartID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 320, -1));

        lblPartid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblPartid.setText("Part ID :");
        pnlBack.add(lblPartid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

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
        pnlBack.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, -1, -1));

        tblPart.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        tblPart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Part ID", "Warranty", "Part name", "Value", "Brand", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPart.setRowHeight(20);
        tblPart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPartMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPart);

        pnlBack.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 207, 1260, 590));

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
        pnlBack.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 130, -1, -1));

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

    private void tblPartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPartMouseClicked
        int row = tblPart.getSelectedRow();
        txtPartID.setText(tblPart.getValueAt(row, 0).toString());
    }//GEN-LAST:event_tblPartMouseClicked

    private void txtPartIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPartIDActionPerformed
        if (txtPartID.getText().trim().length() > 0) {
            try {
                PartModel part = new DeletePartController().getpartByID(txtPartID.getText());
                DefaultTableModel model = (DefaultTableModel) tblPart.getModel();
                model.setRowCount(0);
                model.addRow(new Object[]{
                    part.getPartID(),
                    part.getWarrantyID(),
                    part.getPartName(),
                    part.getValue(),
                    part.getBrand(),
                    part.getDescription()
                });

            } catch (ClassNotFoundException ex) {
                new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
            } catch (SQLException ex) {
                new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
            }
        }
    }//GEN-LAST:event_txtPartIDActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            boolean deleted = new DeletePartController().deletePart(txtPartID.getText());
            if (deleted) {
                new InformationBox(new javax.swing.JFrame(), true, "Deleted successfully.").setVisible(true);
            } else {
                new InformationBox(new javax.swing.JFrame(), true, "Something went wrong, Try again.").setVisible(true);
            }
        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
        loadTable();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnClear;
    private keeptoo.KButton btnDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPartid;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JTable tblPart;
    private javax.swing.JTextField txtPartID;
    // End of variables declaration//GEN-END:variables

    private void setTheam() {
        if (state) {
            pnlBack.setBackground(Color.black);
            lblPartid.setForeground(Color.WHITE);
            txtPartID.setForeground(Color.WHITE);
            txtPartID.setBackground(Color.BLACK);
        }
    }

    private void loadTable() {

        try {
            List<PartModel> list = new DeletePartController().getPart();
            DefaultTableModel model = (DefaultTableModel) tblPart.getModel();
            model.setRowCount(0);

            for (PartModel partModel : list) {
                model.addRow(new Object[]{
                    partModel.getPartID(),
                    partModel.getWarrantyID(),
                    partModel.getPartName(),
                    partModel.getValue(),
                    partModel.getBrand(),
                    partModel.getDescription()
                });
            }

        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
    }

    private void clearAll() {
        txtPartID.setText("");
    }
}
