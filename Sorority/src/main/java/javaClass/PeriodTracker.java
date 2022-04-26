/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaClass;
import java.util.*;
/**
 *
 * @author gloriasingh
 */
public class PeriodTracker {
    
      
    private int femaleId;
    private String emailId;
    private Date lastPeriodDate;
    private String  stopAlert;

    public PeriodTracker(int femaleId, String emailId, Date lastPeriodDate, String stopAlert) {
        this.femaleId = femaleId;
        this.emailId = emailId;
        this.lastPeriodDate = lastPeriodDate;
        this.stopAlert = stopAlert;
    }

    public int getFemaleId() {
        return femaleId;
    }

    public void setFemaleId(int femaleId) {
        this.femaleId = femaleId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Date getLastPeriodDate() {
        return lastPeriodDate;
    }

    public void setLastPeriodDate(Date lastPeriodDate) {
        this.lastPeriodDate = lastPeriodDate;
    }

    public String getStopAlert() {
        return stopAlert;
    }

    public void setStopAlert(String stopAlert) {
        this.stopAlert = stopAlert;
    }
    
    
}
