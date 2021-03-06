/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.WelfareAdmin;

import Business.Employee.Employee;
import Business.Enterprise.WelfareEnterprise;
import Business.Logger;
import Business.Organization.WelfareOrganization;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageWelfareEmployeePanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    WelfareEnterprise enterprise;
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageWelfareEmployeePanel(JPanel userProcessContainer,WelfareEnterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = (WelfareEnterprise)enterprise;
        organizationJTable.getTableHeader().setFont(new Font("TImes New Roman",Font.BOLD,18));
        organizationJTable.setRowHeight(30);
       organizationJTable.setRowMargin(10);
        populateOrganizationEmpComboBox();
        populateTable();
    }
    
    
    public void populateOrganizationEmpComboBox(){
        try{
            organizationEmpJComboBox.removeAllItems();
            for(WelfareOrganization organization: enterprise.getWelfareOrganizationDirectory().getWelfareOrganizationList()){
                if(!organization.getName().equals("WelfareAdmin Organization"))
                    organizationEmpJComboBox.addItem(organization);          
            }
        }
        catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
        }
    }

    private void populateTable(){
       try{
            DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
            model.setRowCount(0);
            for(WelfareOrganization organization:enterprise.getWelfareOrganizationDirectory().getWelfareOrganizationList()){
                if(organization!= null && organization.getEmployeeDirectory()!= null){
                    for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
                        Object[] row = new Object[model.getColumnCount()];
                        row[0] = employee.getId();
                        row[1] = employee.getName();
                        row[2] = organization;
                        model.addRow(row);
                    }
                }
            }
        }
        catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        organizationEmpJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        imgLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        organizationJTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        organizationJTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Organization"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(610, 270, 530, 170);

        addJButton.setBackground(new java.awt.Color(102, 0, 102));
        addJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        addJButton.setText("Create Employee");
        addJButton.setBorder(null);
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton);
        addJButton.setBounds(860, 640, 160, 40);

        backJButton.setBackground(new java.awt.Color(153, 102, 0));
        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.setBorder(null);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(250, 800, 120, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("  Employee Name:");
        add(jLabel2);
        jLabel2.setBounds(710, 540, 190, 28);

        nameJTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nameJTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(97, 17, 73)));
        add(nameJTextField);
        nameJTextField.setBounds(920, 540, 150, 40);

        organizationEmpJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationEmpJComboBox.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(97, 17, 73)));
        add(organizationEmpJComboBox);
        organizationEmpJComboBox.setBounds(920, 470, 150, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Select Organization:");
        add(jLabel3);
        jLabel3.setBounds(680, 470, 220, 28);

        imgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sindhu\\Documents\\AED\\finalproject\\EcoSystem (1)\\EcoSystem\\src\\help.jpg")); // NOI18N
        add(imgLabel);
        imgLabel.setBounds(20, -70, 1540, 1000);
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        
        try{
            WelfareOrganization organization = (WelfareOrganization) organizationEmpJComboBox.getSelectedItem();
            String name = nameJTextField.getText();
            if(!name.trim().isEmpty()){
            organization.getEmployeeDirectory().createEmployee(name);
            populateTable();
            Logger.getInstance().writeLogs("Welfare Employee Created name:- "+name);
            JOptionPane.showMessageDialog(null, "Welfare Employee Created name:- "+name);
                  nameJTextField.setBorder(BorderFactory.createLineBorder(new Color(153,0,102),3));
                  nameJTextField.setText("");
            }
            else{
                 JOptionPane.showMessageDialog(null, "Please enter employee name","Error",JOptionPane.ERROR_MESSAGE);
                  nameJTextField.setBorder(BorderFactory.createLineBorder(Color.RED,3));
                  nameJTextField.setText("");
            }
        }
        catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
        }
        
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
