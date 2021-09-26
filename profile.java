/*
 * To change this license header, choose 
se Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author mehta
 */
public class profile {
private String name;
private String geographicdata;
private Date DOB;
private String telephonenumber;
private String faxnumber;
private String emailaddress;
private String socialsecuritynumber;
private int medicalrecordnumber;
private int healthnumber;
private int bankaccountnumber;
private String certificatenumber; 
private String Vehiclenumber;
private int serialnumber;
private String linkedin;
private String internetaddress;
private int uniquenumber;
private String photo;
private String biometric;
private String path="";

    public String getBiometric() {
        return biometric;
    }

    public void setBiometric(String biometric) {
        this.biometric = biometric;
    }


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }


    
    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeographicdata() {
        return geographicdata;
    }

    public void setGeographicdata(String geographicdata) {
        this.geographicdata = geographicdata;
    }

   

    
    public String getTelephonenumber() {
        return telephonenumber;
    }

    public void setTelephonenumber(String telephonenumber) {
        this.telephonenumber = telephonenumber;
    }

    public String getFaxnumber() {
        return faxnumber;
    }

    public void setFaxnumber(String faxnumber) {
        this.faxnumber = faxnumber;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public String getSocialsecuritynumber() {
        return socialsecuritynumber;
    }

    public void setSocialsecuritynumber(String socialsecuritynumber) {
        this.socialsecuritynumber = socialsecuritynumber;
    }

    public int getMedicalrecordnumber() {
        return medicalrecordnumber;
    }

    public void setMedicalrecordnumber(int medicalrecordnumber) {
        this.medicalrecordnumber = medicalrecordnumber;
    }

    public int getHealthnumber() {
        return healthnumber;
    }

    public void setHealthnumber(int healthnumber) {
        this.healthnumber = healthnumber;
    }

    public int getBankaccountnumber() {
        return bankaccountnumber;
    }

    public void setBankaccountnumber(int bankaccountnumber) {
        this.bankaccountnumber = bankaccountnumber;
    }

    public String getCertificatenumber() {
        return certificatenumber;
    }

    public void setCertificatenumber(String certificatenumber) {
        this.certificatenumber = certificatenumber;
    }

    public String getVehiclenumber() {
        return Vehiclenumber;
    }

    public void setVehiclenumber(String Vehiclenumber) {
        this.Vehiclenumber = Vehiclenumber;
    }

    public int getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(int serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getInternetaddress() {
        return internetaddress;
    }

    public void setInternetaddress(String internetaddress) {
        this.internetaddress = internetaddress;
    }

    public int getUniquenumber() {
        return uniquenumber;
    }

    public void setUniquenumber(int uniquenumber) {
        this.uniquenumber = uniquenumber;
    }

    public void setgeographicdata(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getCertificatenumber(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getdob(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
