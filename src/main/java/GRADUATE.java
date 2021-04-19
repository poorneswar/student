/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prudvi
 */

    public class GRADUATE extends student{
    private String type;

    public GRADUATE(String type, String STUDENTID, String FIRSTNAME, String LASTNAME) {
        super(STUDENTID, FIRSTNAME, LASTNAME);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}

