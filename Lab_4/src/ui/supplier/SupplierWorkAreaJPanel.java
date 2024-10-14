/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.supplier;

import model.Supplier;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import ui.LoginScreen;

/**
 *
 * @author lingduan
 */
public class SupplierWorkAreaJPanel extends javax.swing.JPanel {
       JPanel mainWorkArea;
       Supplier supplier;
    /**
     * Creates new form SupplierWorkAreaJPanel
     */
    public SupplierWorkAreaJPanel(JPanel mainWorkArea, Supplier supplier) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.supplier = supplier;
        if (supplier != null) {
    lblWelcome.setText("Welcome to Lab 4, " + supplier.getSupplyName());
}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        workArea = new javax.swing.JPanel();
        menuBar = new javax.swing.JPanel();
        btnLogOut = new javax.swing.JButton();
        btnManageProductCatalog = new javax.swing.JButton();
        btnSupplierProfile = new javax.swing.JButton();
        btnManageStaff = new javax.swing.JButton();
        Performance = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();

        splitPane.setDividerLocation(150);
        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        workArea.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(workArea);

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnManageProductCatalog.setText("Product Catalog");
        btnManageProductCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProductCatalogActionPerformed(evt);
            }
        });

        btnSupplierProfile.setText("Update Profile");
        btnSupplierProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierProfileActionPerformed(evt);
            }
        });

        btnManageStaff.setText("Manage Satff");

        Performance.setText("Performance");
        Performance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerformanceActionPerformed(evt);
            }
        });

        lblWelcome.setText("<WelcomeMsg>");

        javax.swing.GroupLayout menuBarLayout = new javax.swing.GroupLayout(menuBar);
        menuBar.setLayout(menuBarLayout);
        menuBarLayout.setHorizontalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuBarLayout.createSequentialGroup()
                        .addGap(0, 139, Short.MAX_VALUE)
                        .addComponent(btnManageProductCatalog)
                        .addGap(18, 18, 18)
                        .addComponent(btnSupplierProfile)
                        .addGap(27, 27, 27)
                        .addComponent(btnManageStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Performance)
                        .addGap(17, 17, 17)
                        .addComponent(btnLogOut)
                        .addGap(22, 22, 22))
                    .addGroup(menuBarLayout.createSequentialGroup()
                        .addComponent(lblWelcome)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        menuBarLayout.setVerticalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBarLayout.createSequentialGroup()
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogOut)
                    .addComponent(btnManageProductCatalog)
                    .addComponent(btnSupplierProfile)
                    .addComponent(btnManageStaff)
                    .addComponent(Performance))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        splitPane.setTopComponent(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        mainWorkArea.remove(this);

        Component[] componentArray = mainWorkArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LoginScreen loginPanel = (LoginScreen) component;
        loginPanel.populateSupplierCombo();

        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);
    }//GEN-LAST:event_btnLogOutActionPerformed

    
    private void btnManageProductCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProductCatalogActionPerformed
        // TODO add your handling code here:
        ManageProductCatalogJPanel mpcjp = new ManageProductCatalogJPanel(workArea, supplier);
    workArea.add("ManageProductCatalogJPanel", mpcjp);
    CardLayout layout = (CardLayout) workArea.getLayout();
    layout.next(workArea);
        
        
    }//GEN-LAST:event_btnManageProductCatalogActionPerformed

    private void PerformanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerformanceActionPerformed
        // TODO add your handling code here:
        // ProductReportJPanel prjp = new ProductReportJPanel(userProcessContainer, supplier);
    // workArea.add("ProductReportJPanelSupplier", prjp);
    // CardLayout layout = (CardLayout) workArea.getLayout();
    // layout.next(userProcessContainer);
    }//GEN-LAST:event_PerformanceActionPerformed

    private void btnSupplierProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSupplierProfileActionPerformed

    
    
    public String toString() {
        return "Supplier";
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Performance;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnManageProductCatalog;
    private javax.swing.JButton btnManageStaff;
    private javax.swing.JButton btnSupplierProfile;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel menuBar;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables

   
}
