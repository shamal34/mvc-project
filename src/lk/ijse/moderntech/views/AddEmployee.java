/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.moderntech.views;

import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.moderntech.controler.AddEmployeeController;
import lk.ijse.moderntech.model.EmployeeModel;
import lk.ijse.moderntech.model.UserModel;

/**
 *
 * @author Shamal
 */
public class AddEmployee extends javax.swing.JInternalFrame {

    boolean state;

    public AddEmployee(boolean state) {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.state = state;
        setTheam();
        getEmployeeID();
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
        lblEmployeeid = new javax.swing.JLabel();
        txtEmployeeid = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblContact = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        sp1 = new javax.swing.JSeparator();
        lblLogindetail = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnClear = new keeptoo.KButton();
        btnSave = new keeptoo.KButton();
        cmbRole = new javax.swing.JComboBox<>();
        lblRole = new javax.swing.JLabel();
        cbShow = new javax.swing.JCheckBox();
        txtPassword = new javax.swing.JPasswordField();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1310, 820));

        pnlBack.setBackground(new java.awt.Color(255, 255, 255));
        pnlBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmployeeid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblEmployeeid.setText("Employee ID :");
        pnlBack.add(lblEmployeeid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        txtEmployeeid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtEmployeeid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        txtEmployeeid.setEnabled(false);
        pnlBack.add(txtEmployeeid, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 320, -1));

        lblName.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblName.setText("Name :");
        pnlBack.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        txtName.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        pnlBack.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 320, -1));

        lblContact.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblContact.setText("Contact no :");
        pnlBack.add(lblContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, -1, -1));

        txtContact.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtContact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        pnlBack.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, 320, -1));

        lblEmail.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblEmail.setText("Email :");
        pnlBack.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        txtEmail.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        pnlBack.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 320, -1));

        lblAddress.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblAddress.setText("Address :");
        pnlBack.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        txtAddress.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        pnlBack.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 820, -1));

        sp1.setForeground(new java.awt.Color(0, 0, 0));
        pnlBack.add(sp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 1250, 10));

        lblLogindetail.setFont(new java.awt.Font("Poppins", 0, 36)); // NOI18N
        lblLogindetail.setText("Login Details");
        pnlBack.add(lblLogindetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, -1, -1));

        lblUsername.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblUsername.setText("User name :");
        pnlBack.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, -1, -1));

        txtUsername.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        pnlBack.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 320, -1));

        lblPassword.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblPassword.setText("Password :");
        pnlBack.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, -1, -1));

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
        pnlBack.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 560, -1, -1));

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
        pnlBack.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 560, -1, -1));

        cmbRole.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Salesman", "Repairman" }));
        cmbRole.setBorder(null);
        pnlBack.add(cmbRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 320, 30));

        lblRole.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblRole.setText("Role :");
        pnlBack.add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 50, -1));

        cbShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbShowMouseClicked(evt);
            }
        });
        pnlBack.add(cbShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 450, -1, -1));

        txtPassword.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        pnlBack.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 450, 300, -1));

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
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        EmployeeModel employee = new EmployeeModel(
                txtEmployeeid.getText(),
                txtName.getText(),
                txtContact.getText(),
                txtEmail.getText(),
                txtAddress.getText(),
                cmbRole.getSelectedItem().toString()
        );
        UserModel user = new UserModel(
                txtUsername.getText(),
                txtPassword.getText()
        );
        
        try {
            boolean isSaved = new AddEmployeeController().saveEmployee(employee, user);
            if(isSaved){
                new InformationBox(new javax.swing.JFrame(), true, "Saved successfully.").setVisible(true);
            }else{
                new InformationBox(new javax.swing.JFrame(), true, "Something went wrong, Try again.").setVisible(true);
            }
        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        } catch (NoSuchAlgorithmException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "NoSuchAlgorithm exception").setVisible(true);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cbShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbShowMouseClicked
        if(cbShow.isSelected()){
            txtPassword.setEchoChar((char)0);
        }else{
            txtPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_cbShowMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnClear;
    private keeptoo.KButton btnSave;
    private javax.swing.JCheckBox cbShow;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmployeeid;
    private javax.swing.JLabel lblLogindetail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JSeparator sp1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmployeeid;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void setTheam() {
        if (state) {
            pnlBack.setBackground(Color.BLACK);
            lblAddress.setForeground(Color.WHITE);
            lblContact.setForeground(Color.WHITE);
            lblEmail.setForeground(Color.WHITE);
            lblEmployeeid.setForeground(Color.WHITE);
            lblLogindetail.setForeground(Color.WHITE);
            lblName.setForeground(Color.WHITE);
            lblPassword.setForeground(Color.WHITE);
            lblUsername.setForeground(Color.WHITE);
            lblRole.setForeground(Color.WHITE);
            cmbRole.setForeground(Color.WHITE);
            txtAddress.setForeground(Color.WHITE);
            txtContact.setForeground(Color.WHITE);
            txtEmail.setForeground(Color.WHITE);
            txtEmployeeid.setForeground(Color.WHITE);
            txtName.setForeground(Color.WHITE);
            txtPassword.setForeground(Color.WHITE);
            txtUsername.setForeground(Color.WHITE);
            cmbRole.setBackground(Color.BLACK);
            txtAddress.setBackground(Color.BLACK);
            txtContact.setBackground(Color.BLACK);
            txtEmail.setBackground(Color.BLACK);
            txtEmployeeid.setBackground(Color.BLACK);
            txtName.setBackground(Color.BLACK);
            txtPassword.setBackground(Color.BLACK);
            txtUsername.setBackground(Color.BLACK);

        } else {
        }
    }

    private void getEmployeeID() {
        try {     
            String id = new AddEmployeeController().getEmployeeID();
            txtEmployeeid.setText(id);
        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
    }

    private void clearAll() {
        txtAddress.setText("");
        txtContact.setText("");
        txtEmail.setText("");
        txtEmployeeid.setText("");
        txtName.setText("");
        txtPassword.setText("");
        txtUsername.setText("");
        cmbRole.setSelectedIndex(0);
    }
}
