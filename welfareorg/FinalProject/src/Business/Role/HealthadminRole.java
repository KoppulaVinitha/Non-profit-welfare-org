/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.HealthEnterprise;
import Business.Enterprise.WelfareEnterprise;
import Business.Logger;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Health.HealthAdminWorkAreaPanel;

/**
 *
 * @author HP
 */
public class HealthadminRole extends HealthRole{
    
    @Override
    public JPanel createHealthWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,HealthEnterprise enterprise, EcoSystem business) {
       return new HealthAdminWorkAreaPanel(userProcessContainer, business,enterprise);
    }
    

    @Override
    public JPanel createWelfareWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, WelfareEnterprise enterprise, EcoSystem business) {
        return null;
    }

    
}
