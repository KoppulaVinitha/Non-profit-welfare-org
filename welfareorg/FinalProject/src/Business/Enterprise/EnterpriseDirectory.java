/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;


import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    private ArrayList<WelfareEnterprise> welfareEnterpriseList;
    private ArrayList<HealthEnterprise> healthEnterpriseList;
    private ArrayList<Object> combineEnterprises;
    public EnterpriseDirectory(){
        welfareEnterpriseList=new ArrayList<WelfareEnterprise>();
        healthEnterpriseList=new ArrayList<HealthEnterprise>();
    }

    public ArrayList<WelfareEnterprise> getWelfareEnterpriseList() {
        return welfareEnterpriseList;
    }

    public void setWelfareEnterpriseList(ArrayList<WelfareEnterprise> welfareEnterpriseList) {
        this.welfareEnterpriseList = welfareEnterpriseList;
    }


    public ArrayList<HealthEnterprise> getHospitalnterpriseList() {
        return healthEnterpriseList;
    }

    public void setHospitalnterpriseList(ArrayList<HealthEnterprise> healthEnterpriseList) {
        this.healthEnterpriseList = healthEnterpriseList;
    }
    
    //Create enterprises
    public WelfareEnterprise createAndAddWelfareEnterprise(String name,String type){
        WelfareEnterprise enterpriseW=null;
        if(type.equals(WelfareEnterprise.EnterpriseType.Welfare.getValue())){
            enterpriseW = new WelfareEnterprise(name, WelfareEnterprise.EnterpriseType.valueOf(type));
            welfareEnterpriseList.add(enterpriseW);
        }
        return enterpriseW;
    }
     public HealthEnterprise createAndAddHealthEnterprise(String name,String type){
        HealthEnterprise enterpriseH=null;
        if(type.equals(HealthEnterprise.EnterpriseType.Health.getValue())){
            enterpriseH = new HealthEnterprise(name, HealthEnterprise.EnterpriseType.valueOf(type));
            healthEnterpriseList.add(enterpriseH);
        }
        return enterpriseH;
    }
    
    public ArrayList<Object> GetAllEnterprise(){
        combineEnterprises.add(healthEnterpriseList);
        combineEnterprises.add(welfareEnterpriseList);
        return combineEnterprises;
    }
}

