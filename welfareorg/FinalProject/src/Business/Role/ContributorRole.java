/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.WelfareEnterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ContributorRole.ContributorWorkAreaPanel;

/**
 *
 * @author Sindhu
 */
public class ContributorRole extends WelfareadminRole {
    
    @Override
    public JPanel createWelfareWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, WelfareEnterprise enterprise, EcoSystem system) {
        return new ContributorWorkAreaPanel(userProcessContainer, system, enterprise, organization, account);
    }
}
