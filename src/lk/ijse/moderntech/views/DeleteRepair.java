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
import lk.ijse.moderntech.controler.DeleteRepairController;
import lk.ijse.moderntech.model.RepairModel;

/**
 *
 * @author Shamal
 */
public class DeleteRepair extends javax.swing.JInternalFrame {

    boolean state;

    public DeleteRepair(boolean state) {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRepair = new javax.swing.JTable();
        btnClear = new keeptoo.KButton();
        btnDelete = new keeptoo.KButton();
        lblRepairid = new javax.swing.JLabel();
        txtRepairid = new javax.swing.JTextField();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1310, 820));

        pnlBack.setBackground(new java.awt.Color(255, 255, 255));
        pnlBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRepair.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        tblRepair.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Repair ID", "Employee ID", "Customer ID", "Repair status", "Repair description", "Price"
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
        tblRepair.setRowHeight(20);
        tblRepair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRepairMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRepair);

        pnlBack.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 1270, 560));

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
        pnlBack.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, -1, -1));

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
        pnlBack.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 150, -1, -1));

        lblRepairid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblRepairid.setText("Repair ID :");
        pnlBack.add(lblRepairid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, 30));

        txtRepairid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtRepairid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        pnlBack.add(txtRepairid, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 320, 30));

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

    private void tblRepairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRepairMouseClicked
        int row = tblRepair.getSelectedRow();
        txtRepairid.setText(tblRepair.getValueAt(row, 0).toString());
    }//GEN-LAST:event_tblRepairMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (txtRepairid.getText().trim().length() > 0) {
            try {
                boolean isDeleted = new DeleteRepairController().deleteRepair(txtRepairid.getText());
                if(isDeleted){
                    new InformationBox(new javax.swing.JFrame(), true, "Deleted successfully.").setVisible(true);
                }else{
                    new InformationBox(new javax.swing.JFrame(), true, "Something went wrong, Try again..").setVisible(true);
                }
            } catch (ClassNotFoundException ex) {
                new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
            } catch (SQLException ex) {
                new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
            }
        }
        loadTable();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnClear;
    private keeptoo.KButton btnDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRepairid;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JTable tblRepair;
    private javax.swing.JTextField txtRepairid;
    // End of variables declaration//GEN-END:variables

    private void setTheam() {
        if (state) {
            pnlBack.setBackground(Color.BLACK);
            lblRepairid.setForeground(Color.WHITE);
            txtRepairid.setForeground(Color.WHITE);
            txtRepairid.setBackground(Color.BLACK);
        } else {
        }
    }

    private void loadTable() {
        try {
            List<RepairModel> list = new DeleteRepairController().getAllRepair();
            DefaultTableModel model = (DefaultTableModel) tblRepair.getModel();
            model.setRowCount(0);

            for (RepairModel repairModel : list) {
                model.addRow(new Object[]{
                    repairModel.getRepairID(),
                    repairModel.getEmployeeID(),
                    repairModel.getCustomerID(),
                    repairModel.getRepairStatus(),
                    repairModel.getRepairDescription(),
                    repairModel.getPrice()
                });
            }
        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
    }
}
