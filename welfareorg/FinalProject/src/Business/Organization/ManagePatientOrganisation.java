/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ManagePatientRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
 public class ManagePatientOrganisation extends HealthOrganization{

    public ManagePatientOrganisation() {
        super(Type.ManagePatientOrg.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ManagePatientRole());
        return roles;
    }
     
}  

