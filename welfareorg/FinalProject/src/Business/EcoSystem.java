/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.WelfareEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.WelfareOrganization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        networkList=new ArrayList<Network>();
    }
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    public boolean checkIfUserIsUnique(String userName){
        boolean flag = true;
        for(Network network : networkList)
        {
        if(flag){
            for(WelfareEnterprise ent : network.getEnterpriseDirectory().getWelfareEnterpriseList()){
                for(WelfareOrganization welOrg : ent.getWelfareOrganizationDirectory().getWelfareOrganizationList()){
                    if(!welOrg.getUserAccountDirectory().checkIfUsernameIsUnique(userName))
                    {
                        flag = false;
                    }
                }
            }
        }
        }
        return flag;
    }
}