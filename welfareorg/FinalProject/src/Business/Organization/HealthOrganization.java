/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.UserAccount.UserAccountDirectory;


/**
 *
 * @author HP
 */
    public abstract class HealthOrganization extends Organization {

    private String name;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
       HealthAdmin("HealthAdmin Organization"), 
       DoctorOrg("Doctor Organization"),
       ManagePatientOrg("ManagePatient Organization"),
       AssitantOrg("Lab Organization");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public HealthOrganization(String name) {
        this.name = name;
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
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


