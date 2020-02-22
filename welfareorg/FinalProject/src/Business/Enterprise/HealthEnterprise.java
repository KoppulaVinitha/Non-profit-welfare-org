/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.HealthOrganization;
import Business.Organization.HealthOrganizationDirectory;
import Business.Role.Role;
import java.util.ArrayList;


    
/**
 *
 * @author hp
 */
public class HealthEnterprise extends HealthOrganization{
    private EnterpriseType enterpriseType;
    private HealthOrganizationDirectory healthOrganizationDirectory;

    public HealthOrganizationDirectory getHealthOrganizationDirectory() {
        return healthOrganizationDirectory;
    }

    public enum EnterpriseType{
        Health("Health");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
     public HealthEnterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        healthOrganizationDirectory=new HealthOrganizationDirectory();
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }


    
}


