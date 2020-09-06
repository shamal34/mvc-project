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
import lk.ijse.moderntech.controler.AddRepairController;
import lk.ijse.moderntech.model.RepairModel;

/**
 *
 * @author Shamal
 */
public class AddRepair extends javax.swing.JInternalFrame {

    boolean state;

    public AddRepair(boolean state) {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.state = state;
        setTheam();
        getRepairID();
        loadCustomerID();
        loadEmployeeID();
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
        lblRepairid = new javax.swing.JLabel();
        txtRepairid = new javax.swing.JTextField();
        lblRepairdescription = new javax.swing.JLabel();
        txtRepairtdescription = new javax.swing.JTextField();
        sp1 = new javax.swing.JSeparator();
        lblCustomerID = new javax.swing.JLabel();
        cmbCustomerID = new javax.swing.JComboBox<>();
        lblCName = new javax.swing.JLabel();
        txtCName = new javax.swing.JTextField();
        btnAdd = new keeptoo.KButton();
        tnSearch = new keeptoo.KButton();
        lblCustomerDetail = new javax.swing.JLabel();
        lblEmployeedetail = new javax.swing.JLabel();
        sp2 = new javax.swing.JSeparator();
        lblEmployeeid = new javax.swing.JLabel();
        cmbEmployeeid = new javax.swing.JComboBox<>();
        lblEName = new javax.swing.JLabel();
        txtEName = new javax.swing.JTextField();
        btnClear = new keeptoo.KButton();
        btnSave = new keeptoo.KButton();

        setBorder(null);
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1310, 820));

        pnlBack.setBackground(new java.awt.Color(255, 255, 255));
        pnlBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRepairid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblRepairid.setText("Repair ID :");
        pnlBack.add(lblRepairid, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        txtRepairid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtRepairid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        txtRepairid.setEnabled(false);
        pnlBack.add(txtRepairid, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 320, -1));

        lblRepairdescription.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblRepairdescription.setText("Repair description :");
        pnlBack.add(lblRepairdescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        txtRepairtdescription.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtRepairtdescription.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        pnlBack.add(txtRepairtdescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 870, -1));

        sp1.setForeground(new java.awt.Color(0, 0, 0));
        pnlBack.add(sp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 192, 1250, 10));

        lblCustomerID.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblCustomerID.setText("Customer ID :");
        pnlBack.add(lblCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        cmbCustomerID.setEditable(true);
        cmbCustomerID.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        cmbCustomerID.setBorder(null);
        cmbCustomerID.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCustomerIDItemStateChanged(evt);
            }
        });
        cmbCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCustomerIDActionPerformed(evt);
            }
        });
        pnlBack.add(cmbCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 270, 30));

        lblCName.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblCName.setText("Name :");
        pnlBack.add(lblCName, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, -1, -1));

        txtCName.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtCName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        txtCName.setEnabled(false);
        pnlBack.add(txtCName, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, 320, -1));

        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 215)));
        btnAdd.setForeground(new java.awt.Color(0, 120, 215));
        btnAdd.setText("Add");
        btnAdd.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btnAdd.setkAllowGradient(false);
        btnAdd.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        btnAdd.setkBorderRadius(0);
        btnAdd.setkForeGround(new java.awt.Color(0, 120, 215));
        btnAdd.setkHoverColor(new java.awt.Color(0, 120, 215));
        btnAdd.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        pnlBack.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 260, 150, -1));

        tnSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(26, 200, 179)));
        tnSearch.setForeground(new java.awt.Color(26, 200, 179));
        tnSearch.setText("Search");
        tnSearch.setToolTipText("");
        tnSearch.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        tnSearch.setkAllowGradient(false);
        tnSearch.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        tnSearch.setkBorderRadius(0);
        tnSearch.setkForeGround(new java.awt.Color(26, 200, 179));
        tnSearch.setkHoverColor(new java.awt.Color(26, 200, 179));
        tnSearch.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        tnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnSearchActionPerformed(evt);
            }
        });
        pnlBack.add(tnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 320, 150, -1));

        lblCustomerDetail.setFont(new java.awt.Font("Poppins", 0, 36)); // NOI18N
        lblCustomerDetail.setText("Customer details");
        pnlBack.add(lblCustomerDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, -1));

        lblEmployeedetail.setFont(new java.awt.Font("Poppins", 0, 36)); // NOI18N
        lblEmployeedetail.setText("Employee details");
        pnlBack.add(lblEmployeedetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, -1, -1));

        sp2.setForeground(new java.awt.Color(0, 0, 0));
        pnlBack.add(sp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 1250, 10));

        lblEmployeeid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblEmployeeid.setText("Employee ID :");
        pnlBack.add(lblEmployeeid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, -1, -1));

        cmbEmployeeid.setEditable(true);
        cmbEmployeeid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        cmbEmployeeid.setBorder(null);
        cmbEmployeeid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEmployeeidItemStateChanged(evt);
            }
        });
        cmbEmployeeid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEmployeeidActionPerformed(evt);
            }
        });
        pnlBack.add(cmbEmployeeid, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 270, 30));

        lblEName.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblEName.setText("Name :");
        pnlBack.add(lblEName, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, -1, -1));

        txtEName.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtEName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        txtEName.setEnabled(false);
        pnlBack.add(txtEName, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, 320, -1));

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
        pnlBack.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 570, -1, -1));

        btnSave.setBorder(null);
        btnSave.setText("Save");
        btnSave.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btnSave.setkAllowGradient(false);
        btnSave.setkBackGroundColor(new java.awt.Color(0, 120, 215));
        btnSave.setkBorderRadius(0);
        btnSave.setkHoverColor(new java.awt.Color(0, 80, 143));
        btnSave.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        pnlBack.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 570, -1, -1));

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

    private void cmbCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCustomerIDActionPerformed
        try {
            String name = new AddRepairController().getCustomer(cmbCustomerID.getSelectedItem().toString());
            if (name != null) {
                txtCName.setText(name);
            } else {
                new InformationBox(new javax.swing.JFrame(), true, "Something went wrong, Try again.").setVisible(true);
            }
        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
    }//GEN-LAST:event_cmbCustomerIDActionPerformed

    private void cmbEmployeeidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEmployeeidActionPerformed
        try {
            String name = new AddRepairController().getEmployee(cmbEmployeeid.getSelectedItem().toString());
            if (name != null) {
                txtEName.setText(name);
            } else {
                new InformationBox(new javax.swing.JFrame(), true, "Something went wrong, Try again.").setVisible(true);
            }
        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
    }//GEN-LAST:event_cmbEmployeeidActionPerformed

    private void cmbCustomerIDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCustomerIDItemStateChanged
        try {
            String name = new AddRepairController().getCustomer(cmbCustomerID.getSelectedItem().toString());
            if (name != null) {
                txtCName.setText(name);
            } else {
                new InformationBox(new javax.swing.JFrame(), true, "Something went wrong, Try again.").setVisible(true);
            }
        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
    }//GEN-LAST:event_cmbCustomerIDItemStateChanged

    private void cmbEmployeeidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEmployeeidItemStateChanged
        try {
            String name = new AddRepairController().getEmployee(cmbEmployeeid.getSelectedItem().toString());
            if (name != null) {
                txtEName.setText(name);
            } else {
                new InformationBox(new javax.swing.JFrame(), true, "Something went wrong, Try again.").setVisible(true);
            }
        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
    }//GEN-LAST:event_cmbEmployeeidItemStateChanged

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearAll();
        getRepairID();
        loadCustomerID();
        loadEmployeeID();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        RepairModel repair = new RepairModel(
                txtRepairid.getText(),
                cmbEmployeeid.getSelectedItem().toString(),
                cmbCustomerID.getSelectedItem().toString(),
                "Pending",
                txtRepairtdescription.getText(),
                "0.00"
        );
        
        try {
            boolean saved = new AddRepairController().saveRepair(repair);
            if(saved){
                new InformationBox(new javax.swing.JFrame(), true, "Saved successfully.").setVisible(true);
            }else{
                new InformationBox(new javax.swing.JFrame(), true, "Something went wrong, Try again.").setVisible(true);
            }
        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        new AddCustomer_quick2(new javax.swing.JFrame(), true, this).setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void tnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnSearchActionPerformed
        new SearchCustomer_quick2(new javax.swing.JFrame(), true, this).setVisible(true);
    }//GEN-LAST:event_tnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnAdd;
    private keeptoo.KButton btnClear;
    private keeptoo.KButton btnSave;
    protected javax.swing.JComboBox<String> cmbCustomerID;
    private javax.swing.JComboBox<String> cmbEmployeeid;
    private javax.swing.JLabel lblCName;
    private javax.swing.JLabel lblCustomerDetail;
    private javax.swing.JLabel lblCustomerID;
    private javax.swing.JLabel lblEName;
    private javax.swing.JLabel lblEmployeedetail;
    private javax.swing.JLabel lblEmployeeid;
    private javax.swing.JLabel lblRepairdescription;
    private javax.swing.JLabel lblRepairid;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JSeparator sp1;
    private javax.swing.JSeparator sp2;
    private keeptoo.KButton tnSearch;
    protected javax.swing.JTextField txtCName;
    private javax.swing.JTextField txtEName;
    private javax.swing.JTextField txtRepairid;
    private javax.swing.JTextField txtRepairtdescription;
    // End of variables declaration//GEN-END:variables

    private void setTheam() {
        if (state) {
            pnlBack.setBackground(Color.BLACK);
            lblCName.setForeground(Color.WHITE);
            lblCustomerDetail.setForeground(Color.WHITE);
            lblCustomerID.setForeground(Color.WHITE);
            lblEName.setForeground(Color.WHITE);
            lblEmployeedetail.setForeground(Color.WHITE);
            lblRepairdescription.setForeground(Color.WHITE);
            lblEmployeeid.setForeground(Color.WHITE);
            lblRepairid.setForeground(Color.WHITE);
            cmbCustomerID.setForeground(Color.WHITE);
            cmbEmployeeid.setForeground(Color.WHITE);
            txtCName.setForeground(Color.WHITE);
            txtEName.setForeground(Color.WHITE);
            txtRepairid.setForeground(Color.WHITE);
            txtRepairtdescription.setForeground(Color.WHITE);
            cmbCustomerID.setBackground(Color.BLACK);
            cmbEmployeeid.setBackground(Color.BLACK);
            txtCName.setBackground(Color.BLACK);
            txtEName.setBackground(Color.BLACK);
            txtRepairid.setBackground(Color.BLACK);
            txtRepairtdescription.setBackground(Color.BLACK);
        } else {
        }
    }

    private void getRepairID() {
        try {
            String id = new AddRepairController().getRepairID();
            txtRepairid.setText(id);
        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
    }

    private void loadCustomerID() {
        try {
            List<String> list = new AddRepairController().loadAllCustomers();
            for (String string : list) {
                cmbCustomerID.addItem(string);
            }
        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
    }

    private void loadEmployeeID() {
        try {
            List<String> list = new AddRepairController().loadAllEmployee();
            for (String string : list) {
                cmbEmployeeid.addItem(string);
            }
        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
    }

    private void clearAll() {
        txtRepairid.setText("");
        txtRepairtdescription.setText("");
        txtCName.setText("");
        txtEName.setText("");
        cmbCustomerID.setSelectedIndex(0);
        cmbEmployeeid.setSelectedIndex(0);
    }
}
