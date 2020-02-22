/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Beneficiaries.BeneficaryDirectory;
import Business.Contribution.ContributionDetailsDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Event.EventDirectory;
import Business.UserAccount.UserAccountDirectory;


/**
 *
 * @author user
 */
public abstract class WelfareOrganization extends Organization {

    private String name;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private ContributionDetailsDirectory contributionDirectory;
    private BeneficaryDirectory beneficiaryDirectory;
    private EventDirectory eventDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
       WelfareAdmin("WelfareAdmin Organization"), 
       ContributionOrg("Contribution Organization"),
       EventOrg("Event Organization"),
       BeneficiaryOrg("Beneficiary Organization");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public WelfareOrganization(String name) {
        this.name = name;
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        contributionDirectory = new ContributionDetailsDirectory();
        beneficiaryDirectory = new BeneficaryDirectory();
        eventDirectory = new EventDirectory();
        organizationID = counter;
        ++counter;
        
    }

    public EventDirectory getEventDirectory() {
        return eventDirectory;
    }

   
    public BeneficaryDirectory getBeneficiaryDirectory() {
        return beneficiaryDirectory;
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
     public ContributionDetailsDirectory getContributionDirectory() {
        return contributionDirectory;
    }
    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }
    
    
}
