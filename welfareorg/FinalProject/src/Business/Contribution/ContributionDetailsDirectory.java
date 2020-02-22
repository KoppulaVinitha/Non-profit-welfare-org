/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Contribution;

import java.util.ArrayList;
import Business.EcoSystem;

/**
 *
 * @author Sindhu
 */
public class ContributionDetailsDirectory {
    
    EcoSystem system;
    
    private ArrayList<ContributionDetails> contributionDetailsDirectory;

    public ContributionDetailsDirectory() {
        contributionDetailsDirectory = new ArrayList();
    }
    

    public ArrayList<ContributionDetails> getContributionDetailsDirectory() {
        return contributionDetailsDirectory;
    }

    public void addContribution(ContributionDetails contDetails){
         contributionDetailsDirectory.add(contDetails);
    }
    
}
