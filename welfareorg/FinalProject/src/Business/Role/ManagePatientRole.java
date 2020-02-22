/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.HealthEnterprise;
import Business.Enterprise.WelfareEnterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Health.ManagePatientWorkAreaPanel;

/**
 *
 * @author HP
 */
    public class ManagePatientRole extends HealthRole {

      @Override
    public JPanel createHealthWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, HealthEnterprise healthenterprise, EcoSystem system) {
        return new ManagePatientWorkAreaPanel(userProcessContainer,system, healthenterprise, organization, account);
    }


    @Override
    public JPanel createWelfareWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, WelfareEnterprise enterprise, EcoSystem business) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
