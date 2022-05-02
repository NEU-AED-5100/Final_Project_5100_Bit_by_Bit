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
public class NurseReading {
    
     private int patientId;
    private int enterpriseId;
    private Date readingDate;
    private int heightInCM;
    private int weightInKg;
    private int bpSystolic;
    private int bpDiastolic;
    private int sugarInMGperDL;
    private int thyroidInTSH;
    private int bmi;
    private int hemoglobinl;
    private long wbc;
    private long rbc;
    private int pulseRateBeatsPermin;
    private int respirationRate;
    private int bodyTempInF;
    private String rootConcern;

    public NurseReading(int patientId, int enterpriseId, Date readingDate, int heightInCM, int weightInKg, int bpSystolic, int bpDiastolic, int sugarInMGperDL, int thyroidInTSH, int bmi, int hemoglobinl, long wbc, long rbc, int pulseRateBeatsPermin, int respirationRate, int bodyTempInF, String rootConcern) {
        this.patientId = patientId;
        this.enterpriseId = enterpriseId;
        this.readingDate = readingDate;
        this.heightInCM = heightInCM;
        this.weightInKg = weightInKg;
        this.bpSystolic = bpSystolic;
        this.bpDiastolic = bpDiastolic;
        this.sugarInMGperDL = sugarInMGperDL;
        this.thyroidInTSH = thyroidInTSH;
        this.bmi = bmi;
        this.hemoglobinl = hemoglobinl;
        this.wbc = wbc;
        this.rbc = rbc;
        this.pulseRateBeatsPermin = pulseRateBeatsPermin;
        this.respirationRate = respirationRate;
        this.bodyTempInF = bodyTempInF;
        this.rootConcern = rootConcern;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Date getReadingDate() {
        return readingDate;
    }

    public void setReadingDate(Date readingDate) {
        this.readingDate = readingDate;
    }

    public int getHeightInCM() {
        return heightInCM;
    }

    public void setHeightInCM(int heightInCM) {
        this.heightInCM = heightInCM;
    }

    public int getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(int weightInKg) {
        this.weightInKg = weightInKg;
    }

    public int getBpSystolic() {
        return bpSystolic;
    }

    public void setBpSystolic(int bpSystolic) {
        this.bpSystolic = bpSystolic;
    }

    public int getBpDiastolic() {
        return bpDiastolic;
    }

    public void setBpDiastolic(int bpDiastolic) {
        this.bpDiastolic = bpDiastolic;
    }

    public int getSugarInMGperDL() {
        return sugarInMGperDL;
    }

    public void setSugarInMGperDL(int sugarInMGperDL) {
        this.sugarInMGperDL = sugarInMGperDL;
    }

    public int getThyroidInTSH() {
        return thyroidInTSH;
    }

    public void setThyroidInTSH(int thyroidInTSH) {
        this.thyroidInTSH = thyroidInTSH;
    }

    public int getBmi() {
        return bmi;
    }

    public void setBmi(int bmi) {
        this.bmi = bmi;
    }

    public int getHemoglobinl() {
        return hemoglobinl;
    }

    public void setHemoglobinl(int hemoglobinl) {
        this.hemoglobinl = hemoglobinl;
    }

    public long getWbc() {
        return wbc;
    }

    public void setWbc(long wbc) {
        this.wbc = wbc;
    }

    public long getRbc() {
        return rbc;
    }

    public void setRbc(long rbc) {
        this.rbc = rbc;
    }

    public int getPulseRateBeatsPermin() {
        return pulseRateBeatsPermin;
    }

    public void setPulseRateBeatsPermin(int pulseRateBeatsPermin) {
        this.pulseRateBeatsPermin = pulseRateBeatsPermin;
    }

    public int getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(int respirationRate) {
        this.respirationRate = respirationRate;
    }

    public int getBodyTempInF() {
        return bodyTempInF;
    }

    public void setBodyTempInF(int bodyTempInF) {
        this.bodyTempInF = bodyTempInF;
    }

    public String getRootConcern() {
        return rootConcern;
    }

    public void setRootConcern(String rootConcern) {
        this.rootConcern = rootConcern;
    }
    
}
