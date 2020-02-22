/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.WelfareOrganization;
import Business.Organization.WelfareOrganizationDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sindhu
 */
public class WelfareEnterprise extends WelfareOrganization{
    private EnterpriseType enterpriseType;
    private WelfareOrganizationDirectory welfareOrganizationDirectory;

    public WelfareOrganizationDirectory getWelfareOrganizationDirectory() {
        return welfareOrganizationDirectory;
    }

    public enum EnterpriseType{
        Welfare("Welfare");
        
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
    public WelfareEnterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        welfareOrganizationDirectory=new WelfareOrganizationDirectory();
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }


    
}
