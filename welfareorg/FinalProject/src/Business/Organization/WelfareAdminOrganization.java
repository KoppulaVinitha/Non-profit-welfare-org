/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.WelfareadminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class WelfareAdminOrganization extends WelfareOrganization{

    public WelfareAdminOrganization() {
        super(Type.WelfareAdmin.getValue());
    }
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new WelfareadminRole());
        return roles;
    } 
}
