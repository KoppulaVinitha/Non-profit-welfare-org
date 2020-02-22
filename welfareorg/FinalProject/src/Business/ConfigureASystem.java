package Business;

import Business.Beneficiaries.Beneficiary;
import Business.Employee.Employee;
import Business.Enterprise.HealthEnterprise;
import Business.Enterprise.WelfareEnterprise;
import Business.Event.Event;
import Business.Network.Network;
import Business.Organization.HealthOrganization;
import Business.Organization.WelfareOrganization;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Network network= system.createAndAddNetwork();
        network.setName("System Administrator");
        WelfareEnterprise ent = network.getEnterpriseDirectory().createAndAddWelfareEnterprise("Admin", "Welfare");
        WelfareOrganization welfare = ent.getWelfareOrganizationDirectory().createWelfareOrganization("WelfareAdmin Organization");
        Employee employee = welfare.getEmployeeDirectory().createEmployee("SystemAdmin");

        UserAccount ua= welfare.getUserAccountDirectory().createUserAccount("Admin", "Admin", employee, new SystemAdminRole(),null);

        return system;
    }
    
}
