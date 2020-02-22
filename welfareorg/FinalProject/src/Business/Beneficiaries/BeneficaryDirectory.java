/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Beneficiaries;

import java.util.ArrayList;

/**
 *
 * @author Sindhu
 */
public class BeneficaryDirectory {
    
     private ArrayList<Beneficiary> beneficiaryDirectory; 

    public ArrayList<Beneficiary> getBeneficiaryDirectory() {
        return beneficiaryDirectory;
    }

    public void setBeneficiaryDirectory(ArrayList<Beneficiary> beneficiaryDirectory) {
        this.beneficiaryDirectory = beneficiaryDirectory;
    }

    public BeneficaryDirectory() {
        beneficiaryDirectory = new ArrayList();
    }
     
    public Beneficiary addBeneficiary(int count,String ben_name,String ben_city,String ass_type,String entname){
        Beneficiary benDetails = new Beneficiary();
        benDetails.setBeneficiaryName(ben_name);
        benDetails.setBeneficiaryId(count);
        benDetails.setBeneficiaryCity(ben_city);
        benDetails.setAssistanceType(ass_type);
        benDetails.setEntName(entname);
        beneficiaryDirectory.add(benDetails);
        return benDetails;
    } 
    
}
