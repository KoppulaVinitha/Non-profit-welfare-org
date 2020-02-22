/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.HealthEnterprise;
import Business.Enterprise.WelfareEnterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization,
            EcoSystem business);
    public abstract JPanel createWelfareWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization,
            WelfareEnterprise enterprise,
            EcoSystem business);
     public abstract JPanel createHealthWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization,
            HealthEnterprise enterprise,
            EcoSystem business);
    
}