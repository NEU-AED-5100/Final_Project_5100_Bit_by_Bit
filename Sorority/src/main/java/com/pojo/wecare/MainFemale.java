/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pojo.wecare;
import java.util.*;
/**
 *
 * @author gloriasingh
 */
public class MainFemale {
    
     private int femaleId;
    private String name;
    private Date DOB;
    private String city;
    private String State;
    private int zipcode;
    private String emailId;
    private long mobileNo;
    private String Password;
    private int patientId;

    public MainFemale(int femaleId, String name, Date DOB, String city, String State, int zipcode, String emailId, long mobileNo, String Password, int patientId) {
        this.femaleId = femaleId;
        this.name = name;
        this.DOB = DOB;
        this.city = city;
        this.State = State;
        this.zipcode = zipcode;
        this.emailId = emailId;
        this.mobileNo = mobileNo;
        this.Password = Password;
        this.patientId = patientId;
    }

    public int getFemaleId() {
        return femaleId;
    }

    public void setFemaleId(int femaleId) {
        this.femaleId = femaleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    
    
}
