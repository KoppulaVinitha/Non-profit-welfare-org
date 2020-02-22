/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.EventManagerRole;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EventOrganization extends WelfareOrganization{

    public EventOrganization() {
        super(Type.EventOrg.getValue());
    }
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EventManagerRole());
        return roles;
    }
}
