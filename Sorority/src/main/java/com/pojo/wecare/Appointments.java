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
public class Appointments {
    private int patientId;
    private int femaleId;
    private int enterpriseId;
    private int appointmentNo;
    private String assignedDr;
    private Date appointmentDate;

    public Appointments(int patientId, int femaleId, int enterpriseId, int appointmentNo, String assignedDr, Date appointmentDate) 
    {
        this.patientId = patientId;
        this.femaleId = femaleId;
        this.enterpriseId = enterpriseId;
        this.appointmentNo = appointmentNo;
        this.assignedDr = assignedDr;
        this.appointmentDate = appointmentDate;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getFemaleId() {
        return femaleId;
    }

    public void setFemaleId(int femaleId) {
        this.femaleId = femaleId;
    }

    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public int getAppointmentNo() {
        return appointmentNo;
    }

    public void setAppointmentNo(int appointmentNo) {
        this.appointmentNo = appointmentNo;
    }

    public String getAssignedDr() {
        return assignedDr;
    }

    public void setAssignedDr(String assignedDr) {
        this.assignedDr = assignedDr;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
    
    
    
}
