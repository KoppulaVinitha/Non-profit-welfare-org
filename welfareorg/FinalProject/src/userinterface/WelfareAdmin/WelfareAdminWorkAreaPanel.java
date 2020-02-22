/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.WelfareAdmin;

import Business.EcoSystem;
import Business.Enterprise.WelfareEnterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Sindhu
 */
public class WelfareAdminWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form WelfareAdminWorkAreaPanel
     */
    JPanel userProcessContainer;
    WelfareEnterprise enterprise;
    EcoSystem ecosystem;
    /** Creates new form AdminWorkAreaJPanel */
   
   
   public WelfareAdminWorkAreaPanel(JPanel userProcessContainer,EcoSystem ecosystem, WelfareEnterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.enterprise=enterprise;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        manageOrganizationJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        userJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("Welfare Admin  Role");
        add(jLabel1);
        jLabel1.setBounds(650, 180, 370, 42);

        manageOrganizationJButton.setBackground(new java.awt.Color(153, 153, 0));
        manageOrganizationJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 0), new java.awt.Color(204, 204, 0), new java.awt.Color(204, 204, 0), new java.awt.Color(204, 204, 0)));
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton);
        manageOrganizationJButton.setBounds(680, 280, 250, 60);

        manageEmployeeJButton.setBackground(new java.awt.Color(153, 153, 0));
        manageEmployeeJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 0), new java.awt.Color(204, 204, 0), new java.awt.Color(204, 204, 0), new java.awt.Color(204, 204, 0)));
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton);
        manageEmployeeJButton.setBounds(680, 370, 250, 50);

        userJButton.setBackground(new java.awt.Color(153, 153, 0));
        userJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        userJButton.setText("Manage User");
        userJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 0), new java.awt.Color(204, 204, 0), new java.awt.Color(204, 204, 0), new java.awt.Color(204, 204, 0)));
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton);
        userJButton.setBounds(680, 470, 250, 50);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sindhu\\Documents\\AED\\finalproject\\EcoSystem (1)\\EcoSystem\\src\\help.jpg")); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(50, 0, 1390, 860);
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ManageWelfareUserAccountJPanel muajp = new ManageWelfareUserAccountJPanel(userProcessContainer, enterprise,ecosystem);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        ManageWelfareEmployeePanel manageEmployeeJPanel = new ManageWelfareEmployeePanel(userProcessContainer, enterprise);
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageWelfareOrganizationJPanel manageOrganizationJPanel = new ManageWelfareOrganizationJPanel(userProcessContainer,ecosystem, enterprise);
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    // End of variables declaration//GEN-END:variables
}