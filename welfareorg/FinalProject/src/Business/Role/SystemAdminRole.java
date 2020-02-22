/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.HealthEnterprise;
import Business.Enterprise.WelfareEnterprise;
import Business.Logger;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem system) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
        
    }

    @Override
    public JPanel createWelfareWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, WelfareEnterprise enterprise, EcoSystem business) {
        return null;
    }

    @Override
    public JPanel createHealthWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, HealthEnterprise enterprise, EcoSystem business) {
        return null;
    }
    
    
}
