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
public class FemaleCases {
    
    private int femaleId;
    private String femalecase;
    private int policeEmpId;
    private int lawyerEmpId;
    private Date caseRaised;
    private String involveJudiciary;

    public FemaleCases(int femaleId, String femalecase, int policeEmpId, int lawyerEmpId, Date caseRaised, String involveJudiciary) {
        this.femaleId = femaleId;
        this.femalecase = femalecase;
        this.policeEmpId = policeEmpId;
        this.lawyerEmpId = lawyerEmpId;
        this.caseRaised = caseRaised;
        this.involveJudiciary = involveJudiciary;
    }

    public int getFemaleId() {
        return femaleId;
    }

    public void setFemaleId(int femaleId) {
        this.femaleId = femaleId;
    }

    public String getFemalecase() {
        return femalecase;
    }

    public void setFemalecase(String femalecase) {
        this.femalecase = femalecase;
    }

    public int getPoliceEmpId() {
        return policeEmpId;
    }

    public void setPoliceEmpId(int policeEmpId) {
        this.policeEmpId = policeEmpId;
    }

    public int getLawyerEmpId() {
        return lawyerEmpId;
    }

    public void setLawyerEmpId(int lawyerEmpId) {
        this.lawyerEmpId = lawyerEmpId;
    }

    public Date getCaseRaised() {
        return caseRaised;
    }

    public void setCaseRaised(Date caseRaised) {
        this.caseRaised = caseRaised;
    }

    public String getInvolveJudiciary() {
        return involveJudiciary;
    }

    public void setInvolveJudiciary(String involveJudiciary) {
        this.involveJudiciary = involveJudiciary;
    }
      
    
    
}
