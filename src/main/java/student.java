/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prudvi
 */
public class student {
    private String STUDENTID;
    private String FIRSTNAME;
    private String LASTNAME;

    public student(String STUDENTID, String FIRSTNAME, String LASTNAME) {
        this.STUDENTID = STUDENTID;
        this.FIRSTNAME = FIRSTNAME;
        this.LASTNAME = LASTNAME;
    }

    @Override
    public String toString() {
        return "student{" + "STUDENTID=" + STUDENTID + ", FIRSTNAME=" + FIRSTNAME + ", LASTNAME=" + LASTNAME + '}';
    }
    
    

    public String getSTUDENTID() {
        return STUDENTID;
    }

    public void setSTUDENTID(String STUDENTID) {
        this.STUDENTID = STUDENTID;
    }

    public String getFIRSTNAME() {
        return FIRSTNAME;
    }

    public void setFIRSTNAME(String FIRSTNAME) {
        this.FIRSTNAME = FIRSTNAME;
    }

    public String getLASTNAME() {
        return LASTNAME;
    }

    public void setLASTNAME(String LASTNAME) {
        this.LASTNAME = LASTNAME;
    }
    
    
    
}
