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
public class Examiner {
    
     private int patientId;
    private String testName;
    private String testResult;
    private Date examinationDate;
    private int enterpriseId;

    public Examiner(int patientId, String testName, String testResult, Date examinationDate, int enterpriseId) {
        this.patientId = patientId;
        this.testName = testName;
        this.testResult = testResult;
        this.examinationDate = examinationDate;
        this.enterpriseId = enterpriseId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public Date getExaminationDate() {
        return examinationDate;
    }

    public void setExaminationDate(Date examinationDate) {
        this.examinationDate = examinationDate;
    }

    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }
    
    
    
}
