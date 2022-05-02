/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pojo.wecare;

/**
 *
 * @author gloriasingh
 */
public class MedicineInventory {
    
     private String medicineName;
    private int quantityAvailable;
    private int enterpriseId;

    public MedicineInventory(String medicineName, int quantityAvailable, int enterpriseId) {
        this.medicineName = medicineName;
        this.quantityAvailable = quantityAvailable;
        this.enterpriseId = enterpriseId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }
}
