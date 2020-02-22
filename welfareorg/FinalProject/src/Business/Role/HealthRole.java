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

/**
 *
 * @author HP
 */
public abstract class HealthRole extends Role{
    
     public enum RoleType{
        Healthadmin("HealthAdmin"),
        Doctor("Doctor"),
        Patient("Patient"),
        Lab("Lab");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem system) {
        //return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
        return null;
    }
   
   
}

