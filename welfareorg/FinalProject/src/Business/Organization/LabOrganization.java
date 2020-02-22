/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

//import Business.Role.LabAssistantRole;
import Business.Organization.HealthOrganization.Type;
import Business.Role.NurseRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class LabOrganization extends HealthOrganization{

       public LabOrganization() {
        super(Type.AssitantOrg.getValue());
    }
   
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NurseRole());
        return roles;
    }
     
   
    
    
}
