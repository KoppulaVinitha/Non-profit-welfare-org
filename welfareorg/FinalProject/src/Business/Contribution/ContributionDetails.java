/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Contribution;

/**
 *
 * @author Sindhu
 */
public class ContributionDetails {
    
    int contId;
    String contType;
    String contribution;
    String contName;
    String contEmail;
    String entName;
    String status=null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }
    
    public int getContId() {
        return contId;
    }

    public void setContId(int contId) {
        this.contId = contId;
    }

    public String getContType() {
        return contType;
    }

    public void setContType(String contType) {
        this.contType = contType;
    }

    public String getContribution() {
        return contribution;
    }

    public void setContribution(String contribution) {
        this.contribution = contribution;
    }

    public String getContName() {
        return contName;
    }

    public void setContName(String contName) {
        this.contName = contName;
    }

    public String getContEmail() {
        return contEmail;
    }

    public void setContEmail(String contEmail) {
        this.contEmail = contEmail;
    }
    
}
