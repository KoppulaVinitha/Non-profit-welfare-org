/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class HealthOrganizationDirectory {
    private ArrayList<HealthOrganization> healthOrganizationList;

    public HealthOrganizationDirectory() {
        healthOrganizationList = new ArrayList();
    }

    public ArrayList<HealthOrganization> getHealthOrganizationList() {
        return healthOrganizationList;
    }
    public HealthOrganization createHealthOrganization(String type){
        HealthOrganization organization = null;
        if (type.equals(HealthOrganization.Type.HealthAdmin.getValue())){
            organization = new HealthAdminOrganization();
            healthOrganizationList.add(organization);
        } else if (type.equals(HealthOrganization.Type.DoctorOrg.getValue())){
            organization = new DoctorOrganization();
            healthOrganizationList.add(organization);
        }
        else if (type.equals(HealthOrganization.Type.AssitantOrg.getValue())){
            organization = new LabOrganization();
            healthOrganizationList.add(organization);
        }
        else if (type.equals(HealthOrganization.Type.ManagePatientOrg.getValue())){
            organization = new ManagePatientOrganisation();
            healthOrganizationList.add(organization);
        }
        
        return organization;
    }
}


