/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prudvi
 */
    public class undergraduate extends student{
    private int year;

    public undergraduate(String STUDENTID, String FIRSTNAME, String LASTNAME) {
        super(STUDENTID, FIRSTNAME, LASTNAME);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}

